
/*
 * @author Le Trong Nghia
 * @date 6/9/2016
 * @version v1.0
 * @summary this class use to define for PersonInfo.
 */
public class Teacher extends PersonInfo {

	public String[] abilityToTeach;
	public Class m_Class;

	public Teacher(String fullName, String phoneNumber, String email, String[] abilityToTeach, Class m_Class) {
        super(fullName, phoneNumber, email);
        this.abilityToTeach = abilityToTeach;
        this.m_Class = m_Class;
    }

    public void finalize() throws Throwable {
		super.finalize();
	}

    
	public String[] getAbilityToTeach() {
        return abilityToTeach;
    }

    public void setAbilityToTeach(String[] abilityToTeach) {
        this.abilityToTeach = abilityToTeach;
    }

    public Class getM_Class() {
        return m_Class;
    }

    public void setM_Class(Class m_Class) {
        this.m_Class = m_Class;
    }

    /*
     * Get information of teacher
     * Return result as a String type
     */
    @Override
    public String toString() { 
        String result = "Name of teacher: " + this.fullName + "\nemail: " + this.email + "\nphone: " + this.phoneNumber 
                + "\nAbility to teach:";
        for(String subject : this.abilityToTeach)
            result += subject + " ";
        return result;
    }

}