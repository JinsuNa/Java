package basic.vendingmachine_v02.service;

import basic.vendingmachine_v02.repository.ListRepository;
import basic.vendingmachine_v02.view.UserView;
import basic.vendingmachine_v02.vo.Product;

import java.util.List;

public class UserService {
    ListRepository repository = new ListRepository();

    public boolean serveItem(int userMoney, String itemName) {
        //찾는 제품이 있는지 확인
        Product findItem = repository.findByName(itemName);
        // 제품이 있고, 잔돈이 충분한지 확인하고
        // 충분하면 재고에서 -1 하고 true 리턴
        if (findItem != null && findItem.getPrice() <= userMoney
                && findItem.getStock() > 0) {

            //제품 구매 가능
            findItem.setStock(findItem.getStock() - 1);
            //수정처리
            repository.update(repository.findIndex(itemName), findItem);
            //사용자 잔액 감소
            UserView.userMoney = UserView.userMoney - findItem.getPrice();

            return true;
        }
        // 그렇지 않으면 false 리턴
        else if (findItem == null) {
            System.out.println("찾는 제품이 없습니다.");
            return false;
        } else if (findItem.getPrice() > userMoney) {
            System.out.println("잔액이 부족합니다.");
            return false;
        } else return false;

    }
}








