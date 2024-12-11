    package oopCh06;

    public class LionImpl implements AnimalInterface {
        private String name = "사자";

        public String getName() {
            return name;
        }
        @Override
        public void speak() {
            System.out.println("어흥");
        }

        @Override
        public boolean 육식인가() {
            return true;
        }

        @Override
        public String move() {
            return "잘 걸어다님";
        }
    }
