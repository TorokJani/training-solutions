package trainer;

import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    @Test
    public void testQueue(){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        int i = q.element();
        System.out.println(i);
        i = q.element();
        System.out.println(i);
        i=q.remove();
        System.out.println(i);
        i=q.remove();
        System.out.println(i);
    }

    @Test
    public void testStack(){
        Deque<Integer> q = new LinkedList<>();
        q.push(1);
        q.push(2);
        q.push(3);
        int i = q.peek();
        System.out.println(i);
        i = q.element();
        System.out.println(i);
        i=q.pop();
        System.out.println(i);
        i=q.pop();
        System.out.println(i);
    }

}
