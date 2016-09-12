package Task3;
/* Author: Lê Trọng Nghia
 * Date: 12/9/2016
 * Version: V1.0
 * Description: use to define for student
 */
public class Student {
    public String name;
    public double avgScore;
    public int age;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getAvgScore() {
        return avgScore;
    }
    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }
    public Student(String name, double avgScore, int age) {
        super();
        this.name = name;
        this.avgScore = avgScore;
        this.age = age;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Name: " + this.name + "\tAvg socre: " + this.avgScore + "\tAge: " + this.age;
    }
}
