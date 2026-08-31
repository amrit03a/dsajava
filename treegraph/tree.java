package treegraph;
import java.util.*;


class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class customnode{
    Node node;
    int col;
    customnode(Node node,int col){
        this.col=col;
        this.node=node;
    }
}
class customnode2{
    Node node;
    int col;
    int level;
    customnode2(Node node,int col,int level){
        this.node=node;
        this.col=col;
        this.level=level;
    }
}
public class tree{
    Node root;
    int space=0;
    public void insertion(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter root value (-1 vor no value) ");
        int val=sc.nextInt();
        if(val==-1){
            return;
        }
        root=new Node(val);
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node current=q.poll();
            System.out.println("enter left child of "+current.data+"  (-1 for null)");
            int left=sc.nextInt();
            if(left!=-1){
                current.left=new Node(left);
                q.offer(current.left);
            }

            System.out.println("enter right child of "+ current.data+ "  (-1 for null)");
            int right=sc.nextInt();
            if(right!=-1){
                current.right=new Node(right);
                q.offer(current.right);
            }
        }
    }
    public void bfs(){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node temp=q.poll();
            System.out.println(temp.data+" ");
            if(temp.left!=null){
                q.offer(temp.left);
            }
            if(temp.right!=null){
                q.offer(temp.right);
            }
        }
    }

    public void dfs(){
        if(root==null){
            return;
        }
        Stack<Node> s=new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            Node temp=s.pop();
            System.out.print(temp.data+" ");
            if(temp.left!=null){
                s.push(temp.left);
            }
            if(temp.right!=null){
                s.push(temp.right);
            }
        }
    }
    public void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
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
    public void iterativepreorder(){
        if(root==null){
            return;
        }
        Stack<Node> s=new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            Node current=s.pop();
            System.out.print(current.data+" ");
            if(current.right!=null){
                s.push(current.right);
            }
            if(current.left!=null){
                s.push(current.left);
            }
        }
    }

    public void iterativeinorder(){
        if(root==null){
            return;
        }
        Stack<Node> s=new Stack<>();
        Node current=root;
        while(!s.isEmpty() || current!=null){
            while(current!=null){
                s.push(current);
                current=current.left;
            }

            current=s.pop();
            System.out.print(current.data+" ");

            current=current.right;
        }
    }

    int idx=0;
    public Node constructfromprein(int [] preorder,int start ,int end,HashMap<Integer,Integer> map){
        if(end<start){
            return null;
        }
        int value=preorder[idx++];
        Node root=new Node(value);
        if(start==end){
            return root;
        }
        int index=map.get(value);
        root.left=constructfromprein(preorder, start, index-1, map);
        root.right=constructfromprein(preorder, index+1, end, map);
        return root;
        
    }


    int m ;
    public Node construcrtreefrompostin(int [] postorder,int start,int end,HashMap<Integer,Integer> map){
        if(start>end){
            return null;
        }
        int value=postorder[m--];
        Node root=new Node(value);
        if(start==end){
            return root;
        }
        int index=map.get(value);
        root.right=construcrtreefrompostin(postorder, index+1, end, map);
        root.left=construcrtreefrompostin(postorder, start, index-1, map);
        return root;
    }

    public void maxdepthbfs(){
        if(root==null){
            System.out.println("no element");
        }
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        int level=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i =0;i<size;i++){
                Node current=q.poll();
                if(current.left!=null){
                    q.offer(current.left);
                }
                if(current.right!=null){
                    q.offer(current.right);
                }
            }
            level++;
        }
        System.out.println("max depth"+ level);
    }


    public int maxdepthdfs(Node root){
        if(root==null){
            return 0;
        }
        int left=maxdepthdfs(root.left);
        int right =maxdepthdfs(root.right);
        return 1+Math.max(left,right);
    }


    int maxi=0;
    public int diameter(Node root){
        if(root==null){
            return 0;
        }
        int left=diameter(root.left);
        int right=diameter(root.right);
        maxi=Math.max(maxi,(left+right));
        return 1+Math.max(left,right);
    }

    public void countnodes(){
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        int count=0;
        while(!q.isEmpty()){
            Node current=q.poll();
            if(current.left!=null){
                q.offer(current.left);
            }
            if(current.right!=null){
                q.offer(current.right);
            }
            count=count+1;
        }
        System.out.println("total nb of nodes "+count);
    }
    public int countnodesrecurssion(Node root){
        if(root==null){
            return 0;
        }
        int l=countnodesrecurssion(root.left);
        int r=countnodesrecurssion(root.right);
        return 1+l+r;
    }
    //count nodes optimised method 

    //height of left subtree
    public int leftsubtreeheight(Node root){
        int count=1;
        while(root.left!=null){
            root=root.left;
            count++;
        }
        return count;
    }
    public int rightsubtreeheight(Node root){
        int count=1;
        while(root.right!=null){
            root=root.right;
            count++;
        }
        return count;
    }
    public int countnodeso(Node root){
        if(root==null){
            return 0;
        }
        int left=leftsubtreeheight(root.left);
        int right=leftsubtreeheight(root.right);
        if(left==right){
            return ((int)Math.pow(2,left)-1);
        }
        return 1+countnodeso(root.left)+countnodeso(root.right);
    }

    public int sumofnodes(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=sumofnodes(root.left);
        int rightsum=sumofnodes(root.right);
        return root.data+leftsum+rightsum;
    }

    public boolean checkcousins(int x,int y){
        if(root==null){
            return false;
        }
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int childcount=0;
            int size=q.size();
            for(int i=0;i<size;i++){
                Node current=q.poll();
                int sameparent=0;
                if(current.left!=null){
                    if(current.left.data==x || current.left.data==y){
                        sameparent++;
                        childcount++;
                    }
                    q.offer(current.left);
                }
                if(current.right!=null){
                    if(current.right.data==x || current.right.data==y){
                        sameparent++;
                        childcount++;
                    }
                    q.offer(current.right);
                }
                if(sameparent==2){
                    return false;
                }
            }
            if(childcount==2){
            return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
  
    public void rightview(){
        if(root==null){
            System.out.println("null");
            return;
        }
        ArrayList<Integer> res=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            while(size>0){
                Node node=q.poll();
                if(node.left!=null){
                    q.offer(node.left);

                }
                if(node.right!=null){
                    q.offer(node.right);
                }
                size--;
                if(size==0){
                    res.add(node.data);
                }
            }
        }
        System.out.println(res);

    }
    public void leftview(){
        if(root==null){
            System.out.println("null ");
            return;
        }
        ArrayList<Integer> res=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Node node=q.poll();
                if(i==0){
                    res.add(node.data);
                }
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
        }
        System.out.println(res);
    }

    public void topview(){
        Queue<customnode> q=new LinkedList<>();
        TreeMap<Integer,Integer> tm=new TreeMap<>();
        q.offer(new customnode(root,0 ));
        while(!q.isEmpty()){
            customnode cn=q.poll();
            Node n=cn.node;
            int col=cn.col;
            if(!tm.containsKey(col)){
                tm.put(col,n.data);
            }
            if(n.left!=null){
                q.offer(new customnode(n.left, col-1));
            }
            if(n.right!=null){
                q.offer(new customnode(n.right, col+1));
            }
        }
        for(int value:tm.values()){
            System.out.print(value+" ");
        }
    }

    public void bottomview(){
        Queue<customnode> q=new LinkedList<>();
        TreeMap<Integer,Integer> tm=new TreeMap<>();
        q.offer(new customnode(root,0));
        while(!q.isEmpty()){
            customnode cn=q.poll();
            Node n =cn.node;
            int col=cn.col;
            tm.put(col,n.data);
  
            if(n.left!=null){
                q.offer(new customnode(n.left, col-1));
            }
            if(n.right!=null){
                q.offer(new customnode(n.right, col+1));
            }
        }
        for(int values:tm.values()){
            System.out.print(values+" ");
        }
    }
    public void  verticaltraversal(){
        TreeMap<Integer,TreeMap<Integer,ArrayList<Integer>>> tm=new TreeMap<>();
        Queue<customnode2> q=new LinkedList<>();
        q.offer(new customnode2(root, 0,0));
        while(!q.isEmpty()){
            customnode2 cn=q.poll();
            Node n=cn.node;
            int col=cn.col;
            int level=cn.level;
            if(!tm.containsKey(col)){
                tm.put(col,new TreeMap<>());
            }
            if(!tm.get(col).containsKey(level)){
                tm.get(col).put(level,new ArrayList<>());
            }
            tm.get(col).get(level).add(n.data);

            if (n.left!=null) {
                q.offer(new customnode2(n.left, col-1,level+1));
            }
            if(n.right!=null){
                q.offer(new customnode2(n.right, col+1,level+1));
            }
        }
        for(TreeMap<Integer,ArrayList<Integer>> at:tm.values()){
            for(ArrayList<Integer> a : at.values()){
                Collections.sort(a);
                for(int i :a){
                    System.out.print(i+" ");
                }
            }
        }
    }




    TreeMap<Integer,TreeMap<Integer,ArrayList<Integer>>> map=new TreeMap<>();
    

    public void dfsvertical(Node root,int col,int level){
        if(root==null){
            return;
        }
        if(!map.containsKey(col)){
            map.put(col,new TreeMap<>());
        }
        if(!map.get(col).containsKey(level)){
            map.get(col).put(level,new ArrayList<>());
        }
        map.get(col).get(level).add(root.data);
        dfsvertical(root.left,col-1,level+1);
        dfsvertical(root.right,col+1,level+1);
    }



   public void boundary(Node node){
        ArrayList<Integer> res=new ArrayList<>();
        if(!isleaf(node)){
            res.add(node.data);
        }
        insertleftboundary(res,node);
        insertleafboundary(res,node);
        insertrightboundary(res,node);
        System.out.println(res);
   }
   public void insertleftboundary(ArrayList<Integer> res,Node node ){
        Node leftnode=node.left;
        while(leftnode!=null){
            if(isleaf(leftnode)){
                break;
            }
            res.add(leftnode.data);
            if(leftnode.left!=null){
                leftnode=leftnode.left;
            }
            else{
                leftnode=leftnode.right;
            }
        }
   }
   public void insertleafboundary(ArrayList<Integer> res,Node node){
        if(node==null){
            return ;
        }
        insertleafboundary(res, node.left);
        insertleafboundary(res, node.right);
        if(isleaf(node)){
            res.add(node.data);
        }
   }
   public void insertrightboundary(ArrayList<Integer> res,Node node){
        if(isleaf(node)){
            res.add(node.data);
        }
        Node rightnode=node.right;
        Stack<Integer> s=new Stack<>();
        while(rightnode!=null){
            if(isleaf(rightnode)){
                break;
            }
            s.push(rightnode.data);
            if(rightnode.right!=null){
                rightnode=rightnode.right;
            }
            else{
                rightnode=rightnode.left;
            }
        }
        while(!s.isEmpty()){
            res.add(s.pop());
        }
   }
   public boolean isleaf(Node root){
        return (root.left==null && root.right==null);
   }

   public void zigzagtraversal(){
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        int level=0;
        while(!q.isEmpty()){
            int size=q.size();
            LinkedList<Integer> a=new LinkedList<>();
            for(int i=0;i<size;i++){
                Node n=q.poll();
                if(level%2==0){
                    a.add(n.data);
                }
                else{
                    a.addFirst(n.data);
                }
                if(n.left!=null){
                    q.offer(n.left);
                }
                if(n.right!=null){
                    q.offer(n.right);
                }
            }
            level++;
            res.add(new ArrayList<>(a));
        }
        for(ArrayList<Integer> a:res){
            for(int b:a){
                System.out.print(b+" ");
            }
        }
   }

   public int checkdepth(Node node){
        if(node==null){
            return 0;
        }
        int lh=checkdepth(node.left);
        int rh=checkdepth(node.right);
        if(lh==-1 || rh==-1){
            return -1;
        }
        if(Math.abs(lh-rh)>1){
            return -1;
        }
        return (1+Math.max(lh,rh));
   }
   public boolean balancedtree(){
        int r=checkdepth(root);
        if(r==-1){
            return false;
        }
        else{
            return true;
        }
   }

   public Node LCA(Node root,int a,int b){
        if(root==null){
            return null;
        }
        if(root.data==a || root.data==b){
            return root;
        }
        Node left=LCA(root.left,a,b);
        Node right=LCA(root.right,a,b);
         if(left != null && right != null){
        return root;
        }
        if(left != null){
            return left;
        }
        return right;
    }
     

    int maxii=0;
    Node deepest=null;
    Node diameterNode=null;
    int deepestlevel=-1;

    public int diameterp(Node root){
        if(root==null){
            return 0;
        }
        int lh=diameter(root.left);
        int rh=diameter(root.right);

        if(lh+rh>maxii){
            maxii=lh+rh;
            diameterNode=root;
        }
        return 1+ Math.max(lh,rh);
    }

    public void findDeepest(Node root,int level){
        if(root==null){
            return;
        }
        if(level>deepestlevel){
            deepestlevel=level;
            deepest=root;
        }
        findDeepest(root.left, level+1);
        findDeepest(root.right,level+1);
    }

    public boolean findpath(Node root,Node target,ArrayList<Node> path){
        if(root==null){
            return false;
        }
        path.add(root);
        if(root==target){
            return true;
        }
        boolean l=findpath(root.left, target, path);
        boolean r=findpath(root.right, target, path);
        if(l||r){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }

    public void printdiameterpath(){
        deepest=null;
        deepestlevel=-1;
        findDeepest(diameterNode.left, 0);
        Node leftend=deepest;

        deepest=null;
        deepestlevel=-1;
        findDeepest(diameterNode.right, 0);
        Node rightend=deepest;

        ArrayList<Node> leftpath=new ArrayList<>();
        findpath(diameterNode,leftend,leftpath);

        ArrayList<Node> rightpath=new ArrayList<>();
        findpath(diameterNode,rightend,rightpath);

        System.out.println("diameter is"+maxii);

        for(int i=leftpath.size()-1;i>=0;i--){
            System.out.print(leftpath.get(i).data+" ");
        }
        for(int i=1;i<rightpath.size();i++){
            System.out.print(rightpath.get(i).data+" ");
        }

    }

    /////////another methodfor pathfinding 
    /// 
    /// finds the map between parents and child 
    HashMap<Node,Node> parent =new HashMap<>();
    public void parentmap(Node root){
        if(root==null){
            return;
        }
        if(root.left!=null){
            parent.put(root.left,root);
        }
        if(root.right!=null){
            parent.put(root.right,root);
        }
        parentmap(root.left);
        parentmap(root.right);
    }

    //find farthest
    public Node findfarthest(Node start,HashMap<Node,Node> prev){
        Queue<Node> q=new LinkedList<>();
        HashSet<Node> visited =new HashSet<>();
        q.offer(start);
        visited.add(start);
        Node farthest=start;
        while(!q.isEmpty()){
            Node current=q.poll();
            farthest=current;
            if(current.left!=null && !visited.contains(current.left)){
                q.offer(current.left);
                visited.add(current.left);
                prev.put(current.left,current);
    
            }
            if(current.right!=null && !visited.contains(current.right)){
                q.offer(current.right);
                visited.add(current.right);
                prev.put(current.right,current);
            }

            if(parent.containsKey(current)){
                Node p =parent.get(current);
                if(!visited.contains(p)){
                    q.offer(p);
                    visited.add(p);
                    prev.put(p,current);
                }
            }
        }
        return farthest;
    }

    public void printdiameterpath2(){
          if (root == null) {
            System.out.println("Tree is empty");
            return;
        }

        parentmap(root);
        HashMap<Node,Node> prev1=new HashMap<>();
        Node first=findfarthest(root, prev1);

        HashMap<Node,Node> prev2=new HashMap<>();
        Node second=findfarthest(first, prev2);

        ArrayList<Node> path=new ArrayList<>();
        Node current=second;
        while(current!=null){
            path.add(current);
            current=prev2.get(current);
        }
        Collections.reverse(path);
        System.out.println("diameter path is");
        for (Node n:path){
            System.out.print(n.data+" ");
        }
        System.out.println();
        System.out.println("diameter length is "+ (path.size()-1));
    }

    public boolean completebinarytree(){
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        boolean nullfound=false;
        while(!q.isEmpty()){
            Node c=q.poll();
            if(c.left!=null){
                if(nullfound){
                    return false;
                }
                else{q.offer(c.left);}
            }
            else{
                nullfound=true;
            }
            if(c.right!=null){
                if(nullfound){
                    return false;
                }
                else{q.offer(c.right);}
            }
            else{
                nullfound=true;
            }
        }
        return true;
    }


   
    public static void main(String[] args){
        tree t=new tree();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("\n===== LINKED LIST MENU =====");
            System.out.println("1. Insertion");
            System.out.println("2. display");
            System.out.println("3. bfs");
            System.out.println("4. dfs ");
            System.out.println("5. preorder ");
            System.out.println("6. inorder ");
            System.out.println("7. postorder ");
            System.out.println("8. iterative preorder ");
            System.out.println("9. iterative inorder");
            System.out.println("10. construct tree from inorder preorder");
            System.out.println("11. tree from inorder and postorder");
            System.out.println("12. max depth using bfs");
            System.out.println("13. max depth using dfs ");
            System.out.println("14. diameter ");
            System.out.println("15. count nodes ");
            System.out.println("16. count nodes using recurrsion");
            System.out.println("17. sum of nodes ");
            System.out.println("18. check for cousins ");
            System.out.println("19. side view");
            System.out.println("20. left view ");
            System.out.println("21. top view ");
            System.out.println("22. down view");
            System.out.println("23. vertical view");
            System.out.println("24. boundary traversal ");
            System.out.println("25. zigzag traversal ");
            System.out.println("26: balanced binary tree");
            System.out.println("27: lowest common ancestor ");
            System.out.println("28: diameter with path");
            System.out.println("29: diameter with path optimised ");
            System.out.println("30: check complete tree");

            System.out.println("enter choice..");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    t.insertion();
                    break;
            
                case 2:
                    t.display(t.root, 0);
                    break;

                case 3:
                    t.bfs();
                    break;
                    
                case 4:
                    t.dfs();
                    break;

                case 5:
                    t.preorder(t.root);
                    break;

                case 6:
                    t.inorder(t.root);
                    break;

                case 7:
                    t.postorder(t.root);
                    break;

                case 8:
                    t.iterativepreorder();
                    break;

                case 9:
                    t.iterativeinorder();
                    break;

                case 10:
                    System.out.println("enter length of the inorder  or preorder");
                    int n =sc.nextInt();
                    int [] ino=new int[n];
                    int [] pre=new int[n];
                    System.out.println("enter inorder");
                    for(int i=0;i<n;i++){
                        ino[i]=sc.nextInt();
                    }
                    System.out.println("enetr preorder");
                    for(int i=0;i<n;i++){
                        pre[i]=sc.nextInt();
                    }
                    HashMap<Integer, Integer> map = new HashMap<>();
                    for(int i =0;i<n;i++){
                        map.put(ino[i],i);
                    }
                    t.idx=0;
                    t.root = t.constructfromprein(pre,0,n-1,map);
                    break;


                case 11:
                    System.out.println("enter length of the inorder  or preorder");
                    int l =sc.nextInt();
                    int [] inor=new int[l];
                    int [] post=new int[l];
                    System.out.println("enter inorder");
                    for(int i=0;i<l;i++){
                        inor[i]=sc.nextInt();
                    }
                    System.out.println("enetr ppostorder");
                    for(int i=0;i<l;i++){
                        post[i]=sc.nextInt();
                    }
                    HashMap<Integer, Integer> mapp = new HashMap<>();
                    for(int i =0;i<l;i++){
                        mapp.put(inor[i],i);
                    }
                    t.m = l - 1;
                    t.root = t.construcrtreefrompostin(post,0,l-1,mapp);
                    break;

                case 12:
                    t.maxdepthbfs();
                    break;

                case 13:
                    int max = t.maxdepthdfs(t.root);
                    System.out.println("max depth is "+max);
                    break;

                case 14:
                    t.diameter(t.root);
                    System.out.println("the longest path is "+ t.maxi);
                    break;

                case 15:
                    t.countnodes();
                    break;

                case 16:
                    System.out.println("nb of nodes using recurssion "+ t.countnodesrecurssion(t.root));
                    break;

                case 17:
                    System.out.println("sum of nodes is "+t.sumofnodes(t.root));
                    break;

                case 18:
                    System.out.println("enter the values of cousins ");
                    int x=sc.nextInt();
                    int y=sc.nextInt();
                    System.out.println(t.checkcousins(x, y));

                case 19:
                    t.rightview();
                    break;

                case 20:
                    t.leftview();
                    break;

                case 21:
                    t.topview();
                    break;

                case 22:
                    t.bottomview();
                    break;

                case 23:
                    t.verticaltraversal();
                    break;

                case 24:
                    t.boundary(t.root);
                    break;

                case 25:
                    t.zigzagtraversal();
                    break;

                case 26:
                    System.out.println(t.balancedtree());
                    break;

                case 27:
                    System.out.println("enter p q");
                    int p =sc.nextInt();
                    int q=sc.nextInt();
                    Node ans= t.LCA(t.root, p, q);
                    System.out.println("LCA is "+ ans.data);
                    break;

                case 28:
                    t.diameterp(t.root);
                    t.printdiameterpath();
                    break;


                case 29:
                    t.printdiameterpath2();
                    break;

                case 30:
                    if(t.completebinarytree()){
                        System.out.println("true");
                    }
                    else{
                        System.out.println("false");
                    }
                    break;

                default:
                    break;
            }
        }
    }
}