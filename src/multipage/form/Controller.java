package multipage.form;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import multipage.list.BookList;
import multipage.Main;

public class Controller {


    public void backToList(ActionEvent actionEvent) throws Exception {
        Parent formPage = FXMLLoader.load(getClass().getResource("../list/Subject.fxml"));
        Scene formScene = new Scene(formPage,800,600);
        Main.rootStage.setTitle("Danh sách môn học");
        Main.rootStage.setScene(formScene);
    }


    public TextField sID;
    public TextField sName;
    public TextField sHour;
    public Text checkID;
    public Text checkName;
    public Text checkHour;

    public ObservableList<BookList> bList = FXCollections.observableArrayList();


    public void submit(ActionEvent actionEvent) {
        try {
           checkID.setVisible(false);
           checkName.setVisible(false);
           checkHour.setVisible(false);
           if(sID.getText().isEmpty()){
               throw new Exception("Vui lòng điền mã sách");
           }
           if(sName.getText().isEmpty()){
               throw new Exception("Vui lòng điền tên môn học");
           }
           if(sHour.getText().isEmpty()){
               throw new Exception("Vui lòng điền thời gian học");
           }
        for (BookList b : bList){
            if (b.getId().equals(sID.getText())) {
                return;
            }
        }
        bList.add(new BookList(sID.getText(),sName.getText(),sHour.getText()));


        }catch (Exception c){
            sID.setText(c.getMessage());
            sID.setVisible(true);
            sName.setText(c.getMessage());
            sName.setVisible(true);
            sHour.setText(c.getMessage());
            sHour.setVisible(true);
        }
    }


}
