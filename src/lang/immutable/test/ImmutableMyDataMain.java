package lang.immutable.test;

public class ImmutableMyDataMain {

    public static void main(String[] args) {

        ImmutableMyData data1 = new ImmutableMyData(2024,10,24);
        ImmutableMyData data2 = data1;
        System.out.println(data1);
        System.out.println(data2);

        data2 = data1.withYear(2025);
        System.out.println(data1);
        System.out.println(data2);

    }
}
