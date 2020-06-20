package cresclux.springframework.sfgpetclinic.model;

import java.time.LocalDate;

/**
 * Created by laksheenmendis on 6/19/20 at 11:22 PM
 */
public class Visit {

    private LocalDate date;
    private String description;
    private Pet pet;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
