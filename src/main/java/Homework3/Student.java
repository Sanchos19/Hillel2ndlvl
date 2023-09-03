package Homework3;

    public class Student extends Human {
        public Phone phone;
        public Student() {
            this.phone = phone;
        }

        public Student(int age, String name, Phone phone) {
            super(age, name);
            this.phone = phone;
        }
        @Override
        public void say() {
            System.out.println("Я учусь");
        }
    }
