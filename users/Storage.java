package users;

import users.User.Bus;
import users.User.Drivers;
import users.User.User;


import java.util.ArrayList;
import java.util.List;

public class Storage {
   public static List<User> userList = new ArrayList<>();
  public static List<Bus> busList = new ArrayList<>();

  public static List<Drivers> driversList = new ArrayList<>();
public static List<Bus> bookingBusSeat = new ArrayList<>();
}
