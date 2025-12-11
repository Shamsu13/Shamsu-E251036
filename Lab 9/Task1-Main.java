class Student {

    private String name;
    private String id;
    private double cgpa;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class Main {

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Shamsu Alam");
        s.setId("CCE-2104010");
        s.setCgpa(3.85);
        System.out.println("Student Name: " + s.getName());
        System.out.println("Student ID: " + s.getId());
        System.out.println("Student CGPA: " + s.getCgpa());
    }
}
