package hust.baseweb.baseweb.entity.salesroute;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class SalesmanCheckinHistory {
    @Id
    @NonNull
    private UUID salesRouteDetailId;

    private Date checkinTime;
    private Date createdAt;
}
