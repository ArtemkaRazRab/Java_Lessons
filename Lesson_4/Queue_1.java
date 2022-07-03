import java.util.*;
public class Queue_1 {
   public static void main(String[] args) {
       Queue<Integer> queue = new LinkedList<Integer>();
       queue.add(1);
       int item = queue.remove();
       queue.offer(2809);
       item = queue.poll();
       System.out.println(queue);
       queue.remove(2809); // зачем очередь??
       queue.element();
       queue.peek();
   }
}
