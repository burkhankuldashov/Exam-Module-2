package users.impl;

import users.Storage;
import users.User.User;
import users.interfacee.Driverr;

import java.sql.Driver;
import java.util.Scanner;

public class IDriver implements Driverr {
private static IDriver driver;
public static IDriver driver(){
    if(driver == null){
        driver = new IDriver();
    }
    return driver;
}

    @Override
    public void openDriverConsole() {
        System.out.println("Welcome to driver");
        System.out.println("1-driver list, 0-exit");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num == 1){

        } else if (num == 0) {
            IMainMenu.mainMenu().startMenu();
        }else {
            System.out.println("You entered wrong command!!");
        }
    }
}
