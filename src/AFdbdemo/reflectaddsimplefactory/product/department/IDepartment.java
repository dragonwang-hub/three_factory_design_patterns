package AFdbdemo.reflectaddsimplefactory.product.department;

import AFdbdemo.reflectaddsimplefactory.PO.Department;

public interface IDepartment {
    void insert(Department department);

    Department getDepartment(int id);
}
