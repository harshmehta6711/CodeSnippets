import org.testng.annotations.*;

public class RectangleTest {

    @BeforeClass
    public void setUp() {
        // code that will be invoked when this test is instantiated
        Rectangle objRect = new Rectangle();
        int result[] = new int[2];
    }

    @Test(groups = {"fast"})
    public void aFastTest() {
        System.out.println("Fast test");
        result = objRect.constructRectangle(25);
        System.out.println("Size of result: " + result.length())
    }

    @Test(groups = {"slow"})
    public void aSlowTest() {
        System.out.println("Slow test");
    }

}
