package AFdbdemo.abstractfactory.product.department;

import AFdbdemo.abstractfactory.PO.Department;
import AFdbdemo.abstractfactory.PO.User;

public class SqlserverDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("SQL server insert department: " + department);
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("SQL server insert department, department id is: " + id);
        return new Department(0, "default");
    }
}
