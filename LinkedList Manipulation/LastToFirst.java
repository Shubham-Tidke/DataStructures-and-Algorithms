/*
Write a function that moves the last element to the front in a given Singly Linked List. For example,
if the given Linked List is 1->2->3->4->5, then the function should change the list to 5->1->2->3->4.
 */
public class LastToFirst {
    static  class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static node head;
    public static void main(String[] args) {
        LastToFirst l1 = new LastToFirst();
        l1.head = new node(1);
        l1.head.next = new node(2);
        l1.head.next.next = new node(3);
        l1.head.next.next.next = new node(4);
        l1.head.next.next.next.next = new node(5);
        System.out.println("BEFORE");
        l1.display();
        l1.moveFirstToLast();
        System.out.println();
        System.out.println("AFTER");
        l1.display();
    }
    private static void moveFirstToLast() {
        if (head == null || head.next == null) {
            return;
        }
        node secondLast = null;
        node last = head;
        while(last.next!=null){
            secondLast = last;
            last = last.next;
        }
        secondLast.next = null;
        last.next = head;
        head = last;
    }
    private static void display() {
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
}