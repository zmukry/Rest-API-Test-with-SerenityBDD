package learn.serenitybdd.resttesting.features;

import learn.serenitybdd.resttesting.model.Pet;
import learn.serenitybdd.resttesting.steps.PetStoreSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by zuhair.mukry on 6/30/2016.
 */
@RunWith(SerenityRunner.class)
public class AddAPetToThePetStoreTest {

    @Steps
    PetStoreSteps petStore;

    @Test
    public void shouldBeAbleToAddPetsToAStore() {

        Pet fido = new Pet("available","fido");

        petStore.when_i_add_the_pet_to_the_store(fido);

        petStore.the_pets_should_be_available();
    }

    @Test
    public void shouldBeAbleDeletePetsFromAStore() {

        Pet fido = new Pet("available","fido");

        petStore.when_i_add_the_pet_to_the_store(fido);

        petStore.when_i_delete_the_pet();

        petStore.the_pets_should_be_not_available();
    }

    @Test
    public void shouldBeAbleDeletePetsFromAStoreUsingJsonMap() {

        Pet fido = new Pet("available","fido");

        petStore.when_i_add_the_pet_to_the_store_with_json_map(fido);

        petStore.when_i_delete_the_pet();

        petStore.the_pets_should_be_not_available();
    }
}
