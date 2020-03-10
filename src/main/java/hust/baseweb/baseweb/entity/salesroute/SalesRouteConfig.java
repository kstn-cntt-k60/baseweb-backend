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
public class SalesRouteConfig {
    @Id
    private UUID id;

    @NonNull
    private boolean isEnabled;

    @NonNull
    private short repeatWeek;

    @NonNull
    private UUID createdByUserLoginId;

    private Date createdAt;
    private Date updatedAt;
}
