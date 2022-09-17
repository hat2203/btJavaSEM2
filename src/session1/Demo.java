package session1;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args){
//        System.out.println("Hello word!");
//        int x = 10;
//        System.out.println("x = "+x);
//        String str = "Hello wordl!";
//        if(x>5){
//            System.out.println(str);
//        }else{
//            System.out.println("not found");
//        }
//        for (int i=0;i<10;i++){
//            System.out.println("i="+i);
//        }

        Car c = new Car();
        Car c2 = new Car();
        // c and c2 la hai bien khac nhau
        c.brand = "Toyota";
        System.out.println(c.brand);

        Car.color = "red";
        System.out.println(Car.color);

        c.showInfor();
        c2.showInfor();
        TamGiac t = new TamGiac();
        t.setCanh1(3);
        t.setCanh2(4);
        t.setCanh3(5);
        System.out.println("Chu vi:"+ t.chuVi());
        System.out.println("Dien tich:"+ t.dienTich());

        Scanner sc = new Scanner(System.in);
        //int x = sc.nextInt(); <=> scanf("%d",&x);
        PhanSo f1 = new PhanSo();
        int ts = sc.nextInt();
        f1.setTuSo(ts);
        // cach viet rut gon
        int ms = sc.nextInt();
        f1.setMauSo(ms);
        f1.inPhanSo();

        PhanSo f2 = new PhanSo();
        int ts1 = sc.nextInt();
        f2.setTuSo(ts1);
        f2.setMauSo(sc.nextInt());
        f2.inPhanSo();

        PhanSo a = f1.add(f2);
        a.rutGon();
        a.inPhanSo();


    }
}
