import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateArithmetic{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a date (dd-mm-yyyy): ");
        String inputDate = scan.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date = LocalDate.parse(inputDate,formatter);
        System.out.println("Original Date: " + date);

        LocalDate addedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("After adding 7 days, 1 month, 2 years: " + addedDate);

        LocalDate finalDate = addedDate.minusWeeks(3);
        System.out.println("After subtracting 3 weeks: " + finalDate);
    }
}
