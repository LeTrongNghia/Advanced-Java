package Task19;


/* Author: Lê Trọng Nghia
 * Date: 24/8/2016
 * Version: V1.0
 * Description: this class define for gift box
 */
public class GiftBox {
    public String shape;
    public String color;
    final int PRICE = 10000;
    
    public GiftBox(String shape, String color) {
        super();
        this.shape = shape;
        this.color = color;
    }
    
    
    /*
     * This class is inner class to define for gift
     */
    class Gift{
        public String name;
        public double weight;
        final int FEE = 200;
        
        public Gift(String name, Double weight) {
            super();
            this.name = name;
            this.weight = weight;
        }
        
        /*
         * use  to calculate fee for gift
         */
        public double calFee() {
            return weight * FEE  + GiftBox.this.PRICE;
        }
        
        /*
         * use  to print information for gift
         */
        public String toString(){
            return "Shape: " + shape + "\nColor: " + color + "\nName: " + name 
                    + "\nWeight: " + weight + "\nFree: " + calFee();
        }
    }
}
