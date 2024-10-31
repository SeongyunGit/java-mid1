package lang.math.test;

public class Lotto {

    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] lottoNumbers = lottoGenerator.generate();
        StringBuilder sb = new StringBuilder();
        sb.append("로또 번호:").append(" " + lottoNumbers[0])
                .append(" " + lottoNumbers[1])
                .append(" " + lottoNumbers[2])
                .append(" " + lottoNumbers[3])
                .append(" " + lottoNumbers[4])
                .append(" " + lottoNumbers[5]);

        System.out.println(sb);

        System.out.print("로또 번호: ");
        for (int lottoNumber : lottoNumbers) {
            System.out.print(lottoNumber + " ");
        }
    }
}
