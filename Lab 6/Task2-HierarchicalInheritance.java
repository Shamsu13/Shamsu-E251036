
class Person {
    void displayInfo() {
        System.out.println("This is a person.");
    }
}

class Doctor extends Person {
    void doctorInfo() {
        System.out.println("Doctor treats patients and saves lives.");
    }
}

class Teacher extends Person {
    void teacherInfo() {
        System.out.println("Teacher educates students and builds their future.");
    }
}
class Engineer extends Person {
    void engineerInfo() {
        System.out.println("Engineer designs and builds technology and infrastructure.");
}
}
public class HierarchicalInheritance {

    public static void main(String[] args) {
        Doctor d = new Doctor();
        Teacher t = new Teacher();
        Engineer e = new Engineer();
        System.out.println("Doctor Object:");
        d.displayInfo();
        d.doctorInfo();
        System.out.println("\nTeacher Object:");
        t.displayInfo();
        t.teacherInfo();
        System.out.println("\nEngineer Object:");
        e.displayInfo();
        e.engineerInfo();
    }
}
