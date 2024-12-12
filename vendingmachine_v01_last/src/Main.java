import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String[] product = new String[5];
    static int[] price = new int[5];
    static int[] stock = new int[5];

    public static void main(String[] args) {
        initialize();
        user();
        }

    private static void user() {
        while (true) {
            System.out.println("==================================================");
            System.out.println("자판기입니다.(번호:상품(가격)-재고");
            String menu = "";
            for (int i = 0; i < product.length; i++) {
                menu = menu + (i + 1) + "." + product[i] + price[i] + "W)-" + stock[i] + "개";
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
