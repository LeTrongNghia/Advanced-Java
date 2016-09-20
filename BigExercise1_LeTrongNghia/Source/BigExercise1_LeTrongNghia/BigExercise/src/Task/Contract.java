package Task;


/**
 * @author: Lê Trọng Nghĩa
 * @date: 6-9-2016
 * @version: 1.0
 * @description: class for contract
 */
public class Contract {

    private String endDate;
    private String id;
    private String startDate;
    public Class classRoom;

    public Contract() {

    }

    public Contract(String endDate, String id, String startDate, Class classRoom) {
        this.endDate = endDate;
        this.id = id;
        this.startDate = startDate;
        this.classRoom = classRoom;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Class getclassRoom() {
        return classRoom;
    }

    public void setclassRoom(Class classRoom) {
        this.classRoom = classRoom;
    }

    public void finalize() throws Throwable {

    }

    @Override
    public String toString() {
        return "Contract id: " + this.id + "\tStart date: " + this.startDate + "\tEnd date: " + this.endDate;
    }

}
