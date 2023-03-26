import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestNewStack {
    NewStack ns;

    @Before
    public void setup() {
        ns = new NewStack();
    }

    @Test
    public void testPush() {
        ns.push("Jason");
        ns.push("Gillian");
    }

    @Test
    public void testPeek() {
        ns.push("Jason");
        Assert.assertEquals("Jason", ns.peek());
        ns.push("Gillian");
        Assert.assertEquals("Gillian", ns.peek());
    }

    @Test
    public void testPop() {
        ns.push("Jason");
        ns.push("Gillian");
        ns.push("Argo");
        ns.push("Iris");
        Assert.assertEquals("Iris", ns.peek());
        Assert.assertEquals("Iris", ns.pop());
        Assert.assertEquals("Argo", ns.peek());
        ns.pop();
        Assert.assertEquals("Gillian", ns.peek());
        ns.pop();
        Assert.assertEquals("Jason", ns.peek());
        ns.pop();
        Assert.assertNull(ns.peek());
    }

    @Test
    public void testIsEmpty() {
        Assert.assertTrue(ns.isEmpty());
    }
}
