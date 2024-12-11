package oopCh06;

public class Ch06Main {

    public static void move(AnimalInterface animal) {
        System.out.println(animal.move());
    }


    public static void main(String[] args) {
        AnimalInterface tiger = new TigerImpl();
        AnimalInterface lion = new LionImpl();

        System.out.println("나는 "+tiger.getName());
        tiger.speak();
        if (tiger.육식인가()) {
            System.out.println("육식동물");
        } else {
            System.out.println("초식동물");
        }
        move(tiger);

        System.out.println("\n나는 "+lion.getName());
        lion.speak();
        if (lion.육식인가()) {
            System.out.println("육식동물");
        } else {
            System.out.println("초식동물");
        }
        move(lion);

    }
}
