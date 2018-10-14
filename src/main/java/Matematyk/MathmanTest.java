package Matematyk;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;


public class MathmanTest extends TestCase {


    private Mathman instance;

    @Before
    public void setUp()
    {
        instance = new Mathman();
    }

    @Test
    public void test()
    {
        double result = instance.divide(20, 2);

        assertEquals(10.0, result);
    }

}