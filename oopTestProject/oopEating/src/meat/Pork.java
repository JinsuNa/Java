package oopEating.src.meat;

public class Pork implements Meat {
    private String name = "돼지고기";
    private String brand = "한돈";

    @Override
    public String eat() {
        return brand + " " + name + "을(를) 먹어요.";
    }
}
