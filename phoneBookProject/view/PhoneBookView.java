package view;

import dto.PhoneBookDTO;
import exception.InputValidation;
import exception.MyException;
import service.PhoneBookService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class PhoneBookView implements ViewInterface {
    PhoneBookService bookService = new PhoneBookService();
    Scanner sc = new Scanner(System.in);
    //입력확인용 인스턴스 생성
    InputValidation validation = new InputValidation();

    @Override
    public void insertView() {
        System.out.println("[PhoneBookView]-insertView");
        System.out.println("===전화번호 등록 ===");

        boolean check = true;
        //빈 연락처 클래스 -> 채워서 서비스로 전달 -> 저장
        PhoneBookDTO dto = new PhoneBookDTO();

        //이름입력 처리
        while (check) {
            try {
                System.out.printf("이름 : ");
                String name = sc.next();
                check = validation.nameCheck(name);
                dto.setName(name);

            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }
        check = true;

        //나이입력 처리
        while (check) {
            try {
                System.out.printf("나이 : ");
                int age = sc.nextInt();
                check = validation.ageCheck(age);
                dto.setAge(age);

            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }
        check = true;

        //주소입력 처리
        System.out.printf("주소 : ");
        String address = sc.next();
        dto.setAddress(address);


        //전화번호입력 처리
        while (check) {
            try {
                System.out.printf("번호 : ");
                String phone = sc.next();
                check = validation.phoneCheck(phone);
                dto.setPhone(phone);

            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }
        // 신규 입력이니까 생성일 저장
        dto.setCreatedAt(LocalDateTime.now());

        //서비스로 dto 전달
        int result = bookService.insertService(dto);
        if (result > 0) {
            System.out.println("자료가 저장되었습니다.");
        } else {
            System.out.println("실패하였습니다. 관리자에게 문의하세요.");
        }
    }

    @Override
    public void deleteView() {
        System.out.println("[PhoneBookView]-deleteView");
        System.out.println("삭제할 전화번호부의 id를 입력하세요.");
        Long deleteId = sc.nextLong();
        if (bookService.deleteService(deleteId) > 0) {
            System.out.println("ID : " + deleteId + "의 데이터가 삭제되었습니다.");
        } else {
            searchAllView();
            System.out.println("제대로 된 번호를 입력해주세요.");
        }
    }

    @Override
    public void searchAllView() {
        System.out.println("[PhoneBookView]-searchAllView");
        List<PhoneBookDTO> dtoList = bookService.getAllListService();
        // 출력해보기
        linePrint();
        printTitle();
        linePrint();
        for (PhoneBookDTO dto : dtoList) {
            System.out.println(dto);
        }
        linePrint();

    }

    public void printTitle() {
        System.out.println("Id\t 이름\t 나이\t 주소\t\t 전화번호\t\t 입력\t\t\t 수정");
    }

    public void linePrint() {
        System.out.println("=====================================================");
    }

    @Override
    public void searchNameView() {
        System.out.println("[PhoneBookView]-searchNameView");

    }

    @Override
    public void searchPhoneView() {
        System.out.println("[PhoneBookView]-searchPhoneView");

    }

    @Override
    public void updateView() {
    }
}




