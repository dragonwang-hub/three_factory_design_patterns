package AFdbdemo.abstractfactory.product.user;

import AFdbdemo.abstractfactory.PO.User;

public interface IUser {
    void insert(User user);

    User getUser(int id);
}
