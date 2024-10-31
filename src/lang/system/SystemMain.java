package lang.system;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SystemMain {

    public static void main(String[] args) {

        //현재 시간 밀리초
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        //현재 시간 나노초
        long currentNano = System.nanoTime();
        System.out.println("currentNano = " + currentNano);

        //환경 변수를 익는다.
        System.out.println("getenc= " + System.getenv());

        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version = " + System.getProperty("java.version"));

        //배열을 고속으로 복사한다.
        char[] originalArray = {'h','e','l','l','o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray,0,copiedArray,0, originalArray.length);

        System.out.println("copiedArray = " + copiedArray);
        System.out.println("Arrays.toString = " + Arrays.toString(copiedArray));

        //프로그램 종료
        System.exit(0);
        System.out.println("hello");


    }
}
