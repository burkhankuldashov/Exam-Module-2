package users.impl;

import users.User.User;
import users.enums.Role;
import users.interfacee.MainMenu;
import users.interfacee.Userr;

import java.util.Scanner;

public class IMainMenu implements MainMenu {
    private static MainMenu mainMenu;

    public static MainMenu  mainMenu(){
        if(mainMenu == null){
            mainMenu = new IMainMenu();
        }
        return mainMenu;
    }
    @Override
    public void startMenu() {
        System.out.println("Welcome to our public bus: ");
        System.out.println("1-> Sign In, 2-> Sign Up");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num == 1) {
            ISignInSignUp.signInSignUp().signIn();
            IMainMenu.mainMenu().startMenu();

        } else if (num == 2) {
            ISignInSignUp.signInSignUp().signUp();
IMainMenu.mainMenu().startMenu();
        }else{
            System.out.println("You entered wrong command!!");

            IMainMenu.mainMenu.startMenu();
        }
    }
}
