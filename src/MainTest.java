import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.*;
public class MainTest {

    @Test
    public void testGetYearMethod() {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        assertEquals(2023, Main.getYearMethod(date));
        assertNotEquals(2022, Main.getYearMethod(date));

    }

    @Test
    public void testGetMonthMethod() {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        assertEquals(Month.MARCH, Main.getMonthMethod(date));
        assertNotEquals(Month.FEBRUARY, Main.getMonthMethod(date));
    }

    @Test
    public void testGetDayMethod() {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        assertEquals(DayOfWeek.WEDNESDAY, Main.getDayMethod(date));
        assertNotEquals(DayOfWeek.TUESDAY, Main.getDayMethod(date));
    }

    @Test
    public void testGetDayOfTheWeekMethod() {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        assertEquals(1, Main.getMonthDayMethod(date));
        assertNotEquals(2, Main.getMonthDayMethod(date));
    }
}