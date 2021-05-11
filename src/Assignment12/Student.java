package Assignment12;

public class Student {
    private int id, age, enrollmentYear;
    private String name,gender,department;
    private double perTillDate;

    public Student(int id, String name, int age, String gender, String department, int enrollmentYear, double perTillDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.enrollmentYear = enrollmentYear;
        this.perTillDate = perTillDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getEnrollmentYear() {
        return enrollmentYear;
    }

    public void setEnrollmentYear(int enrollmentYear) {
        this.enrollmentYear = enrollmentYear;
    }

    public double getPerTillDate() {
        return perTillDate;
    }

    public void setPerTillDate(double perTillDate) {
        this.perTillDate = perTillDate;
    }

    @Override
    public String toString(){
        return "[ " +id+" " + name + " " +age+" "+ gender + " "+  department+" "+ enrollmentYear+ " " +perTillDate+" ]";
    }
}
