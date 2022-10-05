package multipage.update;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import multipage.Main;

public class Controller {

    public void backToList(ActionEvent actionEvent) throws Exception {
        Parent updatePage = FXMLLoader.load(getClass().getResource("../list/Subject.fxml"));
        Scene updateScene = new Scene(updatePage,800,600);
        Main.rootStage.setTitle("Sửa môn học");
        Main.rootStage.setScene(updateScene);
    }
}
