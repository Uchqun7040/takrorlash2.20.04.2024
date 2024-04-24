package leetcode;

public class Masala2160 {
    public static int minimumSum(int num) {
        int[] a=new int[4];
        for (int i = 0; i < 4; i++) {
            a[i]=num%10;
            num/=10;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 4; j++) {
                if (a[i]>a[j]){
                    a[i]+=a[j];
                    a[j]=a[i]-a[j];
                    a[i]=a[i]-a[j];
                }
            }
        }
        return (a[0]+a[1])*10 +a[2]+a[3];
    }
}
