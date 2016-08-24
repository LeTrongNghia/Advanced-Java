package Task17;

/* Author: Lê Trọng Nghia
 * Date: 23/8/2016
 * Version: V1.0
 * Description: this class define for bird
 */
public class Fish extends Animal implements INonMolt, IWater, ISwimming {

    public Fish(String food, String name) {
        super(food, name);
    }

    /*
     * (non-Javadoc)
     * @see Task17.ISwimming#swim()
     */
    @Override
    public String swim() {
        return "\nFish can swim";
    }

    /*
     * (non-Javadoc)
     * @see Task17.INonMolt#grownNormal()
     */
    @Override
    public String grownNormal() {
        return "\nFish grow normal";
    }

    /*
     * (non-Javadoc)
     * @see Task17.IWater#IWater()
     */
    @Override
    public String IWater() {
        return "\nFish live in water";
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return super.toString() + IWater() + swim() + grownNormal(); //To change body of generated methods, choose Tools | Templates.
    }

}
