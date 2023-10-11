import java.util.Scanner;

public class TabliceWektory {

    private Scanner scanner = new Scanner(System.in);
    private WyszukiwanieLiniowe wyszukiwanieLiniowe = new WyszukiwanieLiniowe();
    private ZliczanieWgKryterium zliczanieWgKryterium = new ZliczanieWgKryterium();
    private WyszukiwanieMaxMin wyszukiwanieMaxMin = new WyszukiwanieMaxMin();
    private JednoczesneWyszukiwanieMaxMin jednoczesneWyszukiwanieMaxMin = new JednoczesneWyszukiwanieMaxMin();
    private SortowaniePrzezWybor sortowaniePrzezWybor = new SortowaniePrzezWybor();

    public void display() {
        menu();
        wybor();
        System.out.println();
    }

    private void menu() {
        System.out.println("Wybierz opcję z menu: ");
        System.out.println("0 -> Wyjście");
        System.out.println("1 -> Wyszukiwanie liniowe");
        System.out.println("2 -> Zliczanie wg kryterium");
        System.out.println("3 -> Wyszukiwanie max i min");
        System.out.println("4 -> Jednoczesne wyszukiwanie max i min");
        System.out.println("5 -> Sortowanie przez wybór");
        System.out.print("-> ");
    }

    private void wybor() {
        switch (scanner.nextInt()) {
            case 1 -> wyszukiwanieLiniowe.wyswietlenie();
            case 2 -> zliczanieWgKryterium.wyswietlanie();
            case 3 -> wyszukiwanieMaxMin.wypisanie();
            case 4 -> jednoczesneWyszukiwanieMaxMin.wypisanie();
            case 5 -> sortowaniePrzezWybor.wyswietlenieDanych();
        }
    }
}
