package Homework3;

public class Professor extends Human {
    public Car car;
    public Phone mobilephone;
    public Professor(Car car, Phone mobilephone) {
        this.car = car;
        this.mobilephone = mobilephone;
    }
    public Professor(int age, String name, Car car, Phone mobilephone) {
        super(age, name);
        this.car = car;
        this.mobilephone = mobilephone;
    }
    @Override
    public String toString() {
        return "age=" + age + ", name " + name;
    }
    //Полиморфизм методов
    public void teach(String a){
        System.out.println("Сейчас первая пара -" + a);
    }
    public void teach(String a, String b){
        System.out.println("Сейчас вторая пара -" + b);
    }
    public void teach(String a, String b, String c){
        System.out.println("Сейчас третья пара -" + c);
    }
    @Override
    public void say() {
        System.out.println("Я учу");;
    }
}
