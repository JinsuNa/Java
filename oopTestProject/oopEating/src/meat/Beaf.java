package oopEating.src.meat;

public class Beaf implements Meat {
    private String name = "소고기";
    private String brand = "한우";

    @Override
    public String eat() {
        return brand + " " + name + "을(를) 먹어요.";
    }
}
