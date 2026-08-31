package string;
import java.util.*;
public class string {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //String s=sc.nextLine();
        /*int open=0;
        String ans="";
        for(char ch : s.toCharArray()){
            if(ch=='('){
                if(open>0){
                    ans=ans+ch;
                }
                open++;
            }
            else{
                open--;
                if(open>0){
                    ans=ans+ch;
                }
            }
        }
        System.out.println(ans);*/

        //line pallidrome 
        /*String [] str=s.split(" ");
        int n=str.length;
        for(int i=0;i<n/2;i++){
            String temp= str[i];
            str[i]=str[n-i-1];
            str[n-i-1]=temp;
        }
        String res=String.join(" ",str);
        System.out.println(res);*/

        //largest odd substring 
        /*int max=0;
        int sin=-1;
        int ein=-1;
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String l=s.substring(i,j+1);
                int f=Integer.parseInt(l);
                    if(f%2!=0){
                        if(f>max){
                            max=f;
                            sin=i;
                            ein=j;
                        }
                    }
            }
        }
        System.out.println("largest odd nb is "+max);
        System.out.println("in range from "+sin+ " to "+ein);*/

        /*int n=sc.nextInt();
        String [] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        int minLen = Integer.MAX_VALUE;
        for(String s : arr){
            minLen = Math.min(minLen, s.length());
        }
        String ans="";
        for(int i=0;i<minLen;i++){
            char ch=arr[0].charAt(i);
            boolean same=true;
            for(int j=0;j<n;j++){
                if(arr[j].charAt(i)!=ch){
                    same=false;
                    break;
                }
            }
            if(same){
                ans += ch;
            }
            else{
                break;
            }

        }

        System.out.println(ans);*/

        //isomorphic string
        /*String s1=sc.next();
        String s2=sc.next();
        if(s1.length() != s2.length()){
            System.out.println("false");
            return;
        }

        for(int i=0;i<s1.length();i++){
            for(int j=i;j<s2.length();j++){
                if(s1.charAt(i)==s1.charAt(j) && s2.charAt(i)!=s2.charAt(j)){
                    System.out.println("false");
                    return;
                }
                if(s1.charAt(i)!=s1.charAt(j) && s2.charAt(i)==s2.charAt(j)){
                    System.out.println("false");
                    return;
                }
            }
        }
        System.out.println("true");*/

        //rotation
        /*String s1=sc.next();
        String s2=sc.next();
        int n =s1.length();
        for(int i=0;i<n;i++){
            String s3="";
            for(int j=0;j<n;j++){
                s3=s3+s1.charAt((i+j)%n);
            }
            System.out.println(i+1+" th rotation "+ s3);
            if(s2.equals(s3)){
                System.out.println("true");
                break;
            }
        }*/

        /*for(int i =0;i<n;i++){
            String rotation= s1.substring(i)+s1.substring(0,i);
            System.out.println(i+1+" th rotation "+ rotation);
            if(s2.equals(rotation)){
                System.out.println("true");
                break;
            }
        }*/

        //anagram

        /*String s1=sc.next();
        String s2=sc.next();
        if(s1.length()!=s2.length()){
            System.out.println("false ");
            return;
        }
        char [] ch1=s1.toCharArray();
        char [] ch2=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String s3=new String(ch1);
        String s4=new String(ch2);
        if(s3.equals(s4)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }*/

        //frequency counting

        /*String s=sc.next();
        char[] ch=s.toCharArray();
        int n=s.length();
        char [] ans=new char[n];
        int l=0;
        for(int i=0;i<n;i++){
            boolean alreadyprocessed=false;
            for(int k=0;k<l;k++){
                if (ch[i] == ans[k]) {
                    alreadyprocessed = true;
                    break;
        }
            }
            if(alreadyprocessed){
                continue;
            }
            int count=0;
            for(int j=i;j<n;j++){
                if(ch[i]==ch[j]){
                    count++;
                }
            }
            ans[l]=ch[i];
            l++;
            System.out.println("character-- "+ch[i]+" and its frequency "+count);
        }*/

        /*String s=sc.next();
        HashMap<Character,Integer> map =new HashMap<>();
        int n=s.length();
        char [] ch=s.toCharArray();
        for(int i=0;i<n;i++){
            if(map.containsKey(ch[i])){
                map.put(ch[i],map.get(ch[i])+1);
            }
            else{
                map.put(ch[i],1);
            }
        }
        System.out.println(map);*/

        //sorted frequency
        /*String s=sc.next();
        HashMap<Character,Integer> map =new HashMap<>();
        int n =s.length();
        char [] ch=s.toCharArray();
        for(int i=0;i<n;i++){                                             //frequency count
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);
        }
        int m =map.size();
        char[] key =new char[map.size()];
        int[] value =new int[map.size()];

        int index = 0;
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            key[index] = e.getKey();
            value[index] = e.getValue();
            index++;
        }

        for (int i = 0; i < m - 1; i++) {
            int max=i;
            for(int j=i+1;j<m;j++){
                if(value[j]>value[max]){
                    max=j;
                }
            }
            int tempval=value[i];
            value[i]=value[max];
            value[max]=tempval;

            char temp=key[i];
            key[i]=key[max];
            key[max]=temp;

        }

        for (int i = 0; i < m; i++) {
            System.out.println(key[i] + " -> " + value[i]);
        }*/

        /*String s=sc.next();
        char [] ch=s.toCharArray();
        int n =s.length();
        int count=0;
        int maxdepth=0;
        for(int i=0;i<n;i++){
            if(ch[i]=='('){
                count++;
                maxdepth=Math.max(maxdepth, count);
            }
            else if(ch[i]==')'){
                count--;
            }
        }
        System.out.println(maxdepth);*/

        //roman to integer
        /*String s=sc.next();
        HashMap<Character,Integer> map =new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        char [] ch=s.toCharArray();
        int n =ch.length;
        int sum=0;
        for(int i=0;i<n-1;i++){

            if((ch[i]=='I') && ((ch[i+1]=='V')||(ch[i+1]=='X'))){
                sum=sum-1;
            }
            else if((ch[i]=='X') && ((ch[i+1]=='L')||(ch[i+1]=='C'))) {
                sum=sum-10;
            }
            else if((ch[i]=='C') && ((ch[i+1]=='D')||(ch[i+1]=='M'))) {
                sum=sum-100;
            }
            else{
                sum=sum+map.get(ch[i]);
            }
        }

        sum=sum+map.get(ch[n-1]);
        System.out.println("nb "+sum);*/

       /*String s=sc.next();
        HashMap<Character,Integer> map =new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        char [] ch=s.toCharArray();
        int n =ch.length;
        int sum=0;
        for(int i=0;i<n-1;i++){
            if(map.get(ch[i])<map.get(ch[i+1])){
                sum=sum-map.get(ch[i]);
            }
            else{
                sum=sum+map.get(ch[i]);
            }
        }
        sum=sum+map.get(ch[n-1]);
        System.out.println("nb "+sum);*/

       /* String s=sc.next();
        int n =s.length();
        char [] ch=s.toCharArray();
        int count=0;
        int m=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String ss=s.substring(i,j+1);
                HashSet<Character> hs = new HashSet<>();
                for(int k=i;k<=j;k++){
                    hs.add(ch[k]);
                }
                if(hs.size()==m){
                    System.out.println(ss);
                    count++;
                }
            }
        }
        System.out.println(count);*/

        //if only counting

        /*String s = sc.next();
        int m = sc.nextInt();

        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            HashSet<Character> hs = new HashSet<>();

            for (int j = i; j < n; j++) {
                hs.add(s.charAt(j));

                if (hs.size() == m) {
                    count++;
                } else if (hs.size() > m) {
                    break;
                }
            }
        }

        System.out.println(count);*/

        /*String s=sc.next();
        int n=s.length();
        int max=0;
        int start=1;
        int end=-1;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String ss=s.substring(i,j+1);
                StringBuilder sb=new StringBuilder(ss);
                if(ss.equals(sb.reverse().toString())){
                    if(ss.length()>max){
                        max=ss.length();
                        start=i;
                        end=j;
                    }
                }

            }
        }
        System.out.println("max length -   "+max);
        System.out.println("substring "+ s.substring(start,end+1)); */
        
        //Reverse Words in a String

        /*String s=sc.nextLine();
        String [] st=s.split(" ");
        String ss="";
        int n =st.length;
        for(int i=n-1;i>=0;i--){
            ss=ss+(st[i]+" ");
        }
        System.out.println(ss);*/

        
    }
}
