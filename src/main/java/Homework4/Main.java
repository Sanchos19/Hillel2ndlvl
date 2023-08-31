package Homework4;

public class Main {
    public static void main(String[] args) {
        Student Sasha = new Student(17,"Alexandr");
        int a=1;
        for (int i = 0; i < Sasha.Knowledge.length; i++) {
            System.out.println(Sasha.Knowledge[i]);
        }
        for (int i = 0; i < Sasha.charArray.length; i++) {
            System.out.println(Sasha.charArray[i]+ " "  + a + "-я буква имени");
            a+=1;
        }
    }
}