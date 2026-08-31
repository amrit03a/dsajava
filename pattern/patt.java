package pattern;
import java.util.Scanner;
public class patt{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();

        /*for (int i =0;i<n;i++){
            for (int j =0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

       /* for (int i =0;i<n;i++){
            for(int j =0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*for (int i =0;i<=n;i++){
            for(int j =1;j<i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/

        /*for (int i =1;i<n+1;i++){
            for(int j =1;j<i+1;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }*/

        /*for (int i =n;i>0;i--){
            for(int j =0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*for (int i =n;i>0;i--){
            for(int j =1;j<i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/

        
        /*for (int i = 1; i < n+1; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        /*for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

       /*  for (int i=1;i<=2*n;i++){
            if (i<=n){
                for(int j=1;j<=n-i;j++){
                    System.out.print("  ");
                }
                for (int j=1;j<=(2*i-1);j++){
                    System.out.print("* ");
                }
                System.out.println();
            } 
           else{
                for(int j=1;j<=i-n-1;j++){
                    System.out.print("  ");
                }
                for (int j = 1; j <= (2 * (2 * n - i) + 1); j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }*/

        /*for (int i =1;i<=(2*n-1);i++){
            if(i<=n){
                for (int j=1;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for (int j=1;j<=(2*n - i);j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }*/

        /*int start;
        for (int i =0;i<n;i++){
            if(i%2==0){
                start=1;
            }
            else{
                start=0;
            }
            for(int j =0;j<=i;j++){
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();
        }*/

        /*for (int i=1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=(2*n-2*i);j++){
                System.out.print(" ");
            }
            for(int k=i;k>0;k--){
                System.out.print(k);
            }
            System.out.println();
        }*/

        /*int count=0;
        for (int i=1;i<=n;i++){
            for (int j =1;j<=i;j++){
                count =count+1;
                System.out.print(count+" ");
            }
            System.out.println();
        }*/

        /*for (int i=0;i<n;i++){
            char ch='A';
            for (int j =0;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }*/

        /*for (int i=n;i>0;i--){
            char ch='A';
            for (int j=0;j<i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }*/

       /* char ch ='A';
        for (int i=0;i<n;i++){
            for(int j =0;j<=i;j++){
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }*/

        /*for (int i=0;i<n;i++){
            char ch='A';
            for( int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for (int j =0;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            ch-- ;
            for(int j =0;j<i;j++){
                ch--;
                System.out.print(ch);
            }
            System.out.println();
        }*/

       /*  char ch ='E';
        for(int i =0;i<n;i++){
            char chh=(char)(ch-i);
            for (int j=0;j<=i;j++){
                System.out.print(chh);
                chh++;
            }
            System.out.println();
        } */

        /*for (int i=n;i>=1;i--){
            for(int j =1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=0;j<2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j =1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=0;j<2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j =1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

        /*for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=0;j<2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=n-1;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=0;j<2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

        /*for(int i =0;i<n;i++){
            if (i == 0|| i==n-1){
                for(int j =0;j<n;j++){
                    System.out.print("* ");
                }
            }
            else{
                System.out.print("* ");
                for (int j =0;j<n-2;j++){
                    System.out.print("  ");
                }
                System.out.print("*");
            }
            System.out.println();
        }*/

       /* int m=(n+1)/2;
        for (int i=1;i<=n;i++){
            for (int j =1;j<=n ;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print(m);
                }
                else if(i==2||i==n-1||j==2||j==n-1){
                    System.out.print(m-1);
                }
                else if(i==3||i==n-2||j==3||j==n-2){
                    System.out.print(m-2);
                }
                else{
                    System.out.print(m-3);
                }
            }
            System.out.println();
        }*/
    }
}

