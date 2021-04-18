package AFdbdemo.reflectaddsimplefactory;

import AFdbdemo.reflectaddsimplefactory.PO.User;
import AFdbdemo.reflectaddsimplefactory.factory.DataAccess;
import AFdbdemo.reflectaddsimplefactory.product.department.IDepartment;
import AFdbdemo.reflectaddsimplefactory.product.user.IUser;
import com.sun.org.apache.xml.internal.security.Init;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DBMain {
    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/AFdbdemo/reflectaddsimplefactory/setting.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        DataAccess.DB = properties.getProperty("DB");
    }

    public static void main(String[] args) {
        IUser user = DataAccess.createUser();
        user.insert(new User(1, "new user" + DataAccess.DB));

        IDepartment department = DataAccess.createDepartment();
        department.getDepartment(0);
    }
}
