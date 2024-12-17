package streamTest;

// stream 을 다루는 아이 : collection (컬렉션의 대표적인 종류는 배열, ArrayList, Map
// 주로 사용하는 컬렉션은 배열,ArrayList다.
// 전체 안에있는 데이터를 필터를 하여 어떤 특정한 조건으로 인하여 직접수행을 하여 코드를 작성해야 하는데
// 스트림을 이용하면 물 흐르듯이 다음단계로 변경하게 해주는것이다.
// 예를 들어  Arrays.stream(arr).forEach(x -> System.out.println(x)); 이걸 람다식이 아닌 일반 코딩으로 구현하려면 for문을 사용해야하는데 저렇게 하면 코드가 확 줄어버린다.
// 보통 반복문을 사용할 때 사용.

import java.util.Arrays;

public class IntArrayTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(arr).sum(); //Arrays = 클래스 , stream = static 변수
        System.out.println(" ");
        System.out.println(sum);
        long count = Arrays.stream(arr).count();
        System.out.println(" ");
        System.out.println(count);
        System.out.println(" ");
        Arrays.stream(arr).forEach(x -> System.out.println(x));  //이게 람다식이다.

    }
}
