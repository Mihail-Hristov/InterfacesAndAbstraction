package MilitaryElite;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LieutenantGeneralImpl extends PrivateImp{
    private Set<PrivateImp> priv;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.priv = new HashSet<>();
    }

    public void addPrivate (PrivateImp privateImp){
        this.priv.add(privateImp);
    }
}
