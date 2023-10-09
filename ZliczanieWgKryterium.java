import java.util.Random;
import java.util.Scanner;

public class ZliczanieWgKryterium {
    private int[] tablica = new int[20];
    private Losowanie losowanie = new Losowanie();
    Scanner scanner = new Scanner(System.in);

    public void wyswietlanie() {
        uzupelnienieTablicy();
        System.out.print("Jaką liczbę chcesz policzyć?: ");
        zliczanie(scanner.nextInt());
        System.out.println();
    }

    private void uzupelnienieTablicy() {
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = losowanie.losowanie();
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
    }

    private void zliczanie(int count) {
        int ile = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] == count) {
                ile++;
            }
        }
        System.out.println("Ilość liczb " + count + " to: " + ile);
    }
}
