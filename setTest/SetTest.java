/*
데이터구조(자료구조)

ArrayList, Map을 제일 많이 사용한다. 요즘에는 Array를 많이 사용한다.

ArrayList : 중복을 허용한다.

List<담을타입> 이름 = new ArrayList<>();
-삽입 삭제가 자유롭다.

이름.size(), indexOf(), add(), set(), remove()

set : 중복 불가

Map: 중복을 허용한다.
 */

package setTest;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<String> fruit = new HashSet<>();
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Apple");

        for (String x : fruit) {
            System.out.println(x);
        }
        System.out.println(fruit);
    }
}
