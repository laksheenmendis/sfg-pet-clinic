package cresclux.springframework.sfgpetclinic.boostrap;

import cresclux.springframework.sfgpetclinic.model.Owner;
import cresclux.springframework.sfgpetclinic.model.PetType;
import cresclux.springframework.sfgpetclinic.model.Vet;
import cresclux.springframework.sfgpetclinic.services.OwnerService;
import cresclux.springframework.sfgpetclinic.services.PetTypeService;
import cresclux.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by laksheenmendis on 5/25/20 at 10:07 PM
 */

/**
 * This class is created to load data at the time of startup
 * This is one way of doing it.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    // since this is a Spring component, this will be registered as a Bean in the spring context,
    // Thus, when the Spring context is up and ready,
    // it will execute this run method
    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        // to make sure that PetType is saved
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Laksheen");
        owner1.setLastName("Mendis");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Hiranya");
        owner2.setLastName("Fernando");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Matthews");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Marie");
        vet2.setLastName("Bilbao");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
