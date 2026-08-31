package treegraph;
import java.util.*;
/*public class heap {
    int size;
    int heap[];
    int capacity;
    heap(int [] heap){
        this.heap=heap;
        size=heap.length;
        capacity=heap.length;
    }
    public void increasecapacity(){
        capacity=capacity*2;
        int []newheap=new int[capacity];
        for(int i=0;i<size;i++){
            newheap[i]=heap[i];
        }
        heap=newheap;
    }
    public void swap(int i,int j){
        int temp=heap[i];
        heap[i]=heap[j];
        heap[j]=temp;
    }
    public void heapify(int index){
        int largest=index;
        int leftchild=2*index+1;
        int rightchild=2*index+2;
        if(leftchild<size && heap[leftchild]>heap[largest]){
            largest=leftchild;
        }
        if(rightchild<size && heap[rightchild]>heap[largest]){
            largest=rightchild;
        }
        if(largest!=index){
            swap(largest, index);
            heapify(largest);
        }

    }
    public void buildtree(){
        for(int index=(size/2)-1;index>=0;index--){
            heapify(index);
        }
    }
    public void print(){
        for(int i=0;i<size;i++){
            System.out.print(heap[i]+" ");
        }
    }
    public int extractmax(){
         if(size == 0){
            System.out.println("Heap is empty");
            return -1;
        }
        int value=heap[0];
        int last=heap[size-1];
        heap[0]=last;
        size--;
        heapify(0);
        return value;

    }
    public void heapifyup(int index){
        int parent=(int)(Math.ceil(index/2.0)-1);
        while(index>0 && heap[index]>heap[parent]){
            swap(index,parent);
            index=parent;
            parent=(int)(Math.ceil(index/2.0)-1);
        }
    }

    public void increasevalue(int index,int value){
        if(index<0 || index>=size || heap[index]>=value){
            System.out.println("wrong operation");
            return;
        }
        heap[index]=value;
        heapifyup(index);
    }
    public void decreasevalue(int index,int value){
        if(index<0 || index>=size || heap[index]<=value){
            System.out.println("wrong operation");
            return;
        }
        heap[index]=value;
        heapify(index);
    }

    public void insert(int value){
        if(size+1>capacity){
            increasecapacity();
        }
        size++;
        heap[size-1]=value;
        heapifyup(size-1);
    }

    public void extractmaxandstore(){
        if(size==0){
            System.out.println("empty ");
            return;
        }
        int max=heap[0];
        heap[0]=heap[size-1];
        heap[size-1]=max;
        size--;
        heapify(0);
        return;
    }
    public void heapsort(){
        int k=size;
        for(int i =0;i<k;i++){
            extractmaxandstore();
        }
        size=heap.length;
        for(int i=0;i<size;i++){
            System.out.print(heap[i]+" ");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n =sc.nextInt();
        int [] heap=new int[n];
        for(int i=0;i<n;i++){
            heap[i]=sc.nextInt();
        }
        heap h =new heap(heap);
        
        while(true){
            
            System.out.println("\n===== Heap MENU =====");
            System.out.println("2. build heap");
            System.out.println("3. print heap");
            System.out.println("4. extract max");
            System.out.println("5. increase value");
            System.out.println("6. decrease value");
            System.out.println("7. insert");
            System.out.println("8. heap sort");
            int choice=sc.nextInt();
            switch (choice) {
                
                case 2:
                    h.buildtree();
                    break;

                case 3:
                    h.print();
                    break;

                case 4:
                    int z=h.extractmax();
                    if(z!=-1){
                        System.out.println(z);
                    }
                    break;

                case 5:
                    System.out.println("enter the index");
                    int x =sc.nextInt();
                    System.out.println("enter the value");
                    int y=sc.nextInt();
                    h.increasevalue(x,y);
                    break;

                case 6:
                    System.out.println("enter the index");
                    int p =sc.nextInt();
                    System.out.println("enter the value");
                    int q=sc.nextInt();
                    h.decreasevalue(p,q);
                    break;

                case 7:
                    System.out.println("enter the value to insert");
                    int a =sc.nextInt();
                    h.insert(a);
                    break;

                case 8:
                    System.out.println("heap sort");
                    h.heapsort();
                    break;
            }   

        }
    }
}*/

//priority queue wid object datatype

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

class project implements Comparable<project>{
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