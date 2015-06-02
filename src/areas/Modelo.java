package areas;

/**
 *
 * @author Seijas
 */
public class Modelo {
    
    private String shapeType;
    private float area;
    private float length;
    private float height;
    private float radius;

    public Modelo(String shapeType, float area, float length, float height, 
            float radius) {
        this.shapeType = shapeType;
        this.area = area;
        this.length = length;
        this.height = height;
        this.radius = radius;
    }

    public Modelo() {
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
    
    
    public String getShapeType() {
        return shapeType;
    }
    
    public void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }
    
}
