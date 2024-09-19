package Animals;

public class Dog extends Animal {

    private String ownersName;


    public Dog(String name, int age, String ownersName) {
        super(name, age);
        this.ownersName = ownersName;
    }

    public void walk() {
        System.out.println(this.name + " гуляет.");
    }

    public void ownersName() {
        System.out.println("Имя хозяина: " + ownersName);
    }

    @Override
    public void say() {
        System.out.println("Собака " + this.name + "  говорит: Гав");
    }

    @Override
    public void live() {
        super.live();
        walk();
        say();
    }

    public void printInfo() {
        System.out.println("Собака. Имя: " + this.name + ", возраст: " + this.age + ", имя хозяина: " + this.ownersName);
    }
}
