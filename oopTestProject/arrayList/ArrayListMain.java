package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
//        ArrayList<Integer> intData = new ArrayList<>();
        List<Integer> intData = new ArrayList<>();  // 부모 타입이다. 예를들어 abstract ArrayInterface가 있다면 해당 클래스를 상속받는 list이다.
        List<String> strData = new ArrayList<>();

        // 리스트 생성 시 초기값 부여하는 방법
        List<Integer> init = new ArrayList<>(Arrays.asList(1, 2, 3));
//        System.out.println(init);  출력값 : [1, 2, 3]
        for (Integer i : init) {
            System.out.println(i);
        }
        System.out.println(init);

        //CRUD
        // create 데이터 추가 방법 add
        strData.add("나진수");
        strData.add("장원영");
        strData.add("로제");
        System.out.println(strData);

        // 갯수 확인 size
        System.out.println(strData.size());

        //인덱스로 값 찾기 get
        System.out.println(strData.get(0));

        // 로제 출력
        // 1. 로제의 인덱스 값 찾기 indexOf
        int index = strData.indexOf("로제");
        System.out.println(index);
        System.out.println(strData.get(index));

        // 삭제하기 remove
        strData.remove("나진수");
        System.out.println(strData);

        // 수정하기
        // 나진수 추가
        strData.add("나진수");
        System.out.println(strData);
        // 나진수를 홍길동으로 수정
        // 1. 나진수의 위치를찾기
        // 2. 해당 인덱스를 찾으며 값 수정하기
        index = strData.indexOf("나진수");
        strData.set(index, "홍길동");
        System.out.println(strData);

    }
}
