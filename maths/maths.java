package maths;
import java.beans.DefaultPersistenceDelegate;
import java.util.*;
public class maths{

    /*public static void gcd(int a,int b){
        if(b>a){
            int t=a;
            a=b;
            b=t;
        }
        if(b==0){
            System.out.println(a);
            return;
        }
        gcd(a-b,b);
    }*/

    /*public static void euclidean(int a,int b){
        if(b==0){
            System.out.println("gcd is "+a);
            return;
        }
        euclidean(b,a%b);
    }*/

    /*public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }

    public static boolean isprime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }*/
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        //count 
        /*int count =0;                   //handle negative case too
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

        //direct method for finding digit

        //System.out.println((int)Math.log10(n)+1);

    
        //reverse

        /*if(n==0){
            System.out.println(0);
            return
        }
        boolean negative=false;
        if(n<0){
            negative=true;
            n=n*-1;
        }
        int rnb=0;
        while(n>0){
            int lnb=n%10;
            rnb=rnb*10+lnb;
            n=n/10;
        }
        if(negative){
            System.out.println(-1*rnb);
        }
        else{
            System.out.print(rnb);
        }*/

        //fast exponentiation

        /*double res=1.0;
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(b>0){
            if(b%2!=0){
                res=res*a;
                b--;
            }
            a=a*a;
            b=b/2;
        }
        System.out.println((int)res);*/




        //pallindrome
       /* int onb=n;
        int rnb=0;
        while(n>0){
            int lnb=n%10;
            rnb=rnb*10+lnb;
            n=n/10;
        }
        System.out.print(onb==rnb);*/


        //gcd hcf    -1st approach -- gcd /hcf -gratest/highest common divisor

        /*int m =sc.nextInt();
        //these both will handle negative cases
        n=Math.abs(n);
        m=Math.abs(m);
        //cases for handling zeros
        if(n==0 && m==0){
            System.out.println(0);
            return;
        }
        if(n==0){
            System.out.println(m);
            return;
        }
        if(m==0){
            System.out.println(n);
            return;
        }
        int gcd=1;
        for (int i=1;i<=Math.min(n,m);i++){
            if(n%i==0 && m%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);*/

        //gcd -2nd approach --euclidean (nt optimised)
        /*int m=sc.nextInt();
        gcd(n,m);*/                //recursive approach check code once 

        //euclidean optimised   --recursive approach
        /*int m=sc.nextInt();
        euclidean(n, m);*/

        /*int gcd=0;      //iterative approach
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

        //print all unique prime nb   --prime factors


        /*for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(isprime(i)){
                    System.out.print(i+" ");
                }
                int fac=n/i;
                if(fac!=i && isprime(fac)){
                    System.out.print(fac+" ");
                }
            }
        }*/


        //prime factor another approach 

        /*for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print(i+" ");
                while(n%i==0){
                    n=n/i;
                }
            }
        }
        if(n>1){
                System.out.print(n);
        }*/

        //smallest prime factor
        /*for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println(i);
                break;
            }
        }*/

        //smallest prime factor of every nb till n 
        //1st approach is brute force approach 
        //run outer loop from 2 to n and find spf for each nb    
        //tc-n(rootn)

        //2nd approach --modified seive

        /*int[] arr=new int[n+1];
        for(int i=2;i<=n;i++){
            arr[i]=i;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(arr[i]==i){
                for(int j=i*i;j<=n;j=j+i){
                    if(arr[j]==j){
                        arr[j]=i;
                    }
                }
            }
        }
        for(int i=2;i<=n;i++){
            System.out.print(arr[i]+" ");
        }*/
        

      //ArmStrong nb 

     /*int digit=(int)Math.log10(n)+1;
      int nb=n;
      int sum=0;
      while(nb>0){                                        //-ve case nt handled here 
        int d=nb%10;
        sum=sum+(int)Math.pow(d,digit);
        nb=nb/10;
      }
      if(n==sum){
        System.out.println("armstrong ");
      }
      else{
        System.out.println("not");
      }*/

    

        //divisors

        /*for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print(i+" ");
                if(n/i!=i){
                    System.out.print(n/i+" ");
                }
            }
            
        }*/

        

        //3rd
        //Divisors come in pairs. Once we find one divisor, its pair is automatically known. So after a point, we start checking the same pairs again.
        /*boolean isprime=true;
        if(n<=1){
            isprime=false;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isprime=false;
                    break;
                }
            }
        }
        System.out.println(isprime ? "prime" : "not prime");*/

        //brute force prime nb in range

        /*for(int i=2;i<=n;i++){
            boolean isprime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.print(i+" ");
            }
        }*/
       
        //optimised approach -- simple sieve

       /*boolean [] arr=new boolean[n+1];
        Arrays.fill(arr,true);
        for(int i=2;i<=Math.sqrt(n);i++){
            if(arr[i]){
                for(int j=i*i;j<=n;j=j+i){
                    arr[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(arr[i]){
                System.out.print(i+" ");
            }
        }*/

        //segmented seive -- in range
        /*int nn=sc.nextInt();
        boolean[] arr=new boolean[nn+1];
        Arrays.fill(arr,true);
        for(int i=2;i<=Math.sqrt(nn);i++){
            int sm=(n/i)*i;
            if(sm<n){
                sm=sm+i;
            }
            if(sm==i){
                sm=sm+i;
            }
            for(int j=sm;j<=nn;j=j+i){
                arr[j]=false;
            }
        }
        for(int i=n;i<=nn;i++){
            if(arr[i]){
                System.out.print(i+" ");
            }
        }*/

        
        


    //number system 

    /*public static int getdigit(char ch){
        switch (ch) {
            case 'A':
                return 10;

            case 'B':
                return 11;

            case 'C':
                return 12;

            case 'D':
                return 13;
                
            case 'E':
                return 14;

            case 'F':
                return 15;

            default:
                return ch-'0';
        }
    }
    public static char getchar(int i){
        switch(i){
            case 10:
                return 'A';
            case 11:
                return 'B';
            case 12:
                return 'C';
            case 13:
                return 'D';
            case 14:
                return 'E';
            case 15:
                return 'F';
            default:
                return (char)(i+'0');
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //any number to decimal
        /*System.out.println("enter the nb ");
        String nn =sc.next();
        System.out.println("enter the base ");
        int n =sc.nextInt();
        int res=0;
        int p=0;
        for(int i=nn.length()-1;i>=0;i--){
            int digit=getdigit(nn.charAt(i));
            res=res+(digit*((int)Math.pow(n,p)));
            p++;
        }
        System.out.println(res);*/


        //decimal to any other nb 
        /*System.out.println("enter the nb");
        int  nb =sc.nextInt();
        System.out.println("enter the base ");
        int base=sc.nextInt();
        StringBuilder res=new StringBuilder();
        while(nb>0){
            int rem=nb%base;
            res.append(getchar(rem));
            nb=nb/base;
        }
        res.reverse();
        System.out.println(res);*/


        //bitwise 

        //oddeven using bitwise operaator 
        /*boolean b=((n&1)==0);
        if(b){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }*/

        //System.out.println(n>>1);           //left right shift

        //swap two nb without using the third variable 

        /*int m =sc.nextInt();
        System.out.println("before swapping n is "+n+"and m is "+m);
        n=n^m;
        m=n^m;
        n=n^m;
        System.out.println("after swapping n is "+n+"and m is "+m);*/

        //check the kth bit from right is set or not 
        /*System.out.println("enter the k value");
        int k=sc.nextInt();
        boolean b=(((1<<k)&n)>0);
        if(b){
            System.out.println("bit is set");
        }
        else{
            System.out.println("bit is unset");
        }*/

        //set the kth element from right 

        /*int k=sc.nextInt();
        System.out.println((1<<k)|n);*/

        //unset the kth element from right 

        /*int k=sc.nextInt();
        int m = ~(1<<k);
        System.out.println(m&n);*/

        //toggle kth bit from left 

        /*int k=sc.nextInt();
        System.out.println((1<<k)^n);*/


        //---count set bit 

        //direct function 

        //System.out.println(Integer.bitCount(n));

        //brian kernighan's algo
        /*int count=0;
        while(n!=0){
            n=(n&(n-1));
            count++;
        }
        System.out.println(count);*/

        //rightmost set bit  except that every bit shpuld be 0

        //System.out.println(n&(-n));

        //check if nb is power of 2

        /*boolean b=((n&(n-1))==0);
        if(b){
            System.out.println("yes it is 2's power ");
        }
        else{
            System.out.println("nt 2's power");
        }*/

        //char conversion

        //-----to lower 
        /*char ch='A';
        System.out.println((char)(ch|(1<<5)));*/

        //-to upper

        /*char ch='a';
        System.out.println((char)(ch&~(1<<5)));*/

        //-- toggle -- means upper then lower and vice versa

        /*char ch='Z';
        System.out.println((char)(ch^(1<<5)));*/

        //find unique nb in array   -l41 --leet -136

        //--brute force
        /*int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(arr[i]);
                break;
            }
        }*/

        //--optimised solution using xor

        /*int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int xor=0;
        for(int nn:arr){
            xor=xor^nn;
        }
        System.out.println(xor);*/

        //single number -2 ----  leet (see notebook)

        /*int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=0;
        for(int i=0;i<32;i++){
            int bitcount=0;
            for(int nums:arr){
                if((nums & (1<<i))!=0){
                    bitcount++;
                }
            }
            if(bitcount%3!=0){
                res=res | (1<<i);
            }
        }
        System.out.println(res);*/

        //min nb of bits required to  flip to get start to goal

        /*int m=sc.nextInt();
        System.out.println(Integer.bitCount(n^m));*/


        // subsets   of unique elements 
        /*int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<List<Integer>> res=new ArrayList<>();
        int len=arr.length;
        int subsets=1<<len;
        for(int i=0;i<subsets;i++){
            List<Integer> l=new ArrayList<>();
            for(int j=0;j<len;j++){
                if((i & (1<<j))!=0){
                    l.add(arr[j]);
                }
            }
            res.add(l);
        }
        System.out.println(res);*/
    }
    
}