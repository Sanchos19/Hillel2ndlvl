package Homework5;

public class Main {
    public static void main(String[] args) {
        House house1 = new House(2, 5, "Alexovskiy");
        House house2 = new House(3, 9, "Alexandrovskiy");
        System.out.println(house1.equals(house2));
    }
}
