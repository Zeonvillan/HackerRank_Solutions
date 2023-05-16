import java.util.Scanner;
import java.lang.Math;

class Solution{

    public static void calculation(int a , int b, int n){
        int sum = a+(int)Math.pow(2, 0) * b;
        System.out.printf("%d ",sum);
        for(int k = 1; k<n;++k){
            sum += Math.pow(2, k) * b;
            System.out.printf("%d ",sum);
    }
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a, b, c ;
        for(int i = 0; i<=t;++i){
            a = sc.nextInt();
            b = sc.nextInt();
            int n = sc.nextInt();
            calculation(a ,b ,n);
            }

            System.out.println();
            sc.close();
        }
    }
