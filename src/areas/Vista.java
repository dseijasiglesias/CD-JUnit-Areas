package areas;

import javax.swing.JOptionPane;

/**
 *
 * @author Seijas
 */
public class Vista {
    
    public static void askType(Modelo mod){
        String shapeType;
        shapeType = JOptionPane.showInputDialog("What shape would you like to "
                + "find the area of? (square, circle, triangle, rectangle):");
        
        mod.setShapeType(shapeType);
        
        System.out.println("You said: " + shapeType);
    }
    
    public static void showArea(Modelo mod){
        System.out.println("The area for your " + mod.getShapeType() + 
                ": " + mod.getArea());
    }
    
    public static void sideLenght(Modelo mod){
        float lenght = Float.parseFloat(JOptionPane.showInputDialog
                ("what is the side length?"));
        mod.setLength(lenght);
    }
    
    public static void askRadius(Modelo mod){
        float radius = Float.parseFloat(JOptionPane.showInputDialog
                ("What is the radius of the circle?"));
        mod.setRadius(radius);
    }
    
    public static void askBase(Modelo mod){
        float base = Float.parseFloat(JOptionPane.showInputDialog
                ("What is the base length of the triangle?"));
        mod.setLength(base);
    }
    
    public static void askHeight(Modelo mod){
        float height = Float.parseFloat(JOptionPane.showInputDialog
                ("What is the height of the triangle?"));
        mod.setHeight(height);
    }
    
    public static void askWidth(Modelo mod){
        float width = Float.parseFloat(JOptionPane.showInputDialog
                ("what is the rectangles width?"));
        mod.setLength(width);
    }
    
    public static void askRHeight(Modelo mod){
        float height = Float.parseFloat(JOptionPane.showInputDialog
                ("What is the rectangles height?"));
        mod.setHeight(height);
    }
}
