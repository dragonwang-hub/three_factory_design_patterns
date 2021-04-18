package AFdbdemo.reflectaddsimplefactory.product.user;

import AFdbdemo.reflectaddsimplefactory.PO.User;

public interface IUser {
    void insert(User user);

    User getUser(int id);
}
