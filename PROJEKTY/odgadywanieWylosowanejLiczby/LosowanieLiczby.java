package PROJEKTY.odgadywanieWylosowanejLiczby;

import java.util.Random;

public class LosowanieLiczby {
    private Random random;

    int losowanieLiczby() {
        random = new Random();
        return random.nextInt(10) + 1;
    }
}
