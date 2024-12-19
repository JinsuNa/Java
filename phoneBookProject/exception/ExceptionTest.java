package exception;

public class ExceptionTest {

    //런타임 오류 예방하는 방법
    public static void divide(int a, int b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException("0으로 나누면 안돼!!!");
        }
        int c = a / b;
        System.out.println(c);
    }
    public static void main(String[] args) {

        int a;
        int b;
        a = 10;
        b = 0;
        try {
            divide(a, b);

        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

//        try {
//            int c = a / b;
//            System.out.println(c);
//        } catch (ArithmeticException e) {
//            System.out.println("ArithmeticException 발생");
//            System.out.println("0 으로 나누면 안되여");
//        }finally {
//            System.out.println("무조건 실행");  //exit code 1 이 뜨지 않게 해준다.
//        }

//        //런타임 오류
//        int a;
//        int b;
//        a = 10;
//        b = 0;
//        int c = a / b;
//        System.out.println(c); // 10/0 0으로 나누는건 런타임 오류가 발생한다.

        // exit code 0 = 정상적으로 종료
        // exit code 1 = 비정상적인 종료(예외 오류 발생했다는 뜻)

    }
}
