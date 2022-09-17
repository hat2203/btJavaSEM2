package session2;
import session1.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Car c = new Car();
        Human h = new Human();
        h.run(5);
        h.run(5, "sieu thi giam gia");
        h.run("chay nha", 10);

        Human h2 = new Human("Nguyen Van Tu");
        System.out.println(h2.name);

        Student s = new Student("Nguyen Phuong Chi","0833965241","8, Ton That Thuyet",18,new Car());
        s.fiends[0] = "Vuong Huan";
        s.fiends[1] = "Nguyen Manh Hung";
        s.myCar = new Car();
        s.myCar.brand = "Lexu";


        int[] mark = new int[4];
        mark[0] = 19;
        mark[1] = 23;
        mark[2] = 52;
        mark[3] = 89;
        Student student[] = new Student[10];
        Car c1 = new Car();
        c1.brand = "Honda";
        student [0] = new Student("Nguyen Van Anh","0328984053","1, Nguyen Tuan",20,c1);

        for(int i=0; i<student.length;i++){
            student[i] = new Student();
        }
        // set 10 sv theo do tuoi 20 -> 29
        for(int i=0;i< student.length;i++){
            student[i].setAge(i+20);
        }
        for(int i=0;i< student.length;i++){
           System.out.println(student[i].getAge());
        }

        for(Student st : student){// foreach
            System.out.println(st.getAge());//st <=> student[i]
        }
    }


}
