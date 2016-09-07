

/*
 * @author Le Trong Nghia
 * @date 6/9/2016
 * @version v1.0
 * @summary this class use to define for Student.
 */
public class Student extends PersonInfo {

	public String birthDay;
	public ListStudentOfSubject m_ListStudentOfSubject;

	
	public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public ListStudentOfSubject getM_ListStudentOfSubject() {
        return m_ListStudentOfSubject;
    }

    public void setM_ListStudentOfSubject(ListStudentOfSubject m_ListStudentOfSubject) {
        this.m_ListStudentOfSubject = m_ListStudentOfSubject;
    }

    public Student(String fullName, String phoneNumber, String email, String birthDay,
            ListStudentOfSubject m_ListStudentOfSubject) {
        super(fullName, phoneNumber, email);
        this.birthDay = birthDay;
        this.m_ListStudentOfSubject = m_ListStudentOfSubject;
    }

	public void finalize() throws Throwable {
		super.finalize();
	}

	public String getListScore(){
		return "";
	}

}