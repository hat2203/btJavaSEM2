package assignment4;

import java.util.ArrayList;

public class PhoneBook extends assignment4.Phone {
    public ArrayList <assignment4.PhoneNumber> phoneList = new ArrayList<>();
    public PhoneBook(){
        phoneList = new ArrayList<>();
    }

    @Override
    public void insertPhone(String name, String phone) {
        assignment4.PhoneNumber n = new assignment4.PhoneNumber();
        n.setName(name);
        n.phone.add(phone);
        boolean check = false;
        for(assignment4.PhoneNumber pl: phoneList){
            if(pl.name.contains(n.name)) {
                check = true;
                if (!pl.phone.contains(phone)) {
                    pl.phone.add(phone);
                } else {
                    System.out.println("Liên hệ đã tồn tại, vui lòng nhập lại ");
                }
            }
        }
            if(! check) {
                phoneList.add(n);
            }
    }

    @Override
    public void removePhone(String name) {
        boolean check = false;
        for(assignment4.PhoneNumber pl : phoneList) {
            if (pl.name.contains(name)) {
                check = true;
                phoneList.remove(name);
                System.out.println("Đã xóa liên hệ " + name + " khỏi danh bạ");
                break;
            }
        }
        if(!check){
            System.out.println("Không tìm thấy liên hệ "+name+" trong danh bạ");
        }
    }

    @Override
    public void updatePone(String name, String oldPhone, String newPhone) {
        for(assignment4.PhoneNumber pl: phoneList){
            if(pl.name.contains(name)){
                pl.phone.remove(oldPhone);
                pl.phone.add(newPhone);
                System.out.println("Đã thay đổi số liên lạc của liên hệ "+name);
            }
        }
    }

    @Override
    public void searchPhone(String name) {
        boolean check = false;
        for(assignment4.PhoneNumber pl : phoneList){
            if(pl.name.contains(name)){
                check = true;
                System.out.println("Tên liên hệ: "+pl.name+"/ Số thuê bao: "+pl.phone);
            }
        }
        if(!check){
            System.out.println("Liên hệ không tồn tại trong danh bạ");
        }
    }

    @Override
    public void sort() {

    }
}
