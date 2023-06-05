package Java;
import java.util.Random;

public class RandomDropRateNumber {
    public static int rnd(){
        Random random = new Random();
        return random.nextInt(100);
    }
}
