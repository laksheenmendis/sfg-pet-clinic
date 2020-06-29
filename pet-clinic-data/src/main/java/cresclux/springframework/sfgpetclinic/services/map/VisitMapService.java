package cresclux.springframework.sfgpetclinic.services.map;

import cresclux.springframework.sfgpetclinic.model.Visit;
import cresclux.springframework.sfgpetclinic.services.VisitService;

import java.util.Set;

/**
 * Created by laksheenmendis on 6/29/20 at 12:45 AM
 */
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit visit) {

        //this is to make sure that we get a properly formed visit object
        if(visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null)
        {
            throw new RuntimeException("Invalid Visit");
        }

        return super.save(visit);
    }

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
