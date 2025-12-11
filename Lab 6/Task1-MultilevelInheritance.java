
class Grandfather {

    void company() {
        System.out.println("Grandfather has a business company.");
    }
}

class Father extends Grandfather {

    void car() {
        System.out.println("Father owns a car.");
    }
}

class Son extends Father {

    void house() {
        System.out.println("Son owns a beautiful house.");
    }
}

public class MultilevelInheritance {

    public static void main(String[] args) {
        Son s = new Son();
        s.company();
        s.car();
        s.house();
    }
}
