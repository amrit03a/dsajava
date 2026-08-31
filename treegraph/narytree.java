package treegraph;
import java.util.*;
/*class Node{
    int data;
    ArrayList<Node> children;
    Node(int data){
        this.data=data;
        children =new ArrayList<>();
    }
}*/

public class narytree {
    Node root;

    public void insertion(){
        System.out.println("enter root value ");
        Scanner sc=new Scanner(System.in);
        int dd=sc.nextInt();
        root=new Node(dd);
        Queue<Node> q=new LinkedList<Node>();
        q.offer(root);
        while(!q.isEmpty()){
            Node current=q.poll();
            System.out.println("enter the nb of children for "+current.data+" child");
            int n =sc.nextInt();
            for(int i=1;i<=n;i++){
                System.out.println("enter child "+ i +" of " +current.data);
                int c=sc.nextInt();
                Node child=new Node(c);
                current.children.add(child);
                q.offer(child);
            }
        }
    }
    public void display(Node root) {
        if (root == null){
            return;
        }
        System.out.print(root.data + " ");
        for (Node child : root.children) {
            display(child);
        }
    }
    public int maxdepth(Node root){
        if(root==null){
            return 0;
        }
        int max=0;
        for(Node child : root.children){
            max=Math.max(max,maxdepth(child));
        }
        return 1+max;
    }
   int maxi=0;
   public int diameter(Node root){
        if(root==null){
            return 0;
        }
        int h1=0;
        int h2=0;
        for(Node child : root.children){
            int h = diameter(child);
            if(h>h1){
                h2=h1;
                h1=h;
            }
            else if(h>h2){
                h2=h;
            }
        }
        maxi=Math.max(maxi,(h1+h2));
        return 1+h1;
   }


    public static void main(String [] args){
        narytree nt=new narytree();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1. insertion ");
            System.out.println("2. display");
            System.out.println("3. Maximum Depth");
            System.out.println("4. diameter (longest path )");
            System.out.println("5. exit ");

            System.out.println("enter choice");

            int n =sc.nextInt();
            switch (n) {
                case 1:
                    nt.insertion();
                    break;

                case 2:
                    nt.display(nt.root);
                    break;

                case 3:
                    System.out.println("max depth is "+ nt.maxdepth(nt.root)); 
                    break;

                case 4:
                    System.out.println("");
                    

                default:
                    break;
            }
        
        }
    }
}

