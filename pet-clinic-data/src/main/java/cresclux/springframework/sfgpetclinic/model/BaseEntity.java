package cresclux.springframework.sfgpetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Created by laksheenmendis on 5/24/20 at 11:31 AM
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BaseEntity implements Serializable {

    // Hibernate prefers if it's Object types, because they can be null
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
