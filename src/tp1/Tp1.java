/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author sebastian-andreas.si
 */
public class Tp1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Tp1.class.getResource("superlogin.fxml"));
            BorderPane rootLayout = (BorderPane) loader.load();
            
            //reference to controller
            SuperloginController controller = loader.getController();
            ContexteIdentification context;
            Personnes ps = new Personnes();
            context = new ContexteIdentification(ps);
            controller.setContexte(context);
            
            Scene scene = new Scene(rootLayout);      
            primaryStage.setScene(scene);
            primaryStage.show();
            
        } catch (IOException e){
            e.printStackTrace();
        }
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
