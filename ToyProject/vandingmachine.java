import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String[] product = new String[5]; // 제품명
    static int[] price = new int[5]; //가격
    static int[] stock = new int[5]; //재고수량
    static String[] menu = new String[3];
    static String[] adminMenu = new String[5];


    public static void main(String[] args) {
        initialize();
        user();
    }

    private static void user() {
        int inputMoney = 0;

        while (true) {  // 무한 루프로 첫 번째 루프를 감싸고, 조건에 맞을 때만 탈출
            while (inputMoney <= 0) {
                System.out.println("==================================================");
                System.out.println("자판기입니다.(번호:상품(가격)-재고)");
                for (int i = 0; i < price.length; i++) {
                    if (product[i] != null) {
                        System.out.print((i + 1) + ":" + product[i] + "(" + price[i] + "원" + ")" + "-" + stock[i] + "개 ");
                    }
                }
                System.out.println();
                System.out.println("==================================================");
                System.out.println("돈을 넣어주세요:\n");
                inputMoney = sc.nextInt();
                if (inputMoney==1004) break;
                System.out.println("넣은 돈의 가격:" + inputMoney + "원");
            }

//            admin 페이지 만들기






            // 두 번째 while 루프 (메뉴 선택)
            int choiceContinueNumber = 0;
            while (choiceContinueNumber != 3) {
                for (int i = 0; i < price.length; i++) {
                    if (product[i] != null) {
                        System.out.println((i + 1) + ":" + product[i] + "(" + price[i] + "원" + ")" + "-" + stock[i] + "개 ");
                    }
                }
                menu[0] = "1:계속구매하기";
                menu[1] = "2:금액추가하기";
                menu[2] = "3:잔돈반환하기";

                int choiceMenuNumber = sc.nextInt();


                if (inputMoney >= price[choiceMenuNumber - 1] && stock[choiceMenuNumber-1]>0) {
                    System.out.println(product[choiceMenuNumber - 1] + "이(가) 나왔다!");
                    inputMoney -= price[choiceMenuNumber - 1];  // 돈 차감
                    stock[choiceMenuNumber - 1]--;  // 재고 차감
                    System.out.println("잔액: " + inputMoney + "원");

//                    이제 여기서 choiceContinueNumber에 대한 루프를 설정을 해야 하는데 여기서 해야 하는지

                } else if (stock[choiceMenuNumber - 1] == 0) {
                    System.out.println(product[choiceMenuNumber - 1] + "의 재고가 남아있지 않습니다.");
//                    System.out.println("잔돈이 반환됩니다. 프로그램을 종료합니다. 잔돈:" + inputMoney);
//                    inputMoney = 0;

                } else {
                    System.out.println(product[choiceMenuNumber - 1] + "는 넣어주신 돈 보다 금액이 나갑니다.");
                }


                System.out.println(Arrays.toString(menu));
                choiceContinueNumber = sc.nextInt();



                switch (choiceContinueNumber) {
                    case 1:
//                        계속 구매하기
                        break;
                    case 2:
//                        금액 추가하기
                        System.out.println("추가할 금액을 넣어주세요.");
                        int additionalMoney = sc.nextInt();
                        inputMoney += additionalMoney;
                        System.out.println("현재잔액:" + inputMoney + "원");
                        break;
                    case 3:
//                        잔돈 반환하기
                        System.out.println("잔돈이 반환됩니다.");
                        System.out.println("잔돈: " + inputMoney + "원");
                        inputMoney = 0;
                        break;
                    default: //이 부분을 하면 메뉴로 가질 않고 다시 콜라 사이다 커피를 고르는걸로 가게된다.
                        System.out.println("잘못된 입력입니다.");
                        System.out.println("숫자는 1 ~ " + menu.length +"까지 입력해주세요.");
                        break;

                }
                if (inputMoney == 0) break;
            }
        }
    }

    private static void initialize() {
        // 콜라 정보
        product[0] = "콜라";
        price[0] = 500;
        stock[0] = 3;

        // 사이다 정보
        product[1] = "사이다";
        price[1] = 700;
        stock[1] = 3;

        // 커피 정보
        product[2] = "커피";
        price[2] = 1500;
        stock[2] = 3;
    }
}