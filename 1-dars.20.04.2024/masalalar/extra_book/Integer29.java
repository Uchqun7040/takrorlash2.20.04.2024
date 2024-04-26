package extra_book;

import java.util.Scanner;

public class Integer29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Joylashganlar soni: " + (a / c) * (b / c));
        System.out.println("Qolgan yuzasi: " + (a * b - c * c * (a / c) * (b / c)));
    }


}
