package AFdbdemo.abstractfactory.factory;

import AFdbdemo.abstractfactory.product.department.AccessDepartment;
import AFdbdemo.abstractfactory.product.department.IDepartment;
import AFdbdemo.abstractfactory.product.user.AccessUser;
import AFdbdemo.abstractfactory.product.user.IUser;

public class AccessFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }
}
