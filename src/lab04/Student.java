package lab04;

public class Student extends Person {
    private long uniRollNumber;
    private double currentCPI;

    public Student(String name, int age, char gender, long uniRollNumber, double currentCPI) {
        super(name, age, gender); //Person(name, age, gender);
        this.currentCPI = currentCPI;
        this.uniRollNumber = uniRollNumber;
    }

    public long getUniRollNumber() {
        return uniRollNumber;
    }

    public void setUniRollNumber(long uniRollNumber) {
        this.uniRollNumber = uniRollNumber;
    }

    public double getCurrentCPI() {
        return currentCPI;
    }

    public void setCurrentCPI(double currentCPI) {
        this.currentCPI = currentCPI;
    }


}
