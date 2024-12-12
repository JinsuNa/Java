package oopEating.src;

import oopEating.src.meat.Meat;

public class MeatEater {
    private String name = "육식주의자";
    public void meatEat(Meat meat) {
        System.out.println(name + "가 " + meat.eat());

    }
}
