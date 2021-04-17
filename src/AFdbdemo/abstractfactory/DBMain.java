package AFdbdemo.abstractfactory;

import AFdbdemo.abstractfactory.PO.Department;
import AFdbdemo.abstractfactory.PO.User;
import AFdbdemo.abstractfactory.factory.AccessFactory;
import AFdbdemo.abstractfactory.factory.IFactory;
import AFdbdemo.abstractfactory.factory.SqlserverFactory;
import AFdbdemo.abstractfactory.product.department.IDepartment;
import AFdbdemo.abstractfactory.product.user.IUser;

public class DBMain {
    public static void main(String[] args) {
//        IFactory iFactory = new SqlserverFactory();
        IFactory iFactory = new AccessFactory();
        IUser user = iFactory.createUser();
        user.insert(new User(1, "insert"));
        user.getUser(0);

        IDepartment department = iFactory.createDepartment();
        department.insert(new Department(1, "insert"));
        department.getDepartment(0);
    }
}
