package hust.baseweb.baseweb.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class SecurityGroup {
    @Id
    @NonNull
    private short id;

    @NonNull
    @Column(unique = true)
    private String name;

    @CreationTimestamp
    private Date createdAt;
}
