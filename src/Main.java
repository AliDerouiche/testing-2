import java.time.*;
public class Main {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        System.out.println(getYearMethod(date));
        System.out.println(getMonthMethod(date));
        System.out.println(getDayMethod(date));
        System.out.println(getMonthDayMethod(date));
    }

    public static int getYearMethod(OffsetDateTime date) {
        return date.getYear();
    }

    public static Month getMonthMethod(OffsetDateTime date) {
        return date.getMonth();
    }

    public static DayOfWeek getDayMethod(OffsetDateTime date) {
        return date.getDayOfWeek() ;
    }

    public static int getMonthDayMethod(OffsetDateTime date) {
        return date.getDayOfMonth();
    }
}