package myClass.extendTest;

public class ChickenBurger extends Hamburger {
    private String name = "치킨 버거";

    public String getName(){
        return this.name;
    }

    private String 재료3 = "닭다리치킨";

    public String get재료3() {
        return this.재료3;
    }

    @Override
    public String toString() {
        return "ChickenBurger{" +
                "name='" + name + '\'' +
                ", 재료3='" + 재료3 + '\'' +
                '}';
    }

    public void eating() {
        System.out.println("치킨버거를 먹습니다.");
    }

    @Override
    public void order() {
        System.out.println("치킨햄버거 주문 완료");
        //  super.order(); //super 의 의미는 나의 부모 즉 Hamburger class를 의미한다.
    }
}
