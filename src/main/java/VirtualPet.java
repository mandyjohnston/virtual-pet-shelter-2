

public class VirtualPet{

    protected String name;
    protected String description;
    protected int foodLevel;
    protected int waterLevel;
    protected int happyLevel;

    /*public VirtualPet(String name, String description, int foodLevel, int waterLevel, int happyLevel) {
        this.name = name;
        this.description = description;
        this.foodLevel = foodLevel;
        this.waterLevel = waterLevel;
        this.happyLevel = happyLevel;
    }*/

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


    public void feedPet() {
        foodLevel+=5;
    }


    public void waterPet() {
        waterLevel+=5;
    }
    public void walkRoboticDog() {
    }
    public void walkOrganicDog() {
    }


    public void playWithPet() {
        happyLevel+=5;
    }
    public void maintainOrganicPet() {
    }

    public void maintainRoboticPet() {
    }

    public int getMaintenance(){
        return 0;
    }
    public void tick() {
        foodLevel--;
        waterLevel--;
        happyLevel--;
    }

}