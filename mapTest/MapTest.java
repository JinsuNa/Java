/*
Collection : ArrayList, Set, Map 을 말한다.

Set : 중복불가

Set<type> name = new HashSet<>();


Map<키의 타입, 값의 타입> : 중복 허용

키, 값
 */

package mapTest;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        //key, value 의 쌍
        Map<String, Integer> store = new HashMap<>();
        //add
        store.put("water", 1);
        store.put("fruit", 2);
        // 같은 키 값은 수정
        store.put("fruit", 3);
        store.put("my", 1);
        // 삭제 방법
        store.remove("my");
        System.out.println(store);
        for (String key : store.keySet()) {
            store.get(key);
            System.out.println(key + " : " + store.get(key));
        }
    }
}
