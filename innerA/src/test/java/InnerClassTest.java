import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InnerClassTest {

    @Test
    public void doSmth() {
        InnerClass innerClass = new InnerClass();
        innerClass.doSmth();
        Assert.assertTrue(true);
    }
}