package assignment4;

import java.util.Scanner;

public class PhoneMain {

    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.insertPhone("Nam", "01234567");
        pb.insertPhone("Nam", "01234567");
        pb.insertPhone("nguyen van an", "01234567");
        System.out.println(pb.phoneList.size());
        pb.updatePone("nguyen van an","01234567","07894623");
        System.out.println(pb.phoneList.size());

    }
}

