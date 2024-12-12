package basic.vendingmachine_v02.vo;

//제품정보를 담고 있는 클래스

public class Product {
    private String item; //제품의 이름
    private int priice; // 제품의 단가
    private int stock; // 제품의 재고

    @Override
    public String toString() {
        return "Product{" +
                "item='" + item + '\'' +
                ", priice=" + priice +
                ", stock=" + stock +
                '}';
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getPriice() {
        return priice;
    }

    public void setPriice(int priice) {
        this.priice = priice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
