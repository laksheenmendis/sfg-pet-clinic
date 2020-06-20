package cresclux.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * Created by laksheenmendis on 5/23/20 at 10:06 PM
 */
public class Owner extends Person{

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
