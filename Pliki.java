import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Pliki {
    private File file;
    private Scanner scanner = new Scanner(System.in);

    public void display() throws IOException {
        System.out.print("Podaj nazwę pliku i rozszerzenie 'np. plik.txt': ");
        file = new File(fileName());
        System.out.println("Czy plik istnieje: " + isFileExists());
        createFile();
        deleteFile();
    }

    private boolean isFileExists() {
        return file.exists();
    }

    private String fileName() {
        return scanner.nextLine();
    }
    private void createFile() throws IOException {
        if (!isFileExists()) {
            boolean success = file.createNewFile();
            System.out.println("Plik został utworzony: " + success);
        } else {
            System.out.println("Plik już istnieje");
        }
        System.out.println();
    }

    private void deleteFile() {
        System.out.print("Czy chcesz usunąć plik 't/n': ");
        if ("T".equals(scanner.nextLine())) {
            System.out.println("Plik został usunięty " + file.delete());
        } else {
            System.out.println("Plik NIE został usunięty");
        }
    }
}
