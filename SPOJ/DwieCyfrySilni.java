package SPOJ;

import java.util.Scanner;

public class DwieCyfrySilni {
    private int n;
    private Scanner scanner = new Scanner(System.in);

    public void silnia() {
        System.out.print("Podaj liczbe calkowita: ");
        n = scanner.nextInt();

        int wynik = 1;
        for (int i = 1; i <= n; i++) {
            wynik *= i;
        }

        System.out.println(n + "! = " + wynik);
    }

    public static long silnia(long liczba) {
        if (liczba == 0) {
            return 1;
        } else {
            return liczba * silnia(liczba - 1);
        }
    }
}
