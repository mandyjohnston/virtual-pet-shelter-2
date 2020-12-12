import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {
    private static final String DRAGON_NAME = "Bob";
    private static final String DRAGON_DESCRIPTION = "He is funny";
    private static final int DRAGON_FOOD_LEVEL = 50;
    private static final int DRAGON_WATER_LEVEL = 50;
    private static final int DRAGON_HAPPY_LEVEL = 50;
    VirtualPet bob=new VirtualPet(DRAGON_NAME, DRAGON_DESCRIPTION, DRAGON_FOOD_LEVEL, DRAGON_WATER_LEVEL, DRAGON_HAPPY_LEVEL);

    @Test
    public void shouldHaveAName() {
        Assert.assertEquals(bob.getName(),DRAGON_NAME);
    }
    @Test
    public void foodLevelShouldIncrease() {
        VirtualPet bob =new VirtualPet("Bob","He is funny",50,50, 50);
        int beforePetIsFed = bob.getFoodLevel();
        bob.feedPet();
        int afterPetIsFed=bob.getFoodLevel();
        Assert.assertEquals(afterPetIsFed-beforePetIsFed,5);
    }
    @Test
    public void waterLevelShouldIncrease() {
        VirtualPet bob =new VirtualPet("Bob","He is funny",50,50, 50);
        int beforePetIsWatered = bob.getWaterLevel();
        bob.waterPet();
        int afterPetIsWatered=bob.getWaterLevel();
        Assert.assertEquals(afterPetIsWatered-beforePetIsWatered,5);
    }
    @Test
    public void happyLevelShouldIncrease() {
        VirtualPet bob =new VirtualPet("Bob","He is funny",50,50, 50);
        int beforePetIsPlayedWith = bob.getHappyLevel();
        bob.playWithPet();
        int afterPetIsPlayedWith=bob.getHappyLevel();
        Assert.assertEquals(afterPetIsPlayedWith-beforePetIsPlayedWith,5);
    }

}
