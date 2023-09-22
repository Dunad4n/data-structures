import org.example.Stack;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StackTests {

    @Test
    public void pushElements() {
        Stack<String> stack = new Stack<>();
        stack.push("Cat");
        stack.push("Dog");
        stack.push("Duck");

        Assertions.assertEquals(stack.peek(), "Duck");
        Assertions.assertEquals(stack.peek(), "Duck");
    }

    @Test
    public void popElements() {
        Stack<String> stack = new Stack<>();
        stack.push("Cat");
        stack.push("Dog");
        stack.push("Duck");

        Assertions.assertEquals(stack.pop(), "Duck");
        Assertions.assertEquals(stack.pop(), "Dog");
        Assertions.assertEquals(stack.pop(), "Cat");
        Assertions.assertNull(stack.pop());
    }

    @Test
    public void assertSize() {
        Stack<String> stack = new Stack<>();
        stack.push("Cat");
        stack.push("Dog");
        stack.push("Duck");

        Assertions.assertEquals(stack.getSize(), 3);

        stack.pop();

        Assertions.assertEquals(stack.getSize(), 2);

        stack.peek();

        Assertions.assertEquals(stack.getSize(), 2);
    }

}
