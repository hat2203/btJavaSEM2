package assignment8;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.Collections;
import java.util.Comparator;
import java.util.ResourceBundle;

public class StudentController implements Initializable {
    public TextField sName;
    public TextField sEmail;
    public TextField sMark;
    public ListView<StudentList> sThongTin;
    public Text checkName;
    public Text checkEmail;
    public Text checkMark;
    private boolean sortStName = true;
    private boolean sortMark = true;


    private ObservableList<StudentList> stList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        stList.add(new StudentList("Nguyễn Văn A","nva@ggmail.com",5));
        stList.add(new StudentList("Nguyễn Văn B", "nvb@ggmail.com",6));
        sThongTin.setItems(stList);
    }

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
            stList.add(new StudentList(sName.getText(), sEmail.getText(), sMark.getLength() ));
           // stList.add(new StudentList(sName.getText(),sEmail.getText(),sMark ));
            sThongTin.setItems(stList);
            sThongTin.refresh();

        } catch (Exception f) {
            sName.setText(f.getMessage());
            sName.setVisible(true);
            sEmail.setText(f.getMessage());
            sEmail.setVisible(true);
            sMark.setText(f.getMessage());
            sMark.setVisible(true);

        }
    }

    public void clearInput(){
        sName.setText("");
        sEmail.setText("");
        sMark.setText("");

    }


    public void sxTen() {
        Collections.sort(stList, new Comparator<StudentList>() {
            @Override
            public int compare(StudentList s1, StudentList s2) {
                return sortStName?s1.getsName().compareTo(s2.getsName()):s2.getsName().compareTo(s1.getsName());
            }
        });
        sortStName =!sortStName;
        sThongTin.refresh();
    }

    public void sxDiem() {
        Collections.sort(stList, new Comparator<StudentList>() {
            @Override
            public int compare(StudentList s1, StudentList s2) {
                return sortMark?s1.getsMark() - (s2.getsMark()):s2.getsMark() - (s1.getsMark());
            }
        });
        sortMark =!sortMark;
        sThongTin.refresh();
    }

}

