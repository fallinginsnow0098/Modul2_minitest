package week4._Model;

public class Student extends Human{
    private double mathPoint, physicsPoint, chemistryPoint ;

    public Student(int id, String name, int age, double mathPoint, double physicsPoint, double chemistryPoint) {
        super(id, name, age);
        this.mathPoint = mathPoint;
        this.physicsPoint = physicsPoint;
        this.chemistryPoint = chemistryPoint;
    }

    public double getMathPoint() {
        return mathPoint;
    }

    public void setMathPoint(double mathPoint) {
        this.mathPoint = mathPoint;
    }

    public double getPhysicsPoint() {
        return physicsPoint;
    }

    public void setPhysicsPoint(double physicsPoint) {
        this.physicsPoint = physicsPoint;
    }

    public double getChemistryPoint() {
        return chemistryPoint;
    }

    public void setChemistryPoint(double chemistryPoint) {
        this.chemistryPoint = chemistryPoint;
    }
    public double getGPA(){
        return (mathPoint + chemistryPoint + physicsPoint) / 3 ;
    }

    @Override
    public String toString() {
        return " Student [" + super.toString() +
                "|| mathPoint = " + mathPoint +
                "|| physicsPoint = " + physicsPoint +
                "|| chemistryPoint = " + chemistryPoint ;
    }
}
