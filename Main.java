import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        TabliceWektory tabliceWektory = new TabliceWektory();
        Pliki pliki = new Pliki();

        boolean choise = false;
        while (!choise) {

            System.out.println("=====  MENU  =====");
            System.out.println("0 -> WYJŚCIE");
            System.out.println("1 -> PRZEDZIAŁY LICZBOWE I LICZBY");
            System.out.println("2 -> TABLICE - WEKTORY");
            System.out.println("3 -> PLIKI");
            System.out.print("-> ");
            switch (scanner.nextInt()) {
                case 0 -> choise = true;
                case 2 -> tabliceWektory.display();
                case 3 -> pliki.display();
            }

        }

        System.out.println("Koniec programu!");

    }

}
