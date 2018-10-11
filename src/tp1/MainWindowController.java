/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;

/**
 * FXML Controller class
 *
 * @author sebastian-andreas.si
 */
public class MainWindowController implements Initializable {
    ContexteIdentification contexte;
    @FXML
    private ComboBox<?> cmbb_haircolor;
    @FXML
    private ComboBox<?> cmbb_eyeColor;
    @FXML
    private Slider sl_hairLength;
    @FXML
    private ListView<?> lsb_noseShape;
    @FXML
    private Button btn_reset;
    @FXML
    private Button btn_save;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void setContexte(ContexteIdentification contexte){
        this.contexte = contexte;        
    }

    @FXML
    private void reset(ActionEvent event) {
    }

    @FXML
    private void save(ActionEvent event) {
    }
    
}
