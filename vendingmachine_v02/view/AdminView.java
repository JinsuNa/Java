package basic.vendingmachine_v02.view;

import basic.vendingmachine_v02.service.AdminService;
import basic.vendingmachine_v02.vo.Product;

import javax.sound.sampled.Port;
import java.util.List;
import java.util.Scanner;

public class AdminView {

    public void printHeader() {
        System.out.println("============메뉴=============");

    }
    public void printLine() {
        System.out.println("===========================");
    }

    AdminService adminService = new AdminService(); //상속을 받지 않았는데도 사용하는건 컴포지션이라고 한다. (다른 클래스를 그냥 가져다 쓰는 것) 생성자 주입방법으로 주입을 하면 된다.

    Scanner sc = new Scanner(System.in);
    public void insertMenu() {
        //비어있는 Product 생성
//        Product product = new Product(); 빈 깡통 생성하여 하나씩 넣는 방법
        String item;
        int price;
        int stock;

        System.out.println("관리자 메뉴 등록 화면");
        System.out.println("제품 이름을 입력하세요.");
        item = sc.next();
        System.out.println("제품의 가격? (숫자만 입력)");
        price = sc.nextInt();
        System.out.println("재고 등록(채울 개수)");
        stock = sc.nextInt();

//        product.setItem(item);
//        product.setPrice(price);
//        product.setStock(stock);

        Product product = new Product(item, price, stock);
        adminService.insertItem(product);


    }

    public void deleteMenu() {
        System.out.println("관리자 메뉴 삭제 화면");
        viewAllList();

        System.out.println("삭제할 제품명 입력 : ");
        String itemName = sc.next();

        boolean result = adminService.deleteItem(itemName);

        //삭제 성공 혹은 실패 처리
        if (result) {
            System.out.println("삭제 완료");
        } else {
            System.out.println("삭제 실패");
        }
    }

    public void updateMenu() {
        viewAllList();
        System.out.println("수정할 제품명 입력");
        String item = sc.next();

        // 수정할 제품이 있는지 먼저 검사
        int index = adminService.existItem(item);

        if (index == -1) {
            System.out.println("수정할 제품이 없습니다.");
            return;
        } else {

            System.out.println(item + "을 어떻게 수정하시겠습니까?");
            String newItem = sc.next();

            System.out.println(newItem + "의 가격을 수정해주세요");
            int newPrice = sc.nextInt();

            System.out.println(newItem + "의 재고를 수정해주세요");
            int newStock = sc.nextInt();

            Product newProduct = new Product(newItem, newPrice, newStock);
            AdminService.updateItem(index, newProduct);
            System.out.println("수정완료");
            viewAllList();
        }

    }

    public void updateStockMenu() {
        viewAllList();
        System.out.println("재고를 수정 할 제품명 입력");
        String itemName = sc.next();

        System.out.println("(수정) 재고수량? (숫자만 입력)");
        int updateStock = sc.nextInt();
        boolean result = adminService.updateStock(itemName, updateStock);
        if (result) {
            System.out.println("재고가 수정되었습니다.");
            viewAllList();
        } else {
            System.out.println("재고 수정 실패");
        }
    }

    public void viewAllList() {
        printHeader();
        //출력
        //1. 서비스에 전체 리스트 요청
        List<Product> productList = adminService.getAllList();

        //2. 상품리스트가 비어있을 경우
        if (productList.size() == 0) {
            System.out.println("현재 자판기에 재고가 없습니다.");
        } else {
            //3. 받은 리스트를 출력
            for (Product x : productList) {
                System.out.println(x);
            }
        }

        printLine();

    }




}
