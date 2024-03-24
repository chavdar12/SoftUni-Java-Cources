package src.StrategyPattern;

public class Person implements Comparable<src.ComparingObjects.Person> {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(src.ComparingObjects.Person other) {
        int result = this.name.compareTo(other.name);
        if (result == 0) {
            result = this.age - other.age;
        }
        return result;

    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }
}

