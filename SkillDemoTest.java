import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void multiplication() {
        assertEquals(25, SkillDemo.multiply(5, 5));
    }
}