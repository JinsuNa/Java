package oopEating.src.fruit;

import java.util.ArrayList;
import java.util.List;

public class FruitList {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        Apple apple = new Apple();
        fruits.add(apple);
        fruits.add(new Mango());
        fruits.add(new Orange());
        // 사이즈 확인하기

        System.out.println(fruits.size());
        // 전체 출력해보기
        System.out.println("==============");
        System.out.println(fruits);
        System.out.println("==============");
        // index = 1 인 오브젝트 출력해보기
        Fruit a = fruits.get(1);
        System.out.println(a.getName() + " " + a.getTaste());
        System.out.println("==============");
        // 이름이 Orange인 것을 찾아서 맛을 출력하는 방법
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).getName().equals("오렌지")) {
                System.out.println(fruits.get(i).getTaste());
                break;
            }
        }

        // 사과맛을 시큼한 맛 -> 사과본연의 맛 으로 수정하는 방법
        // name이 사과인 것을 찾아서 taste를 수정한다
        System.out.println("==============");
        for (Fruit x : fruits) {
            if (x.getName().equals("사과")) {
                x.setTaste("사과 본연의 맛");
            }
            System.out.println(x.toString());
            break;
        }

        // 사과 삭제하고 출력해보기
        // 사과가 있는 인덱스 찾아서 삭제하기
        System.out.println("==============");
        for (Fruit x : fruits) {
            if (x.getName().equals("사과")) {
                // 인덱스 구하기
                fruits.remove(x);
            }
            break;
        }

        System.out.println(fruits);
        System.out.println("==============");

        // 망고를 사과로 바꾸기
        // 망고 위치 찾고 사과로 바꾸기

        for (Fruit x : fruits) {
            if (x.getName().equals("망고")) {
                int update = fruits.indexOf(x);
                // 수정하기
                fruits.set(update, new Apple());
            }
            break;
        }
        System.out.println(fruits);

    }
}
