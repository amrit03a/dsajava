package array;
import java.util.*;
public class primenb{
    public static void simplesieve(int limit){
        boolean prime[] =new boolean[limit+1];
        for(int i =2;i<=limit;i++){
            prime[i]=true;
        }
        for(int p=2;p*p<=limit;p++){
            if(prime[p]==true){
                for(int i =p*p;i<=limit;i=i+p){
                    prime[i]=false;
                }
            }
        }
        for(int p=2;p<=limit;p++){
            if(prime[p]){
                System.out.println(p);
            }
        }
    }
    public static void segmentedseive(int l,int h){
        boolean prime[]=new boolean[h+1];
        for(int i=2;i<=h;i++){
            prime[i]=true;
        }
        for(int p=2;p*p<=h;p++){
            int sm=(l/p)*p;
            if(sm<l){
                sm=sm+p;
            }
            for(int i=sm;i<=h;i=i+p){
                prime[i]=false;
            }
        }
        for(int i=l;i<=h;i++){
            if(prime[i]){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        /*int n =sc.nextInt();
        simplesieve(n);*/
        int l =sc.nextInt();
        int h =sc.nextInt();
        segmentedseive(l, h);

    }
}