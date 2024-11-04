package lang.immutable.test;

public class ImmutableMyDataMain1 {

    public static void main(String[] args) {

        ImmutableMyData1 immutableMyData1 = new ImmutableMyData1(2024,10,31);
        System.out.println(immutableMyData1);

        ImmutableMyData1 immutableMyData2 = immutableMyData1.withYear(2012);
        System.out.println(immutableMyData2);

        ImmutableMyData1 immutableMyData3 = immutableMyData2.withMonth(8);
        System.out.println(immutableMyData3);
        
        ImmutableMyData1 immutableMyData4 = immutableMyData3.withDay(12);
        System.out.println(immutableMyData4);

    }
}
