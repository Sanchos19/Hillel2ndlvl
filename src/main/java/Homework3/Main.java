package Homework3;

public class Main {
    public static void main(String[] args) {
        //Полиморфизм классов
        Professor Alexandr = new Professor(34, "Alexandr", new Car("BMW","blue"), new Phone());
        Human Vlad = new Professor(38, "Vlad", new Car("Mercedes","black"), new Phone());
        Human Maks = new Student();
        try{
            test(Vlad);
        } catch (ClassCastException e){
            System.out.println("Ошибка!");
        }

        }
    public static void test(Human human){
        Student student = (Student) human;
        human.say();
    }
}
