public class WyszukiwanieMaxMin {
    private int[] tab = new int[20];
    private Losowanie losowanie = new Losowanie();
    private int ile = 20;

    public void wypisanie() {
        wpisanieLiczb();
        System.out.println("Max = " + max());
        System.out.println("Min = " + min());
        System.out.println();
    }

    private void wpisanieLiczb() {
        System.out.print("Wylosowane liczby: ");
        for (int i = 0; i < tab.length; i++) {
            tab[i] = losowanie.losowanie(ile);
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }

    private int max() {
        int temp = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > temp) {
                temp = tab[i];
            }
        }
        return temp;
    }

    private int min() {
        int temp = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < temp) {
                temp = tab[i];
            }
        }
        return temp;
    }

}
