package basic.exam2;


/*문제 1. 최댓값과 인덱스찾기

9개의 서로 다른 자연수
3, 29, 38, 12, 57, 74, 40, 85, 61
가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째
수인지를 구하는 프로그램을 작성하시오.

이 주어지면, 이들 중
최댓값은 85이고, 이 값은 8번째 수이다.
최솟값은 3이고, 이 값은 1번째 수이다.

출력 :

최댓값 : 85, 인덱스 : 7
최솟값 : 3, 인덱스 : 1*/

public class Number1 {
    public static void main(String[] args) {
        int[] nums = {3, 29, 38, 12, 57, 74, 40, 85, 6};
        int max = nums[0];
        int indexMax = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                indexMax = i+1;

            }
        }
        System.out.println(max);
        System.out.println(indexMax);
    }
}