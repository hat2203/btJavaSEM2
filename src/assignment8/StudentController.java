package assignment8;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.Collections;
import java.util.Comparator;

public class StudentController {
    public TextField sName;
    public TextField sEmail;
    public TextField sMark;
    public ListView<StudentList> sThongTin;
    public Text checkName;
    public Text checkEmail;
    public Text checkMark;

    private ObservableList<StudentList> stList = FXCollections.observableArrayList();

    public void nhapTT() {
        try {
            checkName.setVisible(false);
            checkEmail.setVisible(false);
            checkMark.setVisible(false);
            if (sName.getText().isEmpty()) {
                throw new Exception("Vui lòng điền đủ tên");
            }
            if (sEmail.getText().isEmpty()) {
                throw new Exception("Vui lòng điền email");
            }
            if (sMark.getText().isEmpty()) {
                throw new Exception("Vui lòng điền điểm");
            }
            stList.add(new StudentList(sName.getText(), sEmail.getText(), sMark.getText()));
            printfInfor();

        } catch (Exception f) {
            sName.setText(f.getMessage());
            sName.setVisible(true);
            sEmail.setText(f.getMessage());
            sEmail.setVisible(true);
            sMark.setText(f.getMessage());
            sMark.setVisible(true);

        }
    }

    public void sxTen() {
        sortName();
    }

    public void sxDiem() {
        sortMark();
    }


    public void printfInfor() {
        sThongTin.setItems(stList);
        sThongTin.refresh();
    }


    public void sortName() {
        Collections.sort(stList, new Comparator<StudentList>() {
            @Override
            public int compare(StudentList s1, StudentList s2) {
                return s1.getsName().compareTo(s2.getsName());
            }
        });
    }

    public void sortMark(){
        Collections.sort(stList, new Comparator<StudentList>() {
            @Override
            public int compare(StudentList t1, StudentList t2) {
                return t1.getsMark().compareTo(t2.getsMark());
            }
        });
    }

}

