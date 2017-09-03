package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller {
    @FXML
    TextArea txtarea;
    @FXML
    TextField txtfield;
    @FXML
    TextField txtfield2;
    @FXML
    Button btn;
    public void pressed(ActionEvent actionEvent) {
        ArrayList<String> list1 = new ArrayList<>();
        String temp = txtfield.getText();
        String[] temp2 = temp.split(" ");
        for (String s: temp2){
            list1.add(s);
        }
        ArrayList<String> list2 = new ArrayList<>();
        String tempo = txtfield2.getText();
        String[] tempo2 = tempo.split(" ");
        for (String s: tempo2){
            list2.add(s);
        }
        txtarea.setText(String.valueOf(getCommonStrings(list1,list2)));

    }
    public static <E extends Comparable<E>> ArrayList<String> getCommonStrings(ArrayList<String> list1, ArrayList<String> list2){
        ArrayList<String> temp = new ArrayList<>();
        for (String x : list1){
            for (String y : list2){
                if ((x.compareTo(y))== 0){
                    temp.add(x);
                }
            }
        }

        return temp;
    }
}
