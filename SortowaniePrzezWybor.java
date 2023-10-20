package progPodstawy;

public class SortowaniePrzezWybor {
    private int[] tab = new int[10];
    private Losowanie los = new Losowanie();

    public void wyswietlenieDanych() {
        wpisanieLiczbDoTablicy();
        System.out.print("Liczby posotrowane: ");
        sortowanie();
        tablicaPosortowana();
        System.out.println();
    }

    private void wpisanieLiczbDoTablicy() {
        System.out.print("Liczby w tablicy: ");
        for (int i = 0; i < tab.length; i++) {
            tab[i] = los.losowanie(100);
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }

    private void sortowanie() {
        int temp = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[i] > tab[j]) {
                    temp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = temp;
                }
            }
        }
    }

    private void tablicaPosortowana() {
        System.out.print("Liczby w tablicy: ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }
}
