package timeconverter;

import org.junit.jupiter.api.Test;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.*;

public class SystemTimeProviderTest {

    private final SystemTimeProvider provider = new SystemTimeProvider();

    @Test
    void testGetCurrentTime_NotNull() {
        LocalTime time = provider.getCurrentTime();
        assertNotNull(time);
    }

    @Test
    void testGetCurrentTime_ValidRange() {
        LocalTime time = provider.getCurrentTime();
        assertTrue(time.getHour() >= 0 && time.getHour() <= 23);
        assertTrue(time.getMinute() >= 0 && time.getMinute() <= 59);
    }
}