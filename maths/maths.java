package maths;
import java.util.Scanner;
public class maths{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        //count 
        /*int count =0;
        if(n==0){
            count=1;
        }
        else{
            while(n>0){
                count++;
                n=n/10;
            }
        }
        System.out.println(count);*/

    
        //reverse
        /*int rnb=0;
        while(n>0){
            int lnb=n%10;
            rnb=rnb*10+lnb;
            n=n/10;
        }
        System.out.print(rnb);*/


        //pallindrome
       /* int onb=n;
        int rnb=0;
        while(n>0){
            int lnb=n%10;
            rnb=rnb*10+lnb;
            n=n/10;
        }
        System.out.print(onb==rnb);*/

        //gcd hcf 
        /*int m =sc.nextInt();
        int gcd=1;
        for (int i=1;i<=Math.min(n,m);i++){
            if(n%i==0 && m%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);*/

        /*int gcd=0;
        while (n>0 && m>0){
            if(n>m){
                n=n%m;
            }
            else{
                m=m%n;
            }
        }
        if(n==0){
            gcd=m;
        }
        else{
            gcd=n;
        }
        System.out.println(gcd);*/

      /*  int d=0;
        int od=n;
        int m =n;
        while(n>0){
            d++;
            n=n/10;
        }
        int sum=0;
        while(m>0){
            int ld=m%10;
            sum+=Math.pow(ld,d);
            m=m/10;
        }
        System.out.println(od==sum);*/

        //divisors

        /*for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
            }
        }*/

        //prime nb
        //1st
        /*int count=0;
        for(int i =1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("prime");
        }
        else{
            System.out.println("nt prime");
        }*/

        //2bd
        /*boolean isprime=true;
        for(int i =2;i<n;i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        }
        if(isprime){
            System.out.println("prime");
        }
        else{
            System.out.println("nt prime");
        }*/

        //3rd
        //Divisors come in pairs. Once we find one divisor, its pair is automatically known. So after a point, we start checking the same pairs again.
        /*boolean isprime=true;
        if(n<=1){
            isprime=false;
        }
        else{
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    isprime=false;
                    break;
                }
            }
        }
        System.out.println(isprime ? "prime" : "not prime");*/

        
    }
}