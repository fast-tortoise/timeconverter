package timeconverter;

import java.util.Scanner;

public class ConsoleInterface {
    private final TimeConverter converter;
    private final TimeProvider timeProvider;
    private final Scanner scanner;

    public ConsoleInterface(TimeConverter converter, TimeProvider timeProvider) {
        this.converter = converter;
        this.timeProvider = timeProvider;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\nTime Converter");
            System.out.println("1. Current time in words");
            System.out.println("2. Enter time (HH:mm)");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            try {
                switch (choice) {
                    case "1":
                        String currentTimeWords = converter.convertToWords(timeProvider.getCurrentTime());
                        System.out.println(currentTimeWords);
                        break;
                    case "2":
                        System.out.print("Enter time (HH:mm): ");
                        String userTime = scanner.nextLine();
                        String userTimeWords = converter.convertToWords(userTime);
                        System.out.println(userTimeWords);
                        break;
                    case "3":
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid option. Please choose 1, 2, or 3.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}