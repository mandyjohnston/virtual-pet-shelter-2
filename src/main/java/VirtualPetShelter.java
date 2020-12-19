import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {
    public Map<String, VirtualPet> animalsInShelter = new HashMap<>();

    public Collection<VirtualPet> getAllPets() {
        return animalsInShelter.values();
    }
    public int getNumberOfAnimals() {
        return animalsInShelter.size();
    }


    public void admit(VirtualPet pet) {
        animalsInShelter.put(pet.name,pet);
    }


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
    public void maintainAll() {
        for (VirtualPet pet: getAllPets()) {
            pet.maintainRoboticPet();
            pet.maintainOrganicPet();
        }
    }
    public void walkDogs() {
        for (VirtualPet pet: getAllPets()) {
            pet.walkOrganicDog();
            pet.walkRoboticDog();
        }
    }


    public void tickAll() {
        for (VirtualPet pet : animalsInShelter.values()) {
            pet.tick();
        }
    }

    public String organicPetStatus() {
        String petStatus = "";
        for (Entry<String, VirtualPet> eachPet : animalsInShelter.entrySet()) {
            if (eachPet.getValue() instanceof Organic) {
            petStatus += eachPet.getValue().getName() + "\t   " + eachPet.getValue().getFoodLevel() + "\t   "
                    + eachPet.getValue().getWaterLevel() + "\t   " + eachPet.getValue().getHappyLevel() +"\t   " + eachPet.getValue().getMaintenance()+"\n";
            }
        }
        return petStatus;
    }
    public String roboticPetStatus() {
        String roboticPetStatus = "";
        for (Entry<String, VirtualPet> eachPet : animalsInShelter.entrySet()) {
            if (eachPet.getValue() instanceof Robotic) {
                roboticPetStatus += eachPet.getValue().getName() + "\t   "+
                        "\t   " + eachPet.getValue().getHappyLevel() +"\t   " + eachPet.getValue().getMaintenance()+"\n";
            }
        }
        return roboticPetStatus;
    }
    public String organicOption4Display() {
        String option4Display = "";
        for (Entry<String, VirtualPet> eachPet : animalsInShelter.entrySet()) {
            if (eachPet.getValue() instanceof Organic) {
                option4Display += "Name: " + eachPet.getValue().getName() + "\t" + eachPet.getValue().getDescription()
                        + "\n";
            }
        }

        return option4Display;
    }
    public String roboticOption4Display() {
        String roboticOption4Display = "";
        for (Entry<String, VirtualPet> eachPet : animalsInShelter.entrySet()) {
            if (eachPet.getValue() instanceof Robotic) {
                roboticOption4Display += "Name: " + eachPet.getValue().getName() + "\t" + eachPet.getValue().getDescription()
                        + "\n";
            }
        }

        return roboticOption4Display;
    }
    public boolean doesPetRemain(String name) {
        return animalsInShelter.containsKey(name);
    }
}

