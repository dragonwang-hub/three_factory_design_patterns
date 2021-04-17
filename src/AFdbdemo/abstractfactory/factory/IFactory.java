package AFdbdemo.abstractfactory.factory;


import AFdbdemo.abstractfactory.product.department.IDepartment;
import AFdbdemo.abstractfactory.product.user.IUser;

public interface IFactory {
    IUser createUser();
    IDepartment createDepartment();
}
