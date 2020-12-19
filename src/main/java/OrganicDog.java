
public class OrganicDog extends Organic {


    public OrganicDog(String name, String description, int foodLevel, int waterLevel, int happyLevel, int wasteLevel) {
        super(name, description, foodLevel, waterLevel, happyLevel, wasteLevel);
    }
    @Override
    public void walkOrganicDog() {
        wasteLevel-=5;
    }
}

