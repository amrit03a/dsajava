package array;
import java.util.*;
public class phi {
    public static void phi(int n ){
        double result =n ;
        for(int p=2;p*p<=n;p++){
            if(n%p==0){
                while(n%p==0){
                    n=n/p;
                }
                result = result * (1.0 - (1.0 / p));
            }
        }
        if(n>1){
            result=result-result/n;
        }
        System.out.println((int)result);
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        phi(n);
    }
}
