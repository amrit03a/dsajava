/*package linkedlist;
import java.util.*;

class Node<T>{
    T data;
    Node<T> next;
    Node(T data){
        this.data=data;
        this.next=null;
    }
}

public class linkedlist {   //head and size are instance (global) variables declared inside the class,
     Node<Integer> head;
     int size;

    public void inserthead(int data){
        Node<Integer> newnode=new Node<>(data);
        newnode.next=head;
        head=newnode;
        size++;
    }
    public void inserttail(int data){
        Node<Integer> newnode=new Node<>(data);
        if(head==null){
            head=newnode;
            size++;
            return;
        }

        Node<Integer> temp;
        temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        size++;
    }
    public void insertpos(int data,int pos){
        if(pos<1 || pos>size){
            System.out.println("invalid position");
            return;
        }
        if(pos==1){
            inserthead(data);
            return;
        }
        if(pos==size){
            inserttail(data);
            return;
        }
        Node<Integer> newnode =new Node<>(data);
        Node<Integer> temp=head;
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        size++;

    }

    public void deletehead(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        head=head.next;
        size--;
    }
    public void deletetail(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        if(head.next==null){
            head=null;
            size--;
            return;
        }
        Node<Integer> temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        size--;
    }
    public void deletepos(int pos){
        if(head==null){
            System.out.println("empty");
            return;
        }
        if (pos < 1 || pos > size) {
            System.out.println("Invalid Position");
            return;
        }
         if (pos == 1) {
            deletehead();
            return;
        }
         if (pos == size) {
            deletetail();
            return;
        }
        Node<Integer> temp = head;

        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }
        Node<Integer> deletednode =temp.next;
        temp.next=deletednode.next;
        deletednode.next=null;
        size--;
    }
    public void display(){
        Node<Integer> temp=head;
        while(temp!=null){
            System.out.print(temp.data+" - >");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void updatenode(int pos,int value){
        if(head==null){
            System.out.println("null linked list");
            return;
        }
        if(pos < 1 || pos > size){
            System.out.println("Invalid Position");
            return;
        }
        Node<Integer> temp=head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }
        temp.data=value;
        System.out.println("updated ");
    }
    public boolean searchnode(int value){
        if(head==null){
            System.out.println("empty");
            return false;
        }
        Node<Integer> temp=head;
        int counter=1;
        while(temp!=null){
            if(temp.data==value){
                System.out.println("value found at "+counter);
                return true;
            }
            counter++;
            temp=temp.next;
        }
        System.out.println("Not found");
        return false;
    }

    public static void main(String [] args){
        linkedlist list =new linkedlist();
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("\n===== LINKED LIST MENU =====");
            System.out.println("1. Insert Head");
            System.out.println("2. Insert Tail");
            System.out.println("3. Insert At Position");
            System.out.println("4. Delete Head");
            System.out.println("5. Delete Tail");
            System.out.println("6. Delete At Position");
            System.out.println("7. Display");
            System.out.println("8. update node");
            System.out.println("9. search node");
            System.out.println("10. Exit");

            System.out.println("enter choice ...");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("enter data");
                    int data=sc.nextInt();
                    list.inserthead(data);
                    break;
                
                case 2:
                System.out.print("Enter Data: ");
                int data2 = sc.nextInt();
                list.inserttail(data2);
                break;

            case 3:
                System.out.print("Enter Data: ");
                int data3 = sc.nextInt();

                System.out.print("Enter Position: ");
                int pos1 = sc.nextInt();

                list.insertpos(data3, pos1);
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
                list.display();
                break;

            case 8:
                System.out.println("enter pos and value");
                int pos=sc.nextInt();
                int value=sc.nextInt();
                list.updatenode(pos, value);
                break;

            case 9:
                System.out.println("enter the node data to search");
                int datav=sc.nextInt();
                list.searchnode(datav);
                break;

            case 10:
                System.out.println("Program Ended");
                sc.close();
                return;

            default:
                System.out.println("Invalid Choice");

            }
        }
    }
}*/

