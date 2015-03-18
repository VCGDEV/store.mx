package org.mx.panaderias.controllers;

import java.io.IOException;
import java.net.URL;

import org.mx.panaderias.App;
import org.mx.panaderias.SpringFXMLLoader;
import org.mx.panaderias.domain.Producto;
import org.springframework.beans.factory.annotation.Autowired;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class Controller {

	@FXML
	Pane content;
	
	public void mostrarMensaje() throws IOException {

		content.getChildren().clear();
		Pane pane = (Pane) App.loader.load("Productos.fxml");
		content.getChildren().add(pane);
		System.out.println("Contenido:" + content.getChildren());
	}

}
