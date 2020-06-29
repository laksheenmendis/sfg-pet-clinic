package cresclux.springframework.sfgpetclinic.boostrap;

import cresclux.springframework.sfgpetclinic.model.*;
import cresclux.springframework.sfgpetclinic.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

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
    private final SpecialityService specialityService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
        this.visitService = visitService;
    }

    // since this is a Spring component, this will be registered as a Bean in the spring context,
    // Thus, when the Spring context is up and ready,
    // it will execute this run method
    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();

        if(count == 0)
        {
            loadData();
        }
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        // to make sure that PetType is saved
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        radiology.setDescription("Surgery");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        radiology.setDescription("Dentistry");
        Speciality savedDentistry = specialityService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Laksheen");
        owner1.setLastName("Mendis");
        owner1.setAddress("97 Negombo Road");
        owner1.setCity("Colombo");
        owner1.setTelephone("134028033");

        Pet laksheensPet = new Pet();
        laksheensPet.setName("Teena");
        laksheensPet.setPetType(savedDogPetType);
        laksheensPet.setOwner(owner1);
        laksheensPet.setBirthdate(LocalDate.now());
        owner1.getPets().add(laksheensPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Hiranya");
        owner2.setLastName("Fernando");
        owner2.setAddress("97 Negombo Road");
        owner2.setCity("Colombo");
        owner2.setTelephone("134028033");

        Pet hiranyasPet = new Pet();
        hiranyasPet.setName("Sweety");
        hiranyasPet.setPetType(savedCatPetType);
        hiranyasPet.setOwner(owner2);
        hiranyasPet.setBirthdate(LocalDate.now());
        owner2.getPets().add(hiranyasPet);

        ownerService.save(owner2);

        Visit catVisit = new Visit();
        catVisit.setPet(hiranyasPet);
        catVisit.setDate(LocalDate.now());
        catVisit.setDescription("Sneezy kitty");

        visitService.save(catVisit);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Matthews");
        vet1.getSpecialities().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Marie");
        vet2.setLastName("Bilbao");
        vet2.getSpecialities().add(savedSurgery);

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
