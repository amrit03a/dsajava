package treegraph;
import java.util.*;

//priority queue wid object datatype    pq is implemented using heap only 

//note correct the class name 

/*class student implements Comparable<student>{
    int marks;
    String name;
    student(String name,int marks){
        this.marks=marks;
        this.name=name;
    }
    public String toString(){
        return "Student name :"+ this.name +" , marks :" + this.marks;
    }
    public int compareTo(student that){
        if(this.marks==that.marks){
            return this.name.compareTo(that.name);
        }
        return this.marks-that.marks;          //increasin order   //min heap 
    }
}
public class heap{
    public static void main(String[] args){
        PriorityQueue<student> pq=new PriorityQueue<>();
        pq.offer(new student("shashwat", 90));
        pq.offer(new student("aman", 70));
        pq.offer(new student("mohit", 90));
        System.out.println(pq.peek());
    }
} */

//top k frequency element --leet 347 

//max pq 
/*class number implements Comparable<number>{
    int value;
    int freq;
    number(int value,int freq){
        this.value=value;
        this.freq=freq;
    }
    public int compareTo(number that){
        //max heap
        return that.freq-this.freq;
    }
}
class heap{

    public static int[] topkfrequent(int [] nums,int k ){
        PriorityQueue<number> pq=new PriorityQueue<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            number n =new number(entry.getKey(),entry.getValue());
            pq.offer(n);
        }
        int []res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=pq.poll().value;
        }
        return res;
    }
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the k valyue");
        int k =sc.nextInt();
        int [] ans=new int[k];
        ans=topkfrequent(arr,k);
        for(int i=0;i<k;i++){
            System.out.print(ans[i]+" ");
        }
    }
}*/

//using min --little more optimised 

/*class number implements Comparable<number>{
    int value;
    int freq;
    number(int value,int freq){
        this.value=value;
        this.freq=freq;
    }
    public int compareTo(number that){
        //min heap
        return this.freq-that.freq;
    }
}
class heap{

    public static int[] topkfrequent(int [] nums,int k ){
        PriorityQueue<number> pq=new PriorityQueue<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int i=1;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            number n =new number(entry.getKey(),entry.getValue());
            pq.offer(n);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int []res=new int[k];
        for(int j=0;j<k;j++){
            res[i]=pq.poll().value;
        }
        return res;
    }
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the k valyue");
        int k =sc.nextInt();
        int [] ans=new int[k];
        ans=topkfrequent(arr,k);
        for(int i=0;i<k;i++){
            System.out.print(ans[i]+" ");
        }
    }
}*/

//leet-451 sort characters by frequency

/*class letter implements Comparable<letter>{
    char d;
    int freq;
    letter(char d,int freq){
        this.d=d;
        this.freq=freq;
    }
    public int compareTo(letter that){
        return that.freq-this.freq;
    }
}
class heap{

    public static String sortchar(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        PriorityQueue<letter> pq=new PriorityQueue<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            letter l=new letter(entry.getKey(),entry.getValue());
            pq.offer(l);
        }
        int l =map.size();
        String a="";
        while(!pq.isEmpty()){
            letter curr=pq.poll();
            for(int i=0;i<curr.freq;i++){
                a=a+curr.d;
            }
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(sortchar(s));

    }
}*/

//leet-502 IPO

/*class project implements Comparable<project>{
    int profit;
    int capital;
    project(int profit,int capital){
        this.profit=profit;
        this.capital=capital;
    }
    public int compareTo(project that){
        return this.capital-that.capital;
    }
}
class heap{
    public static int fincapital(int k,int[] capital,int[] profit,int n,int w){
        PriorityQueue<project> pq1=new PriorityQueue<>();  //sort project by req capital
        PriorityQueue<Integer> pq2=new PriorityQueue<>(Collections.reverseOrder());  //always give max profit project 
        for(int i=0;i<n;i++){
            pq1.offer(new project(profit[i], capital[i]));
        }
        while(k>0){
            while(!pq1.isEmpty() && pq1.peek().capital<=w){
                pq2.offer(pq1.poll().profit);
            }
            if(pq2.isEmpty()){
                break;
            }
            w=w+pq2.poll();
            k--;
        }
        return w;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nb of project");
        int n = sc.nextInt();
        int[] capital=new int[n];
        System.out.println("enter capital");
        for(int i=0;i<n;i++){
            capital[i]=sc.nextInt();
        }
        int[] profit=new int[n];
        System.out.println("enter profit");
        for(int i=0;i<n;i++){
            profit[i]=sc.nextInt();
        }
        System.out.println("enter the k value");
        int k=sc.nextInt();
        System.out.println("enter the initial wealth ");
        int w=sc.nextInt();
        System.out.println("max wealth "+fincapital(k, capital, profit, n,w));

    }
}
    
}*/


//leet-355 design twitter

/*class tweet implements Comparable<tweet>{
    int time;
    int tweetid;
    tweet(int time,int tweetid){
        this.time=time;
        this.tweetid=tweetid;
    }
    public int compareTo(tweet that){
        return that.time-this.time;
    }
}
class user{
    int userid;
    HashSet<Integer> following;
    ArrayList<tweet> tweets;

    user(int userid){
        this.userid=userid;
        following=new HashSet<>();
        following.add(userid);
        tweets=new ArrayList<>();
    }

    public void addtweet(tweet t){
        tweets.add(0,t);
    }
    public void startfollow(int id){
        following.add(id);
    }
    public void unfollow(int id){
        if(id!=userid){
            following.remove(id);
        }
    }
}
class heap{
    HashMap<Integer,user> userMap;
    int timecounter;
    heap(){
        userMap=new HashMap<>();
        timecounter=0;
    }

    public void posttweet(int userid,int tweetid){
        timecounter++;
        if(!userMap.containsKey(userid)){
            userMap.put(userid,new user(userid));
        }
        user u=userMap.get(userid);
        u.addtweet(new tweet(timecounter, tweetid));
    }
    public void follow(int followerid,int followingid){
        if (!userMap.containsKey(followerid)) {
            userMap.put(followerid, new user(followerid));
        }
        if (!userMap.containsKey(followingid)) {
            userMap.put(followingid, new user(followingid));
        }
        user u=userMap.get(followerid);
        u.startfollow(followingid);
    }
    public void unfollow(int followerid,int followingid){
        if(!userMap.containsKey(followerid)||!userMap.containsKey(followingid)){
            return;
        }
        user u=userMap.get(followerid);
        
        u.unfollow(followingid);
    }
    public List<Integer> getnewfeed(int id){
        if (!userMap.containsKey(id)) {
            System.out.println("user not registered");
            return new ArrayList<>();
        }
        PriorityQueue<tweet> pq=new PriorityQueue<>();
        user u=userMap.get(id);
        for(int followingid : u.following){
            int count=0;
            for(tweet t:userMap.get(followingid).tweets){
                pq.offer(t);
                count++;
                if(count==10){
                    break;
                }
            }
        }
        List<Integer> res=new ArrayList<>();
        int index=0;
        while(!pq.isEmpty() && index<10){
            tweet t=pq.poll();
            res.add(t.tweetid);
            index++;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        heap twitter=new heap();
        while (true) {
            System.out.println("\n----- TWITTER MENU -----");
            System.out.println("1. Post Tweet");
            System.out.println("2. Follow User");
            System.out.println("3. Unfollow User");
            System.out.println("4. Get News Feed");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter User ID: ");
                    int userId = sc.nextInt();
                    System.out.print("Enter Tweet ID: ");
                    int tweetId = sc.nextInt();

                    twitter.posttweet(userId, tweetId);

                    System.out.println("Tweet posted successfully!");
                    break;
                
                case 2:
                    System.out.print("Enter Follower ID: ");
                    int followerId = sc.nextInt();

                    System.out.print("Enter Following ID: ");
                    int followingId = sc.nextInt();

                    twitter.follow(followerId, followingId);

                    System.out.println(followerId +
                        " is now following " + followingId);
                    break;

                case 3:
                System.out.print("Enter Follower ID: ");
                int unfollowerId = sc.nextInt();

                System.out.print("Enter Following ID to unfollow: ");
                int unfollowingId = sc.nextInt();

                twitter.unfollow(unfollowerId, unfollowingId);

                System.out.println("Unfollow operation completed!");
                break;


            case 4:
                System.out.print("Enter User ID: ");
                int id = sc.nextInt();

                List<Integer> feed = twitter.getnewfeed(id);

                System.out.println("News Feed: " + feed);
                break;


            case 5:
                System.out.println("Exiting Twitter...");
                sc.close();
                return;


            default:
                System.out.println("Invalid choice!");
            }
        }
    }
}*/

//task scheduler
/*class tasks implements Comparable<tasks>{
    char ch;
    int freq;
    int et;
    tasks(int freq,int et,char ch){
        this.freq=freq;
        this.et=et;
        this.ch=ch;
    }
    public int compareTo(tasks that){
        return that.freq-this.freq;
    }
}
public class pqquestions{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter tasks as string");
        String n =sc.next();
        System.out.println("enter the cooldown period");
        int nn =sc.nextInt();
        char[] ch=n.toCharArray();
         HashMap<Character,Integer> map=new HashMap<>();
        for(char c:ch){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<tasks> pq=new PriorityQueue<>();
        for(Character chh:map.keySet()){
            int f=map.get(chh);
            pq.offer(new tasks(f, 0,chh));
        }
        ArrayList<Character> res=new ArrayList<>();
        Queue<tasks> q=new LinkedList<>();
        int time=0;
        while(!pq.isEmpty() || !q.isEmpty()){
            time++;
            while(!q.isEmpty() && q.peek().et==time){
                pq.offer(q.poll());
            }
            if(!pq.isEmpty()){
                tasks t=pq.poll();
                res.add(t.ch);
                t.freq--;
                if(t.freq>0){
                    t.et=time+nn;
                    q.offer(t);
                }
            }
            else{
                res.add('_');
            }
        }
        System.out.println("time "+time);
        System.out.println("order "+res);
    }
}*/

//minimum cost of ropes;

class pqquestions{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.offer(sc.nextInt());
        }
        int cost=0;
        while(!(pq.size()==1)){
            int a=pq.poll();
            int b=pq.poll();
            int s=a+b;
            pq.offer(s);
            cost=cost+s;   
        }
        System.out.println("total cost "+cost);
    }
}