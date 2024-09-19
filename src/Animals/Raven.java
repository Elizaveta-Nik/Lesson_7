package Animals;

public class Raven extends Animal implements Bird {

    private int maxHeight;


    public Raven(String name, int age, int maxHeight) {
        super(name, age);
        this.maxHeight = maxHeight;
    }

    @Override
    public void fly() {
        System.out.println("Ворон летит. Максимальная высота полета: " + maxHeight);
    }

    @Override
    public void say() {
        System.out.println("Ворона " + this.name + " говорит: кар");
    }

    @Override
    public void live() {
        super.live();
        fly();
        say();
    }

    public void printInfo() {
        System.out.println("Ворон. Имя: " + this.name + ", " +
                "возраст: " + this.age + ", максимальная высота полета: " + this.maxHeight);
    }

}

