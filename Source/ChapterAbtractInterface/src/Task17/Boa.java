package Task17;

/* Author: Lê Trọng Nghia
 * Date: 23/8/2016
 * Version: V1.0
 * Description: this class define for boa
 */
public class Boa extends Animal implements IBurrowing, IMolt, ISwimming {

    public Boa(String food, String name) {
        super(food, name);
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return super.toString() + burrowing() + molting() + swim(); //To change body of generated methods, choose Tools | Templates.
    }

    /*
     * (non-Javadoc)
     * @see Task17.IBurrowing#burrowing()
     */
    @Override
    public String burrowing() {
        return "\nBoa usally burrow";
    }

    /*
     * (non-Javadoc)
     * @see Task17.IMolt#molting()
     */
    @Override
    public String molting() {
        return "\nBoa will molt";
    }

    /*
     * (non-Javadoc)
     * @see Task17.ISwimming#swim()
     */
    @Override
    public String swim() {
        return "\nBoa can swim";
    }

}
