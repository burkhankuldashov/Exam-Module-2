package users.impl;

import users.Storage;
import users.User.Bus;
import users.User.User;
import users.interfacee.UserConsole;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class IUsercnsole implements UserConsole {

    private static IUsercnsole usercnsole;

    public static UserConsole userConsole() {
        if (usercnsole == null) {
            usercnsole = new IUsercnsole();
        }
        return usercnsole;
    }

    @Override
    public void openUserConsole() {
        System.out.println("User console: ");
        System.out.println("1-> Travel list,2- history, 0-> exit");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 1) {
            System.out.println("1- bus list,0- exit");
            int sum = scanner.nextInt();
            if (sum == 1) {
                Storage.busList.forEach(System.out::println);
                System.out.println("Choose bus: ");
                int numm = scanner.nextInt();
                System.out.print("Free seats: ");
                System.out.println(Storage.busList.get(numm).getNumberOfSeats());
                System.out.println("Choose free seats: ");
                int seat = scanner.nextInt();
                Bus bus = Storage.busList.get(numm);
                Bus bus1 = new Bus(bus.getId(), bus.getName(), bus.getNumber(), bus.getNumberOfSeats() - seat);
                Storage.bookingBusSeat.add(bus1);
                int i = Storage.busList.get(numm).getNumberOfSeats() - seat;
                Storage.busList.get(numm).setNumberOfSeats(i);
            }
        } else if (num == 0) {
            IMainMenu.mainMenu().startMenu();
        } else if (num == 2) {
            Storage.bookingBusSeat.forEach(System.out::println);
        } else {
            System.out.println("You entered wrong command!!");
            IMainMenu.mainMenu().startMenu();
        }
    }
}
