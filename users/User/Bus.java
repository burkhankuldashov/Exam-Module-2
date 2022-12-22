package users.User;

import java.security.PublicKey;
import java.util.Objects;

public class Bus {
    private int id;
    private String name;
    private String number;
    private int numberOfSeats;

    public static int currentId = 0;
    {
        currentId++;
    }

    public Bus() {
    }

    public Bus(int id, String name, String number, int numberOfSeats) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.numberOfSeats = numberOfSeats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return id == bus.id && numberOfSeats == bus.numberOfSeats && Objects.equals(name, bus.name) && Objects.equals(number, bus.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, number, numberOfSeats);
    }
}
