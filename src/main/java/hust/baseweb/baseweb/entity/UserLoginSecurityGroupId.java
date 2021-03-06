package hust.baseweb.baseweb.entity;

import lombok.*;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.UUID;

@Embeddable
@Getter
@Setter
@EqualsAndHashCode
@RequiredArgsConstructor
@NoArgsConstructor
public class UserLoginSecurityGroupId implements Serializable {
    @NonNull
    private UUID userLoginId;

    @NonNull
    private short securityGroupId;
}