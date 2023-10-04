package BaiTap;

import java.util.Objects;
import java.util.Scanner;

public class week4{
    static class MyNode{
        public String data;
        public MyNode next;
        public MyNode(){
            this.data = null;
            this.next = null;
        }
        public MyNode(String data){
            this.data = data;
            this.next = null;
        }
    }

    static class linkedList {
        MyNode head;
        public linkedList(){
            this.head = null;
        }

    }
    public linkedList insertANodeAtTheHead(){

    }

    static void printLinkedList(MyNode head){
        if(head == null) return;
        System.out.println(head.data);
        printLinkedList(head.next);
    }

    static MyNode append(MyNode head, String data){
        if(head == null) {
            return new MyNode(data);
        }
        head.next = append(head.next, data);
        return head;
    }
    static MyNode removeFirst(MyNode head, String data){
        MyNode preNode = new MyNode();

        if(Objects.equals(head.data, data)){
            System.out.println();
        }
    }
    public final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println('a');
    }
}

