package Animals;

public class Parrot extends Animal implements Bird {

    private String color;
    private int height;

    public Parrot(String name, int age, int height, String color) {
        super(name, age);
        this.height = height;
        this.color = color;
    }

    @Override
    public void say() {
        System.out.println("Попугай " + this.name + " говорит: привет!");
    }

    @Override
    public void fly() {
        System.out.println("Попугай летит. Высота полета: " + height);
    }

    @Override
    public void live() {
        super.live();
        say();
        fly();
    }

    public void printInfo() {
        System.out.println("Попугай. Имя: " + this.name + ", возраст: " + this.age + ", высота полета: " + this.height +
                ", цвет оперения: " + this.color);
    }
}
