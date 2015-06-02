package areas;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Seijas
 */
public class ClaseLogicaTest {
    
    public ClaseLogicaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of shapeType method, of class ClaseLogica.
     */
    @Test
    public void testShapeType() {
        System.out.println("shapeType");
        Modelo mod = new Modelo();
        
        mod.setShapeType("square");
        mod.setLength(4);
        
        float expResult = 16.0F;
        float result = ClaseLogica.shapeType(mod);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
