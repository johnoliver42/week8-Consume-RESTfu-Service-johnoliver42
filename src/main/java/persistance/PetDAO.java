package persistance;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entities.ApiResponse;
import entities.Pet;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import main.Driver;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

@Log4j2
public  class PetDAO {

    static public Pet getPet(int petId) {
        Pet pet = new Pet();

        Client client = ClientBuilder.newClient();

        WebTarget target = client.target("https://petstore.swagger.io/v2/pet/" + petId);
        ObjectMapper mapper = new ObjectMapper();

        String response = null;
        try {
            response = target.request(MediaType.APPLICATION_JSON).get(String.class);
            pet = mapper.readValue(response, Pet.class);
        } catch (javax.ws.rs.NotFoundException e) {
            log.error("Pet not found");

            return null;

        } catch (JsonProcessingException e) {

            log.error("Failed to parse json.");
        }

        return pet;

    }

    static public ApiResponse deletePet(int petId) {
        ApiResponse apiResponse = new ApiResponse();

        


        return apiResponse;
    }

    static public void createPet(Pet pet) {

    }

}
