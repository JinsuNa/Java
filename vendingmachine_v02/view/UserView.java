package basic.vendingmachine_v02.view;

import basic.vendingmachine_v02.MachineMain;

import java.util.Scanner;

public class UserView {
    public static int userMoney = 0;
    Scanner sc = new Scanner(System.in);
    public void insertCoin() {
        System.out.println("돈을 넣어 주세요.");
        System.out.println(" ");
        System.out.println("1: 5,000원 2: 1,000원 3: 500원 4: 100원");
        int[] insertMoney = {5000, 1000, 500, 100};
        int number = sc.nextInt();
        switch (number) {
            case 1:
                userMoney = userMoney + insertMoney[number-1];
                break;
            case 2:
                userMoney = userMoney + insertMoney[number-1];
                break;
            case 3:
                userMoney = userMoney + insertMoney[number-1];
                break;
            case 4:
                userMoney = userMoney + insertMoney[number-1];
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");

        }
        if (number >= 1 || number <= 4) {
            System.out.println("투입 금액 :"+insertMoney[number-1]+"원");
        }
        System.out.println("사용가능 금액 :" + userMoney + "원");
    }

    public void returnCoin() {
        System.out.println("잔돈반환 화면");
        System.out.println(" ");
        System.out.println(userMoney + "원 반환 완료");
        userMoney = 0;
        System.out.println("사용가능 금액 :" + userMoney + "원");
    }

    public void selectMenu() {
        System.out.println("메뉴선택 화면");
        System.out.println(" ");
    }
}