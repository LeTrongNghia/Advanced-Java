package Task33;

/* @Author: Lê Trọng Nghia
 * @Date: 5/9/2016
 * @Version: V1.0
 */
public class ProxyImage implements Image {

    RealImage realImage;
    String filename;

    public ProxyImage() {
    }

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    //init a real image if it has not been initated then display
    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
