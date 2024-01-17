package PROJEKTY.odgadywanieWylosowanejLiczby;

import java.util.Random;

public class LosowanieLiczby {
    private Random random;

    int losowanieLiczby(int kon) {
        random = new Random();
        return random.nextInt(kon) + 1;
    }
}
