package extra_book;

import java.util.Scanner;

public class Integer30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > n - n % 100) {
            System.out.println(n/100+1);
        }
        else
            System.out.println(n/100);
    }


}
