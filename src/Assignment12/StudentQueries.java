package Assignment12;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentQueries {
    static ArrayList<Student> students=new ArrayList<>();

    public static void main(String[] args) {
        addStudents();
        printDepartmentNames();
        getNamesEnrolledAfter2018();
        getMaleStudentsInComputerScience();
        countMaleFemaleStudents();
        getAverageAgeByGender();
        getHighestPercentageStudent();
        countStudentsByDepartment();
        getAveragePercentageByDepartment();
        getYoungestMaleInElectronic();
        countMaleFemaleInComputerScience();
    }

    public static void printDepartmentNames() {
        System.out.println("*** Names of all departments in the college ***");
        Stream<Student> stream = students.stream();
        stream.map(Student::getDepartment)
                .distinct()
                .forEach(System.out::println);
    }

    public static void getNamesEnrolledAfter2018() {
        System.out.println("*** Names of all students who have enrolled after 2018 ***");
        Stream<Student> stream = students.stream();
        stream.filter(student->student.getEnrollmentYear()>2018)
                .map(Student::getName)
                .forEach(System.out::println);
    }

    public static void getMaleStudentsInComputerScience(){
        System.out.println("*** Details of all male students in the computer science department ***");
        Stream<Student> stream = students.stream();
        stream.filter(student -> student.getGender().equals("Male") && student.getDepartment().equals("Computer Science"))
                .forEach(System.out::println);
    }

    public static void countMaleFemaleStudents(){
        System.out.println("*** Number of male and female students ***");
        Stream<Student> stream = students.stream();
        stream.collect(Collectors.groupingBy( Student::getGender, Collectors.counting()))
                .forEach((gender,count)->System.out.println(gender+" : "+count));
    }

    public static void getAverageAgeByGender(){
        System.out.println("*** The average age of male and female students ***");
        Stream<Student> stream = students.stream();
        stream.collect(Collectors.groupingBy(Student::getGender,
                        Collectors.averagingInt(Student::getAge)))
                .forEach((gender,averageAge)-> System.out.println(gender+" : "+averageAge));
    }

    public static void getHighestPercentageStudent() {
        System.out.println("*** The details of highest student having highest percentage ***");
        Stream<Student> stream = students.stream();
        stream.max(Comparator.comparingDouble(Student::getPerTillDate))
                .ifPresent(System.out::println);
    }

    public static void countStudentsByDepartment(){
        System.out.println("*** The number of students in each department ***");
        Stream<Student> stream = students.stream();
        stream.collect(Collectors.groupingBy( Student::getDepartment, Collectors.counting()))
                .forEach((department,count)-> System.out.println(department+" : "+count));

    }

    public static void getAveragePercentageByDepartment(){
        System.out.println("*** The average percentage achieved in each department ***");
        Stream<Student> stream = students.stream();
        stream.collect(Collectors.groupingBy(Student::getDepartment,
                        Collectors.averagingDouble(Student::getPerTillDate)))
                .forEach((department,average)-> System.out.println(department+" : "+average));

    }

    public static void getYoungestMaleInElectronic(){
        System.out.println("*** The details of youngest male student in the Electronic department ***");
        Stream<Student> stream = students.stream();
        stream.filter(student -> student.getDepartment().equals("Electronic") && student.getGender().equals("Male"))
                .collect(Collectors.minBy(Comparator.comparingInt(Student::getAge)))
                .ifPresent(System.out::println);
    }

    public static void countMaleFemaleInComputerScience(){
        System.out.println("*** Number of male and female students in the computer science department ***");
        Stream<Student> stream = students.stream();
        stream.filter(student -> student.getDepartment().equals("Computer Science"))
                .collect(Collectors.groupingBy(Student::getGender, Collectors.counting()))
                .forEach((gender,count)-> System.out.println(gender+" : "+count));

    }

    public static void addStudents() {
        students.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        students.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        students.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        students.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        students.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        students.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        students.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        students.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        students.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        students.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        students.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        students.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        students.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        students.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        students.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        students.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        students.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));
    }
}
