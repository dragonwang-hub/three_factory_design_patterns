package AFdbdemo.reflectaddsimplefactory.factory;


import AFdbdemo.reflectaddsimplefactory.product.department.IDepartment;
import AFdbdemo.reflectaddsimplefactory.product.user.IUser;

public class DataAccess {

    public static String DB = "";

    public static IUser createUser() {
        String classFullName = "AFdbdemo.reflectaddsimplefactory.product.user." + DB + "User";
        IUser iUser = null;
        try {
            iUser = (IUser) Class.forName(classFullName).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to Create User Table, DB is" + DB);
        }
        return iUser;
    }

    public static IDepartment createDepartment() {
        String classFullName = "AFdbdemo.reflectaddsimplefactory.product.department." + DB + "Department";
        IDepartment iDepartment = null;
        try {
            iDepartment = (IDepartment) Class.forName(classFullName).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to Create Department Table, DB is" + DB);
        }
        return iDepartment;
    }
}
