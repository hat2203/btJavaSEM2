package chuaAssigment2;

import java.util.Scanner;

public class TKnganHang {
    public static void main(String[] args) {
        Account myAccount = new Account(1, "Nguyen Van Tu", 200);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien muon rut: ");
        int x = sc.nextInt();
        if (myAccount.debit(x)) {
            System.out.println("Rut thanh cong " + x);
        } else {
            System.out.println("So du tk khong du vui long nhap lai");
        }

        Account nam = new Account(2,"Cao Hoang Nam", 10);
        System.out.println("Nhap so tien can chuyen: ");
        int y = sc.nextInt();
        if(myAccount.tranferTo(nam,y)){
            System.out.println("Chuyen khoan thanh cong " +y+" sang tai khoan "+nam.getName());
        }else{
            System.out.println("Chuyen khoan khong thanh cong");
        }
    }
}

