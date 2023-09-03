package Homework1;

public class Main {
    public static void main(String[] args) {
            int i=0;
            for ( i = 0; i < 15; i++) {
                System.out.println("i = " + i);
            }
            i=0;
            while (i<15){
                System.out.println("i = " + i);
                i+=1;
            }
            i=0;
            do {
                System.out.println("i = " + i);
                i+=1;
            } while(i<15);
        }
}
