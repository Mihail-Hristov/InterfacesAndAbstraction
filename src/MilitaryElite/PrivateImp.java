package MilitaryElite;

public class PrivateImp extends SoldierImp{
    private double salary;

    public PrivateImp (int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }
}
