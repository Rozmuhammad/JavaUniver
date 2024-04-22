package lab6Loan;

public class Student extends User {
    public Student(Integer id, String name, String surname, String group) {
        super(id, name, surname, group);
    }

    public void check() {
        System.out.println("This is a student.");
    }
}
