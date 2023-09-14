package Homework5;

public class Main {
    public static void main(String[] args) {
        House.Builder houseBuilder = new House.Builder("Alex");

        House house = houseBuilder.setFloors(5).setRooms(15).build();
        House house1 = houseBuilder.setFloors(3).setRooms(9).build();
        System.out.println(house.equals(house1));

    }
}