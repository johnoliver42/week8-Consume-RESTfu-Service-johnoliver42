package persistance;

import entities.Pet;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
class PetDAOTest {

    @Test
    void getPetTest() {

        Pet pet = PetDAO.getPet(2);
        assertEquals(2, pet.getId());
    }
}