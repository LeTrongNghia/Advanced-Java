package Task28;
/* @Author: Lê Trọng Nghia
 * @Date: 5/9/2016
 * @Version: V1.0
 */

public class MobileObserver extends Observer{
    public MobileObserver(Account account) {
        this.account = account;
        this.account.attach(this);;
       
    }
    
    /*
     * (non-Javadoc)
     * @see Task28.Observer#update()
     */
    @Override
    public String update() {
        // TODO Auto-generated method stub
        return "Mobi:Hello.Your acount was been changed.\nAmount: " + account.getState() + "vnd";
    }
    
}
