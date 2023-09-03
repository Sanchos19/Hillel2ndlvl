package Homework5;

import java.util.Objects;
public class House {
    private int floors;
    private int rooms;
    private String name;
    public House(int floors, int rooms, String name) {
        this.floors = floors;
        this.rooms = rooms;
        this.name = name;
    }
    public int getFloors() {
        return floors;
    }
    public void setFloors(int floors) {
        this.floors = floors;
    }
    public int getRooms() {
        return rooms;
    }
    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return floors == house.floors && rooms == house.rooms && Objects.equals(name, house.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(floors, rooms, name);
    }
}
