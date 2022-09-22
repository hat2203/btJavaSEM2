package session3;

import chuaAssigment2.Account;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Animal a = new Animal();
        a.run();
        Dog d = new Dog();
        d.run();
        d.eat();
        BullDog bd = new BullDog();
        bd.run();
        bd.eat();
    }


    public static void main2(String [] args){
        int[] intarrays = new int[5];
        // khi biet tap hop co bn phan tu

        // khi khong biet so luong phan tu
        ArrayList arrayList = new ArrayList();

        arrayList.add(10);
        arrayList.add("Hello world!");
        arrayList.add(new Account());
        // them thong tin vao mang

        arrayList.remove(0);
        arrayList.remove("Hello world");
        // xoa mot phan tu trong mang

        ArrayList<String> strArray = new ArrayList<>();// tao mot mang cac phan tu thuoc kieu du lieu string
        strArray.add("Hello");
        strArray.add("world");

        // duyet mang - nen nhieu
        for(String s: strArray){
            System.out.println(s);
        }
        //cach duyet mang 2 - it dung
        for (int i=0; i<strArray.size();i++){
            System.out.println(strArray.get(i));
        }


    }
}
