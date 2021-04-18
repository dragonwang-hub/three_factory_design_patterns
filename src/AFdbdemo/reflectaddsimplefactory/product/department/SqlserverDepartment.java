package AFdbdemo.reflectaddsimplefactory.product.department;

import AFdbdemo.reflectaddsimplefactory.PO.Department;

public class SqlserverDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("SQL server insert department: " + department);
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("SQL server get department, department id is: " + id);
        return new Department(0, "default");
    }
}
