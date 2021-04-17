package AFdbdemo.abstractfactory.product.department;

import AFdbdemo.abstractfactory.PO.Department;
import AFdbdemo.abstractfactory.PO.User;

public interface IDepartment {
    void insert(Department department);

    Department getDepartment(int id);
}
