package assignment4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends assignment4.Phone {
    public ArrayList<assignment4.PhoneNumber> phoneList = new ArrayList<>();

    public PhoneBook() {
        phoneList = new ArrayList<>();
    }

    @Override
    public void insertPhone(String name, String phone) {
        for (PhoneNumber p : phoneList) {
            if (p.getName().equals(phone)) {
                if (p.getPhone().contains(phone)) {
                    // neu da ton tai so
                    System.out.println("Lien lac da ton tai");
                    return;
                }
                // neu da co ten ma chua co so
                p.getPhone().add(phone);
                System.out.println("Da them so vao danh ba co san");
                return;
            }
        }
        // neu chua co ten
        PhoneNumber pn = new PhoneNumber(name, phone);
        phoneList.add(pn);
    }

    @Override
    public void removePhone(String name) {
        // cach so 1:
        for (PhoneNumber p : phoneList) {
            if (p.getName().equals(name)) {
                phoneList.remove(p);
            }
        }
        // cach so 2:
//        for(int i=0; i<phoneList.size();i++){
//            if(phoneList.get(i).getName().equals(name)){
//                phoneList.remove(i);
//            }
//        }
    }

    @Override
    public void updatePone(String name, String oldPhone, String newPhone) {
        for (PhoneNumber p : phoneList) {
            if (p.getName().equals(name)) {
                p.getPhone().remove(oldPhone);
                p.getPhone().add(newPhone);
            }
        }
    }

    @Override
    public PhoneNumber searchPhone(String name) {
        for (PhoneNumber p : phoneList) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void sort() {// sap xep theo thu tu alphabe
        Collections.sort(phoneList //truyen vao mot mang
                , new Comparator<PhoneNumber>(){ // Comparator la mot interface
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2){ // ham compare la ham tru, so sanh hai chuoi va tra ve so duong or so am
//                if(o1.getName().compareTo(o2.getName())>0)// neu nguoc alphabate <=> xyz-abc
//                     {
//                         return 1;
//                }
//                return 0;
                return o1.getName().compareTo(o2.getName());// cach ngan gon hon
                // neu muon dao nguoc sap xep
                // return -o1.getName().compareTo(o2.getName());
            }
        });
    }
}


//    @Override
//    public void sort() {
//        Collection.sort (phoneList, new Comparator<PhoneNumber>(){
//            @Override
//            public int compare(PhoneNumber o1, PhoneNumber o2){ // ham compare la ham tru, so sanh hai chuoi va tra ve so duong or so am
////                if(o1.getName().compareTo(o2.getName())>0)// neu nguoc alphabate <=> xyz-abc
////                     {
////                         return 1;
////                }
////                return 0;
//                return (o1.getName().compareTo(o2.getName());
//            }
//        });
//    }
//}
