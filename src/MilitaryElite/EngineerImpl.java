package MilitaryElite;

import java.util.HashSet;
import java.util.Set;

public class EngineerImpl extends SpecialisedSoldierImpl{
    private Set<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary, String corps, String partName, int hoursWorked) {
        super(id, firstName, lastName, salary);
        this.repairs = new HashSet<>();
    }

    public void addRepair(Repair repair) {
        this.repairs.add(repair);
    }

    public Set<Repair> getRepairs() {
    return this.repairs;
    }
}
