import java.util.Scanner;

public class WyszukiwanieLiniowe {
    private final int[] zbior_Z = new int[20];
    private Scanner scanner = new Scanner(System.in);

    public void wyswietlenie() {
        infoZbior();
        znajdzElement();
    }

    private void uzupelnienieTablicy() {
        for (int i = 0; i < zbior_Z.length; i++) {
            zbior_Z[i] = i + 1;
            System.out.print(zbior_Z[i] + " ");
        }
        System.out.println();
    }

    private void infoZbior() {
        System.out.print("Zbiór zawiera 20 elementów od [1;20]: ");
        uzupelnienieTablicy();
        System.out.print("Podaj element do znalezienia: ");
    }

    private int podajElement() {
        return scanner.nextInt();
    }

    private void znajdzElement() {
        int element = podajElement();
        if ((element >= 1) && (element <= 20)){
            System.out.println("Element jest w zbiorze!");
        } else {
            System.out.println("Elementu nie ma w zbiorze!");
        }
    }
}
