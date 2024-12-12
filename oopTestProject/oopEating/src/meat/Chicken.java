package oopEating.src.meat;

public class Chicken implements Meat {
    private String name = "닭고기";
    private String brand = "하림";

    @Override
    public String eat() {
        return brand + " " + name + "을(를) 먹어요.";
    }
}
