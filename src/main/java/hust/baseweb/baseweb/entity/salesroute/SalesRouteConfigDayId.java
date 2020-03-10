package hust.baseweb.baseweb.entity.salesroute;

import lombok.*;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@Embeddable
@EqualsAndHashCode
@RequiredArgsConstructor
@NoArgsConstructor
public class SalesRouteConfigDayId implements Serializable {
    @NonNull
    private UUID configId;

    @NonNull
    private short day;
}
