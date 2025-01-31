package Collection;

import java.util.Comparator;

public class Employee  {

    private int eId;
    private String eName;
    private String position;


    public Employee(int eId, String eName, String position) {
        this.eId = eId;
        this.eName = eName;
        this.position = position;
    }

    public Employee() {
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", eName='" + eName + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

//    @Override
//    public int compare(Employee o1, Employee o2) {
//        return Integer.compare(o1.geteId(), o2.geteId());
//    }
}
