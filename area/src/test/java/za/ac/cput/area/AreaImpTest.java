package za.ac.cput.area;

import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.area.Impl.AreaImp;

/**
 * Created by student on 2015/02/19.
 */
public class AreaImpTest extends TestCase {

    @Test
    public void testCalcArea() throws Exception {
        AreaInter a = new AreaImp();
        assertEquals(28.26,a.calcArea(3));
    }
}
