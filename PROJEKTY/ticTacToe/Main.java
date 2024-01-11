package PROJEKTY.ticTacToe;

public class Main {
    public static void main(String[] args) {

        int[][] tab = new int[3][3];
        int count = 0;

        System.out.println("   a   b   c");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(count++ + "  ");
            for (int j = 0; j < tab[i].length; j++) {
                if (j == 2) {
                    System.out.println(tab[i][j]);
                } else {
                    System.out.print(tab[i][j] + " | ");
                }
            }
            if (i == 2) {
                System.out.println();
            } else {
                System.out.println("  -----------");
            }
        }

    }
}
