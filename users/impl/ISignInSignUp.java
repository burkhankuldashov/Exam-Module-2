package users.impl;

import users.Storage;
import users.User.User;
import users.enums.Role;
import users.interfacee.SignInSignUp;

import java.util.Scanner;
import static users.enums.Role.*;
public class ISignInSignUp implements SignInSignUp {
    private static ISignInSignUp signInSignUp;

    public static SignInSignUp signInSignUp() {
        if (signInSignUp == null) {
            signInSignUp = new ISignInSignUp();
        }
        return signInSignUp;
    }

    @Override
    public void signIn() {
        System.out.println("Enter your username:");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        System.out.println("Enter your password: ");
        String password = scanner.next();
        User user1 = Storage.userList.stream().filter(user -> user.getLogin().equals(username) && user.getPassword().equals(password)).findFirst().orElse(null);
        if(null != user1){
  if (username.equals("admin")) {
     IAdmin.admin().adminConsole();
 } else if (user1.getRole().equals(USER)) {
     IUsercnsole.userConsole().openUserConsole();
 } else if (user1.getRole().equals(USER)) {
      IDriver.driver().openDriverConsole();
  }else{
      IMainMenu.mainMenu().startMenu();
  }
        }else{
            System.out.println("We have no this user: ");
            IMainMenu.mainMenu().startMenu();
        }
    }

    @Override
    public void signUp() {
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Enter your login: ");
        String logIn = scanner.nextLine();
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();
        User user1 = Storage.userList.stream().filter(user -> user.getLogin().equals(logIn)).findFirst().orElse(null);
        if(user1 == null){
            User user = new User(name,logIn,password,User.currentId(),0d,USER);
            Storage.userList.add(user);
            IUsercnsole.userConsole().openUserConsole();
    }else {
            System.out.println("try again");
            ISignInSignUp.signInSignUp().signUp();
        }
    }

}
