package Task31;

/**
 * @author SockLaoGia
 * @version 1.0
 * @created 01-Sep-2016 2:12:40 PM
 */
public class FactoryMorden implements Factory {

	public Modern m_Modern;

	public FactoryMorden(){
	    
	}

	public void finalize() throws Throwable {

	}

	/*
	 * return modern
	 */
	public AoDai sew(){
	    return new Modern();
	}

}