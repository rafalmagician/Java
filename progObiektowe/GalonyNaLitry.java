package progObiektowe;

public class GalonyNaLitry {
    public void galonyNaLitry() {

        double litry;
        int count = 0;
        for (int galony = 1; galony <= 100; galony++) {

            if (count == 10) {
                System.out.println();
                count = 0;
            }
            count++;
            litry = galony * 3.7854;
            System.out.println(galony + " galonow to: " + litry + " litrow.");

        }

    }
}
