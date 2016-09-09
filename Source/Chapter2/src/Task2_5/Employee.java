package Task2_5;
/* Author: Lê Trọng Nghia
 * Date: 8/9/2016
 * Version: V1.0
 * Description: use to define for employee
 */

public class Employee implements Comparable<Employee>{
    public String name;
    public int age;
    public long salary;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    
    public Employee(String name, int age, long salary) {
        super();
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    /*
     * use to print information employee
     */
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Name: " + this.name + "\nAge: " + this.age + "\nSalary: " + this.salary;
    }
    
    /*
     * use to compare employee allow salary
     */
    @Override
    public int compareTo(Employee o) {
        // TODO Auto-generated method stub
        long result = this.salary - o.salary;
        if (result > 0)
            return -1;
        if (result < 0)
            return 1;
        return 0;
    }
}
