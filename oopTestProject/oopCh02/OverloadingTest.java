package oopCh02;

import java.util.Scanner;

public class OverloadingTest {


    public static void main(String[] args) {

        Running runner = new Running("나진수");
        runner.running();
        runner.running(10.5);
        runner.running(42);
        runner.running(10);
        runner.running(5,20);

    }
}
