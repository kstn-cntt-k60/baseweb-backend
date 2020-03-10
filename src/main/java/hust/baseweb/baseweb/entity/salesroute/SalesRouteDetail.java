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
public class SalesRouteDetail {
    @Id
    private UUID id;

    @NonNull
    private UUID configId;

    @NonNull
    private UUID planningPeriodId;

    @NonNull
    private UUID customerId;

    @NonNull
    private UUID salesmanId;

    private Date createdAt;
    private Date updatedAt;
}
