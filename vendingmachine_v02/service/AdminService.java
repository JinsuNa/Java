package basic.vendingmachine_v02.service;

import basic.vendingmachine_v02.repository.ListRepository;
import basic.vendingmachine_v02.view.AdminView;
import basic.vendingmachine_v02.vo.Product;

import java.util.ArrayList;
import java.util.List;

public class AdminService {
    public static ListRepository repository = new ListRepository();

    public static void updateItem(int index, Product newProduct) {

        repository.update(index, newProduct);
    }

    public void insertItem(Product product) {

        repository.insert(product);
    }

    public List<Product> getAllList() {

        List<Product> productList = new ArrayList<>();
        productList = repository.findAll();
        return productList;
    }

    public boolean deleteItem(String itemName) {
        //1. itemName이 존재하는지 확인
        int index = repository.findIndex(itemName);

        //2. 존재하면 삭제 요청 후 true리턴 그렇지 않으면 false 리턴
        if (index != -1) {
            //삭제 요청
            repository.delete(index);
            return true;
        } else {
            //삭제 실패
            return false;
        }


    }

    public boolean updateStock(String itemName, int updateStock) {
        // 1. 수정할 제품 존재 확인
        int index = repository.findIndex(itemName);
        if (index != -1) {
            //수정할 제품 찾기
            Product findProduct = repository.findByName(itemName);
            //재고 수정하기
            int updateValue = findProduct.getStock() + updateStock;
            findProduct.setStock(updateValue);
            //수정 요청
            repository.update(index, findProduct);
            return true;
        } else {
            return false;
            //수정 실패
        }
        // 2. 존재하면 수정요청
    }



    public int existItem(String item) {
        return repository.findIndex(item);
    }
}




