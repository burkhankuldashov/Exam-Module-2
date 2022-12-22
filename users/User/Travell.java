package users.User;

import java.util.Objects;

public class Travell {
String places;
String data;
String name;
String bus;

    public Travell() {
    }

    public Travell(String places, String data, String name, String bus) {
        this.places = places;
        this.data = data;
        this.name = name;
        this.bus = bus;
    }

    public String getPlaces() {
        return places;
    }

    public void setPlaces(String places) {
        this.places = places;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    @Override
    public String toString() {
        return "Travell{" +
                "places='" + places + '\'' +
                ", data='" + data + '\'' +
                ", name='" + name + '\'' +
                ", bus='" + bus + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Travell travell = (Travell) o;
        return Objects.equals(places, travell.places) && Objects.equals(data, travell.data) && Objects.equals(name, travell.name) && Objects.equals(bus, travell.bus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(places, data, name, bus);
    }
}
