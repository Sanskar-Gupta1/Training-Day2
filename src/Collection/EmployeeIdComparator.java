package Collection;

import java.util.Comparator;

public class EmployeeIdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.geteId(), o2.geteId());
    }
}
