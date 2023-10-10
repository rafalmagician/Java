public class JednoczesneWyszukiwanieMaxMin {
    private int[] tab = new int[20];
    private Losowanie losowanie = new Losowanie();
    private int ile = 20;

    public void wypisanie() {
        wpisanieLiczb();
        maxMin();
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

    private void maxMin() {
        int max = tab[0];
        int min = tab[0];

        for (int i = 0; i < tab.length; i++) {
            if (max < tab[i]) {
                max = tab[i];
            }
            if (min > tab[i]) {
                min = tab[i];
            }
        }
        System.out.println("Max = " + max + ", Min = " + min);
    }
}
