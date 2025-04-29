package timeconverter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TimeValidatorTest {

    private final TimeValidator validator = new TimeValidator();

    @Test
    void testValidate_ValidTime() {
        assertDoesNotThrow(() -> validator.validate("08:34"));
        assertDoesNotThrow(() -> validator.validate("23:59"));
        assertDoesNotThrow(() -> validator.validate("00:00"));
    }

    @Test
    void testValidate_InvalidHour() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            validator.validate("24:00");
        });
        assertEquals("Invalid time format. Use HH:mm (e.g., 11:25)", exception.getMessage());
    }

    @Test
    void testValidate_InvalidMinute() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            validator.validate("12:60");
        });
        assertEquals("Invalid time format. Use HH:mm (e.g., 11:25)", exception.getMessage());
    }

    @Test
    void testValidate_WrongFormat() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            validator.validate("123:45");
        });
        assertEquals("Invalid time format. Use HH:mm (e.g., 11:25)", exception.getMessage());
    }

    @Test
    void testValidate_NullInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            validator.validate(null);
        });
        assertEquals("Invalid time format. Use HH:mm (e.g., 11:25)", exception.getMessage());
    }
}