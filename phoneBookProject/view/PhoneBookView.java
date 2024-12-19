package view;

import dto.PhoneBookDTO;
import service.PhoneBookService;

import java.util.List;

public class PhoneBookView implements ViewInterface {
    PhoneBookService bookService = new PhoneBookService();

    @Override
    public void insertView() {
        System.out.println("[PhoneBookView]-insertView");
    }

    @Override
    public void updateView() {
        System.out.println("[PhoneBookView]-updateView");

    }

    @Override
    public void deleteView() {
        System.out.println("[PhoneBookView]-deleteView");

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
}
