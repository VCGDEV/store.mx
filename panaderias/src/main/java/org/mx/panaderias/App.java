package org.mx.panaderias;

import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */

@Component
public class App extends Application
{    
	public static SpringFXMLLoader loader;
	
    public static void main( String[] args )
    {
        launch(args);
    }
    
	@Override 
	public void start(Stage stage) throws Exception {
		loader = new SpringFXMLLoader(); 
		Pane root = (Pane)loader.load("Principal.fxml");
		Scene scene = new Scene(root, 720, 425);
		stage.setScene(scene);
		stage.show();
	}
}

