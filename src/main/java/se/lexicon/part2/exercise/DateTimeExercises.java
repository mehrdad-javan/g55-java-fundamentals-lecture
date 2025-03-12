package se.lexicon.part2.exercise;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeExercises {

    public static void main(String[] args) {
        exercise1();
    }


    // Exercise 1: Create a LocalDate of the current day and print it out
    private static void exercise1() {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Exercise 1: " + currentDate);
    }

    // Exercise 2: Create a LocalDate of the current day and print it out in the specified pattern
    private static void exercise2() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d MMMM", java.util.Locale.ENGLISH);
        String formattedDate = currentDate.format(formatter);
        System.out.println("Exercise 2: " + formattedDate);
    }

    // Exercise 3: Create a LocalDate of last Monday and print out the entire week
    private static void exercise3() {
        LocalDate lastMonday = LocalDate.now().with(DayOfWeek.MONDAY).minusWeeks(1);
        System.out.println("Exercise 3:");
        for (int i = 0; i < 7; i++) {
            System.out.println("   " + lastMonday.plusDays(i).format(DateTimeFormatter.ISO_LOCAL_DATE));
        }
    }

    // Exercise 4: Create a LocalDate object from a String using the .parse() method
    private static void exercise4() {
        String dateString = "2022-03-06";
        LocalDate parsedDate = LocalDate.parse(dateString);
        System.out.println("Exercise 4: " + parsedDate);
    }

    // Exercise 5: Create a LocalDate of your birthday and extract the day of the week
    private static void exercise5() {
        LocalDate birthday = LocalDate.of(1990, 5, 8);
        DayOfWeek dayOfWeek = birthday.getDayOfWeek();
        System.out.println("Exercise 5: " + dayOfWeek);
    }

    // Exercise 6: Create a LocalDate of current date plus 10 years and minus 10 months
    private static void exercise6() {
        LocalDate currentDatePlus10YearsMinus10Months = LocalDate.now().plusYears(10).minusMonths(10);
        Month month = currentDatePlus10YearsMinus10Months.getMonth();
        System.out.println("Exercise 6: " + month);
    }

    // Exercise 7: Create a Period between your birthdate and the date from exercise 5
    private static void exercise7() {
        LocalDate birthdate = LocalDate.of(1990, 5, 8);
        Period period = Period.between(birthdate, LocalDate.now());
        System.out.println("Exercise 7: " + period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days");
    }

    // Exercise 8: Create a period of 4 years, 7 months, and 29 days and add it to the current date
    private static void exercise8() {
        Period periodToAdd = Period.of(4, 7, 29);
        LocalDate currentDatePlusPeriod = LocalDate.now().plus(periodToAdd);
        System.out.println("Exercise 8: " + currentDatePlusPeriod);
    }

    // Exercise 9: Create a LocalTime object of the current time
    private static void exercise9() {
        LocalTime currentTime = LocalTime.now();
        System.out.println("Exercise 9: " + currentTime);
    }

    // Exercise 10: Extract the nanoseconds of a LocalTime object of current time
    private static void exercise10() {
        LocalTime currentTime = LocalTime.now();
        int nanoseconds = currentTime.getNano();
        System.out.println("Exercise 10: " + nanoseconds + " nanoseconds");
    }

    // Exercise 11: Create a LocalTime object from a String using the .parse() method
    private static void exercise11() {
        String timeString = "12:34:56";
        LocalTime parsedTime = LocalTime.parse(timeString);
        System.out.println("Exercise 11: " + parsedTime);
    }

    // Exercise 12: Format LocalTime from current time and print it out as a specified pattern
    private static void exercise12() {
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(formatter);
        System.out.println("Exercise 12: " + formattedTime);
    }

    // Exercise 13: Create a LocalDateTime with specific date and time components
    private static void exercise13() {
        LocalDateTime customDateTime = LocalDateTime.of(2018, 4, 5, 10, 0);
        System.out.println("Exercise 13: " + customDateTime);
    }

    // Exercise 14: Format the LocalDateTime object from exercise 13 to a specified pattern
    private static void exercise14() {
        LocalDateTime customDateTime = LocalDateTime.of(2018, 4, 5, 10, 0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d MMMM HH:mm", java.util.Locale.ENGLISH);
        String formattedDateTime = customDateTime.format(formatter);
        System.out.println("Exercise 14: " + formattedDateTime);
    }

    // Exercise 15: Create a LocalDateTime object by combining LocalDate and LocalTime
    private static void exercise15() {
        LocalDate datePart = LocalDate.of(2022, 3, 6);
        LocalTime timePart = LocalTime.of(15, 30);
        LocalDateTime combinedDateTime = LocalDateTime.of(datePart, timePart);
        System.out.println("Exercise 15: " + combinedDateTime);
    }

    // Exercise 16: Get LocalDate and LocalTime components from LocalDateTime
    private static void exercise16() {
        LocalDateTime customDateTime = LocalDateTime.of(2022, 3, 6, 15, 30);
        LocalDate datePart = customDateTime.toLocalDate();
        LocalTime timePart = customDateTime.toLocalTime();
        System.out.println("Exercise 16: Date: " + datePart + ", Time: " + timePart);
    }

    // Extra challenge: Create your own calendar for the year 2018
    private static void createCalendar2018() {
        int year = 2018;

        for (int month = 1; month <= 12; month++) {
            YearMonth yearMonth = YearMonth.of(year, month);
            System.out.println("\n" + yearMonth.getMonth() + " " + year);
            System.out.println("-------------------------------");
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
            int startingDayOfWeek = firstDayOfMonth.getDayOfWeek().getValue();

            // Print empty spaces for days before the starting day of the month
            for (int i = 1; i < startingDayOfWeek; i++) {
                System.out.print("    ");
            }

            // Print the days of the month
            int daysInMonth = yearMonth.lengthOfMonth();
            for (int day = 1; day <= daysInMonth; day++) {
                System.out.printf("%3d ", day);

                // Move to the next line after Saturday
                if ((day + startingDayOfWeek - 1) % 7 == 0 || day == daysInMonth) {
                    System.out.println();
                }
            }
        }
    }
}
