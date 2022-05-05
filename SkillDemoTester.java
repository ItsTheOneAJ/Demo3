import static org.junit.Assert.*;
import org.junit.*;




public class SkillDemoTester {
    
    @Test
    public void subtractTest(){
        assertEquals(1, SkillDemo.subtract(1, 3)); //Failing test
    }
}
