package cresclux.springframework.sfgpetclinic.services.map;

import cresclux.springframework.sfgpetclinic.model.Vet;
import cresclux.springframework.sfgpetclinic.services.CrudService;

import java.util.Set;

/**
 * Created by laksheenmendis on 5/24/20 at 4:12 PM
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}