
public class Dragon extends VirtualPet implements HealthNecessities {

    public Dragon(String name, String description, int foodLevel, int waterLevel, int happyLevel) {
        super(name, description, foodLevel, waterLevel, happyLevel);


    }

    @Override
    public void feedPet() {
        foodLevel += 15;
    }

    @Override
    public void waterPet() {
        waterLevel += 15;
    }

    @Override
    public void playWithPet() {
        happyLevel += 15;
    }


}

