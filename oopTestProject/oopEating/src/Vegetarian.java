package oopEating.src;

import oopEating.src.fruit.Fruit;

public class Vegetarian {
    private String name = "채식주의자";

    //composition 방법
    private final Fruit fruit;

    public Vegetarian(Fruit fruit) {
        this.fruit = fruit;
    }

    public void vegetableEat() {
        System.out.println(name + "가 " + fruit.eat());
    }
}
