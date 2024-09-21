package Figure;


public class Triangle extends Figures{
    double sideA;
    double sideB;
    double sideC;

    public Triangle( double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    public double areaCalculate(){
        double area = (sideA+sideB+sideC)/2.0d;
        return Math.sqrt(area* (area - sideA) * (area - sideB) * (area - sideC));
    }

    public double perimeterCalculate(){
        return sideA + sideB + sideC;
    }
    public void printInfo(){
        System.out.println("Треугольник: ");
        System.out.printf("Сторона 1 - %.2f, Сторона 2 - %.2f, Сторона 3 - %.2f%n", sideA, sideB, sideC);
    }

}

