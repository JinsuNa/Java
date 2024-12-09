import carPackage.Car;

import java.util.Scanner;
public class CarMain {
   static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int selectionCarNumber = 0;
        int colorOptionNum = 0;
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
                break;

            case 2:
                kia.Caroption();
                colorOptionNum = sc.nextInt();
                kia.setColor(colorOptionNum);
                System.out.println("내가 선택한 색상은 : " + kia.getColor() + "입니다.");
                break;
            case 3:
                samsung.Caroption();
                colorOptionNum = sc.nextInt();
                samsung.setColor(colorOptionNum);
                System.out.println("내가 선택한 색상은 : " + samsung.getColor() + "입니다.");
                break;
            default:
                System.out.println("잘못된 숫자를 입력하셨습니다");
                return;
        }





    }
}
