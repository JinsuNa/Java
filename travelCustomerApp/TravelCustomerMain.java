package travelCustomerApp;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TravelCustomerMain {
    public static void main(String[] args) {

        List<Customer> customers = new ArrayList<>();

        Customer jang = new Customer("장원영", 20, 100);
        Customer ahn = new Customer("안유진", 21, 100);
        Customer hong = new Customer("홍길동", 50, 80);
        customers.add(jang);
        customers.add(ahn);
        customers.add(hong);

        //1. 고객명단을 추가된 순서대로 출력하기
        customers.stream().forEach(x -> System.out.println(x));
        System.out.println();

        //2. 고객 명단에 추가된 순서대로 이름만 출력하기
        customers.stream().forEach(x -> System.out.println(x.getName()));
        System.out.println();

        //3. 고객 명단 가나다 순
        customers.stream().map(customer -> customer.getName())
                .sorted()
                .forEach(x-> System.out.println(x));
        System.out.println();

        //4. 총 여행비용 출력하기
        int sum = customers.stream().mapToInt(x -> x.getPrice())
                .sum();
        System.out.println("총 여행경비는 : " + sum);
        System.out.println();

        //5. 21세 이상 고객명단의 이름만 오름차순으로 출력하기
        customers.stream().filter(age -> age.getAge() >= 21)
                .map(name->name.getName())
                .sorted()
                .forEach(name -> System.out.println(name));
        System.out.println();

        //6. 21세 이상 고객명단 전체를 내림차순으로 출력하기
        customers.stream().filter(age -> age.getAge() >= 21)
                .sorted(Comparator.comparing(Customer::getName)
                        .reversed())
//                .forEach(x -> System.out.println(x)); 아래와 똑같다.
                .forEach(System.out::println);
    }
}
