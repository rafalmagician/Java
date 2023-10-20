package progPodstawy;

public class WpisanieLiczbDoTablicy {
    private int[] tab = new int[10];
    private Losowanie los = new Losowanie();

    public void wpisanieDoTablicy() {
        System.out.print("Liczby wylosowane: ");
        for (int i = 0; i < tab.length; i++) {
            tab[i] = los.losowanie(10);
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }
}
