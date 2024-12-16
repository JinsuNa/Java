package equalsAndHashcode;

public class EqualsAndHashcodeTest {
    public static void printLine() {
        System.out.println("=======================");
    }
    public static void main(String[] args) {
        // primitive type
        // int, double, long, boolean, etc... 이런걸 프리미티브 타입(원시타입 이라고 한다)
        // 원시타입 데이터도 비교할 때는 주소를 갖고 비교를 한다. constant(상수 = final) pool에 저장한다.
        int a = 3;
        int b = 3;
        if (a == b) {
            System.out.println("a와b는 같다");
        } else {
            System.out.println("a와b는 같지 않다.");
        }
        printLine();

        String str1 = "장원영";  // 값을 직정 할당을 하면 equlas를 내부에서 자동으로 생성해서 같다고 나오는건다.
        String str2 = "장원영";

        if (str1 == str2) {
            System.out.println(str1 + " " + str2);
            System.out.println("같습니다");
        } else {
            System.out.println("다릅니다.");
        }
        printLine();

        String str3 = new String("장원영"); //new를 하면 인스턴스를 생성해서 힙의 영역으로 간다. 새롭게 주소를 할당받아서 틀리다고 나오는 거다.
        String str4 = new String("장원영"); //new로 인스턴스를 생성하면 둘의 번지수는 다르기 때문에 틀리다고 나오는거다.

        if (str3 == str4) {
            System.out.println(str3 + " " + str4);
            System.out.println("if (str3 == str4)는 같습니다");
        } else {
            System.out.println("if (str3 == str4)는 다릅니다.");
        }
        printLine();

        Person p1 = new Person("장원영", 20);
        Person p2 = new Person("장원영", 10);
        if (p1.name.equals(p2.name)) {
            System.out.println("p1.name.equals(p2.name)는 이름이 같습니다.");
        } else {
            System.out.println("p1.name.equals(p2.name)는 이름이 다릅니다.");
        }
        printLine();

        if (p1 == p2) {
            System.out.println("p1 == p2는 p1과 p2는 같다");

        } else {
            System.out.println("p1 == p2는 p1과 p2는 같지않다.");
        }
        printLine();

        if (p1.equals(p2)) {
            System.out.println("p1.equals(p2)는 같다");
        } else {
            System.out.println("p1.equals(p2)는 같지않다.");

        }

        //toString, equals and hashcode를 오버라이딩 해야지 값들이 변경된다.
        //toString 은 리스트에 있는 출력을 변경해주는거고 equals and hashcode는 내가 원하는 비교대상만 정할 수 있어서 편리하다.


  }
}
