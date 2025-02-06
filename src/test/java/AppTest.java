import com.example.MyController;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testApp() {
        MyController myController = new MyController();

        // Call the getStatus method in MyController
        String result = myController.getStatus();

        assertEquals("App is running!", result);
    }
}
