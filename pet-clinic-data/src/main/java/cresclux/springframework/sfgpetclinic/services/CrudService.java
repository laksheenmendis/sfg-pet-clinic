package cresclux.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by laksheenmendis on 5/24/20 at 3:26 PM
 */

// Here we're trying to mimic the Spring Data Repository, instead of using the CrudRepository
public interface CrudService<T, ID> {

    T findById(ID id);

    T save(T object);

    Set<T> findAll();

    void delete(T object);

    void deleteById(ID id);
}
