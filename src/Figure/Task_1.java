package Figure;

import java.util.Random;

public class Task_1 {
    public static void run() {
        Figures[] figures = new Figures[5];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = getRandomFigures();
        }

        double totalPerimeter = 0;
        for (Figures figure : figures) {
            figure.printInfo();
            System.out.println("Площадь: " + figure.areaCalculate());
            System.out.println("Периметр: " + figure.perimeterCalculate());
            totalPerimeter += figure.perimeterCalculate();
            System.out.println();
        }
        System.out.println("Сумма периметров: " + totalPerimeter);
    }


    private static Figures getRandomFigures() {
        Random random = new Random();
        int flag = random.nextInt(3);
        if (flag == 0) {
            return new Rectangle(
                    getRandomValue(),
                    getRandomValue());
        } else if (flag == 1) {
            return new Triangle(
                    getRandomValue(),
                    getRandomValue(),
                    getRandomValue());
        } else {
            return new Circle(getRandomValue());
        }
    }

    private static double getRandomValue() {
        Random random = new Random();
        return (random.nextDouble() + 1) * 10;
    }
}
