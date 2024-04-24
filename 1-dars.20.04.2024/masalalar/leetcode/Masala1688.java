package leetcode;

public class Masala1688 {
    public int numberOfMatches(int n) {
        int s=0;
        while(n>0 && n!=1){
            s+=n/2;
            n=n-n/2;
        }
        return s;
    }
}
