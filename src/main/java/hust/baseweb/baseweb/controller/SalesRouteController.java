package hust.baseweb.baseweb.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import hust.baseweb.baseweb.entity.salesroute.SalesRouteConfig;
import hust.baseweb.baseweb.entity.salesroute.SalesRoutePlanningPeriod;
import hust.baseweb.baseweb.model.GetUserLogin;
import hust.baseweb.baseweb.repository.SalesRoutePlanningPeriodRepository;
import hust.baseweb.baseweb.repository.UserLoginRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Getter
@NoArgsConstructor
class CreatePlanningPeriodRequest {
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "UTC")
    private Date fromDate;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "UTC")
    private Date thruDate;

    private String description;
}

@Getter
@RequiredArgsConstructor
class CreatePlanningPeriodResponse {
    private final List<SalesRoutePlanningPeriod> planningPeriods;
}

@Getter
@NoArgsConstructor
class CreateConfigRequest {
    private boolean isEnabled;
    private short repeatWeek;
}

@Getter
@RequiredArgsConstructor
class CreateConfigResponse {
    private final List<SalesRouteConfig> configs;
}

@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class SalesRouteController {
    private UserLoginRepository userLoginRepository;
    private SalesRoutePlanningPeriodRepository salesRoutePlanningPeriodRepository;

    @GetMapping("/api/sales-route/planning-period")
    public List<SalesRoutePlanningPeriod> getPlanningPeriod() {
        return salesRoutePlanningPeriodRepository.findAll();
    }

    @PostMapping("/api/sales-route/create-planning-period")
    public CreatePlanningPeriodResponse createPlanningPeriod(@RequestBody CreatePlanningPeriodRequest request, Principal principal) {
        GetUserLogin getUserLogin = userLoginRepository.getUserLoginByUsername(principal.getName());

        ZoneId zoneId = ZoneId.of("UTC");
        LocalDate fromDate = request.getFromDate().toInstant().atZone(zoneId).toLocalDate();
        LocalDate thruDate = request.getThruDate().toInstant().atZone(zoneId).toLocalDate();

        SalesRoutePlanningPeriod planningPeriod = new SalesRoutePlanningPeriod(
                fromDate, thruDate, getUserLogin.getId(), request.getDescription());
        salesRoutePlanningPeriodRepository.save(planningPeriod);

        List<SalesRoutePlanningPeriod> planningPeriods = salesRoutePlanningPeriodRepository.findAll();
        return new CreatePlanningPeriodResponse(planningPeriods);
    }
}
