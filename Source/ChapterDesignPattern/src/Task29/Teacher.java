package Task29;
/* Author: Lê Trọng Nghia
 * Date: 1/9/2016
 * Version: V1.0
 * Description: this class define for teacher singleton
 */
public class Teacher {
    private static Teacher A = new Teacher();
    
    private Teacher() {
        
    }
    
    /*
     * use to get instance
     */
    public static Teacher getInstance() {
        return A;
    }
    
    /*
     * use to return share document
     */
    public String shareDocument() {
        return "Document: \n-Chapter1\n-Chapter2\n-Chapter3\n...";
    }
}
