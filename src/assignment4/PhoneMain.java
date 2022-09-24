package assignment4;

import java.util.Scanner;

public class PhoneMain {

    public static void main(String[] args){
        assignment4.PhoneBook pb = new assignment4.PhoneBook();
        Scanner sc = new Scanner(System.in);



        System.out.println("====== PHONEBOOK =====");
        System.out.println("1.Insert phone ");
        System.out.println("2.Remove phone");
        System.out.println("3.Update phone");
        System.out.println("4.Search phone");
        System.out.println("5.Sorf");
        System.out.println("6.Exit");

        System.out.println("Please choose an option ");
        int i = sc.nextInt();

        if(i == 1){
                sc.nextLine();
                System.out.print("Input name: ");
                String name = sc.nextLine();
                System.out.print("Input phone: ");
                String phone = sc.nextLine();
                pb.insertPhone(name,phone);
        }

        }
    }

