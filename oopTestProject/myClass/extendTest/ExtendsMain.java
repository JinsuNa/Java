package myClass.extendTest;

public class ExtendsMain {
    public static void main(String[] args) {
        CheeseHamburger cheeseBurger = new CheeseHamburger();
        System.out.println(cheeseBurger.getName());
        System.out.println(cheeseBurger.get재료1());
        System.out.println(cheeseBurger.get재료2());
        System.out.println(cheeseBurger.get재료3());
        System.out.println("==============================");

        ChickenBurger chickenBurger = new ChickenBurger();
        System.out.println(chickenBurger.getName());
        System.out.println(chickenBurger.get재료2());
        System.out.println(chickenBurger.get재료3());
        System.out.println("==============================");

        Hamburger burger = new Hamburger();
        System.out.println(burger.getName());
        System.out.println(burger.toString());

    }
}
