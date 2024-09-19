package Animals;

public class Animal {
    private static long nextId = 1;

    protected final long id;
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.id = nextId++;
        this.name = name;
        this.age = age;
    }

    public void eat() {

        System.out.println(this.getClass().getSimpleName() + " # " + id + " поел");
    }

    public void say() {
    }

    public void live() {
        eat();
    }

    public void printInfo() {

    }
}
