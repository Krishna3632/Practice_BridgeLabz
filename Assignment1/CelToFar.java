import java.util.*;
public class CelToFar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ct = scan.nextInt();
        int ft = (ct * 9 / 5) + 32;
        System.out.println(ct+" celsius in fahrenheit is "+ft);
    }
}
