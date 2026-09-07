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
}}
*/