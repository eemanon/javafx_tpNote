/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Jonathan.FERNANDO-JO
 */
public class MenuController implements Initializable {

    ContexteAvatar contexte;

    @FXML
    private MenuItem menu_profil;
    @FXML
    private MenuItem menu_avatar;
    @FXML
    private MenuItem menu_exit;
    @FXML
    private ScrollPane scroll_pane;
    @FXML
    private TableView<Personne> table_view;
    @FXML
    private GridPane gird_pane_principal;
    @FXML
    private TableColumn<Personne, String> column_login;
    @FXML
    private TableColumn<Personne, String> column_nom;
    @FXML
    private TableColumn<Personne, String> column_ville;
    @FXML
    private Label label_login_ajout;
    @FXML
    private Label label_nom_ajout;
    @FXML
    private Label label_add1_ajout;
    @FXML
    private Label label_add2_ajout;
    @FXML
    private Label label_tel1_ajout;
    @FXML
    private TextField textfield_login_ajout;
    @FXML
    private TextField textfield_nom_ajout;
    @FXML
    private TextField textfield_add1_ajout;
    @FXML
    private TextField textfield_add2_ajout;
    @FXML
    private TextField textfield_tel1_ajout;
    @FXML
    private TextField textfield_tell2_ajout;
    @FXML
    private Label label_tel2_ajout;
    @FXML
    private Button btn_save_ajout;
    @FXML
    private Button btn_delete_ajout;
    @FXML
    private PasswordField pwdfield_ajout;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Personnes p = new Personnes();
        table_view.setItems((ObservableList)p.getListe());
        column_login.setCellValueFactory(
            new PropertyValueFactory("login")
        );
        column_nom.setCellValueFactory(
            new PropertyValueFactory("name")
        );
        column_ville.setCellValueFactory(
            new PropertyValueFactory("address1")
        );
    }

    @FXML
    private void view_profile(ActionEvent event) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Information Profil");
        alert.setContentText("Le login est " + contexte.getPersonne().getLogin() + " et le nom est " + contexte.getPersonne().getName());
        alert.showAndWait();
    }

    @FXML
    private void config_avatar(ActionEvent event) throws IOException {
        //Recupération du stage a partir de n'importe quel objet de JavaFX
        Stage stage = new Stage();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Tp1.class.getResource("MainWindow.fxml"));
        BorderPane rootLayout = (BorderPane) loader.load();

        //Chargement du second controleur
        MainWindowController controller = loader.getController();
        controller.setContexte(contexte);

        Scene scene = new Scene(rootLayout, 600, 600);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    private void close(ActionEvent event) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirmation Dialog");
        alert.setContentText("Are you sure you want to exit?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            System.exit(0);
        } else {
            alert.close();
        }
    }

    public void setContexte(ContexteAvatar contexte) {
        this.contexte = contexte;
    }

}
