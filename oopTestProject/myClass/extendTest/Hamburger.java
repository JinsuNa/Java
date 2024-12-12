package myClass.extendTest;

public class Hamburger {
    private String name = "기본햄버거";
    private String 재료1 = "번";
    private String 재료2 = "양상추";

    public void order(){}  //어차피 메뉴는 자식에 의해 계속 변경되기 때문에 적어놓지 않아도 무방하다.


    @Override
    public String toString() {
        return "Hamburger{" +
                "name='" + name + '\'' +
                ", 재료1='" + 재료1 + '\'' +
                ", 재료2='" + 재료2 + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String get재료1() {
        return 재료1;
    }

    public void set재료1(String 재료1) {
        this.재료1 = 재료1;
    }

    public String get재료2() {
        return 재료2;
    }

    public void set재료2(String 재료2) {
        this.재료2 = 재료2;
    }
}
