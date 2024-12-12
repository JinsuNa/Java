package basic.exam2;

public class Number2해석 {
    public static void main(String[] args) {
        final int TIMES = 36000; /*상수 ex)const의 효과가 있는 final이다. 상수의 이름은 전부 대문자로 하는게 관행이다. */
        int diceOne = 0;
        int diceTwo = 0;
        int diceSum = 0;
        int[] diceIndex = new int[11];
        int total_rolls = 36000;
        for (int i = 1; i <= total_rolls; i++) {
            diceOne = (int) (Math.random() * 6 + 1);
            diceTwo = (int) (Math.random() * 6 + 1);
            diceSum = diceOne + diceTwo;
            diceIndex[diceSum - 2]++;
        }

        double rate = 0.0;
        String strRate = "";


        for (int i = 0; i < diceIndex.length; i++) {
            rate = (double) diceIndex[i] / total_rolls;
            strRate = String.format("%6f", rate);
            System.out.println((i + 2) + " : " + diceIndex[i] + "(" + strRate /*rate 도 똑같은결과지만 Rate는 모든 소수점이 나온다.*/ + ")");
        }

    }
}
