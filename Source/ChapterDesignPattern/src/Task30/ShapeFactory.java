package Task30;
/* Author: Lê Trọng Nghia
 * Date: 1/9/2016
 * Version: V1.0
 * Description: class use to define for Shape Factory
 */
public class ShapeFactory {
    /*
     * use to select shape
     */
    public Shape getShape(String shapeType) {
        if(shapeType == null)
            return null;
        if (shapeType.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        else if (shapeType.equalsIgnoreCase("SQUARE"))
            return new Square();
        else if (shapeType.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        return null;
    }
    
    public ShapeFactory(){
        
    }
}
