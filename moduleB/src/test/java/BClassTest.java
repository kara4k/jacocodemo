import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BClassTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void start() {
        Assert.assertEquals(BClass.start(), "Module B");
    }

    @Test
    public void testMore() {
        Assert.assertEquals(BClass.startMore(), "Module More");
    }

    @Test
    public void testCreateNewClass(){
        Assert.assertNotNull(new BClass());
    }
}