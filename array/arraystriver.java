package array;
import java.util.*;
public class arraystriver {
    public static void main(String[] args){
        /*Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int [] arr=new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }*/
        //largestelement
        /*Arrays.sort(arr);
        System.out.println(arr[n-1]);*/

        /*int max=arr[0];
        for(int i =1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);*/

        //second smallest

        /*if(n<2){
            System.out.println("not exist");
        }
        int small = Integer.MAX_VALUE;
        int secondsmall=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<small){
                secondsmall=small;
                small=arr[i];
            }
            else if(arr[i]<secondsmall && arr[i]!=small){
                secondsmall=arr[i];
            }
        }
        System.out.println(secondsmall);*/

        //second largest 

        /*if(n<2){
            System.out.println("nt possible");
        }
        int largest=Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondlargest && arr[i]!=largest){
                secondlargest=arr[i];
            }
        }
        System.out.println(secondlargest);*/

        //check array is sorted or not 
        /*boolean sorted=true;
        for(int i =1;i<n;i++){
            if(arr[i-1]>arr[i]){
                sorted=false;
            }
        }
        if(sorted){
            System.out.println("sorted");
        }
        else{
            System.out.println("ntt");
        }*/

        //remove duplicate elements

        /*Arrays.sort(arr);
         int i =0;
        for(int j =1;j<n;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        for(int k=0;k<i+1;k++){
            System.out.print(arr[k]);
        }*/

        /*int [] arrr=new int[n];
        int k =0;
        arrr[0]=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                k++;
                arrr[k]=arr[i];
            }
        }
        for(int m=0;m<=k;m++){
            System.out.print(arrr[m]);
        }*/

    
        //left rotate by 1 place
        /*int temp=arr[0];
        for(int i =1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        for(int m=0;m<n;m++){
            System.out.print(arr[m]);
        }*/

        //left rotate by k place 

        /*int k =sc.nextInt();
        int [] temp=new int[n];
        for(int i =0;i<n;i++){
            temp[i]=arr[(i+k)%n];
        }
        for(int m=0;m<n;m++){
            System.out.print(temp[m]);
        }*/

        //move zero to last

        /*int j =-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j!=-1){
            for(int i=j+1;i<n;i++){
                if(arr[i]!=0){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    j++;
                }
            }
        }
        for(int m=0;m<n;m++){
            System.out.print(arr[m]);
        }*/

       /*int k=0;
        for(int i =0;i<n;i++){
            if(arr[i]!=0){
                arr[k]=arr[i];
                k++;
            }
        }
        for(int i=k;i<n;i++){
            arr[i]=0;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }*/

        //linear search

        /*int k =sc.nextInt();
        int l=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                l=i;
                break;
            }
        }
        if(l==-1){
            System.out.println("nt found");
        }
        else{
            System.out.println("found at "+l);
        }*/

        //union

       /* int m =sc.nextInt();
        int [] arrr=new int[m];
        for(int i =0;i<m;i++){
            arrr[i]=sc.nextInt();
        }
        int [] union=new int[n+m];
        int k=0;
        for(int i=0;i<n;i++){
            union[k++]=arr[i];
        }
        for(int i=0;i<m;i++){
            union[k++]=arrr[i];
        }
        Arrays.sort(union);

        int i=0;
        for(int j=1;j<n+m;j++){
            if(union[j]!=union[i]){
                 i++;
                union[i]=union[j];
            }
        }
        for(int j=0;j<i+1;j++){
            System.out.print(union[j]);
        }*/

        //find absent
       /*for(int i =1;i<=n;i++){
            boolean found=false;
            for(int j=0;j<n;j++){
                if(arr[j]==i){
                    found=true;
                    break;
                }
            }
             if(!found) {
             System.out.println("Missing Number = " + i);
             return;
    }
            }*/

       /*int count=0;
        int maxi=0;
        for(int i =0;i<n;i++){
            if(arr[i]==1){
                count++;
            }
            else{
                count=0;
            }
            maxi=Math.max(maxi,count);
        }
        System.out.println(maxi);*/

        /*for(int i =0;i<n;i++){
            int num=arr[i];
            int count=0;
            for(int j =0;j<n;j++){
                if(arr[j]==num){
                    count++;
                }
            }
            if(count==1){
                System.out.println(arr[i]);
                break;
            }
        }*/
       
       /*int max = 0;
       int sin = -1;
       int ein = -1;
       int l = sc.nextInt();
       for(int si = 0; si < n; si++) {
        for(int ei = si; ei < n; ei++) {
            int sum = 0;
            for(int k = si; k <= ei; k++) {
                sum += arr[k];
        }
        if(sum == l && (ei - si + 1) > max) {
            max = ei - si + 1;
            sin = si;
            ein = ei;
        }
      }
     }
     System.out.println("Length = " + max);
     if(sin != -1) {
        System.out.print("Subarray: ");
        for(int i = sin; i <= ein; i++) {
            System.out.print(arr[i] + " ");
        }
    }*/

    //target two sum
    /*int ii=-1;
    int jj=-1;
    int k=sc.nextInt();
    for(int i =0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i!=j){
                if(arr[i]+arr[j]==k){
                    ii=i;
                    jj=j;
                    break;
                }
            }
        }
    }
    System.out.println("found at i= "+ii+" and "+ jj +" sum is "+arr[ii]+"and "+arr[jj]);*/
    

    //max frequency in array
    /*for (int i=0;i<n;i++){
        int count=0;
        int num=arr[i];
        for(int j =0;j<n;j++){
            if(arr[j]==num){
                count++;
            }
        }
        if(count>n/2){
            System.out.println(arr[i]);
            break;
        }
    }*/

    //Kadane's Algorithm : Maximum Subarray Sum in an Array

   /*int maxi=0;
    int sin=-1;
    int ein=-1;
    for(int si =0;si<n;si++){
        for(int ei=si;ei<n;ei++){
            int sum=0;
            for(int i=si;i<=ei;i++){
                sum=sum+arr[i];
            }
            if(sum>maxi){
                maxi=sum;
                sin=si;
                ein=ei;
            }
        }
    }
    System.out.println("maxsum= "+maxi+" from index "+sin+" to "+ein);*/

    //seprate negative and positive

    /*ArrayList<Integer> pos=new ArrayList<>();
    ArrayList<Integer> neg=new ArrayList<>();
    for(int i=0;i<n;i++){
        if(arr[i]>=0){
            pos.add(arr[i]);
        }
        else{
            neg.add(arr[i]);
        }
    }
    System.out.println(pos);
    System.out.println(neg);*/

    //leaders in an array

    /*ArrayList<Integer> leader =new ArrayList<>();
    for(int i =0;i<n;i++){
        int l=0;
        for(int j=i+1;j<n;j++){
            if(arr[i]>arr[j]){
                l++;
            }
        }
        if(l==(n-i-1)){
            leader.add(arr[i]);
        }
    }
    System.out.println(leader);*/

    //Longest Consecutive Sequence in an Array

   /*Arrays.sort(arr);
    int maxi=0;
    int count=1;

    for(int i=0;i<n-1;i++){
        if(arr[i+1]==arr[i]+1){
            count++;
        }
        else if(arr[i+1]==arr[i]){
            maxi=Math.max(maxi,count);
            count=1;
        }
    }
    maxi = Math.max(maxi, count);
    System.out.println(maxi);*/

    //2d array
    //set matrix zero
    //i=row j=colns

    /*Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        int [][] arr=new int[n][m];
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
         for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(arr[i][j]==0){
                    for(int k=0;k<m;k++){
                        if(arr[i][k]!=0){
                            arr[i][k]=-1;
                        }
                    }
                    for(int k=0;k<n;k++){
                        if(arr[k][j]!=0){
                            arr[k][j]=-1;
                        }
                    }

                    
                }
            }

        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(arr[i][j] == -1){
                    arr[i][j] = 0;
                }
           }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }*/

        //Rotate Image by 90 degree

        /*Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        int [][] arr=new int[n][m];
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int [][] rot=new int[n][m];

        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                rot[j][n-i-1]=arr[i][j];
            }
        }
         for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(rot[i][j] + " ");
            }
            System.out.println();
        }*/

        //spiral

        /*Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        int [][] arr=new int[n][m];
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("array");
        int top=0;
        int left=0;
        int right=m-1;
        int bottom=n-1;

        while(top<=bottom && left<=right){

            for(int i=left;i<=right;i++){
                System.out.println(arr[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++){
                System.out.println(arr[i][right]);
            }
            right--;

            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    System.out.println(arr[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    System.out.println(arr[i][left]);
                }
                left++;
            }
        }*/

        //count nb of subarrrays sum whose sum is equal to k

        /*Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int [] arr=new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter sum");
        int m =sc.nextInt();
        int count=0;
        for(int i =0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                }
                if(sum==m){
                    count++;
                    System.out.println("\nsubarray");
                    for(int k=i;k<=j;k++){
                        System.out.print(arr[k]+" ");
                    }
                }
            }
        }
        System.out.println("\ntotal count "+count);*/


        //pascal trianglr

        /*Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int [][] arr=new int[n][n];

        for(int i=0;i<n;i++){
            for( int j=0;j<=i;j++){
                if(j==0 || j==i) {
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }

            }
        }
         for(int i = 0; i < n; i++) {

            for(int s = 0; s < n-i-1; s++) {
                System.out.print(" ");
            }

            for(int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }*/

        //count frequence if greater than n/3

        /*Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int [] arr=new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            int count=0;
            if(ans.contains(arr[i])){
                continue;
            }
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>n/3){
                    ans.add(arr[i]);
            }
        }
        System.out.println(ans);*/


        //3sum

        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k =j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        System.out.println("triplet "+arr[i]+" "+arr[j]+" "+arr[k]+" ");
                    }
                }
            }
        }*/

    
        //largest subarray with sum zero

       /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ein=-1;
        int sin=-1;
        int maxi=0;
        for(int si=0;si<n;si++){
            for(int ei=si;ei<n;ei++){
                int sum=0;
                for(int i=si;i<=ei;i++){
                    sum=sum+arr[i];
                }
                if(sum==0){
                    if((ei-si+1)>maxi){
                        maxi=ei-si+1;
                        ein=ei;
                        sin=si;
                    }
                }
            }
        }
        System.out.println("length "+(ein-sin+1));
        for(int i=sin;i<=ein;i++){
            System.out.print(arr[i]+" ");
        }*/

       //overlapping

        /*Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int start=arr[0][0];
        int end=arr[0][1];
        for(int i=1;i<n;i++){
            if(arr[i][0]<=end){
                end=arr[i][1];
            }
            else{
                System.out.println("["+start+","+end+"]");
                start=arr[i][0];
                end=arr[i][1];
            }
        }
        System.out.println("[" + start + "," + end + "]");   */

        //Merge two Sorted Arrays Without Extra Space


        Scanner sc = new Scanner(System.in);

        /*int n = sc.nextInt();
        int[] nums1 = new int[n];
        for(int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] nums2 = new int[m];
        for(int i = 0; i < m; i++) {
            nums2[i] = sc.nextInt();
        }
        
        int j=0;
        for(int i=0;i<n;i++){
            if(nums1[i]==0){
                nums1[i]=nums2[j];
                j++;
            }
        }
        Arrays.sort(nums1);
        for (int num : nums1) {
            System.out.print(num + " ");
        }*/

       /*int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int repetition=-1;
        int missing=-1;
        for(int i=1;i<=n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[j]==i){
                    count++;
                }

            }
            if(count==0){
                missing=i;
            }
            else if(count==2){
                repetition=i;
            }
        }
        System.out.println("missing"+missing);
        System.out.println("repetition"+repetition);*/

        //inversions

        /*int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>=arr[j]){
                    count++;
                }
            }
        }
        System.out.println(count+" inversions");*/

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       /*int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>2*arr[j]){
                    count++;
                    System.out.println("pairs "+arr[i]+" "+arr[j]);
                }
            }
        }
        System.out.println(count+" --total pairs");*/

        /*int max=0;
        int sin=-1;
        int ein=-1;
        for(int si=0;si<n;si++){
            for(int ei=si;ei<n;ei++){
                int prod=1;
                for(int i=si;i<=ei;i++){
                    prod=prod*arr[i];
                }
                if(prod>max){
                    max=prod;
                    sin=si;
                    ein=ei;
                }
            }
        }
        System.out.println("maximum product is "+max);
        System.out.println("and it is in range "+sin+" to "+ein);*/

        
    }

}






