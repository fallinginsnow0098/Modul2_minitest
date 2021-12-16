package week2.bai1;

import java.util.Comparator;

public class Student extends Human {
    public double averagePoint ;

//    public Student() {
//    }

    public Student(int id, String name, int age, double averagePoint) {
        super(id, name, age);
        this.averagePoint = averagePoint;
    }

    public double getAveragePoint() {
        return averagePoint;
    }

    public void setAveragePoint(double averagePoint) {
        this.averagePoint = averagePoint;
    }

}
