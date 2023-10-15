import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Pliki {
    private File file;
    private Scanner scanner = new Scanner(System.in);
    private String wybor = "t";
    private int choise;

    public void display() throws IOException {
        System.out.print("Czy chcesz utworzyć plik 't/n': ");
        if (wybor.equals(scanner.nextLine())) {
            System.out.print("Podaj nazwę pliku i rozszerzenie 'np. plik.txt': ");
            file = new File(fileName());
            createFile();
        } else {
            System.out.println("=== MENU ===");
            System.out.println("1 -> USUWANIE");
            System.out.println("2 -> ODCZYT");
            System.out.println("3 -> ZAPIS");
            System.out.print("-> ");

            choise = Integer.valueOf(scanner.nextLine());
            switch (choise) {
                case 1 -> deleteFile();
                case 2 -> odczytPliku();
                case 3 -> zapisDoPliku();
            }

        }
        System.out.println();
    }

    private void createFile() throws IOException {
        if (!isFileExists()) {
            boolean success = file.createNewFile();
            System.out.println(success + " Plik został utworzony pomyślnie");
        } else {
            System.out.println("Plik nie został utworzony. Plik istnieje");
        }
    }

    private boolean isFileExists() {
        return file.exists();
    }

    private String fileName() {
        return scanner.nextLine();
    }

    private void deleteFile() {
        System.out.println("Usunięcie pliku: ");
        System.out.print("Czy chcesz usunąć plik 't/n': ");
        if ("t".equals(scanner.nextLine())) {
            System.out.print("Podaj nazwę pliku do usunięcia: ");
            file = new File(fileName());
            System.out.println("Plik został usunięty " + file.delete());
        } else {
            System.out.println("Plik NIE został usunięty");
        }
    }

    private void zapisDoPliku() {

    }

    private void odczytPliku() throws FileNotFoundException {
        System.out.println("Odczyt z pliku: ");
        System.out.print("Podaj nazwę pliku do odczytania: ");
        file = new File(fileName());
        Scanner odczyt = new Scanner(file);

        System.out.println();
        System.out.println("----- PLIK -----");
        while (odczyt.hasNext()) {
            System.out.println(odczyt.nextLine());
        }
    }
}
