package AFdbdemo.reflectaddsimplefactory.product.user;

import AFdbdemo.reflectaddsimplefactory.PO.User;

public class SqlserverUser implements IUser {

    @Override
    public void insert(User user) {
        System.out.println("SQL server insert user: " + user);
    }

    @Override
    public User getUser(int id) {
        System.out.println("SQL server get user, id is: " + id);
        return new User(0, "default");
    }
}
