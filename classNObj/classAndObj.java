class Student{
    String name;
    int age;
    int roll_no;
    String grade;
}

public class classAndObj {
    public static void main(String[] args){
        // Student Information System
        Student s1 = new Student(); // object of student class
        s1.name = "Sanjana";
        s1.age = 22;
        s1.roll_no = 72;
        s1.grade = "A";

        Student s2 = new Student(); // object of student class
        s2.name = "Radha";
        s2.age = 18;
        s2.roll_no = 38;
        s2.grade = "A+";

        Student s3 = new Student(); // object of student class
        s3.name = "Harsh";
        s3.age = 23;
        s3.roll_no = 63;
        s3.grade = "O";

        System.out.println("Student --> Grade");
        System.out.println(s1.name +" --> " + s1.grade);
        System.out.println(s2.name +" --> " + s2.grade);
        System.out.println(s3.name +" --> " + s3.grade);
        

    }
}
