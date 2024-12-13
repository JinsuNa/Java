package basic.vendingmachine_v02.repository;

import basic.vendingmachine_v02.vo.Product;

import java.util.ArrayList;
import java.util.List;

public class InitArrayList {
    static List<Product> productList = new ArrayList<>();  //리스트를 넣으면 시스템이 종료되면 자료가 다 날라가는 단점이 있다. 그래서 데이터베이스 mysql을 사용하는 것이다.

}
