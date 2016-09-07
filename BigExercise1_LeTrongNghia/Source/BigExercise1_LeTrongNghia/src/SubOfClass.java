

/*
 * @author Le Trong Nghia
 * @date 6/9/2016
 * @version v1.0
 * @summary this class use to define for SubOfClass.
 */
public class SubOfClass {

	public Class clas;
	public Subject subject;

	public SubOfClass(Class clas, Subject subject) {
        super();
        this.clas = clas;
        this.subject = subject;
    }

    public Class getClas() {
        return clas;
    }

    public void setClas(Class clas) {
        this.clas = clas;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void finalize() throws Throwable {

	}

	public String toString(){
		return "";
	}

}