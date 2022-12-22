package users.impl;

import users.Storage;
import users.User.Bus;
import users.User.Drivers;
import users.User.User;
import users.enums.Role;
import users.interfacee.Admin;

import java.util.Scanner;

public class IAdmin implements Admin {
    private static Admin admin;

    public static Admin admin() {
        if (admin == null) {
            admin = new IAdmin();
        }
        return admin;
    }

    @Override
    public void adminConsole() {
        System.out.println("Welcome admin :)");
        System.out.println("1-> add new driver, 2-> add new bus, 3-> add new line, 4-> buses aviable or sold, 0-> exit");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 1) {
            driver();
        } else if (num == 2) {
            addNewBus();
        } else if (num == 3) {
            //add new line
        } else if (num == 4) {
            //buses
        } else if (num == 0) {
            IMainMenu.mainMenu().startMenu();
        } else {
            System.out.println("you entered wrong command!!!");
            IMainMenu.mainMenu().startMenu();
        }
    }

    private static void driver() {
        System.out.println("Add driver!!!! ");
        System.out.println("Driver name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Driver username: ");
        String userName = scanner.next();
        System.out.println("Password: ");
        String password = scanner.next();
       User user1 = new User(name,userName,password,User.currentId(),0d, Role.DRIVER);
        Storage.driversList.add((Drivers) user1);
        System.out.println("Added driver");
         IAdmin.admin().adminConsole();

    }


    private static void addNewBus() {
        System.out.println("Bus name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Bus number: ");
        String number = scanner.nextLine();
        System.out.println("Bus of seats: ");
        int seats = scanner.nextInt();
        Bus bus2 = Storage.busList.stream().filter(bus -> bus.getNumber().equals(number)).findFirst().orElse(null);
        if (bus2 == null) {
            Bus bus1 = new Bus(Bus.currentId, name, number, seats);
            Storage.busList.add(bus1);
            System.out.println("added bus");
        } else {
            System.out.println("We have this bus!!!");
            addNewBus();
        }
    }
}

