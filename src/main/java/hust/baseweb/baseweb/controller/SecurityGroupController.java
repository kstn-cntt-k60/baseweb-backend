package hust.baseweb.baseweb.controller;

import hust.baseweb.baseweb.entity.SecurityGroup;
import hust.baseweb.baseweb.repository.SecurityGroupRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Getter
@NoArgsConstructor
class AddSecurityGroupRequest {
    private String name;
}

@Getter
@RequiredArgsConstructor
class AddSecurityGroupResponse {
    private final SecurityGroup securityGroup;
}

@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class SecurityGroupController {
    private SecurityGroupRepository securityGroupRepository;

    @PostMapping("/api/security/add-security-group")
    public AddSecurityGroupResponse addSecurityGroup(@RequestBody AddSecurityGroupRequest body) {

        short maxId = securityGroupRepository.findMaxId();

        short id = (short) (maxId + 1);
        SecurityGroup securityGroup = new SecurityGroup(id, body.getName());
        securityGroupRepository.save(securityGroup);

        return new AddSecurityGroupResponse(securityGroupRepository.findById(id).get());
    }
}
