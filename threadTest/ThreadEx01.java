package threadTest;

public class ThreadEx01 { //외부에 처리하는 방법 (문제가 생기면 내가 아닌 다른쪽에 문제를 넘겨서 해결)
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            System.out.println("메인 스레드 : " + i);
            Thread.sleep(1000); // 1초가 1000

        }
    }
}
