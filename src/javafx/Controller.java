package javafx;

import assignment5.INewInterface;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class Controller {
    public TextField txtFullName;
    public TextField txtEmail;
    public TextField txtAge;
    public TextField txtAddress;

    public Text txtHoTen;
    public Text txtTuoi;
    public Text txtDiaChi;
    public Text txtMail;


    public Text noticeName;
    public Text noticeEmail;
    public Text noticeAge;
    public Text noticeAddress;


    public TextField txtName;
    public TextField txtNumber;

    public Text txtTen;
    public Text txtSo;

    public Text checkTen;
    public Text checkSo;



    public void ok(){
        String fn = txtFullName.getText();
        if(fn.isEmpty()){
            noticeName.setText("Vui lòng điền đủ họ tên");
            noticeName.setVisible(true);
        }else {
            txtHoTen.setText(fn);
        }

        String em = txtEmail.getText();
        if(em.isEmpty() ||!em.contains("@") || em.startsWith("@") || em.endsWith("@")){
            noticeEmail.setText("Vui lòng nhập đúng email");
            noticeEmail.setVisible(true);
        }else {
            txtMail.setText(em);
        }

        String ag = txtAge.getText();
        try {
            Integer nAge = Integer.parseInt(ag);
            if(nAge < 0 || nAge>100)
                throw new Exception("Vui lòng nhập tuổi hợp lệ");
            txtTuoi.setText(ag);
            noticeAge.setVisible(true);
        }catch (Exception e){
            noticeAge.setText(e.getMessage());
            noticeAge.setVisible(false);
        }

        String ad = txtAddress.getText();
        if (ad.isEmpty()){
            noticeAddress.setText("Vui lòng nhập địa chỉ");
            noticeAddress.setVisible(true);
        }else {
            txtDiaChi.setText(ad);
        }
    }

    public void taoMoi(){
        String t = txtName.getText();
        txtTen.setText(t);
//        if(t.isEmpty()){
//            checkTen.setText("Vui lòng nhập tên");
//            checkTen.setVisible(false);
//        }else {
//
//        }
        String n = txtNumber.getText();
        txtSo.setText(n);
//        if(n.isEmpty()){
//            checkSo.setText("Vui lòng nhập SĐT");
//            checkSo.setVisible(false);
//        }else{
//
//        }


    }
}
