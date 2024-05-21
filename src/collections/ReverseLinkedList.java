package collections;

// Java program for reversing the linked list

class LinkedList {

  static class Node {

    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }

  Node reverse(Node node) {
    Node prev = null;
    Node current = node;
    Node next = null;
    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    node = prev;
    return node;
  }

  void printList(Node node) {
    while (node != null) {
      System.out.print(node.data + " ");
      node = node.next;
    }
    System.out.println();
  }
}

public class ReverseLinkedList {

  static LinkedList.Node head;
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    head = new LinkedList.Node(85);
    head.next = new LinkedList.Node(15);
    head.next.next = new LinkedList.Node(4);
    head.next.next.next = new LinkedList.Node(20);

    System.out.println("Given linked list");
    list.printList(head);
    head = list.reverse(head);
    System.out.println("Reversed linked list ");
    list.printList(head);
  }
}
