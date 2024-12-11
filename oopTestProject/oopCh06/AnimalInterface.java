package oopCh06;

// abstract 는 내가 원하는 메서드를 정할 수 있지만 interface는 메서드 앞에 abstract 가 생략되어 있어 전부다 구현을 해야되는 차이점이 있다.
// 보통 interface를 많이 쓰긴한다.
public interface AnimalInterface {
    String getName();

    void speak(); //동물의 울음소리 출력 기능

    boolean 육식인가(); //육식인지 초식인지 확인 기능 육식:true 초식:false

    String move(); // 움직임 출력 기능


}
