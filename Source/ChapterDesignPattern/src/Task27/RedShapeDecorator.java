package Task27;
/* @Author: Lê Trọng Nghia
 * @Date: 5/9/2016
 * @Version: V1.0
 */
public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape shape) {
        super(shape);
        // TODO Auto-generated constructor stub
    }
    
    /*
     * (non-Javadoc)
     * @see Task27.ShapeDecorator#draw()
     */
    public String draw() {
        return this.shape.draw() + " and " + setRedBorder(); 
    }
    
    /*
     * use to set decorator
     */
    public String setRedBorder(){
        return "Border corlor: red";
    }
}
