package Homework4;

public class Student {
    private int age;
    private String name;
    public Student (int age, String name){
            this.age = age;
            this.name = name;
            this.charArray = name.toCharArray();
        System.out.println(age);
        System.out.println(name);
    }

    public String[] Knowledge = {"math", "english"};
    public char[] charArray ;
}