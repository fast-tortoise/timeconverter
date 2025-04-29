package timeconverter;

public class Main {
    public static void main(String[] args) {
        TimeProvider timeProvider = new SystemTimeProvider();
        TimeConverter converter = new TimeConverter();
        ConsoleInterface console = new ConsoleInterface(converter, timeProvider);
        console.start();
    }
}
