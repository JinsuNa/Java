package oopEating.src;

import oopEating.src.fruit.Apple;
import oopEating.src.fruit.Fruit;
import oopEating.src.fruit.Mango;
import oopEating.src.meat.Beaf;
import oopEating.src.meat.Chicken;
import oopEating.src.meat.Meat;
import oopEating.src.meat.Pork;

public class OopEatingMain {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit mango = new Mango();
        Vegetarian w1 = new Vegetarian(apple);
        Vegetarian w2 = new Vegetarian(mango);
        w1.vegetableEat();
        w2.vegetableEat();

        System.out.println("");

        Meat chicken = new Chicken();
        Meat beaf = new Beaf();
        Meat pork = new Pork();
        MeatEater m1 = new MeatEater();
        MeatEater m2 = new MeatEater();
        MeatEater m3 = new MeatEater();
        m1.meatEat(chicken);
        m2.meatEat(beaf);
        m3.meatEat(pork);

    }
}
