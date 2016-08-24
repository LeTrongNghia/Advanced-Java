package Task17;

/* Author: Lê Trọng Nghia
 * Date: 23/8/2016
 * Version: V1.0
 * Description: this class define for Tiger
 */
public class Tiger extends Animal implements IBurrowing, INonMolt, IRunning, ISwimming {

    public Tiger(String food, String name) {
        super(food, name);
    }

    /*
     * (non-Javadoc)
     * @see Task17.IBurrowing#burrowing()
     */
    @Override
    public String burrowing() {
        return "\nTiger can burrow sand";
    }
    
    /*
     * (non-Javadoc)
     * @see Task17.IRunning#run()
     */
    @Override
    public String run() {
        return "\nTiger can run fast";
    }

    /*
     * (non-Javadoc)
     * @see Task17.ISwimming#swim()
     */
    @Override
    public String swim() {
        return "\nTiger also can swimming";
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return super.toString() + grownNormal() + run() + swim() + burrowing();
    }

    /*
     * (non-Javadoc)
     * @see Task17.INonMolt#grownNormal()
     */
	@Override
	public String grownNormal() {
		// TODO Auto-generated method stub
		return "\nTiger grow normal";
	}

}
