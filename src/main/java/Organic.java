public class Organic extends VirtualPet {
    public int wasteLevel;

    public Organic(String name, String description, int foodLevel, int waterLevel, int happyLevel, int wasteLevel) {
        this.name=name;
        this.description=description;
        this.foodLevel=foodLevel;
        this.waterLevel=waterLevel;
        this.happyLevel=happyLevel;
        this.wasteLevel=wasteLevel;
    }

    @Override
    public int getMaintenance(){
        return wasteLevel;
    }
    @Override
    public void tick() {
        foodLevel--;
        waterLevel--;
        happyLevel--;
        wasteLevel--;
    }
    public void maintainOrganicPet() {
        wasteLevel +=15;

    }

}
