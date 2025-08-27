import java.util.*;
public class KMtoMiles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kd = scan.nextInt();
        double md = kd * 0.621371;
        System.out.println("Distance in miles is "+md);
    }
}
