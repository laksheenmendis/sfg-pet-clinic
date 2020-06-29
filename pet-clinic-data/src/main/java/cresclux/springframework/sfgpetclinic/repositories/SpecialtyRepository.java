package cresclux.springframework.sfgpetclinic.repositories;

import cresclux.springframework.sfgpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by laksheenmendis on 6/28/20 at 11:41 PM
 */
public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
