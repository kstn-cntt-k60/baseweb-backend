package hust.baseweb.baseweb.entity.salesroute;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class SalesRouteConfigDay {
    @EmbeddedId
    @NonNull
    private SalesRouteConfigDayId id;

    @Column(insertable = false)
    private Date createdAt;
}
