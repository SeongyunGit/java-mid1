package nested.annoymous.ex;

import java.util.Random;

public class Dice {

    public void dice() {
        int randomValue = new Random().nextInt(6)+1;
        System.out.println("주사위 = " + randomValue);

    }
}
