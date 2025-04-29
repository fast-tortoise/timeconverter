package timeconverter;

import java.time.LocalTime;

public class SystemTimeProvider implements TimeProvider {
    @Override
    public LocalTime getCurrentTime() {
        return LocalTime.now();
    }
}