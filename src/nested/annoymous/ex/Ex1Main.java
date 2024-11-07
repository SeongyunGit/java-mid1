package nested.annoymous.ex;

import java.util.Random;

public class Ex1Main {

    public static void helloDice() {
        System.out.println("프로그램 시작");

        Dice dice = new Dice();
        dice.dice();


        System.out.println("프로그램 종료");
    }

    public static void helloSum() {
        System.out.println("프로그램 시작");

        Sum sum = new Sum();
        sum.sum();

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {


        helloDice();
        helloSum();
    }
}
