package robocontest;

import java.util.Scanner;

public class Masala0945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a*b > 2*(a+b)){
            System.out.println(a*b);
        }
        else{
            System.out.println(2*(a+b));
        }
    }
}
