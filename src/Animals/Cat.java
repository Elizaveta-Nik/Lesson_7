package Animals;

public class Cat extends Animal {


    public Cat(String name, int age) {
        super(name, age);

    }

    @Override
    public void say() {
        System.out.println("Кот " + this.name + "  говорит: мяу");
    }

    @Override
    public void live() {
        super.live();
        say();
    }

    public void printInfo() {
        System.out.println("Кот. Имя: " + this.name + ", возраст: " + this.age);
    }
}
