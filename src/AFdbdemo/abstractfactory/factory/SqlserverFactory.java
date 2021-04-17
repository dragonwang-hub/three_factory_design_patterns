package AFdbdemo.abstractfactory.factory;

import AFdbdemo.abstractfactory.product.department.SqlserverDepartment;
import AFdbdemo.abstractfactory.product.user.IUser;
import AFdbdemo.abstractfactory.product.department.IDepartment;
import AFdbdemo.abstractfactory.product.user.SqlserveUser;

public class SqlserverFactory implements IFactory{

    @Override
    public IUser createUser() {
        return new SqlserveUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlserverDepartment();
    }
}
