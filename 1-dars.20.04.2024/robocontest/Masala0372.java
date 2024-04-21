import java.util.Scanner;

public class Masala0372 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (m>n){
            System.out.println(Math.max(m, k));
        }
        else
            System.out.println(Math.max(n, k));
    }
}

