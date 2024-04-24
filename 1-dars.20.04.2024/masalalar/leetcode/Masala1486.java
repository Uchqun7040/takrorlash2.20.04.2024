package leetcode;

public class Masala1486 {
    public  int xorOperation(int n, int start) {
        int x=0;
        for (int i = 0; i < n; i++) {
            x^=start+2*i;
        }
        return x;
    }
}
