/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.Slider;

/**
 * FXML Controller class
 *
 * @author sebastian-andreas.si
 */
public class MainWindowController implements Initializable {

    ContexteAvatar contexte;
    @FXML
    private ComboBox<String> cmbb_haircolor;
    @FXML
    private ComboBox<String> cmbb_eyeColor;
    @FXML
    private Slider sl_hairLength;
    @FXML
    private Button btn_reset;
    @FXML
    private Button btn_save;
    @FXML
    private ListView<String> lsb_details;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> eyeColor = FXCollections.observableArrayList("noir", "marron", "vert", "bleu");
        cmbb_eyeColor.setPromptText("Choisir la couleur des yeux");
        cmbb_eyeColor.setItems(eyeColor);

        ObservableList<String> hairColor = FXCollections.observableArrayList("noir", "marron", "blond");
        cmbb_haircolor.setPromptText("Choisir la couleur des cheveux");
        cmbb_haircolor.setItems(hairColor);

        sl_hairLength.setMin(0);
        sl_hairLength.setMax(100);
        sl_hairLength.setValue(50);
        sl_hairLength.setShowTickLabels(true);
        sl_hairLength.setShowTickMarks(true);
        sl_hairLength.setMajorTickUnit(50);
        sl_hairLength.setMinorTickCount(5);
        sl_hairLength.setBlockIncrement(10);
        
        
        ObservableList<String> listeDetails = FXCollections.observableArrayList("tatouage", "piercing", "grain de beauté");
        lsb_details.setItems(listeDetails);
        lsb_details.selectionModelProperty().get().setSelectionMode(SelectionMode.MULTIPLE);
        /*        
        lsb_details.selectionModelProperty().get().getSelectedItems().addListener(new ListChangeListener<String>(){
           @Override
           public void onChanged(ListChangeListener.Change<? extends String> c){
               for(String val : c.getList()){
                   listDetail.add(val);
               }
           }           
        });*/
    }

    public void setContexte(ContexteAvatar contexte) {
        this.contexte = contexte;
        contexte.getPersonne().eyeColorProperty().bind(cmbb_eyeColor.valueProperty());
        contexte.getPersonne().hairColorProperty().bind(cmbb_haircolor.valueProperty());
        contexte.getPersonne().hairLenghtProperty().bind(sl_hairLength.valueProperty());
        /* bin ddu listview ne fonctionne pas
        contexte.getPersonne().detailProperty().bind(lsb_details.getSelectionModel().getSelectedItem());
        */
    }

    @FXML
    private void reset(ActionEvent event) {
        cmbb_eyeColor.valueProperty().set(null);
        cmbb_haircolor.valueProperty().set(null);
        sl_hairLength.setValue(50);
        lsb_details = null;
    }

    @FXML
    private void save(ActionEvent event) {

    }
}
