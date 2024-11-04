package lang.immutable.test;

public class ImmutableMyData1 {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyData1(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmutableMyData1 withYear(int year) {
        return new ImmutableMyData1(year, month, day);
    }

    public ImmutableMyData1 withMonth(int month) {
        return new ImmutableMyData1(year, month, day);
    }

    public ImmutableMyData1 withDay(int day) {
        return new ImmutableMyData1(year, month, day);
    }

    @Override
    public String toString() {
        return "ImmutableMyData1{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
