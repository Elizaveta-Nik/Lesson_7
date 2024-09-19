package Animals;

import java.util.Random;

public class Task_2 {
    public static void run() {

        Animal[] animals = new Animal[10];

        for (int i = 0; i < animals.length; i++) {
            animals[i] = getRandomAnimals();
        }

        for (Animal animal : animals) {
            animal.printInfo();
            animal.live();
            System.out.println();
        }
    }


    private static Animal getRandomAnimals() {
        Random random = new Random();
        int flag = random.nextInt(5);
        if (flag == 0) {
            return new Dog(getRandomName(), getRandomValue(), getRandomName());
        } else if (flag == 1) {
            return new Cat(getRandomName(), getRandomValue());
        } else if (flag == 2) {
            return new Raven(getRandomName(), getRandomValue(), getRandomValue());
        } else if (flag == 3) {
            return new Parrot(getRandomName(), getRandomValue(), getRandomValue(), getRandomColor());
        } else {
            return new Fish(getRandomName(), getRandomValue());
        }
    }

    private static int getRandomValue() {
        Random random = new Random();
        return (random.nextInt(1, 50));
    }

    private static String getRandomName() {
        Random random = new Random();
        String[] names = new String[]{"Петя", "Бобик", "Ася", "Жоржик", "Дори", "Арсен"};

        return names[random.nextInt(0, names.length - 1)];
    }

    private static String getRandomColor() {
        Random random = new Random();
        String[] names = new String[]{"Красный", "Желтый", "Зеленый", "Синий", "Белый", "Серый"};

        return names[random.nextInt(0, names.length - 1)];
    }

}
