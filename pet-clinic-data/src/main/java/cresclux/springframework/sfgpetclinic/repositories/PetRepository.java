package cresclux.springframework.sfgpetclinic.repositories;

import cresclux.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by laksheenmendis on 6/28/20 at 11:40 PM
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
