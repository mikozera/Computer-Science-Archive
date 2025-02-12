// (c) A+ Computer Science
// www.apluscompsci.com
// Name -

public class Student
{
    private String myName;
    private Grades myGrades;

    public Student() {
        setName("");
        setGrades("");
    }

    public Student(String name, String gradeList) {
        setName(name);
        setGrades(gradeList);
    }

    public void setGrades(String gradeList) {
        myGrades = new Grades(gradeList);
    }

    public void setGrade(int spot, double grade) {
        myGrades.setGrade(spot, grade);
    }

    public String getName() {
        return myName;
    }

    public void setName(String name) {
        myName = name;
    }

    public int getNumGrades() {
        return myGrades.getNumGrades();
    }

    public double getSum() {
        return myGrades.getSum();
    }

    public double getAverage() {
        return myGrades.getSum() / myGrades.getNumGrades();
    }

    public double getAverageMinusLow() {
        return (myGrades.getSum() - myGrades.getLowGrade()) / (myGrades.getNumGrades() - 1);
    }

    public double getHighGrade() {
        return myGrades.getHighGrade();
    }

    public double getLowGrade() {
        return myGrades.getLowGrade();
    }

    public String toString() {
        return myName + " = " + myGrades;
    }
}
