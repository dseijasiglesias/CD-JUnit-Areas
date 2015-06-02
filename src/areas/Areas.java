package areas;

/**
 *
 * @author Seijas
 */
public class Areas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Modelo mod = new Modelo();
        Vista.askType(mod);
        ClaseLogica.shapeType(mod);
    }
    
}
