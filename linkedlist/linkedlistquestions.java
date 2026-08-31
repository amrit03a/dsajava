//package linkedlist;
/*import java.util.*;
class Node<T>{
    T data;
    Node<T> next;

    Node(T data){
        this.data=data;
        this.next=null;
    }
}
public class linkedlistquestions {

    //normal not optimised for finding middle
    int size=0;
    Node<Integer> head;

    public void inserthead(int data){
        Node<Integer> newnode=new Node<>(data);
        newnode.next=head;
        head=newnode;
        size++;
    }
    public void display(){
        Node<Integer> temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    //normal not optimised for finding middle
    public void findmiddle(){
        if(head==null){
            System.out.println(" empty linked list");
            return;
        }
        Node<Integer> temp=head;
        int m=0;
        if(size%2==0){
            m=(size/2)+1;
        }
        else{
            m=(size+1)/2;
        }
        for(int i=1;i<m;i++){
            temp=temp.next;
        }
        System.out.println("final answer "+temp.data);
    }

    // using slow fast pointer for middle 
    public void middle(){
        Node<Integer> slow=head;
        Node<Integer> fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("middle element "+slow.data);
    }
    public void deletemiddle(){
        Node<Integer> slow=head;
        Node<Integer> fast=head;
        Node<Integer> prev=null;
        if(head==null){
            System.out.println("empty ");
            return;
        }
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(prev==null){
            head=null;
        }
        else{
            prev.next=slow.next;
            slow.next=null;
        }
        
    }
    public void swap(){
        Node<Integer> first=head;
        if(head == null || head.next == null) {
            System.out.println("swapping not possible ");
            return;
        }
        while(first!=null && first.next!=null) {
            Node<Integer> second=first.next;

            int temp=first.data;
            first.data=second.data;
            second.data=temp;

            first=second.next;
        }
    }
    public void addtwo(Node<Integer> l1,Node<Integer> l2){
        int num1=0;
        int num2=0;
        while(l1!=null){
            num1=num1*10+l1.data;
            l1=l1.next
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        linkedlistquestions list =new linkedlistquestions();
        while(true){
            System.out.println(" 1. inserthead");
            System.out.println(" 2. display");
            System.out.println(" 3. middle");
            System.out.println(" 4. deletemiddle");
            System.out.println(" 5. swap");
            System.out.println(" 6. Exit");
            System.out.println("enter choice ");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter data");
                    int data=sc.nextInt();
                    list.inserthead(data);
                    break;
            
                case 2:
                    list.display();
                    break;
                
                case 3:
                    list.middle();
                    break;
                
                case 4:

                    list.deletemiddle();
                    break;

                case 5:
                    list.swap();
                    break;

                case 6:
                    System.out.println("Program Ended");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}*/



//add two linked list

/*package linkedlist;
import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class linkedlistquestions {
    public static Node createlist(Scanner sc){
        Node head=null;
        Node tail=null;
        while(true){
            String s=sc.next();
            if(s.equals("stop")){
                break;
            }
            int n=Integer.parseInt(s);
            Node newnode=new Node(n);
            if(head==null){
                head=newnode;
                tail=newnode;
            }
            else{
                tail.next=newnode;
                tail=newnode;
            }
        }
        return head;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node addtwonumbers(Node l1,Node l2){
        Node dummy=new Node(0);
        Node temp=dummy;

        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            int sum=carry;
            
            if(l1!=null){
                sum= sum + l1.data;
                l1=l1.next;
            }

            if(l2!=null){
                sum=sum+l2.data;
                l2=l2.next;
            }

            carry=sum/10;
            Node newnode=new Node(sum%10);
            temp.next=newnode;
            temp=temp.next;
        }
        return dummy.next;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first linked list ");
        Node l1=createlist(sc);
        System.out.println("enter 2nd linked list");
        Node l2=createlist(sc);
        System.out.println("1st linked list");
        display(l1);
        System.out.println("2nd linked list");
        display(l2);
        Node result=addtwonumbers(l1, l2);
        display(result);
    }
}*/

//reverse linkedlist
//1st method
package linkedlist;
import java.util.*;

/*class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class linkedlistquestions{

    Node head;
    Node tail;
    Node headans;

    public void insertail(int data){
        Node newnode = new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
    }
    public void reverse() {
        if(head==null){
            System.out.println("empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            Node newnNode=new Node(temp.data);
            if(headans==null){
                headans=newnNode;
            }
            else{
                newnNode.next=headans;
                headans=newnNode;
            }
            temp=temp.next;
        }
    }   
    public void display(){
        Node temp=headans;
        while (temp!=null) {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
    }
    public void pallindrome(){
        Node temp=head;
        Node temp1=headans;

        int pall=1;
        while(temp!=null){
            if(temp.data!=temp1.data){
                pall=0;
                break;
            }
            temp=temp.next;
            temp1=temp1.next;
        }
        if(pall==1){
            System.out.println("pallindrome ");
        }
        else{
            System.out.println("nt pallindrome");
        }

    }
    public static void main(String[] args){
        linkedlistquestions list =new linkedlistquestions();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("\n===== LINKED LIST MENU =====");
            System.out.println("1. Insert Tail");
            System.out.println("2. display");
            System.out.println("3. reverse");
            System.out.println("4. pallindrome");
            System.out.println("5. exit");

            System.out.println("enter choice ..");

            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("enter data ");
                    int n =sc.nextInt();
                    list.insertail(n);
                    break;

                case 2:
                    list.display();
                    break;

                case 3:
                    list.reverse();
                    break;

                case 4:
                    list.pallindrome();
                    break;
                
                case 5:
                    return;
            }

        }

    }
}*/

//other methods for pallindrome and reverse

/*class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class linkedlistquestions{
    Node head;
    public void inserthead(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
    }
    public void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
    public Node reverse(Node head){
        Node pre=null;
        Node cur=head;
        while(cur!=null){
            Node nextNode=cur.next;
            cur.next=pre;
            pre=cur;
            cur=nextNode;
        }
        return pre;
    }
    public void ispalindrome(){
        if(head==null || head.next==null){
            System.out.println("pallindrome");
        }
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null){
            slow=slow.next;
        }
        Node secondhalf=reverse(slow);
        Node firsthalf=head;

        while(secondhalf!=null){
            if (firsthalf.data != secondhalf.data) {
                System.out.println("Not Palindrome");
                return;
            }
            firsthalf=firsthalf.next;
            secondhalf=secondhalf.next;
        }
        System.out.println("pallindrome");

    }
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        linkedlistquestions list = new linkedlistquestions();
        System.out.println("Enter elements (-1 to stop)");
        while (true) {
            int n = sc.nextInt();
            if (n == -1)
                break;
            list.inserthead(n);
        }
        System.out.println("\nLinked List:");
        list.display(list.head);
        list.ispalindrome();
    }
}*/


    /*public void checkcyclic(){
        if(head==null || head.next==null){
            System.out.println("nt cyclic");
            return;
        }
        Node slow=head;
        Node fast=head;
        boolean flag=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(fast==slow){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("cyclic ");
        }
        else{
            System.out.println("nt cyclic ");
        }
    }*/

// cyclic linkedlist

/*class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class linkedlistquestions{
    Node head;
    Node tail;
    public void inserthead(int data){
        Node newnode =new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
            tail.next=head;
        }
        else{
            newnode.next=head;
            head=newnode;
            tail.next=head;
        }
    }
    public void inserttail(int data){
        Node newnode =new Node(data);
        if(tail==null){
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
    public void display(){
        if(head==null){
            System.out.println("no node");
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        while(temp != head);

    System.out.println("(head)");
    }
    public void countnodes(){
        if (head == null) {
            System.out.println("Total Nodes = 0");
            return;
        }
        Node temp=head;
        int count=0;
        do{
            count++;
            temp=temp.next;
        }
        while(temp!=head);
        System.out.println("Total Nodes = " + count);
    }
    public void insertpos(int data,int pos){
        if(head==null){
            System.out.println("no node");
            return;
        }
        if(pos==1){
            inserthead(data);
            return;
        }
        Node temp=head;
        Node newnode=new Node(data);
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        if(temp==tail){
            tail=newnode;
        }
        tail.next=head;
    }
    public void search(int val){
        if(head==null){
            System.out.println("no node");
            return;
        }
        int pos=0;
        int i=1;
        Node temp=head;
        do{
            if(temp.data==val){
                pos=i;
            }
            i++;
            temp=temp.next;
        }
        while(temp!=head);
        if(pos==0){
            System.out.println("not found  ");
        }
        else{
            System.out.println("found at "+ pos);
        }
    }
    public void updateval(int pos,int val){
        if(head==null){
            System.out.println("no node");
            return;
        }
        Node temp=head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }
        temp.data=val;
    }

    public void deletehead(){
        if(head==null){
            System.out.println("no node");
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
            return;
        }
        Node temp=head.next;
        head.next=null;
        tail.next=temp;
        head=temp;
    }

    public void deletetail(){
        if(head==null){
            System.out.println("no node");
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
            return;
        }
        Node temp=head.next;
        Node prev=head;
        while(temp!=tail){
            prev=temp;
            temp=temp.next;
        }
        prev.next=head;
        tail=prev;
    }

   public void deletepos(int pos){
        if(head == null){
            System.out.println("No Node");
            return;
        }

        if(pos == 1){
            deletehead();
            return;
        }

        Node temp = head;
        Node prev = null;

        for(int i=1;i<pos;i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        if(temp == tail){
            tail = prev;
        }
        tail.next = head;
    }

    public void reverse(){
        if(head == null || head == tail){
            return;
        }
        Node curr=head;
        Node prev=tail;
        while(curr!=tail){
            Node nextnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }
        curr.next = prev;
        tail=head;
        head=curr;
        tail.next=head;
    }

    public void middle(){
        if(head == null){
        System.out.println("Empty");
        return;
        }
        Node slow=head;
        Node fast=head;
        while(fast.next!=head && fast.next.next!=head){
            slow=slow.next;
            fast=fast.next.next;
        }
        if (fast.next.next == head) {
            slow = slow.next;
        }
        System.out.println("Middle = " + slow.data);
    }
    public void split(){
        if(head == null || head.next==null){
            return;
        }
        Node head1=head;
        Node head2;
        Node slow=head;
        Node fast=head;
        while(fast.next!=head && fast.next.next!=head){
            slow=slow.next;
            fast=fast.next.next;
        }
        head2=slow.next;
        Node temp1=head1;
        System.out.println("1st linked list");
        while(temp1.next!=head2){
            System.out.print(temp1.data+ " -> ");
            temp1=temp1.next;
        }
        Node tail1 = temp1;
        System.out.println(tail1.data+" -> ");
        tail1.next=head1;
        System.out.print(head1.data);

        System.out.println("2nd linked list");
        Node temp2=head2;
        while(temp2.next!=head1){
            System.out.print(temp2.data+" -> ");
            temp2=temp2.next;
        }
        Node tail2=temp2;
        System.out.println(tail2.data+" -> ");
        tail2.next=head2;
        System.out.print(head2.data);
    }




    public static void main(String[] args){
        linkedlistquestions list = new linkedlistquestions();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("\n===== CIRCULAR LINKED LIST =====");
            System.out.println("1. Insert Head");
            System.out.println("2. Insert Tail");
            System.out.println("3. Display");
            System.out.println("4. Count Nodes");
            System.out.println("5. insert at pos");
            System.out.println("6. search");
            System.out.println("7. updatevalue");
            System.out.println("8. deletehead");
            System.out.println("9. deletetail");
            System.out.println("10. deletepos");
            System.out.println("11. reverse");
            System.out.println("12. middle");
            System.out.println("13. split");
            System.out.println("14. Exit");

            System.out.println("enter choice ");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter data ");
                    int n=sc.nextInt();
                    list.inserthead(n);
                    break;
                case 2:
                    System.out.println("enter data ");
                    int m=sc.nextInt();
                    list.inserttail(m);
                    break;
                case 3:
                    list.display();
                    break;
                case 4:
                    list.countnodes();
                    break;

                case 5:
                    System.out.println("insert pos");
                    int p=sc.nextInt();
                    int val=sc.nextInt();
                    list.insertpos(val,p);
                    break;

                case 6:
                    System.out.println("wt to search ");
                    int v=sc.nextInt();
                    list.search(v);
                    break;

                case 7:
                    System.out.println("old value to update ");
                    int pos=sc.nextInt();
                    int nw=sc.nextInt();
                    list.updateval(pos,nw);
                    break;

                case 8:
                    list.deletehead();
                    break;

                case 9:
                    list.deletetail();
                    break;

                case 10:
                    System.out.println("pos to delete ");
                    int po=sc.nextInt();
                    list.deletepos(po);
                    break;

                case 11:
                    list.reverse();
                    break;

                case 12:
                    list.middle();
                    break;

                case 13:
                    list.split();
                    break;
                case 14:
                    return;
            
                default:
                    break;
            }
        }
    }
}*/

//Lecture-150 - Odd Even Linked List/code/OddEvenLinkedList.java


class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class linkedlistquestions{
    Node head;
    Node tail;

    Node head2;
    Node tail2;

    public void insertail(int nb,int data){
        Node newnode = new Node(data);
        if(nb==1){
            if(head==null){
                head=newnode;
                tail=newnode;
            }
            else{
                tail.next=newnode;
                tail=newnode;
            }
        }
        else{
            if(head2==null){
                head2=newnode;
                tail2=newnode;
            }
            else{
                tail2.next=newnode;
                tail2=newnode;
            }
        }
    }
    public void display(int x){
        if(x==1){
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
        }
        else{
            Node temp=head2;
             while (temp!=null) {
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
        }
    }
    //Lecture-150 - Odd Even Linked List/code/OddEvenLinkedList.java
    public void oddeven(){
        if(head==null || head.next==null){
            return;
        }
        Node oddnode=head;
        Node evenhead=head.next;
        Node evennode=evenhead;
        
        while(evennode!=null && evennode.next!=null){
            oddnode.next=evennode.next;
            oddnode=oddnode.next;

            evennode.next=oddnode.next;
            evennode=evennode.next;
        }
        oddnode.next=evenhead;
    }
    //Lecture-151 - Reverse Node In K Groups/code/LinkedListGroupReverseGfg.java

    public void reversenodeingroup(int k){
        if(head == null || k <= 1) {
            return;
        }
        Node currhead=head;
        Node prevtail=null;
        Node newhead=null;
        Node newtail = null;
        while(currhead!=null){
            Node curr=currhead;
            Node prev=null;
            Node nextnode=null;
            int count=0;
            while(count<k && curr!=null){
                nextnode=curr.next;
                curr.next=prev;
                prev=curr;
                curr=nextnode;
                count++;
            }
            if(newhead==null){
                newhead=prev;
            }
            if(prevtail != null){
                prevtail.next = prev;
            }

            prevtail = currhead;
            currhead = curr;
            if(curr==null){
                newtail=currhead;
            }
        }
        head = newhead;
        tail = newtail;
    }

    public void removenthnodefromend(int n ){
       if(head==null){
        return;
       }
       Node slow=head;
       Node fast=head;
       for(int i=0;i<n;i++){
        fast=fast.next;
       }
       if(fast==null){
        Node temp=head;
        head=head.next;
        temp.next=null;
        return;
       }
       while(fast.next!=null){
        slow=slow.next;
        fast=fast.next;
       }

       Node del=slow.next;
       slow.next=del.next;
       del.next=null;
    }

   public void sortzerosonestwos(){
    Node zerohead=null;
    Node zerotail=null;
    Node onehead=null;
    Node onetail=null;
    Node twohead=null;
    Node twotail=null;

    Node temp=head;
    while(temp!=null){
        Node nextnode=temp.next;
        temp.next=null;

        if(temp.data==0){
            if(zerohead==null){
                zerohead=temp;
                zerotail=temp;
            }
            else{
                zerotail.next=temp;
                zerotail=temp;
            }
        }
        else if(temp.data==1){
            if(onehead==null){
                onehead=temp;
                onetail=temp;
            }
            else{
                onetail.next=temp;
                onetail=temp;
            }
        }
        else{
            if(twohead==null){
                twohead=temp;
                twotail=temp;
            }
            else{
                twotail.next=temp;
                twotail=temp;
            }
        }
        temp=nextnode;
    }
    if(zerotail!=null){
            if(onehead!=null){
                zerotail.next=onehead;
            }
            else{
                zerotail.next=twohead;
            }
    }
        if(onetail!=null){
            onetail.next=twohead;
        }
        if(zerohead!=null){
            head=zerohead;
        }
        else if(onehead!=null){
            head=onehead;
        }
        else{
            head=twohead;
        }
   }
   /*public Node intersection(){

    //brute-force approach. --my method
       
     /*Node temp1=head;

     Node temphead=null;
     Node temptail=null;

     while(temp1!=null) {
        Node temp2=head2;
        while(temp2!=null){
            if(temp1.data==temp2.data){
                Node newnode = new Node(temp1.data);
                if(temphead==null){
                    temphead=newnode;   //we cannot do temphead.data=temp1.data becuase initially we have temphead=null its  pointing to nothing so must create a newnode 
                    temptail=newnode;
                    break;
                }
                else{
                    Node t=temphead;
                    boolean found=false;
                    while(t!=null){
                        if(t.data==temp1.data){
                            found=true;
                            break;
                        }
                        t=t.next;
                    }
                    if(!found){
                        temptail.next = newnode;
                        temptail = newnode;
                    }
                    break;
                }
            }
            temp2=temp2.next;
        }
        temp1=temp1.next;
     }
     head=temphead;
     tail=temptail;*/


     //optimised method using two pointer  *note= it will only for sorted linked list

     /*Node t1=head;
     Node t2=head2;

     Node dummy=new Node(-1);
     Node tail=dummy;
     while(t1 != null && t2 != null){
        if(t1.data==t2.data){
            tail.next=new Node(t1.data);
            tail=tail.next;

            t1=t1.next;
            t2=t2.next;
        }
        else if(t1.data<t2.data){
            t1=t1.next;
        }
        else{
            t2=t2.next;
        }
     }
     head=dummy.next;*/
   

     //using hashset 
     /*HashSet<Integer> hash=new HashSet<>();
     Node temp=head;
     while(temp!=null){
        hash.add(temp.data);
        temp=temp.next;
     }
     Node dummy=new Node(-1);
     Node tail=dummy;

     temp=head2;
     while(temp!=null){
        if(hash.contains(temp.data)){
            tail.next=new Node(temp.data);
            tail=tail.next;

            hash.remove(temp.data);
        }
        temp=temp.next;
     }
     head=dummy.next;*/

    public void insertinsorted(int data){
        Node newnode=new Node(data);

        Node nextnode=head.next;
        Node temp=head;

        if(data<head.data){
            newnode.next=head;
            head=newnode;
            return;
        }
        while(nextnode!=null){
            if(nextnode.data>data){
                newnode.next=nextnode;
                temp.next=newnode;
                return;
            }
            temp=nextnode;
            nextnode=nextnode.next;
        }
        temp.next=newnode;
     }

    /*public void insertionsort(){
        if(head==null || head.next==null){
            return;
        }


        Node dummy=new Node(-1);
        Node temp=head;

        while(temp!=null){
            Node next=temp.next;
            Node pre=dummy;
            Node curr=dummy.next;

            while(curr!=null && curr.data<temp.data){
                pre=curr;
                curr=curr.next;
            }
            temp.next=curr;
            pre.next=head;

            temp=next;
        }
        head=dummy.next;
    }*/

    //all sorting techniques left


    public static void main(String[] args){
        linkedlistquestions list =new linkedlistquestions();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("\n===== LINKED LIST MENU =====");
            System.out.println("1. Insert Tail");
            System.out.println("2. display");
            System.out.println("3. odd-even linkedlist");
            System.out.println("4. reverse in k-node group");
            System.out.println("5. del nth node from ending ");
            System.out.println("6. sort 0 1 2 in linkedlist");
            System.out.println("7. intersection ... ");
            System.out.println("8. insert in sorted ll");
            System.out.println("9. exit");

            System.out.println("enter choice ..");

            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("enter 1 of want to add in first linked list or enter 2 if want to do it for 2");
                    int nb=sc.nextInt();
                    System.out.println("enter data ");
                    int n =sc.nextInt();
                    list.insertail(nb,n);
                    break;

                case 2:
                    System.out.println("which linkedlist to display 1 or 2 ");
                    int x =sc.nextInt();
                    list.display(x);
                    break;

                case 3:
                    list.oddeven();
                    break;

                case 4:
                    System.out.println("enter value of k for reverse in kth node ");
                    int nn=sc.nextInt();
                    list.reversenodeingroup(nn);
                    break;

                case 5:
                    System.out.println("enter nth node which we have to del from last");
                    int l=sc.nextInt();
                    list.removenthnodefromend(l);
                    break;
                
                case 6:
                    list.sortzerosonestwos();
                    break;

                /*case 7:
                    list.intersection();
                    break;*/

                case 8:
                    System.out.println("enter the data ");
                    int dd=sc.nextInt();
                    list.insertinsorted(dd);
                    break;

                case 9 :
                    return;
            }

        }

    }
}
