package lambda;
@FunctionalInterface  // FunctionalInterface는 항상 함수를 1개만 가져야한다.
public interface Calc {
    int calculator(int x, int y);

//    int calc(int a, int b);  //이렇게 함수가 두개이상이 되면 메인이 실행이 되질 않는다.
}

