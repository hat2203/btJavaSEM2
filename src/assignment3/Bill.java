package assignment3;

public class Bill {
    public static void main(String[] args){
        KHVietNam a = new KHVietNam(1, "Nguyen Phuong Chi", "2022-09-12",20,"Ca nhan");
        KHNgoaiQuoc b = new KHNgoaiQuoc(2, "William Jonh", "2022-09-15",123,"US");
        System.out.println(a.thanhTien());
        System.out.println(b.thanhTien());
    }
}
