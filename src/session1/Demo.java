package session1;

public class Demo {
    public static void main(String[] args){
        System.out.println("Hello word!");
        int x = 10;
        System.out.println("x = "+x);
        String str = "Hello wordl!";
        if(x>5){
            System.out.println(str);
        }else{
            System.out.println("not found");
        }
        for (int i=0;i<10;i++){
            System.out.println("i="+i);
        }

        Car c = new Car();
        Car c2 = new Car();
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

        PhanSo n = new PhanSo();
        n.setTuSo(2);
        n.setMauSo(3);
        System.out.println("Phân số: "+ n.tuSo + "/"+ n.mauSo);
        System.out.println("Phân số nghịch đảo: "+ n.mauSo + "/"+n.tuSo);
        PhanSo m = new PhanSo();
        m.setTuSo(5);
        m.setMauSo(10);


    }
}
