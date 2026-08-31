package linkedlist;
import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class circularlinkedlist {
    Node head;
    Node tail;
    Node head2;
    public void insertion(int n ){
        Node newnode=new Node(n);
        if(head==null){
            head=newnode;
            tail=newnode;
            tail.next=head;
        }
        else{
            tail.next=newnode;
            tail=newnode;
            tail.next=head;
        }
    }
    public void display(int nb){

        if(nb==1){
        System.out.print(head.data);
        Node temp=head.next;
        while(temp!=head){
            System.out.print(" -> "+temp.data);
            temp=temp.next;
        }
        System.out.print(" -> "+head.data);
        }
        else{
             System.out.print(head2.data);
            Node temp=head2.next;
            while(temp!=head2){
                System.out.print(" -> "+temp.data);
                temp=temp.next;
            }
            System.out.print(" -> "+head2.data);
        }
    }

    public void split(){
        Node slow = head;
        Node fast = head;

        while(fast.next != head && fast.next.next != head){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast.next.next == head){
            fast = fast.next;
        }
        head2 = slow.next;
        slow.next = head;
        fast.next = head2;
    }
    public static void main(String[] args){
        circularlinkedlist list =new circularlinkedlist();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("\n===== circular LINKED LIST MENU =====");
            System.out.println("1. Insert Tail");
            System.out.println("2. display");
            System.out.println("3. splitt");
            System.out.println("4. exit");

            System.out.println("enter choice ..");

            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("enter data");
                    int nb=sc.nextInt();
                    list.insertion(nb);
                    break;

                case 2:
                    System.out.println("enter 1 to display 1st ll and 2 to display 2nd");
                    int n =sc.nextInt();
                    list.display(n);
                    break;

                case 3:
                    list.split();
                    break;

                case 4:
                    return;
            }
        }
    }
}