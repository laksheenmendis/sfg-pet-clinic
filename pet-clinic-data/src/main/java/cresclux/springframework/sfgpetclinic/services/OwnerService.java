package cresclux.springframework.sfgpetclinic.services;

import cresclux.springframework.sfgpetclinic.model.Owner;

/**
 * Created by laksheenmendis on 5/24/20 at 11:13 AM
 */
public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
