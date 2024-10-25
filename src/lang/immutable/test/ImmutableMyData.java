package lang.immutable.test;

public class ImmutableMyData {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyData(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day= day;
    }

    public ImmutableMyData withYear(int year) {
        return new ImmutableMyData(year,month,day);
    }

    public ImmutableMyData withMonth(int month) {
        return new ImmutableMyData(year, month, day);
    }

    public ImmutableMyData withDay(int day) {
        return new ImmutableMyData(year, month, day);
    }

    @Override
    public String toString() {
        return "year=" + year + ", month=" + month + ", day=" + day;
    }
}
