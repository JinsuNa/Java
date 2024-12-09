import carPackage.Car;

import java.util.Scanner;
public class CarMain {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int selectionCarNumber = 0;
        int colorOptionNum = 0;
        int navigationOptionNum = 0;
        Car hyundai = new Car(1,"현대", 2000, "그랜져");
        Car kia = new Car(2,"기아", 2000, "K5");
        Car samsung = new Car(3,"삼성", 2000, "SM6");

        hyundai.carMenu();
        kia.carMenu();
        samsung.carMenu();

        selectionCarNumber = sc.nextInt();

        switch (selectionCarNumber) {
            case 1:
                hyundai.Caroption();
                colorOptionNum = sc.nextInt();
                hyundai.setColor(colorOptionNum);
                System.out.println("내가 선택한 색상은 : " + hyundai.getColor() + "입니다.");

                while (true) {
                    System.out.println("===========================");
                    System.out.println("네비게이션 옵션을 선택해주세요.");
                    System.out.println("1.네비게이션 옵션 설치, 2.네비게이션 옵션 비활성화");
                    navigationOptionNum = sc.nextInt();

                    switch (navigationOptionNum) {
                        case 1:
                            hyundai.setNavigation(true);
                            break;
                        case 2:
                            hyundai.setNavigation(false);
                            break;
                        default:
                            System.out.println("잘못된 값을 입력하셨습니다.");
                    }
                    hyundai.carPreview();
                    return;
                }



            case 2:
                kia.Caroption();
                colorOptionNum = sc.nextInt();
                kia.setColor(colorOptionNum);
                System.out.println("내가 선택한 색상은 : " + kia.getColor() + "입니다.");
                while (true) {
                    System.out.println("===========================");
                    System.out.println("네비게이션 옵션을 선택해주세요.");
                    System.out.println("1.네비게이션 옵션 설치, 2.네비게이션 옵션 비활성화");
                    navigationOptionNum = sc.nextInt();

                    switch (navigationOptionNum) {
                        case 1:
                            kia.setNavigation(true);
                            break;
                        case 2:
                            kia.setNavigation(false);
                            break;
                        default:
                            System.out.println("잘못된 값을 입력하셨습니다.");
                    }
                    kia.carPreview();
                    return;
                }

            case 3:
                samsung.Caroption();
                colorOptionNum = sc.nextInt();
                samsung.setColor(colorOptionNum);
                System.out.println("내가 선택한 색상은 : " + samsung.getColor() + "입니다.");
                while (true) {
                    System.out.println("===========================");
                    System.out.println("네비게이션 옵션을 선택해주세요.");
                    System.out.println("1.네비게이션 옵션 설치, 2.네비게이션 옵션 비활성화");
                    navigationOptionNum = sc.nextInt();

                    switch (navigationOptionNum) {
                        case 1:
                            samsung.setNavigation(true);
                            break;
                        case 2:
                            samsung.setNavigation(false);
                            break;
                        default:
                            System.out.println("잘못된 값을 입력하셨습니다.");
                    }
                    samsung.carPreview();
                    return;
                }

            default:
                System.out.println("잘못된 숫자를 입력하셨습니다");
                return;
        }

        //엑셀과 브레이크







    }
}
