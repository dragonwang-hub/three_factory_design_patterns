package AFdbdemo.reflectaddsimplefactory.product.department;

import AFdbdemo.reflectaddsimplefactory.PO.Department;


public class AccessDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("Access server insert department: " + department);
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("Access server get department, department id is: " + id);
        return new Department(0, "default");
    }
}
