package figureCalculator.diagram;

public class Rectangle extends Figure {

    private String name = "사각형";

    public String getName() {
        return name;
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
    }
    public void setHeight(int height) {
        super.setHeight(height);
    }

    @Override
    public double area() {
        return this.width * this.height;
    }


}
