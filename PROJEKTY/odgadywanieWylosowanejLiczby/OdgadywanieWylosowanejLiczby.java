package PROJEKTY.odgadywanieWylosowanejLiczby;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OdgadywanieWylosowanejLiczby {
    private Scanner scanner;
    private int userChoise;

    private Poziom1 poziom1;
    private Poziom2 poziom2;
    private Poziom3 poziom3;
    private boolean shouldContinue;

    OdgadywanieWylosowanejLiczby() {
        this.scanner = new Scanner(System.in);
        this.poziom1 = new Poziom1(0, 10, 3);
        this.poziom2 = new Poziom2(0, 50, 5);
        this.poziom3 = new Poziom3(0, 100, 10);
        this.shouldContinue = true;
    }

    void graZgadywanieLiczby() {

        try {
            while (shouldContinue) {

                menu();
                userChoise = getNumber();

                switch (userChoise) {

                    case 0 -> shouldContinue = false;
                    case 1 -> poziom1.poziom1();
                    case 2 -> poziom2.poziom2();
                    case 3 -> poziom3.poziom3();

                }
            }
        } catch (InputMismatchException e) {
            sout("Podano bledna wartosc!");
        } catch (Exception e) {
            sout("Wystapil jakis blad!");
        } finally {
            scanner.close();
            sout("Koniec programu!");
        }

    }

    private int getNumber() {
        return scanner.nextInt();
    }

    private void menu() {
        System.out.println("0 - wyjscie");
        System.out.println("1 - poziom [0;10]");
        System.out.println("2 - poziom [0;50]");
        System.out.println("3 - poziom [0;100]");
        System.out.print("Wybierz poziom: ");
    }

    private void sout(String text) {
        System.out.println(text);
    }
}
