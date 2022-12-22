package users.User;

import javax.management.relation.Role;
import java.util.Objects;

public class User {
    private String name;
    private String login;
    private String password;
    private int id;
    private double balance;
    private Role role;

   public static int currentId() {
       int currentId = 0;
      return currentId++;
    }

    public User(String admin, String login, String password, int currentId, double balance, users.enums.Role role) {
    }

    public User(String name, String login, String password, int id, double balance, Role role) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.id = id;
        this.balance = balance;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin() {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword() {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                ", balance=" + balance +
                ", role=" + role +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Double.compare(user.balance, balance) == 0 && Objects.equals(name, user.name) && Objects.equals(login, user.login) && Objects.equals(password, user.password) && Objects.equals(role, user.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, login, password, id, balance, role);
    }
}
