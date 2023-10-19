package pl.party;

public class Person {
    private String name;
    private String meal;

    public Person(String name, String meal) {
        this.name = name;
        this.meal = meal;
    }

    @Override
    public String toString() {
        return "Imię: %s, Posiłek: %s".formatted(name, meal);
    }
}
