import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first date (dd-MM-yyyy): ");
        String input1 = scan.nextLine();
        System.out.print("Enter second date (dd-MM-yyyy): ");
        String input2 = scan.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date1 = LocalDate.parse(input1, formatter);
        LocalDate date2 = LocalDate.parse(input2, formatter);

        if (date1.isBefore(date2)) {
            System.out.println(date1.format(formatter) + " is before " + date2.format(formatter));
        } else if (date1.isAfter(date2)) {
            System.out.println(date1.format(formatter) + " is after " + date2.format(formatter));
        } else {
            System.out.println(date1.format(formatter) + " is the same as " + date2.format(formatter));
        }
    }
}
