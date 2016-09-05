package Task32;

/* @Author: Lê Trọng Nghia
 * @Date: 5/9/2016
 * @Version: V1.0
 */
public class FlightBooking implements Booking {

    String flyDate;
    String flyTime;
    String destination;

    public FlightBooking() {
    }

    public FlightBooking(String flyDate, String flyTime, String destination) {
        this.flyDate = flyDate;
        this.flyTime = flyTime;
        this.destination = destination;
    }

    public void setFlyDate(String flyDate) {
        this.flyDate = flyDate;
    }

    public void setFlyTime(String flyTime) {
        this.flyTime = flyTime;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public void book() {
        System.out.println("Booked flight " + toString());
    }

    @Override
    public String toString() {
        return "FlightBooking{" + "flyDate=" + flyDate + ", flyTime=" + flyTime + ", destination=" + destination + '}';
    }

}
