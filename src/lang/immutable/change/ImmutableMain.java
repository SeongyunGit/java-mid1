package lang.immutable.change;

public class ImmutableMain {

    public static void main(String[] args) {
        ImmutableObj immutableObj = new ImmutableObj(10);
        ImmutableObj immutableObj1 = immutableObj.add(20);

        System.out.println(immutableObj.getValue());
        System.out.println(immutableObj1.getValue());
    }
}
