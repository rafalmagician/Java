import java.util.Random;

public class Losowanie {
    private Random random = new Random();
    private int ile;

    public int losowanie(int ile) {
        return random.nextInt(ile);
    }
}
