package Task32;

/* @Author: Lê Trọng Nghia
 * @Date: 5/9/2016
 * @Version: V1.0
 */
public class TrainBooking implements Booking {

    String trainDate;
    String trainTime;
    String destination;

    public TrainBooking(String trainDate, String trainTime, String destination) {
        this.trainDate = trainDate;
        this.trainTime = trainTime;
        this.destination = destination;
    }

    public String getTrainDate() {
        return trainDate;
    }

    public void setTrainDate(String trainDate) {
        this.trainDate = trainDate;
    }

    public String getTrainTime() {
        return trainTime;
    }

    public void setTrainTime(String trainTime) {
        this.trainTime = trainTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public TrainBooking() {
    }

    @Override
    public void book() {
        System.out.println("Booked train" + toString());
    }

    @Override
    public String toString() {
        return "TrainBooking{" + "trainDate=" + trainDate + ", trainTime=" + trainTime + ", destination=" + destination + '}';
    }

}
