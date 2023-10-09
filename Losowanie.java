import java.util.Random;

public class Losowanie {
    private Random random = new Random();

    public int losowanie() {
        return random.nextInt(2);
    }
}
