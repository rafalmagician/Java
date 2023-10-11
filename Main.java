import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TabliceWektory tabliceWektory = new TabliceWektory();

        boolean choise = false;
        while (!choise) {

            System.out.println("=====  MENU  =====");
            System.out.println("0 -> WYJŚCIE");
            System.out.println("1 -> PRZEDZIAŁY LICZBOWE I LICZBY");
            System.out.println("2 -> TABLICE - WEKTORY");
            switch (scanner.nextInt()) {
                case 0 -> choise = true;
                case 2 -> tabliceWektory.display();
            }

        }

        System.out.println("Koniec programu!");

    }

}
