package assignment2;

import java.util.Scanner;

public class Account {
    // khai bao thuoc tinh
    public String id;
    public String name;
    public int balance;

    public Account() {
        // khởi constructor mặc định
    }

    public Account(String id, String name, int balance) {
        // khởi tạo constructor có tham số
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    Scanner sc = new Scanner(System.in);
    //in tên và số tk của ng dùng
    public void inThongTin(){
        System.out.println("Chủ tài khoản: "+getName());
        System.out.println("Số dư: "+ getBalance());
    }
    // nạp tiền
    public int napTien(){
        int nap;
        System.out.println("Vui lòng nhập số tiền cần nạp: ");
        nap = sc.nextInt();
        if(nap>= 0){
            balance = nap + balance;
            System.out.println("Bạn vừa nạp "+nap+" vào tài khoản");
            System.out.println("Số dư tài khoản là:"+balance);
        }else{
            System.out.println("Số tiền không hợp lệ, vui lòng nhập lại");
        }
        return nap;
    }

    // rút tiền
    public int rutTien(){
        int rut;
        int ton = 50;
        System.out.println("Vui lòng nhập số tiền cần rút: ");
        rut = sc.nextInt();
        if(rut <= (balance - ton)){
            balance = balance - rut;
            System.out.println("Bạn vừa rút "+rut+"từ tài khoản");
            System.out.println("Số dư tài khoản là "+balance);
        }else{
            System.out.println("Số dư tài khoản phải đủ 50.000 Đ, vui lòng nhập lại số tiền");
        }
        return rut;
    }
    public void chuyenTien(Account destination)
    {
        int amount;
        int ton = 50;
        System.out.println("Vui lòng nhập số tiền cần chuyển: ");
        amount = sc.nextInt();
        if ( amount <= this.balance - ton) {
            this.balance = this.balance - amount;
            System.out.println("Bạn đã chuyển thành công "+amount+", số dư tài khoản là: "+this.balance);
        } else {
            System.out.println("Số dư tài khoản phải đủ 50.000 Đ, vui lòng nhập lại số tiền");
        }
        destination.balance = destination.balance + amount;
        System.out.println("Bạn vừa nhận được "+amount+", số dư tài khoản là: "+destination.balance);
    }



}
