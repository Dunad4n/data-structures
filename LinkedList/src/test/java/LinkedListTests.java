import org.example.LinkedList;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class LinkedListTests {

    @Test
    public void oneElement() {
        LinkedList<String> list = new LinkedList<>("Cat");
        Assertions.assertEquals(list.get(0), "Cat");
        Assertions.assertEquals(list.getHead(), "Cat");
        Assertions.assertEquals(list.getTail(), "Cat");
    }

    @Test
    public void addElements() {
        LinkedList<String> list = new LinkedList<>("Cat");
        list.add("Dog");
        list.add("Duck");
        list.add("Snake");

        Assertions.assertEquals(list.get(0), "Cat");
        Assertions.assertEquals(list.get(1), "Dog");
        Assertions.assertEquals(list.get(2), "Duck");
        Assertions.assertEquals(list.get(3), "Snake");
    }

    @Test
    public void setElements() {
        LinkedList<String> list = new LinkedList<>("Cat");
        list.add("Dog");
        list.add("Duck");
        list.add("Snake");

        list.set(2, "Lion");
        list.set(4, "Tiger");
        list.set(0, "Chicken");

        Assertions.assertEquals(list.getHead(), "Chicken");
        Assertions.assertEquals(list.get(0), "Chicken");
        Assertions.assertEquals(list.get(1), "Cat");
        Assertions.assertEquals(list.get(2), "Dog");
        Assertions.assertEquals(list.get(3), "Duck");
        Assertions.assertEquals(list.get(4), "Lion");
        Assertions.assertEquals(list.get(5), "Snake");
        Assertions.assertEquals(list.get(6), "Tiger");
        Assertions.assertEquals(list.getTail(), "Tiger");
    }

    @Test
    public void removeElements() {
        LinkedList<String> list = new LinkedList<>("Cat");
        list.add("Dog");
        list.add("Duck");
        list.add("Snake");

        list.remove(2);
        list.remove(2);

        Assertions.assertEquals(list.getHead(), "Cat");
        Assertions.assertEquals(list.get(0), "Cat");
        Assertions.assertEquals(list.get(1), "Dog");
        Assertions.assertEquals(list.getTail(), "Dog");
    }

    @Test
    public void assertSize() {
        LinkedList<String> list = new LinkedList<>("Cat");
        list.add("Dog");
        list.add("Duck");
        list.add("Snake");

        Assertions.assertEquals(list.getSize(), 4);

        list.set(2, "Tiger");

        Assertions.assertEquals(list.getSize(), 5);

        list.remove(2);
        list.remove(2);

        Assertions.assertEquals(list.getSize(), 3);
    }
}
