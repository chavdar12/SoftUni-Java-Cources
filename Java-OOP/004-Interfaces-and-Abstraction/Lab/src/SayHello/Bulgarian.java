package SayHello;

public class Bulgarian implements Person {
    private final String name;

    public Bulgarian(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}

