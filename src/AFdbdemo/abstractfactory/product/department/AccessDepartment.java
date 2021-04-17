package AFdbdemo.abstractfactory.product.department;

import AFdbdemo.abstractfactory.PO.Department;

public class AccessDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("Access server insert department: " + department);
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("Access server insert department, department id is: " + id);
        return new Department(0, "default");
    }
}
