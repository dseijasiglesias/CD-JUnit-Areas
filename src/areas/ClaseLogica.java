package areas;

/**
 *
 * @author Seijas
 */
public class ClaseLogica {
    
    public static float shapeType(Modelo mod){
        
        String shapeType = mod.getShapeType();
        float area = 0;
        
        switch(shapeType.toLowerCase()){
            
            case "square":
                Vista.sideLenght(mod);
                
                area = (float) mod.getLength() * mod.getLength();
                mod.setArea(area);
                
                Vista.showArea(mod);
                break;
            
            case "rectangle":
                Vista.askWidth(mod);
                Vista.askRHeight(mod);
                
                area = mod.getLength() * mod.getHeight();
                mod.setArea(area);
                
                Vista.showArea(mod);
                break;
            
            case "triangle":
                Vista.askBase(mod);
                Vista.askHeight(mod);
                
                area = (float) (0.5 * mod.getLength() * mod.getHeight());
                mod.setArea(area);
                
                Vista.showArea(mod);
                break;
            
            case "circle":
                Vista.askRadius(mod);
                
                area = mod.getRadius() * mod.getRadius();
                area = (float) (3.14159265 * area);
                mod.setArea(area);
                
                Vista.showArea(mod);
                break;
            
        }
        return area;
    }
    
}
