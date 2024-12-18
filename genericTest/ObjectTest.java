package genericTest;

import java.util.ArrayList;
import java.util.List;

public class ObjectTest {
    public static void main(String[] args) {
        Object dog = new Dog();
        Object cat = new Cat();  //cat,dog 는 기본적으로 object를 상속받는 아이이기 때문에 에러가 나오질 않는다.
        List<Object> animalList = new ArrayList<>();
        animalList.add(dog);
        animalList.add(cat);
        //다운캐스팅 방법
        String name = ((Dog) dog).getName();
        System.out.println(name);

        name = ((Cat) cat).getName();
        System.out.println(name);
        System.out.println();

        Cat myCat = (Cat) cat;
        System.out.println(myCat.getName());
    }
}
