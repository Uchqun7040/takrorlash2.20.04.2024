package robocontest;

import java.util.Scanner;

public class Masala0479 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%100 ==0)
            System.out.println(n/100);
        else
            System.out.println(n/100F);
    }
}
