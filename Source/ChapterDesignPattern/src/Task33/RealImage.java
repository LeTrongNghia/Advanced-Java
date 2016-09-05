package Task33;

/* @Author: Lê Trọng Nghia
 * @Date: 5/9/2016
 * @Version: V1.0
 */
public class RealImage implements Image {

    String fileName;

    public RealImage() {
    }

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    //display image after initated it
    @Override
    public void display() {
        System.out.println("Displaying " + fileName); //To change body of generated methods, choose Tools | Templates.
    }

    //load image from disk and assign it to constructor
    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
}
