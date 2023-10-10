public class NajczestszaWartoscWZbiorze {
    private int[] tab = new int[10];
    private Losowanie los = new Losowanie();
    private int licznik = 0;
    private WpisanieLiczbDoTablicy wpisanieLiczbDoTablicy = new WpisanieLiczbDoTablicy();

    public void wypisz() {
        wpisanieLiczbDoTablicy.wpisanieDoTablicy();
        System.out.println();
        naczestszaWartosc();
    }

    private void naczestszaWartosc() {
        
    }
}
