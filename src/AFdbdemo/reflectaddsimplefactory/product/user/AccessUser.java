package AFdbdemo.reflectaddsimplefactory.product.user;

import AFdbdemo.reflectaddsimplefactory.PO.User;

public class AccessUser implements IUser {

    @Override
    public void insert(User user) {
        System.out.println("Access server insert user: " + user);
    }

    @Override
    public User getUser(int id) {
        System.out.println("Access server get user, id is: " + id);
        return new User(0, "default");
    }
}
