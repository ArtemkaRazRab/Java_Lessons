import java.util.*;
public class Ex003_Deque {
   public static void main(String[] args) {
       Deque <Integer> deque = new ArrayDeque<>();
       Deque <Integer> deque = new ArrayDeque<>();
       deque.addFirst(1);   
       deque.removeLast();  
       deque.offerFirst(1); 
       deque.pollFirst();   
       deque.getFirst();    
       deque.peekFirst();   
       deque.addLast(2);
       deque.removeLast();
       deque.offerLast(2);
       deque.pollLast();
       deque.getLast();
       deque.peekLast();
   }
}
