package users.impl;

import users.Storage;
import users.interfacee.Travvel;

public class ITravel implements Travvel {
    @Override
    public void travels() {
        System.out.println("Travels");
        Storage.bookingBusSeat.forEach(System.out::println);
        System.out.println("We go this buses");
    }
}
