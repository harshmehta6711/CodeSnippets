import org.testng.Assert;
import org.testng.annotations.*;

public class TestRectangle {

    private Rectangle objRect;
    private int[] result;

    @BeforeMethod
    public void setUp() throws Exception {
        objRect= new Rectangle();
    }

    @Test
    public void testConstructRectangle() throws Exception {
        System.out.println("Fast test");
        result = objRect.constructRectangle(25);
        System.out.println("Size of result: " + result);
    }
}
