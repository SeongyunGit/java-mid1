package nested.annoymous;

import nested.local.Printer;

public class AnnoymousOuter {

    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;


        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };

        printer.print();
        System.out.println("printer.getClass() = " + printer.getClass());
    }

    public static void main(String[] args) {
        AnnoymousOuter localOuterV1 = new AnnoymousOuter();
        localOuterV1.process(2);
    }
}

