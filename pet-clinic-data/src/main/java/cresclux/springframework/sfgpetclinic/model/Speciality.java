package cresclux.springframework.sfgpetclinic.model;

/**
 * Created by laksheenmendis on 6/19/20 at 11:27 PM
 */
public class Speciality extends BaseEntity{

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
