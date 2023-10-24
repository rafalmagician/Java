package listaGosciNaImpreze;

import java.util.*;

public class Party {
    private final List<Guest> guests = new ArrayList<>();
    private final Set<String> meals = new HashSet<>();
    private final HashMap<Integer, Guest> phoneToGuest = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public void addGuest() {
        System.out.println("Podaj imie gościa: ");
        String name = scanner.nextLine();

        System.out.println("Podaj preferowany posiłek: ");
        String meal = scanner.nextLine();

        System.out.println("Podaj numer telefonu: ");
        int phoneNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Czy weganin? (Y/N): ");
        String isVeganString = scanner.nextLine();

        boolean isVegan;
        if (isVeganString.equals("Y")) {
            isVegan = true;
        } else {
            isVegan = false;
        }

        Guest guest = new Guest(name, meal, phoneNumber, isVegan);

        meals.add(meal);
        phoneToGuest.put(phoneNumber, guest);
        guests.add(guest);
    }

    public void displayGuestByPhoneNumber() {
        System.out.print("Podaj numer telefonu: ");
        Integer phoneNumber = Integer.valueOf(scanner.nextLine());
        Guest guest = phoneToGuest.get(phoneNumber);

        guest.displayGuestInformation();
        System.out.println();
    }

    public void displayMeals() {
        for (String e : meals) {
            System.out.println(e);
        }
        System.out.println();
    }

    public void displayGuests() {
        int i = 1;
        for (Guest guest : guests) {
            System.out.print(i + ". ");
            guest.displayGuestInformation();
            i++;
        }
        System.out.println();
    }
}
