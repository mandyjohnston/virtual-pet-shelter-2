
public class RoboticDog extends Robotic {


    public RoboticDog(String name, String description, int happyLevel, int oilLevel) {
        super(name, description,happyLevel, oilLevel);
    }
    @Override
    public void walkRoboticDog() {
        oilLevel-=5;
    }
}