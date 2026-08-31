/*package linkedlist;
import java.util.*;
class Node<T>{
    T data;
    Node<T> next;
    Node<T> prev;

    Node(T data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class doublylinkedlist{
    Node<Integer> head;
    Node<Integer> tail;
    int size;

    public void inserthead(int data){
        Node<Integer> newnode =new Node<>(data);
        if(head==null){
            head=tail=newnode;
        }
        else{
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }
        size++;
    }
    public void inserttail(int data){
        Node<Integer> newnode=new Node<>(data);
        if(head==null){
            head=tail=newnode;
        }
        else{
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
        }
        size++;
    }
    public void insertpos(int pos,int data){
        if (pos < 1 || pos > size + 1) {
            System.out.println("Invalid Position");
            return;
        }

        if (pos == 1) {
            inserthead(data);
            return;
        }

        if (pos == size + 1) {
            inserttail(data);
            return;
        }

        Node<Integer> newnode=new Node<>(data);
        Node<Integer> temp=head;

        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        Node<Integer> nextnode =temp.next;
        newnode.next=nextnode;
        newnode.prev=temp;

        temp.next=newnode;
        nextnode.prev=newnode;
        size++;
    }
    public void deletehead(){
        if(head==null){
            System.out.println("list empty");
            return;
        }
        if(head==tail){
            head=tail=null;
            size--;
            return;
        }
        head=head.next;
        head.prev=null;

        size--;
    }

    public void deletetail(){
        if(head==null){
            System.out.println("list empty");
            return;
        }
        if(head==tail){
            head=tail=null;
            size--;
            return;
        }
        tail=tail.prev;
        tail.next=null;

        size--;
    }
    public void deletepos(int pos){
        if(head==null){
            System.out.println("list empty");
            return;
        }
        if(pos<1 || pos>size){
            System.out.println("invalid pos");
            return;
        }
        if(pos==1){
            deletehead();
            return;
        }
        if(pos==size){
            deletetail();
            return;
        }
        Node<Integer> temp=head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }
        Node<Integer> prevnode=temp.prev;
        Node<Integer> nextnode = temp.next;
        prevnode.next=nextnode;
        nextnode.prev=prevnode;

        temp.next=null;
        temp.prev=null;

        size--;
    }

    public void updatenode(int pos,int val){
        if(head==null){
            System.out.println("list empty");
            return;
        }
        if(pos<1 || pos>size){
            System.out.println("invalid pos");
            return;
        }
        Node<Integer> temp=head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }
        temp.data=val;
        System.out.println("node updated");

    }
    public boolean searchnode(int val){
        Node<Integer> temp=head;
        int pos=1;
        while(temp!=null){
            if(temp.data==val){
                System.out.println("value found at "+pos);
                return true;
            }
            pos++;
            temp=temp.next;
        }
        System.out.println("Not Found");
        return false;
    }
    public void displayforward(){
        Node<Integer> temp=head;
        while(temp!=null){
            System.out.println(temp.data+" <-> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void displayreverse(){
        Node<Integer> temp=tail;
        while(temp!=null){
            System.out.println(temp.data+" <-> ");
            temp=temp.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        doublylinkedlist list=new doublylinkedlist();
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("\n===== LINKED LIST MENU =====");
            System.out.println("1. Insert Head");
            System.out.println("2. Insert Tail");
            System.out.println("3. Insert At Position");
            System.out.println("4. Delete Head");
            System.out.println("5. Delete Tail");
            System.out.println("6. Delete At Position");
            System.out.println("7. update node");
            System.out.println("8. search node");
            System.out.println("9. displayforward");
            System.out.println("10. displayreverse");
            System.out.println("11. Exit");

            System.out.println("enter choice ...");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("enter data at head");
                    int val=sc.nextInt();
                    list.inserthead(val);
                    break;
                
                case 2:
                    System.out.println("enter data to be inserted at tail");
                    int val2=sc.nextInt();
                    list.inserttail(val2);
                    break;
                
                case 3:
                    System.out.print("Enter Data: ");
                    int data3 = sc.nextInt();
                    System.out.print("Enter Position: ");
                    int pos1 = sc.nextInt();
                    list.insertpos( pos1,data3);
                    break;
                
                case 4:
                    list.deletehead();
                    break;

                case 5:
                    list.deletetail();
                    break;

                case 6:
                    System.out.print("Enter Position: ");
                    int pos2 = sc.nextInt();
                    list.deletepos(pos2);
                    break;

                case 7:
                    System.out.println("enter pos and value");
                    int pos=sc.nextInt();
                    int value=sc.nextInt();
                    list.updatenode(pos, value);
                    break;

                case 8:
                    System.out.println("enter the node data to search");
                    int datav=sc.nextInt();
                    list.searchnode(datav);
                break;

                case 9:
                    list.displayforward();
                    break;

                case 10:
                    list.displayreverse();
                    break;
                
                case 11:
                    System.out.println("Program Ended");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
                
            }
        }
    }

}*/