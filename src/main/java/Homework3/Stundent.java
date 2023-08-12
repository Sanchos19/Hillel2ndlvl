package Homework3;

    public class Stundent extends Human {
        public Phone phone;

        public Stundent() {
            this.phone = phone;
        }

        public Stundent(int age, String name, Phone phone) {
            super(age, name);
            this.phone = phone;
        }

        @Override
        public void say() {
            System.out.println("Я учусь");
        }
    }
