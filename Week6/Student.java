package Week6;

class Student {
    String name;
    double attendance;

    static String collegeName = "SRMIST";
    static int studentCount = 0;

    Student(String name, double attendance) {
        this.name = name;
        this.attendance = attendance;
        studentCount++;
    }

    static void printCollegeInfo() {
        System.out.println("College: " + collegeName);
        System.out.println("Total Students: " + studentCount);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ravi", 85.5);
        Student s2 = new Student("Anitha", 90.0);

        System.out.println(s1.name + " " + s1.attendance);
        System.out.println(s2.name + " " + s2.attendance);

        Student.printCollegeInfo();
    }
}