package za.ac.cput.diameter;

import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.diameter.Impl.DiameterImp;

/**
 * Created by student on 2015/02/19.
 */
public class DiameterImpTest extends TestCase{
    @Test
    public void testCalcDiameter() throws Exception {
        DiameterInter d = new DiameterImp();
        assertEquals(4,d.calcDiameter(2));


    }
}
