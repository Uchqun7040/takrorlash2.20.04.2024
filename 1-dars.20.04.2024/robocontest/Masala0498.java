import java.util.Scanner;
//hali xato
public class Masala0498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, m;
        for (int i = 0; i < n-1; i++) {
            a += sc.nextInt();
            a -= sc.nextInt();
        }
        m = sc.nextInt();
        System.out.println(m-a-1);
    }
}
