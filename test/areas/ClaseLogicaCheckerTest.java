package areas;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * @version 1.0
 * @author Seijas
 */
@RunWith(Parameterized.class)
public class ClaseLogicaCheckerTest {
   private final Modelo mod;
   private final float resultado;
   
   private ClaseLogica claseLogica;

   @Before
   public void initialize() {
      claseLogica = new ClaseLogica();
   }
   
   public ClaseLogicaCheckerTest(Modelo mod, float resultado) {
      this.mod = mod;
      this.resultado = resultado;
   }
   
   @Parameterized.Parameters
   public static Collection claseLogica() {
      return Arrays.asList(new Object[][] {
         { new Modelo("square", 16, 4, 0, 0), 16},
         { new Modelo("circle", 0, 0, 0, 5), 78},
         { new Modelo("triangle", 0, 5, 5, 0), 12},
         { new Modelo("rectangle", 0, 5, 7, 0), 35},
         { new Modelo("circle", 20, 0, 0, 5), 5} //fallado a proposito
      });
   }
   
   
   @Test
   public void testclaseLogicaChecker() {
      System.out.println("Parametros testeados : " + mod);
      assertEquals(resultado, ClaseLogica.shapeType(mod), 1);
   }
}
