import java.util.*;
public class AverageOfThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        double av = (a+b+c)/3; 
        System.out.println("Average is "+av);
    }
}
