package collections;

class Node {
  int val;
  Node next;

  public Node(int val) {
    this.val = val;
  }
}
class MyLinkedList {
  Node head = null;

  Node sortedMerge(Node a, Node b) {
    Node result = null;
    if (a == null)
      return b;
    if (b == null)
      return a;
    
    if (a.val <= b.val) {
      result = a;
      result.next = sortedMerge(a.next, b);
    } else {
      result = b;
      result.next = sortedMerge(a, b.next);
    }
    return result;
  }

  Node mergeSort(Node h) {
    if (h == null || h.next == null) {
      return h;
    }
    
    Node middle = getMiddle(h);
    Node nextofmiddle = middle.next;
    
    middle.next = null;
    Node left = mergeSort(h);
    Node right = mergeSort(nextofmiddle);
    
    return sortedMerge(left, right);
  }
  
  public static Node getMiddle(Node head) {
    if (head == null)
      return null;
    Node slow = head, fast = head;
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  void push(int new_data) {
    Node new_node = new Node(new_data);
    new_node.next = head;
    head = new_node;
  }

  void printList(Node headref) {
    while (headref != null) {
      System.out.print(headref.val + " ");
      headref = headref.next;
    }
  }
}

public class MergeSortedList {
  public static void main(String[] args) {

    MyLinkedList li = new MyLinkedList();
    li.push(15);
    li.push(10);
    li.push(5);
    li.push(20);
    li.push(3);
    li.push(2);
    
    li.head = li.mergeSort(li.head);
    System.out.print("\n Sorted Linked List is: \n");
    li.printList(li.head);
  }
}
