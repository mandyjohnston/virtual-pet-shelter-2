import org.junit.Test;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class VirtualPetShelterTest {
    Dragon dragon1 = new Dragon("Tina", "She's running out of fire", 50, 50, 50);
    Alligator alligator1 = new Alligator("Akira", "She's got sharp teeth, ",50, 50, 50);
    Dog dog1 = new Dog("Mickey", "He'll slobber all over you",50, 50, 50);
    Cat cat1 = new Cat("Kelso", "He's a big cuddler", 50, 50, 50);
    VirtualPetShelter bigAls = new VirtualPetShelter();

    public Map<String, VirtualPet> animalsInShelter = new HashMap<>();


    @Test
    public void shouldHaveTwoAnimals() {
        bigAls.admit(dragon1);
        bigAls.admit(alligator1);
        bigAls.admit(dog1);
        bigAls.admit(cat1);
        int result = bigAls.getNumberOfAnimals();
        assertEquals(result, 4);
    }
    @Test
    public void shouldReturnListOfAllAnimals() {
        bigAls.admit(dragon1);
        bigAls.admit(alligator1);
        bigAls.admit(dog1);
        bigAls.admit(cat1);
        Collection<VirtualPet> allPets = new ArrayList<>(bigAls.getAllPets());
        assertEquals(bigAls.getAllPets().contains(dragon1),true);
        assertEquals(bigAls.getAllPets().contains(alligator1),true);
        assertEquals(bigAls.getAllPets().contains(dog1),true);
        assertEquals(bigAls.getAllPets().contains(cat1),true);
    }
    @Test
    public void shouldAdoptPet() {
        bigAls.admit(dragon1);
        bigAls.admit(alligator1);
        bigAls.admit(dog1);
        bigAls.admit(cat1);
        bigAls.adopt("Tina");
        Collection<VirtualPet> allPets = new ArrayList<>(bigAls.getAllPets());
        assertEquals(bigAls.getAllPets().contains(dragon1), false);
    }
    @Test
    public void shouldAdmitPet() {
        bigAls.admit(dragon1);
        bigAls.admit(alligator1);
        Collection<VirtualPet> allPets = new ArrayList<>(bigAls.getAllPets());
        assertEquals(bigAls.getAllPets().contains(dragon1), true);
        assertEquals(bigAls.getAllPets().contains(alligator1), true);
    }
    @Test
    public void allFoodLevelsShouldIncrease() {
        bigAls.admit(dragon1);
        int beforePetIsFed = dragon1.getFoodLevel();
        bigAls.feedAll();
        int afterPetIsFed = dragon1.getFoodLevel();
        assertEquals(afterPetIsFed-beforePetIsFed,15);
    }
    @Test
    public void allWaterLevelsShouldIncrease() {
        bigAls.admit(dragon1);
        int beforePetIsWatered = dragon1.getWaterLevel();
        bigAls.waterAll();
        int afterPetIsWatered = dragon1.getWaterLevel();
        assertEquals(afterPetIsWatered-beforePetIsWatered,15);
    }
    @Test
    public void playLevelShouldIncrease() {
        bigAls.admit(dragon1);
        int beforePetIsPlayedWith = dragon1.getHappyLevel();
        bigAls.play("Tina");
        int afterPetIsPlayedWith = dragon1.getHappyLevel();
        assertEquals(afterPetIsPlayedWith-beforePetIsPlayedWith,15);
    }
    @Test
    public void petShouldRemain() {
        bigAls.admit(dragon1);
        assertEquals(bigAls.getAllPets().contains(dragon1),true);
    }







}
