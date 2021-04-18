package AFdbdemo.reflectaddsimplefactory;

import AFdbdemo.reflectaddsimplefactory.PO.User;
import AFdbdemo.reflectaddsimplefactory.factory.DataAccess;
import AFdbdemo.reflectaddsimplefactory.product.department.IDepartment;
import AFdbdemo.reflectaddsimplefactory.product.user.IUser;

public class DBMain {
    public static void main(String[] args) {
        DataAccess.DB = "Sqlserver";
        IUser user = DataAccess.createUser();
        user.insert(new User(1, "new user" + DataAccess.DB));

        IDepartment department = DataAccess.createDepartment();
        department.getDepartment(0);
    }
}
