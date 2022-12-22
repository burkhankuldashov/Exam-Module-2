package users.User;

import static users.enums.Role.DRIVER;

public class Drivers extends User {

    public Drivers() {
        super("admin", "admin", "admin", User.currentId(), 0d, DRIVER);
    }
}
