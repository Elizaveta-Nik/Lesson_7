package Figure;

public class Rectangle extends Figures {
    double sideA;
    double sideB;

    public Rectangle(double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public double areaCalculate(){
        return sideA * sideB;
    }

    public double perimeterCalculate(){
        return sideA + sideB + sideA + sideB;
    }
    public void printInfo(){
        System.out.println("Прямоугольник: ");
        System.out.printf("Сторона 1 - %.2f, Сторона 2 - %.2f%n", sideA, sideB);
    }
}
