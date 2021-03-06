package cresclux.springframework.sfgpetclinic.services.map;

import cresclux.springframework.sfgpetclinic.model.Speciality;
import cresclux.springframework.sfgpetclinic.model.Vet;
import cresclux.springframework.sfgpetclinic.services.SpecialityService;
import cresclux.springframework.sfgpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by laksheenmendis on 5/24/20 at 4:12 PM
 */
@Service
@Profile({"default", "map"})
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialityService specialityService;

    public VetMapService(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {

        if(object.getSpecialities().size() > 0)
        {
            object.getSpecialities().forEach(speciality -> {
                //if there is a speciality that is not saved, we save it here
                if(speciality.getId() == null)
                {
                    Speciality savedSpeciality = specialityService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }
        return super.save(object);
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
