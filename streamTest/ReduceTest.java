package streamTest;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class ReduceTest {

    public static void main(String[] args) {
        String[] greetings = {"안녕하세요~~~~", "hello", "Good morning^^"};
        String result;
        //람다식으로 reduce() 구현하기
        result = Arrays.stream(greetings).reduce("", (str1, str2) -> {
            if (str1.length() >= str2.length()) {
                return str1;
            } else {
                return str2;
            }
        });

        System.out.println(result);

        //BinaryOperator를 이용해서 reduce() 구현하기
        // 코드가 많을때는 바이너리오퍼레이터가 낫다.

        result = Arrays.stream(greetings).reduce(new CompareString()).get();
        System.out.println("BinaryOperator reduce 구현 "+result);
    }

}

class CompareString implements BinaryOperator<String> {
    @Override
    public String apply(String str1, String str2) {
        if (str1.length() >= str2.length()) {
            return str1;
        } else {
            return str2;
        }

    }
}