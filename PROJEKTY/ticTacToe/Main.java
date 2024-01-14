package PROJEKTY.ticTacToe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //wspolrzedne uzytkownika
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wspolrzedne (gdzie wstawic znak): ");
        System.out.print("Wsp 1: ");
        int wsp1 = scanner.nextInt();
        System.out.print("Wsp 2: ");
        int wsp2 = scanner.nextInt();

        System.out.println("Wspolrzedne: " + "wsp1 = " + wsp1 + "; wsp2 = " + wsp2);


        //wyswietlenie tabeli
//        int[][] tab = new int[3][3];
//        int count = 1;
//
//        System.out.println("   1   2   3");
//        for (int i = 0; i < tab.length; i++) {
//            System.out.print(count++ + "  ");
//            for (int j = 0; j < tab[i].length; j++) {
//                if (j == 2) {
//                    System.out.println(tab[i][j]);
//                } else {
//                    System.out.print(tab[i][j] + " | ");
//                }
//            }
//            if (i == 2) {
//                System.out.println();
//            } else {
//                System.out.println("  -----------");
//            }
//        }

    }
}
