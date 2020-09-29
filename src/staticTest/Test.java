package staticTest;

public class Test {
    public static void main(String[] args) {

        Student.university = "daxue";

        Student s1 = new Student();
        s1.name = "spf";
        s1.age = 24;
//        s1.university = "daxue";

        s1.show();

        Student s2 = new Student();
        s2.name = "lll";
        s2.age = 20;
//        s2.university = "daxue";

        s2.show();
    }
}
