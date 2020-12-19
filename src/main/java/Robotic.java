public class Robotic extends VirtualPet{
    public int oilLevel;

    public Robotic(String name, String description,int happyLevel, int oilLevel) {
        this.name=name;
        this.description=description;
        this.happyLevel=happyLevel;
        this.oilLevel=oilLevel;
    }

    @Override
    public int getMaintenance(){
        return oilLevel;
    }
    @Override
    public void tick() {
        foodLevel--;
        waterLevel--;
        happyLevel--;
        oilLevel--;
    }
    public void maintainRoboticPet() {
        oilLevel +=15;
    }
}
