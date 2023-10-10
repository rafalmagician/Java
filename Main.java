import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        WyszukiwanieLiniowe wyszukiwanieLiniowe = new WyszukiwanieLiniowe();
        ZliczanieWgKryterium zliczanieWgKryterium = new ZliczanieWgKryterium();
        WyszukiwanieMaxMin wyszukiwanieMaxMin = new WyszukiwanieMaxMin();
        JednoczesneWyszukiwanieMaxMin jednoczesneWyszukiwanieMaxMin = new JednoczesneWyszukiwanieMaxMin();
        SortowaniePrzezWybor sortowaniePrzezWybor = new SortowaniePrzezWybor();

        boolean choise = false;
        while (!choise) {

            System.out.println("Wybierz opcję z menu: ");
            System.out.println("0 -> Wyjście");
            System.out.println("1 -> Wyszukiwanie liniowe");
            System.out.println("2 -> Zliczanie wg kryterium");
            System.out.println("3 -> Wyszukiwanie max i min");
            System.out.println("4 -> Jednoczesne wyszukiwanie max i min");
            System.out.println("5 -> Sortowanie przez wybór");
            System.out.print("-> ");
            switch (scanner.nextInt()) {
                case 0 -> choise = true;
                case 1 -> wyszukiwanieLiniowe.wyswietlenie();
                case 2 -> zliczanieWgKryterium.wyswietlanie();
                case 3 -> wyszukiwanieMaxMin.wypisanie();
                case 4 -> jednoczesneWyszukiwanieMaxMin.wypisanie();
                case 5 -> sortowaniePrzezWybor.wyswietlenieDanych();
            }

        }

        System.out.println("Koniec programu!");

    }

}
