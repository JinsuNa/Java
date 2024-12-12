package figureCalculator.diagram;

public class Circle extends Figure{
    String name = "원";
    private int radius;

    public String getName() {
        return name;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    public double area() {
        return Math.PI * (radius * radius);
    }
}
