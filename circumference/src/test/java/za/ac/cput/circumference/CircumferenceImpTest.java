package za.ac.cput.circumference;

import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.circumference.Impl.CircumferenceImp;

/**
 * Created by student on 2015/02/19.
 */
public class CircumferenceImpTest extends TestCase{
    @Test
    public void testName() throws Exception {
        CircumferenceInter c = new CircumferenceImp();
        assertEquals(12.56,c.calcCircuference(2));
    }
}
