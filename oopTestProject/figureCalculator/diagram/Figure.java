package figureCalculator.diagram;

public abstract class Figure implements FigureInterface {
   public abstract double area();

    protected int width;
    protected int height;


    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;

    }
}
