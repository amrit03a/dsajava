package Recursion;
/*public class Recursion {
    public static void printname(String name,int count,int N){
        if(count==N){
            return;
        }
        System.out.println(name);
        printname(name, count + 1, N);
    }
    public static void main(String[] args){
        int N=5;
        String name="Amrit";
        printname(name,0,N);
    }
}
*/
import java.util.*;
/*public class Recursion{
    public static void printnb(int n,int N){
        System.out.println(n);
        if(n==N){
            return;
        }
        printnb(n+1, N);
    }
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        printnb(1,n);
    }
}*/

/*public class Recursion{
    public static void sum(int n,int N,int s){
        s=s+n;
        if(n==N){
            System.out.println(s);
            return;
        }
        sum(n+1, N,s);
    }
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int s=0;
        sum(1,n,s);
    }
}*/


/*public class Recursion{
    public static void factorial(int n,int f){
        if(n==0){
            System.out.println(f);
            return;
        }
        f=f*n;
        factorial(n-1,f);
    }
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int f=1;
        factorial(n,f);
    }
}*/


/*public class Recursion{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr,0,arr.length-1);
        for(int i=0;i<n;i++){
            System.out.print(i+" ");
        }
        
    }
    public static void reverse(int[] arr,int left,int right){
        if(left==right){
            return;
        }
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;

        reverse(arr, left+1, right-1);
    }
}*/

/*public class Recursion{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String nn=sc.nextLine();
        reverse(arr,0,arr.length-1);
        System.out.println(n);
    }
    public static void reverse(int[] arr,int left,int right){
        if(left==right){
            return;
        }
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        reverse(arr, left+1, right-1);
    }
}*/

/*public class Recursion{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String nn=sc.nextLine();
        System.out.println(pallindrome(nn,0,nn.length()-1));
    }
    public static boolean pallindrome(String s,int left,int right){
        if(left==right){
            return true;
        }
        if(s.charAt(left)!=s.charAt(right)){
            return false;
        }
        return pallindrome(s, left+1, right-1);
    }
}*/

/*public class Recursion{
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(fibonacci(n));
    }
}*/

