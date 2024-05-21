package collections;

import java.util.ArrayList;
import java.util.List;

class CircularQueue<T> {
  private final List<T> queue;

  private int head;
  private int tail;

  public CircularQueue(int size) {
    queue = new ArrayList<>(size);
    for (int i = 0; i < size; i++) {
      queue.add(null);
    }
    head = -1;
    tail = -1;
  }

  public boolean isFull() {
    if (tail - head == queue.size() - 1) {
      return true;
    }
    return head - tail == 1;
  }

  public boolean isEmpty() {
    return head == -1 && tail == -1;
  }

  public T Front() {
    if (this.isEmpty()) {
      return null;
    }
    return queue.get(head);
  }

  public T Rear() {
    if (this.isEmpty()) {
      return null;
    }
    return queue.get(tail);
  }

  public boolean enQueue(T element) {
    if (this.isFull()) {
      return false;
    }
    tail = tail == queue.size() - 1 ? 0 : tail + 1;
    queue.set(tail, element);
    if (head == -1) {
      head++;
    }
    return true;
  }

  public boolean deQueue() {
    if (this.isEmpty()) {
      return false;
    }
    if (head == tail) {
      head = tail = -1;
      return true;
    }
    head = head == queue.size() - 1 ? 0 : head + 1;
    return true;
  }
}

public class MyCircularQueue {
  public static void main(String[] args) {
    CircularQueue<Integer> q = new CircularQueue<>(3);
    System.out.println(q.enQueue(1));
    System.out.println(q.enQueue(2));
    System.out.println(q.enQueue(3));
    System.out.println(q.enQueue(4));
    System.out.println(q.Rear());
    System.out.println(q.isFull());
    System.out.println(q.deQueue());
    System.out.println(q.enQueue(4));
    System.out.println(q.Rear());
    System.out.println(q.deQueue());
    System.out.println(q.Front());
  }
}
