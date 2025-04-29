package timeconverter;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class TimeConverter {
    private static final Map<Integer, String> NUMBER_WORDS = new HashMap<>();

    static {
        NUMBER_WORDS.put(0, "zero");
        NUMBER_WORDS.put(1, "one");
        NUMBER_WORDS.put(2, "two");
        NUMBER_WORDS.put(3, "three");
        NUMBER_WORDS.put(4, "four");
        NUMBER_WORDS.put(5, "five");
        NUMBER_WORDS.put(6, "six");
        NUMBER_WORDS.put(7, "seven");
        NUMBER_WORDS.put(8, "eight");
        NUMBER_WORDS.put(9, "nine");
        NUMBER_WORDS.put(10, "ten");
        NUMBER_WORDS.put(11, "eleven");
        NUMBER_WORDS.put(12, "twelve");
        NUMBER_WORDS.put(13, "thirteen");
        NUMBER_WORDS.put(14, "fourteen");
        NUMBER_WORDS.put(15, "fifteen");
        NUMBER_WORDS.put(16, "sixteen");
        NUMBER_WORDS.put(17, "seventeen");
        NUMBER_WORDS.put(18, "eighteen");
        NUMBER_WORDS.put(19, "nineteen");
        NUMBER_WORDS.put(20, "twenty");
        NUMBER_WORDS.put(21, "twenty one");
        NUMBER_WORDS.put(22, "twenty two");
        NUMBER_WORDS.put(23, "twenty three");
        NUMBER_WORDS.put(24, "twenty four");
        NUMBER_WORDS.put(25, "twenty five");
        NUMBER_WORDS.put(26, "twenty six");
        NUMBER_WORDS.put(27, "twenty seven");
        NUMBER_WORDS.put(28, "twenty eight");
        NUMBER_WORDS.put(29, "twenty nine");
        NUMBER_WORDS.put(30, "thirty");
        NUMBER_WORDS.put(31, "thirty one");
        NUMBER_WORDS.put(32, "thirty two");
        NUMBER_WORDS.put(33, "thirty three");
        NUMBER_WORDS.put(34, "thirty four");
        NUMBER_WORDS.put(35, "thirty five");
        NUMBER_WORDS.put(36, "thirty six");
        NUMBER_WORDS.put(37, "thirty seven");
        NUMBER_WORDS.put(38, "thirty eight");
        NUMBER_WORDS.put(39, "thirty nine");
        NUMBER_WORDS.put(40, "forty");
        NUMBER_WORDS.put(41, "forty one");
        NUMBER_WORDS.put(42, "forty two");
        NUMBER_WORDS.put(43, "forty three");
        NUMBER_WORDS.put(44, "forty four");
        NUMBER_WORDS.put(45, "forty five");
        NUMBER_WORDS.put(46, "forty six");
        NUMBER_WORDS.put(47, "forty seven");
        NUMBER_WORDS.put(48, "forty eight");
        NUMBER_WORDS.put(49, "forty nine");
        NUMBER_WORDS.put(50, "fifty");
        NUMBER_WORDS.put(51, "fifty one");
        NUMBER_WORDS.put(52, "fifty two");
        NUMBER_WORDS.put(53, "fifty three");
        NUMBER_WORDS.put(54, "fifty four");
        NUMBER_WORDS.put(55, "fifty five");
        NUMBER_WORDS.put(56, "fifty six");
        NUMBER_WORDS.put(57, "fifty seven");
        NUMBER_WORDS.put(58, "fifty eight");
        NUMBER_WORDS.put(59, "fifty nine");
    }

    public String convertToWords(String time) {
        TimeValidator validator = new TimeValidator();
        validator.validate(time);

        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);

        return convertToWords(hours, minutes);
    }

    public String convertToWords(LocalTime time) {
        return convertToWords(time.getHour(), time.getMinute());
    }

    private String convertToWords(int hours, int minutes) {
        if (hours == 12 && minutes == 0) {
            return "It's Midday";
        }
        if (hours == 0 && minutes == 0) {
            return "It's Midnight";
        }

        String hourWord = NUMBER_WORDS.get(hours % 24);
        String minuteWord = minutes == 0 ? "" : NUMBER_WORDS.get(minutes);

        if (minutes == 0) {
            return String.format("It's %s o'clock", hourWord);
        }
        return String.format("It's %s %s", hourWord, minuteWord);
    }
}