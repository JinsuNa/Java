package basic.vendingmachine_v02;

import basic.vendingmachine_v02.view.AdminView;
import basic.vendingmachine_v02.view.UserView;

import java.util.Scanner;

public class MachineMain {

    // 사용자가 입력한 돈 관리용

    public static void main(String[] args) {
        UserView view = new UserView();
        AdminView adminView = new AdminView();
        Scanner sc = new Scanner(System.in);
        int menuNumber = 0;

        while (menuNumber != 5) {
            System.out.println("1. 동전투입 2. 잔돈반환 3. 메뉴선택 4. 관리자메뉴 5. 종료 =>");
            menuNumber = sc.nextInt();
            switch (menuNumber) {
                case 1:
                    view.insertCoin();  //완료
                    break;
                case 2:
                    view.returnCoin();  //완료
                    break;

                case 3:
                    System.out.println("3. 메뉴선택");
                    view.selectMenu();
                    break;

                case 4:
                    System.out.println("4. 관리자메뉴");
                    int adminMenuNumber = 0;
                    while (adminMenuNumber != 6) {
                        System.out.println("1. 메뉴등록 2. 메뉴삭제 3. 메뉴수정 4. 재고등록 5. 전체목록보기 6. 이전으로 돌아가기");
                        adminMenuNumber = sc.nextInt();
                        switch (adminMenuNumber) {
                            case 1:
                                System.out.println("1. 메뉴등록");
                                adminView.insertMenu();
                                break;
                            case 2:
                                System.out.println("2. 메뉴삭제");
                                adminView.deleteMenu();
                                break;
                            case 3:
                                System.out.println("3. 메뉴수정");
                                adminView.updateMenu();
                                break;
                            case 4:
                                System.out.println("4. 재고등록");
                                adminView.updateStockMenu();
                                break;
                            case 5:
                                System.out.println("5. 전체목록보기");
                                adminView.updateStockMenu();
                                break;
                            case 6:
                                System.out.println("6. 이전으로 돌아가기");
                                break;
                            default:
                                System.out.println("잘못입력하셨습니다.");
                                break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("5. 종료");
                    break;

                default:
                    System.out.println("잘못입력하셨습니다.");

            }
        }
    }
}
