
package treegraph;
import java.util.*;
class Node2{
    int data;
    Node2 left;
    Node2 right;
    int height;
    Node2(int data){
        this.data=data;
        this.height=1;
        this.left=null;
        this.right=null;
    }
}
public class avltree {
    
    public int height(Node2 n){
        if(n==null){
            return 0;
        }
        return n.height;
    }
    public int getbf(Node2 node){
        if(node==null){
            return 0;
        }
        return (height(node.left)-height(node.right));
    }

    public Node2 rightrotate(Node2 y){
        Node2 x=y.left;
        Node2 t2=x.right;
        x.right=y;
        y.left=t2;

        y.height=1+Math.max(height(y.left),height(y.right));
        x.height=1+Math.max(height(x.left),height(x.right));

        return x;
    }
    public Node2 leftrotate(Node2 x){
        Node2 y=x.right;
        Node2 t2=y.left;
        y.left=x;
        x.right=t2;

        y.height=1+Math.max(height(y.left),height(y.right));
        x.height=1+Math.max(height(x.left),height(x.right));

        return y;
    }
    Node2 insert(Node2 root,int data){
        //1.normal bst insertion

        if(root==null){
            return new Node2(data);
        }
        else if(data<root.data){
            root.left=insert(root.left, data);
        }
        else if(data>root.data){
            root.right=insert(root.right,data);
        }
        else{
            return root;
        }
        //update height

        root.height=1+Math.max(height(root.left),height(root.right));

        //calculate bf
        int balance=getbf(root);

        //ll case 
        if(balance>1 && data<root.left.data){
            return rightrotate(root);
        }

        //rr case 
        if(balance<-1 && data>root.right.data){
            return leftrotate(root);
        }

        //lr case 

        if(balance >1 && data >root.left.data){
            root.left=leftrotate(root.left);
            return rightrotate(root);
        }

        //rl case 

        if(balance <-1 && data <root.right.data){
            root.right=rightrotate(root.right);
            return leftrotate(root);
        }
        return root;
    }

    //inorder  traversal 
    void inorder(Node2 root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n =sc.nextInt();
        int [] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        avltree tree=new avltree();
        Node2 root=null;
        for (int x: arr){
            root=tree.insert(root, x);
        }
        System.out.println("inorder");
        tree.inorder(root);
    }
}
