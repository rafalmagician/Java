import java.io.*;
import java.util.Scanner;

public class Pliki {
    private File file;
    private PrintWriter printWriter;
    private Scanner scanner = new Scanner(System.in);
    private int choise;

    public void display() throws IOException {
        System.out.println("=== MENU ===");
        System.out.println("1 -> USUWANIE");
        System.out.println("2 -> ODCZYT");
        System.out.println("3 -> ZAPIS");
        System.out.println("4 -> TWORZENIE");
        System.out.print("-> ");

        choise = Integer.valueOf(scanner.nextLine());
        switch (choise) {
            case 1 -> deleteFile();
            case 2 -> odczytPliku();
            case 3 -> zapisDoPliku();
            case 4 -> createFile();
        }

        System.out.println();
    }

    private void createFile() throws IOException {
        System.out.print("Podaj nazwę pliku i rozszerzenie 'np. plik.txt': ");
        file = new File(fileName());
        if (!isFileExists()) {
            file.createNewFile();
            System.out.println("Plik został utworzony pomyślnie");
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
        System.out.print("Podaj nazwę pliku do usunięcia: ");
        file = new File(fileName());
        if (isFileExists()) {
            file.delete();
            System.out.println("Plik został usunięty");
        } else {
            System.out.println("Plik NIE został usunięty");
        }
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

    private void zapisDoPliku() throws IOException {
        System.out.println("Zapis do pliku: ");
        System.out.print("Podaj nazwę pliku do zapisania danych: ");
        file = new File(fileName());
        if (isFileExists()) {
            printWriter = new PrintWriter(file);
            System.out.print("Podaj tekst do zapisu: ");
            printWriter.println(scanner.nextLine());
            printWriter.close();
        } else {
            System.out.println("Plik nie istnieje");
        }
    }
}
