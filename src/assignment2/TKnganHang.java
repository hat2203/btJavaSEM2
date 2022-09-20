package assignment2;

public class TKnganHang {

    public static void main(String[] args){
        Account ac1 = new Account("MB001","Nguyễn Thị Lan Anh",200);
        ac1.inThongTin();
        ac1.napTien();

        Account ac2 = new Account("SHB038","Nguyễn Mạnh Hùng",100);
        ac2.inThongTin();
        ac2.rutTien();

        ac1.chuyenTien(ac2);



    }
}
