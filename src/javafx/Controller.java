package javafx;

import assignment5.INewInterface;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
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
    public ListView<PhoneNumber> lv;
    public Text checkTen;
    public Text checkSo;
    private ObservableList<PhoneNumber> numberList = FXCollections.observableArrayList();


    public void taoMoi(){
        try{
            checkTen.setVisible(false);
            checkSo.setVisible(false);
            if(txtName.getText().isEmpty()){
                throw new Exception("Vui lòng nhập đầy đủ tên ");
            }
            if(txtNumber.getText().isEmpty()){
                throw new Exception("Vui lòng điền SĐT");
            }
 //           numberList.add(new PhoneNumber(txtName.getText(),txtNumber.getText()));

//            String n = txtName.getText();
//            String p = txtNumber.getText();
//            PhoneNumber pn = new PhoneNumber(n,p);
//            numberList.add(pn);

            //in mảng
            printfPhoneList();
            updatePhone();

        }catch (Exception e){
            checkTen.setText(e.getMessage());
            checkTen.setVisible(true);
            checkSo.setText(e.getMessage());
            checkSo.setVisible(true);
        }
    }

    public void printfPhoneList(){
        lv.setItems(numberList);
        lv.refresh();
    }
    public void updatePhone(){
        for(PhoneNumber p : numberList){
            if(p.getName().equals(txtName.getText())){
                    p.setPhone(txtNumber.getText());
                    return;
            }
        }
        numberList.add(new PhoneNumber(txtName.getText(),txtNumber.getText()));
    }




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


}
