package lang.wrapper.test;

public class WrapperTest2 {

    public static void main(String[] args) {
        String[] array = {"1.5","2.5","3.0"};


        double total=0;
        for (int i=0;i< array.length;i++) {
            double num = Double.parseDouble(array[i]);
            total += num;
        }

        System.out.println("total = " + total);

    }
}

