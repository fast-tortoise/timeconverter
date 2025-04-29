package timeconverter;

public class TimeValidator {
    public void validate(String time) throws IllegalArgumentException {
        if (time == null || !time.matches("^([0-1][0-9]|2[0-3]):[0-5][0-9]$")) {
            throw new IllegalArgumentException("Invalid time format. Use HH:mm (e.g., 11:25)");
        }
    }
}