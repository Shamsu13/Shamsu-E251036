
class IDCard {

    String name;
    String id;
    String department;
    String institution;

    IDCard(String name, String id, String department, String institution) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.institution = institution;
    }

    void showID() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Institution: " + institution);
        System.out.println(".................");
    }

    public static void main(String[] args) {
        IDCard myIDCard1 = new IDCard("Shamsu Alam", "E251036", "Computer and Communication Engineering ", "International Islamic University Chittagong ");
        IDCard myIDCard2 = new IDCard("Hatim ", "E251037", "Computer and Communication Engineering", "International Islamic University Chittagon  ");
        myIDCard1.showID();
        myIDCard2.showID();
    }
}
