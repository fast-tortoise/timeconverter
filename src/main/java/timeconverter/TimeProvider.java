package timeconverter;

import java.time.LocalTime;

public interface TimeProvider {
    LocalTime getCurrentTime();
}