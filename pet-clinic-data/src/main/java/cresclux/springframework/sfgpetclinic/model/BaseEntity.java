package cresclux.springframework.sfgpetclinic.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Created by laksheenmendis on 5/24/20 at 11:31 AM
 */
@MappedSuperclass
public class BaseEntity implements Serializable {

    // Hibernate prefers if it's Object types, because they can be null
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
