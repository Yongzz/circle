package za.ac.cput.circle;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.circle.Impl.CircleMultipleImp;
import za.ac.cput.circle.config.AppConfig;

/**
 * Created by student on 2015/02/20.
 */
public class CircleMultipleImpTest extends TestCase{
    private CircleMultipleImp cm;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        cm = (CircleMultipleImp) ctx.getBean("cmArea");

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testName() throws Exception {
        assertEquals(4.0,cm.calcDiameter(2));
    }
}
