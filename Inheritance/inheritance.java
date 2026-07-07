
// parent class
class Employee{ 
    String employeeName;
    int employeeID;
    double salary;

    

    void displayEmployee(){
        System.out.println("Employee Details: ");
        System.out.println("Employee ID: "+ employeeID);
        System.out.println("Employee Name: "+ employeeName);
        System.out.println("Employee Salary: "+ salary);
    }
}

class Developer extends Employee{
    String programmingLanguage;
    int experience;

    void displayDeveloper(){
        displayEmployee();
        System.out.println("Role: Developer");
        System.out.println("Programming Language: "+ programmingLanguage);
        System.out.println("Employee Experience (years): "+ experience);
        System.out.println();
    }


}

class Manager extends Employee{
    String department;
    int teamSize;

    void displayManager(){
        displayEmployee();
        System.out.println("Role: Manager");
        System.out.println("Manager Department: "+ department);
        System.out.println("Team Size: "+ teamSize);
        System.out.println();
    }
}

public class inheritance {
    public static void main(String[] args){
        Developer dev1 = new Developer();
        Developer dev2 = new Developer();
        Manager m1 = new Manager();
        Manager m2 = new Manager();

        dev1.employeeID = 101;
        dev2.employeeID = 102;
        m1.employeeID = 103;
        m2.employeeID = 104;

        dev1.employeeName = "Sanjana";
        dev2.employeeName = "Harsh";
        m1.employeeName = "Radha";
        m2.employeeName = "Mahek";

        dev1.salary = 20000;
        dev2.salary = 25000;
        m1.salary = 30000;
        m2.salary = 35000;

        dev1.programmingLanguage = "Java";
        dev2.programmingLanguage = "Pythom";

        dev1.experience = 2;
        dev2.experience = 3;

        m1.department = "Finance";
        m2.department = "Account";

        m1.teamSize = 15;
        m2.teamSize = 10;

        dev1.displayDeveloper();
        dev2.displayDeveloper();

        m1.displayManager();
        m2.displayManager();
        
    }
}
