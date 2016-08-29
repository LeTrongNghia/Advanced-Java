package Task19;

/*
 * @author Le Trong Nghia
 * @version 1.0
 * @created 29-Aug-2016 8:37:41 AM
 * @summary use to define for Card
 */
public class Card extends PersonalInformation{

	public String cardID;
	public String vertificationType;
	public Order order;

	public Card(String cardID, String vertificationType, Order order) {
        super();
        this.cardID = cardID;
        this.vertificationType = vertificationType;
        this.order = order;
    }
    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public String getVertificationType() {
        return vertificationType;
    }

    public void setVertificationType(String vertificationType) {
        this.vertificationType = vertificationType;
    }

    public Order getM_Order() {
        return order;
    }

    public void setM_Order(Order m_Order) {
        this.order = m_Order;
    }

    public Card(){

	}

	public void finalize() throws Throwable {

	}

	/*
	 * use to pay for total money
	 */
	public double pay(){
		return 0;
	}

}