package Task27;
/* @Author: Lê Trọng Nghia
 * @Date: 5/9/2016
 * @Version: V1.0
 */
public abstract class ShapeDecorator {
    protected Shape shape;
    
    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }
    
    public String draw(){
        return shape.draw();
    }
}
