import java.util.Scanner;
public class Add {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int sum = n1 + n2;
        System.out.println("The sum of "+n1+" and "+n2+" is "+sum);
    }
}
