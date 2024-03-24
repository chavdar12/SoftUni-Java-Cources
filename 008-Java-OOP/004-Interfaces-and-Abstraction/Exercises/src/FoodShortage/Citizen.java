package FoodShortage;


public class Citizen implements Buyer, Identifiable, Person {
    private final String name;
    private final int age;
    private final String id;
    private final String birthDate;
    private int food = 0;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public int getFood() {
        return food;
    }

    public void buyFood() {
        this.food += 10;
    }
}
