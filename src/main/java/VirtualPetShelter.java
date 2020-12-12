import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter implements ShelterActivities {
    public Map<String, VirtualPet> animalsInShelter = new HashMap<>();

    public Collection<VirtualPet> getAllPets() {
        return animalsInShelter.values();
    }
    public int getNumberOfAnimals() {
        return animalsInShelter.size();
    }

    @Override
    public void admit(VirtualPet pet) {
        animalsInShelter.put(pet.name,pet);
    }

    @Override
    public void adopt(String name) {
        animalsInShelter.remove(name);
    }


    public void feedAll() {
        for (VirtualPet pet : animalsInShelter.values()) {
            pet.feedPet();
        }
    }


    public void play(String name) {

        animalsInShelter.get(name).playWithPet();
    }

    public void waterAll() {
        for (VirtualPet pet : animalsInShelter.values()) {
            pet.waterPet();
        }
    }

    public void tickAll() {
        for (VirtualPet pet : animalsInShelter.values()) {
            pet.tick();
        }
    }

    public String petStatus() {
        String petStatus = "";
        for (Entry<String, VirtualPet> eachPet : animalsInShelter.entrySet()) {
            petStatus += eachPet.getValue().getName() + "\t   " + eachPet.getValue().getFoodLevel() + "\t   "
                    + eachPet.getValue().getWaterLevel() + "\t   " + eachPet.getValue().getHappyLevel() + "\n";
        }
        return petStatus;
    }
    public String option4Display() {
        String option4Display = "";
        for (Entry<String, VirtualPet> eachPet : animalsInShelter.entrySet()) {
            option4Display += "Name: " + eachPet.getValue().getName() + "\t" + eachPet.getValue().getDescription()
                    + "\n";
        }
        return option4Display;
    }
    public boolean doesPetRemain(String name) {
        return animalsInShelter.containsKey(name);
    }
}

