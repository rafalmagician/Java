import java.util.Random;
import java.util.Scanner;

public class Losowanie {
    private Random random = new Random();
    private int[] tablica = new int[20];
    Scanner scanner = new Scanner(System.in);

    public void losowanie() {
        System.out.print("Z ilu liczb ma byc losowanie?: ");
        liczbyZZakresu(scanner.nextInt());
    }

    private void liczbyZZakresu(int ile) {
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = random.nextInt(ile);
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
    }
}
