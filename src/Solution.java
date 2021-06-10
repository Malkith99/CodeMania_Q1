import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      //  Vector<Integer> vec =new Vector<>();
        //Vector<String> print = new Vector<>();
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        int[] arr=new int[N];
        int[] sum=new int[N];
        int Q=scanner.nextInt();
        String[] print=new String[Q];
        for(int i=0;i<N;i++){
           arr[i]=scanner.nextInt();
            if(i==0){
                sum[i]=arr[0];
            }else {
                sum[i]=(arr[i] + sum[i - 1]);
            }
        }
        for(int i=0;i<Q;i++) {
            int p = scanner.nextInt();
            int q = scanner.nextInt();
            if ((p > q) && (q > N-1)) {
                return;
            } else if(p==0){
                print[i]=sum[q]+"";
            }else{
               print[i]=(sum[q]-sum[p-1])+"";
            }

        }
       System.out.println(String.join("\n",print));

    }
}