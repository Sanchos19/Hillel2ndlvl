package Homework2;

public class Main {
    public static void main(String[] args) {
        String day = "Thursday";

        switch (day) {
            case "Monday":
                System.out.println("Неделя только началась!");
                break;
            case "Thursday":
                System.out.println("До выходных осталось совсем немного!");
                break;
            case "Wednesday":
                System.out.println("Сегодня среда!");
                break;
            default:
                System.out.println("Нет такого дня!");
        }
    }
}
