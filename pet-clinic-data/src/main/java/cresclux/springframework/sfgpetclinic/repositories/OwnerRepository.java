package cresclux.springframework.sfgpetclinic.repositories;

import cresclux.springframework.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by laksheenmendis on 6/28/20 at 10:46 PM
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
