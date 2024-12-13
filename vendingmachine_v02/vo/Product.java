package basic.vendingmachine_v02.vo;

//제품정보를 담고 있는 클래스

public class Product {
    private String item; //제품의 이름
    private int price; // 제품의 단가
    private int stock; // 제품의 재고

    public Product(){} //빈 깡통 생성자를 만들어야 한다. AdminView 에도 이미 생성자가 있기때문에 오버로딩을 사용한다.

    public Product(String item, int price, int stock) {
        this.item = item;
        this.price = price;
        this.stock = stock;
    }

    @Override
    public String toString() {
        String result = "제품명 :" + item + " / 가격 :" + +price + " / 재고 :" + stock;
        return result;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
