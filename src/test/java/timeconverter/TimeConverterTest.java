package timeconverter;

import org.junit.jupiter.api.Test;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.*;

public class TimeConverterTest {

    private final TimeConverter converter = new TimeConverter();

    @Test
    void testConvertToWords_Midday() {
        String result = converter.convertToWords("12:00");
        assertEquals("It's Midday", result);
    }

    @Test
    void testConvertToWords_Midnight() {
        String result = converter.convertToWords("00:00");
        assertEquals("It's Midnight", result);
    }

    @Test
    void testConvertToWords_RegularTime() {
        String result = converter.convertToWords("08:34");
        assertEquals("It's eight thirty four", result);
    }

    @Test
    void testConvertToWords_OClock() {
        String result = converter.convertToWords("15:00");
        assertEquals("It's fifteen o'clock", result);
    }

    @Test
    void testConvertToWords_LocalTime() {
        LocalTime time = LocalTime.of(11, 25);
        String result = converter.convertToWords(time);
        assertEquals("It's eleven twenty five", result);
    }

    @Test
    void testConvertToWords_InvalidTimeFormat() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            converter.convertToWords("25:00");
        });
        assertEquals("Invalid time format. Use HH:mm (e.g., 11:25)", exception.getMessage());
    }
}