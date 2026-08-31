package binarysearch;
import java.util.*;
public class bs {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        }
        int m =sc.nextInt();

        Arrays.sort(arr);

        //binary search
       /*int low=0;
        int high=n-1;
        int found=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==m){
                found=mid;
                break;
            }
            if(arr[mid]<m){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            
        }
        if(found==-1){
            System.out.println("target not found");
        }
        else{
            System.out.println("target found at "+ found);
        }*/ 

        

        //recursion 

        /*int result=binarysearch(arr,0,n-1,m);
        if(result==-1){
            System.out.println("target not found");
        }
        else{
            System.out.println("target found at "+ result);
        }
    }
    static int binarysearch(int[] arr,int low,int high,int target){
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if(arr[mid]==target){
            return mid;
        }

        if (arr[mid] < target) {
            return binarysearch(arr, mid + 1, high, target);
        }
        return binarysearch(arr, low, mid - 1, target);*/

        //lower bound

        //System.out.println(lowerBound(arr, m));
    }

    /*static int lowerBound(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= x) {
                return i;
            }
        }
        return arr.length;
    }*/

    //lower bound
    /*static int lowerBound(int[] arr,int x){
        int l=0;
        int h =arr.length-1;
        int ans=arr.length;
        while(l<=h){
            int mid=(l+h)/2;

            if(arr[mid]>=x){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }*/

    //upper bound 

    /*static int lowerBound(int[] arr,int x){
        int l=0;
        int h =arr.length-1;
        int ans=arr.length;
        while(l<=h){
            int mid=(l+h)/2;

            if(arr[mid]>x){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }*/

        
}
