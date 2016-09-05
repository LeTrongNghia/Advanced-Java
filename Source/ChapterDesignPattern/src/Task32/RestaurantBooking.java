package Task32;

/* @Author: Lê Trọng Nghia
 * @Date: 5/9/2016
 * @Version: V1.0
 */
public class RestaurantBooking implements Booking {

    String fromDate;
    String toDate;
    String location;

    public RestaurantBooking() {
    }

    public RestaurantBooking(String fromDate, String toDate, String location) {
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.location = location;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void book() {
        System.out.println("RestaurantBooking::book()");
        // System.out.println("Booked restaurant" + toString());
    }

    @Override
    public String toString() {
        return "RestaurantBooking{" + "fromDate=" + fromDate + ", toDate=" + toDate + ", location=" + location + '}';
    }

}
