import java.io.*;
import java.util.*;
public class BalancedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int cases=1;cases<=t;cases++){
            int n=sc.nextInt();
            int[] a=new int[n];
            int sum=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                sum=sum+a[i];
            }
            if(n==1){
                System.out.println("Yes");
                continue;
            }
            int i,prevsum=0;
            for(i=0;i<n-1;i++)
            {
                if((sum-a[i])==prevsum)
                {
                    System.out.println("Yes");
                    break;
                }
                prevsum=prevsum+a[i];
                sum=sum-a[i];
            }
            if(i==(n-1))
            {
                if(sum==0)
                {
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
        }
    }
}
