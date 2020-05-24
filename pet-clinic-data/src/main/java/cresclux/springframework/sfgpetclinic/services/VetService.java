package cresclux.springframework.sfgpetclinic.services;

import cresclux.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by laksheenmendis on 5/24/20 at 11:20 AM
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
