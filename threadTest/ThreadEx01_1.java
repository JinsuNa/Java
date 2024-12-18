package threadTest;

public class ThreadEx01_1 { //내가 처리하는 방법. (문제가 생겼을 때 내가 처리한다.)
    public static void main(String[] args) {
        SubThread subThread = new SubThread();
        Thread thread = new Thread(subThread);
        thread.start();
        for (int i = 1; i <= 10; i++) {
            try {
                System.out.println("메인 스레드 : " + i);
                Thread.sleep(1000); // 1초가 1000
            } catch (InterruptedException e) {
                e.getMessage();
//                e.printStackTrace();  위에 있는 getMessage랑 똑같다.
//                 프로그램이 오류가 났을 때 해당 에러를 해결하기 위해 try, catch를 사용하는거다. 에러가 난다면 메세지를 출력한다.
            }

        }

    }
}
