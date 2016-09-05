package Task27;
/* @Author: Lê Trọng Nghia
 * @Date: 5/9/2016
 * @Version: V1.0
 */
public class NomalShapeDecorator extends ShapeDecorator{

    public NomalShapeDecorator(Shape shape) {
        super(shape);
        // TODO Auto-generated constructor stub
    }
    
    /*
     * (non-Javadoc)
     * @see Task27.ShapeDecorator#draw()
     */
    public String draw() {
        return this.shape.draw() + " and " + setNomalBorder(); 
    }
    
    /*
     * use to set decorator
     */
    public String setNomalBorder(){
        return "Border corlor: nomal";
    }
}
