package Homework3;

public class Main {
    public static void main(String[] args) {
        //Полиморфизм классов
        Professor Alexandr = new Professor(34, "Alexandr", new Car("BMW","blue"), new Phone());
        Human Vlad = new Professor(38, "Vlad", new Car("Mercedes","black"), new Phone());
        Human Maks = new Stundent();
        try{
            test(Vlad);
        } catch (Exception e){
            System.out.println("Ошибка!");
        }

        }
    public static void test(Human human){
        Stundent stundent = (Stundent) human;
        human.say();
    }
}
