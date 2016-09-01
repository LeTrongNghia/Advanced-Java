package Task31;

/**
 * @author SockLaoGia
 * @version 1.0
 * @created 01-Sep-2016 2:12:41 PM
 */
public class FactoryTraditional implements Factory {

	public Traditional m_Traditional;

	public FactoryTraditional(){

	}

	public void finalize() throws Throwable {

	}

	/*
	 * return Traditional
	 */
	public AoDai sew(){
	    return new Traditional();
	}

}