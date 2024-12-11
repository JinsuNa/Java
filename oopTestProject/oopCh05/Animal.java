package oopCh05;

//absract = new 가 안되는 아이 abstract 앞에 public은 생략이 되어있다.
abstract class Animal {
    abstract void speak(); //자식들이 의무적으로 구현을 해야한다고 하면 앞에 abstract를 붙이면 된다.
    public void defence() {
        System.out.println("모든 공격을 차단함");

        // abstract 는 껍데기 이며 class 앞에있는거 말고 speak 앞에있는 abstract ㅆㅂ...
    }
}
