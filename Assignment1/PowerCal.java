import java.util.*;
public class PowerCal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        int e = scan.nextInt();
        double ans = Math.pow(b,e);
        System.out.println(ans);
    }
}
