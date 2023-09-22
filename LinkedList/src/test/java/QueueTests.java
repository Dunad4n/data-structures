import org.example.Queue;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class QueueTests {

    @Test
    public void addElements() {
        Queue<String> queue = new Queue<>();
        queue.add("Cat");
        queue.add("Dog");
        queue.add("Duck");

        Assertions.assertEquals(queue.peek(), "Cat");
        Assertions.assertEquals(queue.peek(), "Cat");
    }

    @Test
    public void pollElements() {
        Queue<String> queue = new Queue<>();
        queue.add("Cat");
        queue.add("Dog");
        queue.add("Duck");

        Assertions.assertEquals(queue.poll(), "Cat");
        Assertions.assertEquals(queue.poll(), "Dog");
        Assertions.assertEquals(queue.poll(), "Duck");
        Assertions.assertNull(queue.poll());
    }

    @Test
    public void assertSize() {
        Queue<String> queue = new Queue<>();
        queue.add("Cat");
        queue.add("Dog");
        queue.add("Duck");

        Assertions.assertEquals(queue.getSize(), 3);

        queue.poll();

        Assertions.assertEquals(queue.getSize(), 2);

        queue.peek();

        Assertions.assertEquals(queue.getSize(), 2);
    }

}
