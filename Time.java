package sample;

public class Time {
    private int day;
    private int maxDay;
    private Month month;
    private int year;

    enum Month {
        JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC;
    }

    public Time() {
        this(Month.JAN, 1, 2000);
    }

    public Time(Month month, int day, int year) {
        this.year = year;
        this.day = day;
        this.month = month;

        checkDayFromMonth(this.month);
    }

    @Override
    public String toString() { //MM/DD/YYYY
        return month + " " + day + " " + year;
    }

    private void checkDayFromMonth(Month month) {
        switch (this.month) {
            case JAN:
            case MAR:
            case MAY:
            case JUL:
            case AUG:
            case OCT:
            case DEC:
                maxDay = 31;
                break;
            case APR:
            case JUN:
            case SEP:
            case NOV:
                maxDay = 30;
                break;
            case FEB:
                maxDay = 29;
        }

        if (day > maxDay) {
            day = maxDay;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
