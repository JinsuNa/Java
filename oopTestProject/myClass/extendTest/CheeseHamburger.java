package myClass.extendTest;

public class CheeseHamburger extends Hamburger {
    private String name = "치즈햄버거";
    private String 재료3 = "치즈듬뿍";

    public String get재료3() {
        return this.재료3;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void order() {
        System.out.println("치즈햄버거 주문 완료");
        //  super.order(); //super 의 의미는 나의 부모 즉 Hamburger class를 의미한다.
    }
}
