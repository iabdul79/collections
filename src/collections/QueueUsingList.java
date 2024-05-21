package collections;

import java.util.ArrayList;
import java.util.List;

class MyQueue<T> {

  private final List<T> queue;
  private int pointer;
  public MyQueue() {
    queue = new ArrayList<>();
    pointer = 0;
  }

  public void enqueue(T elem) {
    queue.add(elem);
  }

  public boolean dequeue() {
    if (this.isEmpty()) {
      return false;
    }
    pointer++;
    return true;
  }

  public T front() {
    return queue.get(pointer);
  }

  public boolean isEmpty() {
    return queue.size() <= pointer;
  }
}

public class QueueUsingList {
  public static void main(String[] args) {
    MyQueue<Integer> q = new MyQueue<>();
    q.enqueue(5);
    q.enqueue(3);
    if (!q.isEmpty()) {
      System.out.println(q.front());
    }
    q.dequeue();
    if (!q.isEmpty()) {
      System.out.println(q.front());
    }
    q.dequeue();
    if (!q.isEmpty()) {
      System.out.println(q.front());
    }
    q.enqueue(5);
    q.enqueue(3);
    q.enqueue(4);
    q.enqueue(20);
    q.dequeue();
    q.dequeue();
    System.out.println(q.front());
  }
}
