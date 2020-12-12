

public class VirtualPet implements HealthNecessities {

    protected String name;
    protected String description;
    protected int foodLevel;
    protected int waterLevel;
    protected int happyLevel;

    public VirtualPet(String name, String description, int foodLevel, int waterLevel, int happyLevel) {
        this.name = name;
        this.description = description;
        this.foodLevel = foodLevel;
        this.waterLevel = waterLevel;
        this.happyLevel = happyLevel;
    }

    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }

    public int getFoodLevel() {
        return foodLevel;
    }

    public int getWaterLevel() {
        return waterLevel;
    }


    public int getHappyLevel() {
        return happyLevel;
    }

    @Override
    public void feedPet() {
        foodLevel+=5;
    }

    @Override
    public void waterPet() {
        waterLevel+=5;
    }

    @Override
    public void playWithPet() {
        happyLevel+=5;
    }
    public void tick() {
        foodLevel--;
        waterLevel--;
        happyLevel--;
    }

}