# Time Converter

A Java console application that converts 24-hour clock times to words (e.g., "08:34" to "It's eight thirty four"). It supports displaying the current time in words, converting user-provided times in "HH:mm" format, and handles special cases like "It's Midday" (12:00) and "It's Midnight" (00:00). The project adheres to **SOLID** design principles for modularity and maintainability.

## Features
- **Current Time Conversion**: Displays the current system time in words.
- **User Input Conversion**: Converts user-provided time (e.g., "11:25") to words (e.g., "It's eleven twenty five").
- **Special Cases**: Returns "It's Midday" for 12:00 and "It's Midnight" for 00:00.
- **Input Validation**: Ensures time inputs are in valid 24-hour format (00:00 to 23:59).
- **Console Interface**: Simple menu-driven interaction with options to view current time, enter a time, or exit.

## SOLID Principles
- **Single Responsibility**: Classes have distinct roles (e.g., `TimeConverter` for conversion, `TimeValidator` for validation).
- **Open/Closed**: Extensible design (e.g., number-to-word mappings can support new formats).
- **Liskov Substitution**: `TimeProvider` interface allows swapping time sources.
- **Interface Segregation**: Minimal interfaces (e.g., `TimeProvider` has one method).
- **Dependency Inversion**: Dependencies are injected via constructors.

## Project Structure
- **Interfaces**:
  - `TimeProvider`: Abstracts time retrieval.
- **Classes**:
  - `SystemTimeProvider`: Provides system time.
  - `TimeValidator`: Validates "HH:mm" input.
  - `TimeConverter`: Converts time to words.
  - `ConsoleInterface`: Handles user I/O.
  - `Main`: Program entry point.

## Requirements
- Java 8 or higher.

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/time-converter.git
