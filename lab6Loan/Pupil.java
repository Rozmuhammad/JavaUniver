package lab6Loan;

public class Pupil extends User {
    public Pupil(Integer id, String name, String surname, String group) {
        super(id, name, surname, group);
    }

    public void check() {
        System.out.println("This is a pupil.");
    }
}
