package collections;


class LinkedListSwap {
  Node head;

  public void swapNodes(int x, int y) {
    if (x == y)
      return;

    Node prevX = null, currX = head;
    while (currX != null && currX.val != x) {
      prevX = currX;
      currX = currX.next;
    }

    Node prevY = null, currY = head;
    while (currY != null && currY.val != y) {
      prevY = currY;
      currY = currY.next;
    }

    if (currX == null || currY == null)
      return;

    if (prevX != null)
      prevX.next = currY;
    else
      head = currY;

    if (prevY != null)
      prevY.next = currX;
    else
      head = currX;

    Node temp = currX.next;
    currX.next = currY.next;
    currY.next = temp;
  }

  public void push(int new_data) {
    Node new_Node = new Node(new_data);
    new_Node.next = head;
    head = new_Node;
  }

  public void printList() {
    Node tNode = head;
    while (tNode != null) {
      System.out.print(tNode.val + " ");
      tNode = tNode.next;
    }
  }
}


public class SwapNodeInLinkedList {
  public static void main(String[] args) {
    LinkedListSwap llist = new LinkedListSwap();
    llist.push(7);
    llist.push(6);
    llist.push(5);
    llist.push(4);
    llist.push(3);
    llist.push(2);
    llist.push(1);

    System.out.print("Linked list \n");
    llist.printList();
    llist.swapNodes(4, 3);
    System.out.print("\nLinked list after swap nodes \n");
    llist.printList();
  }
}
