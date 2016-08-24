package Task17;
/* Author: Lê Trọng Nghia
 * Date: 23/8/2016
 * Version: V1.0
 * Description: this class define for bird
 */
public class Bird extends Animal implements IFlying, INonMolt, INest {
	public Bird(String food, String name) {
        super(food, name);
    }

	/*
	 * (non-Javadoc)
	 * @see Task17.INest#nesting()
	 */
	@Override
	public String nesting() {
		// TODO Auto-generated method stub
		return "Bird build nest";
		
	}

	/*
	 * (non-Javadoc)
	 * @see Task17.INonMolt#grownNormal()
	 */
	@Override
	public String grownNormal() {
		// TODO Auto-generated method stub
		return "Bird grow normal";
		
	}

	/*
	 * (non-Javadoc)
	 * @see Task17.IFlying#flying()
	 */
	@Override
	public String flying() {
		// TODO Auto-generated method stub
		return"Bird can fly";		
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
    public String toString() {
        return super.toString() + flying() + grownNormal() + nesting(); 
    }
}
