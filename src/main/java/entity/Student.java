package entity;

public class Student {
    private String EnrollID;
    private String FisrtName;
    private String LastName;
    private int Age;
    public Student() {
    }

    public Student(String enrollID, String fisrtName, String lastName, int age) {
        EnrollID = enrollID;
        FisrtName = fisrtName;
        LastName = lastName;
        Age = age;
    }

    public String getEnrollID() {
        return EnrollID;
    }

    public void setEnrollID(String enrollID) {
        EnrollID = enrollID;
    }

    public String getFisrtName() {
        return FisrtName;
    }

    public void setFisrtName(String fisrtName) {
        FisrtName = fisrtName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
