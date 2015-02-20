package za.ac.cput.circle;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.circle.CircleModuleImpTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.circle.config.AppConfig;

/**
 * Created by student on 2015/02/20.
 */
public class CircleModuleImpTest extends TestCase{
    private Circle c;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        c = (Circle) ctx.getBean("circ");

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testCalcArea() throws Exception {
        assertEquals(3.14,c.calcArea(1));
    }

    @Test
    public void testCalcCircumference() throws Exception {
        assertEquals(12.56,c.calcCircumference(2));

    }

    @Test
    public void testName() throws Exception {
        assertEquals(4.0,c.calcDiameter(2));
    }
}
