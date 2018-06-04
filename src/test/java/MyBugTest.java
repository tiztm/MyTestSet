import biz.nilstest.Mybug;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/12/16.
 */
public class MyBugTest {

    @Test
    public void testAdd() throws InterruptedException {
        //assertEquals(5, Mybug.add(2,3));

        for (int i = 0; i <10 ; i++) {

            Mybug m = new Mybug();
            m.getTen();
            Thread.sleep(1000);
            assertEquals("0123456789", m.out);
        }

    }
}
