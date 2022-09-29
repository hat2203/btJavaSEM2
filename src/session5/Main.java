package session5;

import session4.Human;

public class Main {
    public static void main (String[] args){
        StudentInterface s = new StudentInterface() {
            @Override
            public void run() {

            }

            @Override
            public void eat() {

            }

            @Override
            public void learn() {

            }
        };
        // tao mot lop an danh ngam nhan dinh la implements Interface nay

        Human h = new Human() {
            @Override
            public void eat() {
                System.out.println("Eat.......");
            }
        };
        h.eat();
        Human h2 = new Human() {
            @Override
            public void eat() {
                System.out.println("Eating......");
            }
        };
        h2.eat();

        FptStudentInterface f = new FptStudentInterface() {
            @Override
            public void coding(int y) {

            }
        };

        // cach 2, lamda expression, cu phap dc su dung khi la Functional Interface
        FptStudentInterface fs = (y) ->{
            // body of coding function
        };
        // khi co tham so y dc truyen vao
    }
}
