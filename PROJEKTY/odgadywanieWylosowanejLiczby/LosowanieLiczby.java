package PROJEKTY.odgadywanieWylosowanejLiczby;

import java.util.Random;

public class LosowanieLiczby {
    private Random random;

    int losowanieLiczby(int pocz, int kon) {
        random = new Random();
        return random.nextInt(10) + 1;
    }
}
