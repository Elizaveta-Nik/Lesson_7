package Figure;

public class Circle extends Figures {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double areaCalculate() {
        return Math.PI * (radius * radius);
    }

    public double perimeterCalculate() {
        return Math.PI * 2 * radius;
    }
    public void printInfo(){
        System.out.println("Круг: ");
        System.out.printf("Радиус - %.2f%n", radius);
    }
}

