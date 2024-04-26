package extra_book;

import java.util.Scanner;

public class Begin40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a1 = sc.nextDouble();
        double b1 = sc.nextDouble();
        double c1 = sc.nextDouble();
        double a2 = sc.nextDouble();
        double b2 = sc.nextDouble();
        double c2 = sc.nextDouble();
        double d = a1 * b2 - a2 * b1;
        System.out.println("x = " + (c1 * b2 - c2 * b1) / d);
        System.out.println("y = " + (a1 * c2 - a2 * c1) / d);
    }
}
