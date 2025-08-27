import java.util.*;
public class VolOfCylinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int h = scan.nextInt();
        double v = 3.14 * r * r * h; 
        System.out.println("The volume of cylinder of radius "+r+" and height "+h+" is "+v);
    }
}
