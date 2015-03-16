package org.mx.panaderias;

import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;

import org.mx.panaderias.domain.ProductoWrapper;

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
public class App extends Application
{    

	
    public static void main( String[] args )
    {
//    	ProductoWrapper pw = new ProductoWrapper(); 
//    	TextField tf = new TextField();
//    	
//    	StringProperty sp = tf.textProperty();
//    	StringProperty sp2 = pw.descripcionSPProperty();
//    	sp.bindBidirectional(sp2);
//    	tf.setText("una");
//    	System.out.println("sp:" + tf.getText());
//    	System.out.println("sp2"+ pw.getDescripcion());
//    	sp2.setValue("dos");
//    	System.out.println("sp:" + tf.getText());
//    	System.out.println("sp2"+ pw.getDescripcion());
    	
    	
        launch(args);
    }
    
	@Override 
	public void start(Stage stage) throws Exception {
		URL url = getClass().getResource("Principal.fxml");
		Pane root = (Pane)FXMLLoader.load(url);
		Scene scene = new Scene(root, 600, 400);
		stage.setScene(scene);
		stage.show();
		
	}
}
