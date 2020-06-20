package cresclux.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * Created by laksheenmendis on 5/23/20 at 10:06 PM
 */
public class Vet extends Person {

    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
