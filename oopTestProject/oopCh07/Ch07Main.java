package oopCh07;

import oopCh07.animal.Monkey;
import oopCh07.animal.Tiger;

public class Ch07Main {

    public static void moveWildAnimal(WildMoveInterface wild) {
        wild.up();
        wild.down();
    }

    public static void moveMildAnimal(MildMoveInterface mild) {
        mild.hide();
        mild.right();
    }

    public static void main(String[] args) {
//        Monkey monkey = new Monkey();
        MildAnimal monkey = new Monkey();
        monkey.채집();
        moveMildAnimal(monkey);

        System.out.println("");

        Tiger tiger = new Tiger();
//        WildAnimal tiger = new Tiger(); 위에 거랑 결과는 같다.
//        WildMoveInterface tiger = new Tiger();  이거는 wildAnimal 에 attack 이있기때문에 최상위 조상은 들어올 수 없다.
        tiger.attack();
        moveWildAnimal(tiger);
    }
}
