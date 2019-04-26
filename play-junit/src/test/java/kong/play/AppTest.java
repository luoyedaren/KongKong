package kong.play;

import static org.junit.Assert.assertTrue;

import kong.play.simple.BaseUseTest;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testUnitCase() {
        Result result = JUnitCore.runClasses(BaseUseTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());

        }
        System.out.println("失败次数:"+result.getFailureCount());
        result.wasSuccessful();
    }

}
