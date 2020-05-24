package cresclux.springframework.sfgpetclinic.services;

import cresclux.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by laksheenmendis on 5/24/20 at 11:19 AM
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
