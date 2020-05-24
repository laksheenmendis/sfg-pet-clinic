package cresclux.springframework.sfgpetclinic.services;

import cresclux.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by laksheenmendis on 5/24/20 at 11:13 AM
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
