package myClass.extendTest.main;

import myClass.extendTest.CheeseHamburger;
import myClass.extendTest.ChickenBurger;
import myClass.extendTest.Hamburger;

public class MainClazz {
    public static void main(String[] args) {
        Hamburger cheese = new CheeseHamburger();  //Hamburger 의 타입을 가지고 있어 부모를 바라보기 때문에 재료3을 가져올순 없는데 아래에 강제적으로 캐스팅을 하는 방법이 나와 있다.
        System.out.println(cheese.toString());
        //cheseBurger 에 있는 재료3을 찍고싶을 때는 어떻게 해야할까?
        System.out.println(((CheeseHamburger)cheese).get재료3());  //이걸 캐스팅 이라고 한다.
        cheese.order();
        System.out.println("================================");

        Hamburger chicken = new ChickenBurger();
        System.out.println(chicken.toString());
        chicken.order();
    }
}
