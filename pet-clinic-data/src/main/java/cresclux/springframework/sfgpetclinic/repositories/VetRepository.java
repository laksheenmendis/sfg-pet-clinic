package cresclux.springframework.sfgpetclinic.repositories;

import cresclux.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by laksheenmendis on 6/28/20 at 11:42 PM
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
