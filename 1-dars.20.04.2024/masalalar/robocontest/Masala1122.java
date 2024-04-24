package robocontest;

import java.util.Scanner;

public class Masala1122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =0;
        while (n>0){
            if((n%10)%2 == 0){
                System.out.println("NO");
                return;
            }
            n/=10;
            i++;
        }
        System.out.println(i%2==1 ? "YES": "NO");
    }
}
//pythonda tashlandi