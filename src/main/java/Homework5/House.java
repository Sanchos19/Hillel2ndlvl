package Homework5;

import java.util.Objects;
public class House {
    private int floors;
    private int rooms;
    private String name;
    private House(Builder builder) {
        this.floors = floors;
        this.rooms = rooms;
        this.name = name;
    }
    @Override
    public String toString() {return "floors=" + floors + ", rooms=" + rooms + ", name='" + name ;}
    static class Builder{
        private int floors;
        private int rooms;
        private String name;

        public Builder(String name){
            this.name = name;
        }
        public Builder setFloors(int floors) {
            this.floors = floors;
            return this;
        }
        public Builder setRooms(int rooms) {
            this.rooms = rooms;
            return this;
        }
        public House build(){ return new House(this);}
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