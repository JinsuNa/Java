package lambda;
// 람다는 내가 처리할 데이터를 다음단계로 넘겨주는 역활이다.

public class LambdaExpression {
    public static void main(String[] args) {
        // 자바스크립트 : =>     <<이걸 에로우 펑션이라고 한다.
        Calc add = (x, y) -> {
            return x + y;
        };
        Calc minus = (x, y) -> x - y;

        System.out.println(add.calculator(3, 4));
        System.out.println(minus.calculator(7, 3));
    }
}

/*
① 매개 변수가 하나인 경우 자료형과 괄호 생략 가능 : str-> {System.out.println(str); }
② 매개 변수가 두개 이상인 경우 중괄호를 생략할 수 없음 : x, y -> {System.out.println(x+y); } //오류③ 실행문이 한 문장인 경우 중괄호 생략 가능 : str-> System.out.println(str);
④ 실행문이 한 문장이라도 return문이 있으면 중괄호 생략 불가 : str -> return str.length(); //오류
⑤ 실행문이 한 문장의 반환문인 경우 return 과 중괄호 모두 생략 가능 : str -> str.length();
 */