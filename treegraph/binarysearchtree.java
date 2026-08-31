package treegraph;
import java.util.*;


public class binarysearchtree {
    Node root;
    public void constructbstiterative(int[] arr){
        if(arr.length==0){
            System.out.println("empty  ");
        }
        root=new Node(arr[0]);
        for(int i=1;i<arr.length;i++){
            Node newnode=new Node(arr[i]);
            Node current=root;

            while(true){
                //left
                if(arr[i]<current.data){
                    if(current.left==null){
                        current.left=newnode;
                        break;
                    }
                    current=current.left;
                }
                else{
                    if(current.right==null){
                        current.right=newnode;
                        break;
                    }
                    current=current.right;
                }
            }
        }

    }
    public void constructbstrecursion(int [] arr){
        for(int i=0;i<arr.length;i++){
            root= insertrec(root, arr[i]);
        }
    }
    public Node insertrec(Node root,int val){
        if(root==null){   //empty position
            return new Node(val);
        }
        if(val<root.data){
            root.left=insertrec(root.left, val);
        }
        else{
            root.right=insertrec(root.right, val);
        }
        return root;
    }

    public void display(Node root,int space){
        if (root == null)
            return;
        space+=5;
        display(root.right, space);
        System.out.println();
        for (int i = 5; i < space; i++){
            System.out.print(" ");
        }
        System.out.println(root.data);
        display(root.left, space);
    }
    public void inordertrav(Node root){
        if(root==null){
            return;
        }
        inordertrav(root.left);
        System.out.print(root.data+" ");
        inordertrav(root.right);
    }
    public Node search(Node root, int val){
        if(root==null){
            return null;
        }
        if(root.data==val){
            return root;
        }
        if(root.data>val){
            return search(root.left,val);
        }
        else{
            return  search(root.right,val);
        }
    }

    public Node deletNode(Node root,int k){
        if(root==null){
            return root;
        }
        else if(k<root.data){
            root.left=deletNode(root.left, k);
        }
        else if(k>root.data){
            root.right=deletNode(root.right, k);
        }
        else{
            if(root.left==null && root.right==null){
                return null;
            }
            else if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            else{
                Node node=findsuccessor(root.right);
                root.data=node.data;
                root.right=deletNode(root.right,node.data);
            }
        }
        return root;
    }
    public Node findsuccessor(Node node ){
        while(node.left!=null){
            node=node.left;
        }
        return node;
    }
   public boolean validate (Node root,long imin,long imax){
    if(root==null){
        return true;
    }
    if(root.data<=imin || root.data>=imax){
        return false;
    }
    boolean lefttree=validate(root.left,imin,root.data);
    boolean righttree=validate(root.right,root.data,imax);
    return(lefttree && righttree);
   }

   public boolean twosum(int k){
        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root, arr);
        int left=0;
        int right=arr.size()-1;
        while(left<right){
            int sum=arr.get(left)+arr.get(right);
            if(sum==k){
                return true;
            }
            if(sum<k){
                left++;
                
            }
            if(sum>k){
                right--;
            }
        }
        return false;
   }
   public void inorder(Node node,ArrayList<Integer> arr){
        if(node==null){
            return;
        }
        inorder(node.left, arr);
        arr.add(node.data);
        inorder(node.right, arr);
   }
   public Node lca(Node root, Node p, Node q) {
        if(root==null || root==p || root==q){
            return root;
        }
        if(p.data<root.data && q.data<root.data){
            return lca(root.left,p,q);
        }
        if(p.data>root.data && q.data>root.data){
            return lca(root.right,p,q);
        }
        return root;
    }
    int ans;
    public int maxsum(){
         ans=0;
        dfs(root);
        return ans;
    }
    public int[] dfs(Node root){
        if(root==null){
            return new int[]{
                Integer.MAX_VALUE,
                Integer.MIN_VALUE,
                0
            };
        }
        int [] left=dfs(root.left);
        int [] right=dfs(root.right);

        //check if it is bst or not 
        if(root.data>left[1] && root.data<right[0]){
            int cursum=left[2]+right[2]+root.data;
            ans=Math.max(cursum,ans);
            int minval=Math.min(left[0],root.data);
            int maxval=Math.max(right[1],root.data);
            return new int[]{minval,maxval,cursum};
        }
        //if tree is not bst 
        int maxsum=Math.max(left[2],right[2]);
        return new int[]{Integer.MIN_VALUE,Integer.MAX_VALUE,maxsum};
    }

    public static void main(String[] args){
        binarysearchtree bs=new binarysearchtree();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("\n===== LINKED LIST MENU =====");
            System.out.println("1. constructbst iterative");
            System.out.println("2. constructbstrecursion");
            System.out.println("3. insertion ");
            System.out.println("4. display");
            System.out.println("5. inordertraversal (ascending order) ");
            System.out.println("6. search in bst ");
            System.out.println("7. delete node ");
            System.out.println("8.check validity ");
            System.out.println("9. twp sum ");
            System.out.println("10. find lca enter two nb ");
            System.out.println("11. bst iterator");
            System.out.println("12. max sum bst ");
            System.out.println("0. exit");
            System.out.println("enter choice..");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter the size of array ");
                    int n =sc.nextInt();
                    int [] arr=new int[n];
                    for(int i=0;i<n;i++){
                        arr[i]=sc.nextInt();
                    }
                    bs.constructbstiterative(arr);
                    break;

                case 2:
                    System.out.println("enter the size of array ");
                    int nn =sc.nextInt();
                    int [] arrr=new int[nn];
                    for(int i=0;i<nn;i++){
                        arrr[i]=sc.nextInt();
                    }
                    bs.constructbstrecursion(arrr);
                    break;

                case 3 :
                    System.out.println("enter the element which too be inserted ");
                    int d =sc.nextInt();
                    bs.insertrec(bs.root, d);

                case 4:
                    bs.display(bs.root, 0);
                    break;

                case 5:
                    bs.inordertrav(bs.root);
                    break;

                case 6:
                    System.out.println("enter the value to be search ");
                    int v=sc.nextInt();
                    Node ans= bs.search(bs.root,v);
                    if(ans==null){
                        System.out.println("not found ");
                    }
                    else{
                        System.out.println("found "+ans.data);
                    }
                    break;

                case 7:
                    System.out.println("enter the value to be delete");
                    int l =sc.nextInt();
                    Node roott=bs.root;
                    bs.deletNode(roott, l);
                    break;

                case 8:
                    System.out.println(bs.validate(bs.root,Long.MIN_VALUE,Long.MAX_VALUE));
                    break;

                case 9:
                    int k =sc.nextInt();
                    System.out.println(bs.twosum(k));
                    break;

                case 10:
                    int x =sc.nextInt();
                    Node n1=new Node(x);
                    int y=sc.nextInt();
                    Node n2=new Node(y);
                    System.out.println(bs.lca(bs.root, n1, n2).data);
                    break;


                case 11:
                    bstiterator bt=new bstiterator(bs.root);
                    while(bt.hasnext()){
                        System.out.print(bt.next()+" ");
                    }
                    break;

                case 12:
                    System.out.println(bs.maxsum());
                    break;

                case 0:
                    return;
            }
        }
    }
}

class bstiterator{
    Stack<Node> s;
    public bstiterator(Node root){
        s=new Stack<>();
        Node node =root;
        while(node!=null){
            s.push(node);
            node=node.left;
        }
    }
    public int next(){
        Node n=s.pop();
        int val=n.data;
        n=n.right;
        while (n!=null) {
            s.push(n);
            n=n.left;
        }
        return val;
    }
    public boolean hasnext(){
        return !s.isEmpty();
    }
}