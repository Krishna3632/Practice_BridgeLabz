import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        double a = 3.14 * r * r; 
        System.out.println("The area of circle of radius "+r+" is "+a);
    }
}
