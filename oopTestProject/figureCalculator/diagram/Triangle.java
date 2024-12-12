package figureCalculator.diagram;

public class Triangle extends Figure {
    String name = "삼각형";

    @Override
    public String getName() {
        return name;
    }

    public void setWidth(int width) {
        super.setWidth(width);
    }
    public void setHeight(int height) {
        super.setHeight(height);
    }

    @Override
    public double area() {
        return width * height / 2;
    }

}
