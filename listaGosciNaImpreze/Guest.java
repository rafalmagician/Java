package listaGosciNaImpreze;

public class Guest {
    private String name;
    private String meal;
    private int phoneNumber;
    private boolean isVegan;

    public Guest(String name, String meal, int phoneNumber, boolean isVegan) {
        this.name = name;
        this.meal = meal;
        this.phoneNumber = phoneNumber;
        this.isVegan = isVegan;
    }

    public String getName() {
        return name;
    }

    public String getMeal() {
        return meal;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void displayGuestInformation() {
        System.out.print(name + " " + meal + " " + phoneNumber + " ");
        String isVeganString = isVegan ? "tak" : "nie";
        System.out.println(isVeganString);
    }
}
