package session5;

public interface StudentInterface { // gom cac thong tin thiet yeu ve mot goi
    // không thể tạo đối tượng
    // implement - triển khai, khác với abstract - kế thừa
    // bstract class có thể implemnt một Interface
    // cac ham dc khai bao deu la ham truu tuong
    void run();
    void eat();
    void learn();
    // khong can khai bao public vi trong interface mac dinh la ham truu tuong
    // tác dụng :
    // abstract là kế thừa hay gây ra tình trạng lãng phí bộ nhớ, interface sẽ giải quyết vc này, nếu abstract đã nạp một hoặc nhiều Interface
    //          vào thì lớp con sẽ đc kế thừa

}
