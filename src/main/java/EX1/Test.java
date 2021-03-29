package EX1;

import java.util.Date;

public class Test {
    static int numStudent = 0;
    static int male = 0;
    static final int MAX = 10;

    public static void main(String[] args) {
        Student student = new Student(1, "viet", "12/04/2000", 'm');
        Student student1 = new Student(2, "quoc anh", "08/09/2000", 'm');
        Student student2 = new Student(3, "thanh", "22/11/2004", 'm');
        Student student3 = new Student(4, "ngoc", "14/05/2000", 'f');
        Student student4 = new Student(5, "nga", "15/03/2000", 'f');
        Student student5 = new Student(6, "nam", "15/03/2000", 'm');

        Student[] arr = new Student[MAX];
        addStudent(student, arr);
        addStudent(student1, arr);
        addStudent(student2, arr);
        addStudent(student3, arr);
        addStudent(student4, arr);
        addStudent(student5, arr);
        addStudent(new Student(7, "lam", "15/03/2000", 'm'), arr);

        System.out.println(getAge(student2));

        printAllByYear(2004, arr);

        double rate = (double) male / numStudent * 100;
        System.out.println("\nPercentage of male students: " + rate + "%");
        System.out.println("");
    }

    private static void printAllByYear(int birthYear, Student[] arr) {
        for (int i = 0; i < numStudent; i++) {
            int sYear = Integer.parseInt(arr[i].getDOB().substring(6, 10));
            if (sYear == birthYear) {
                arr[i].print();
            }
        }
    }

    private static void addStudent(Student student, Student[] arr) {
        if (numStudent >= arr.length) {
            System.out.println("Can not add student. The number of students has reached maximum!");
        } else {
            arr[numStudent] = student;
            numStudent++;
            if (student.getGender() == 'm')
                male++;
        }
    }

    private static void showAllStudent(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i].print();
        }
    }

    private static int getAge(Student student) {
        Date d = new Date();
        int recentYear = d.getYear() + 1900;
        int birthYear = Integer.parseInt(student.getDOB().substring(6, 10));
        int age = recentYear - birthYear;
        return age;
    }

}
