package Animals;

public class Fish extends Animal {

    public Fish(String name, int age) {
        super(name, age);
    }

    public void swim() {
        System.out.println(this.name + " плавает");
    }

    @Override
    public void live() {
        super.live();
        swim();
    }

    public void printInfo() {
        System.out.println("Рыба. Имя: " + this.name + ", возраст: " + this.age);
    }
}
