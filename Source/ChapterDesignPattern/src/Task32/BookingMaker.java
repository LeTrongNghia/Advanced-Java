package Task32;

/* @Author: Lê Trọng Nghia
 * @Date: 5/9/2016
 * @Version: V1.0
 */
public class BookingMaker {

    FlightBooking flight;
    RestaurantBooking restaurant;
    TrainBooking train;

    public BookingMaker() {
        flight = new FlightBooking();
        restaurant = new RestaurantBooking();
        train = new TrainBooking();
    }

    public void bookTrain(String trainDate, String trainTime, String destination) {
        train.setTrainDate(trainDate);
        train.setTrainTime(trainDate);
        train.setDestination(destination);
        train.book();
    }

    public void bookRestaurant(String fromDate, String toDate, String location) {
        restaurant.setFromDate(fromDate);
        restaurant.setToDate(toDate);
        restaurant.setLocation(location);
        restaurant.book();
    }

    public void bookFlight(String flyDate, String flyTime, String destination) {
        flight.setFlyDate(flyDate);
        flight.setFlyTime(flyTime);
        flight.setDestination(destination);
        flight.book();
    }
}
