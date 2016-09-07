

/**
 * @author Le Trong Nghia
 * @version 1.0
 * @created 06-Sep-2016
 */
public class Subject {

	public String endDate;
	public String name;
	public int noGeneral;
	public String startDate;
	public Score m_Score;
	public ListStudentOfSubject m_ListStudentOfSubject;
	public SubjectOfClass m_SubjectOfClass;

	public Subject(){

	}

	public void finalize() throws Throwable {

	}

	public String getListClass(){
		return "";
	}

}