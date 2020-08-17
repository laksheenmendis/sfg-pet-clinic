package cresclux.springframework.sfgpetclinic.services.springdatajpa;

import cresclux.springframework.sfgpetclinic.model.Owner;
import cresclux.springframework.sfgpetclinic.repositories.OwnerRepository;
import cresclux.springframework.sfgpetclinic.repositories.PetRepository;
import cresclux.springframework.sfgpetclinic.repositories.PetTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by laksheenmendis on 8/16/20 at 9:19 PM
 */
@ExtendWith(MockitoExtension.class)
class OwnerSDJpaServiceTest {

    final String LAST_NAME = "Mendis";

    @Mock
    OwnerRepository ownerRepository;
    @Mock
    PetRepository petRepository;
    @Mock
    PetTypeRepository petTypeRepository;

    @InjectMocks
    OwnerSDJpaService ownerSDJpaService;

    long id = 1L;
    Owner owner;

    @BeforeEach
    void setUp() {
        owner = Owner.builder().id(id).lastName(LAST_NAME).build();
    }

    @Test
    void findByLastName() {
        when(ownerRepository.findByLastName(any())).thenReturn(owner);

        Owner foundOwner = ownerSDJpaService.findByLastName(LAST_NAME);
        assertSame(owner, foundOwner);
        assertEquals(LAST_NAME, foundOwner.getLastName());

        verify(ownerRepository).findByLastName(any());
    }

    @Test
    void findById() {
        when(ownerRepository.findById(anyLong())).thenReturn(java.util.Optional.ofNullable(owner));

        Owner foundOwner = ownerSDJpaService.findById(id);
        assertNotNull(foundOwner);
        assertSame(owner, foundOwner);
    }

    @Test
    void findByIdNotFound() {
        when(ownerRepository.findById(anyLong())).thenReturn(java.util.Optional.empty());

        Owner foundOwner = ownerSDJpaService.findById(id);
        assertNull(foundOwner);
    }


    @Test
    void save() {
        when(ownerRepository.save(any())).thenReturn(owner);

        Owner savedOwner = ownerSDJpaService.save(owner);
        assertNotNull(savedOwner);
        assertSame(owner, savedOwner);
        verify(ownerRepository).save(any());
    }

    @Test
    void findAll() {
        Set<Owner> ownerSet = new HashSet<>();
        ownerSet.add(Owner.builder().id(2L).lastName("Fernando").build());
        ownerSet.add(Owner.builder().id(3L).lastName("Perera").build());

        when(ownerRepository.findAll()).thenReturn(ownerSet);

        Set<Owner> all = ownerSDJpaService.findAll();
        assertEquals(2, all.size());
    }

    @Test
    void delete() {
        ownerSDJpaService.delete(owner);

        verify(ownerRepository).delete(any());
    }

    @Test
    void deleteById() {
        ownerSDJpaService.deleteById(id);

        verify(ownerRepository).deleteById(anyLong());
    }
}