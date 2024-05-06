import org.junit.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testDateFull() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String formatData = Main.formatInFull(dateTime);
        String dataFormat = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));

        assertEquals(dataFormat, formatData);
        System.out.println("data complete: " + dataFormat);

    }
    @Test
    public void testDateMedium() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String formatData = Main.formatInMedium(dateTime);
        String dataFormat = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));

        assertEquals(dataFormat, formatData);
        System.out.println("data medium: " + dataFormat);

    }
}