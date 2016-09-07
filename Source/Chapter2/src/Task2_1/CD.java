package Task2_1;
/* Author: Lê Trọng Nghia
 * Date: 7/9/2016
 * Version: V1.0
 * Description: this class use to define for CD
 */
public class CD implements Comparable<CD> {
    public String id;
    public String name;
    public String Singer;
    public int numberOfSong;
    public double price;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSinger() {
        return Singer;
    }
    public void setSinger(String singer) {
        Singer = singer;
    }
    public int getNumberOfSong() {
        return numberOfSong;
    }
    public void setNumberOfSong(int numberOfSong) {
        this.numberOfSong = numberOfSong;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
    public CD(String id, String name, String singer, int numberOfSong, double price) {
        super();
        this.id = id;
        this.name = name;
        Singer = singer;
        this.numberOfSong = numberOfSong;
        this.price = price;
    }
    
    /*
     * use to print information CD
     * return String
     */
    public String toString(){
        return "ID: " + this.id + "\nName: " + this.name + "\nSinger: " + this.Singer + "\nPrice: " + this.price;
    }
    
    /*
     * use to compare CD allow name
     * return int
     */
    @Override
    public int compareTo(CD cd) {
        return (this.name).compareTo(cd.name);
    }
 
    
  
}
