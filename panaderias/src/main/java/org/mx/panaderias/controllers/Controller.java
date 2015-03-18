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
	
	public static int OPCION_PRODUCTOS = 1;
	public static int OPCION_VENTAS = 2;
	public static int OPCION_COMPRAS = 3;
	public static int OPCION_CLIENTES = 4;
	public static int OPCION_PROVEEDORES = 5;
	public static int OPCION_PERSONAL = 6;
	public static int OPCION_INVENTARIO = 7;
	public static int OPCION_CONFIGURACION = 8;
	

	@FXML
	Pane content;
	
	public void mostrarPantalla(int opcion) throws IOException {
		content.getChildren().clear();
		String pantalla = "";
		switch (opcion) {
			case 1: pantalla = "Productos.fxml"; break;
			case 2: pantalla = "ventas.fxml"; break;
			case 3: pantalla = "compras.fxml"; break;
			case 4: pantalla = "clientes.fxml"; break;
			case 5: pantalla = "proveedores.fxml"; break;
			case 6: pantalla = "personal.fxml"; break;
			case 7: pantalla = "inventario.fxml"; break;
			case 8: pantalla = "configuracion.fxml"; break;
			default: break;
		}
		Pane pane = (Pane) App.loader.load(pantalla);
		content.getChildren().add(pane);
		System.out.println("Contenido:" + content.getChildren());
	}
	
	public void pantallaProductos() throws IOException {  mostrarPantalla(Controller.OPCION_PRODUCTOS); }
	public void pantallaClientes() throws IOException { mostrarPantalla(Controller.OPCION_CLIENTES); }
	public void pantallaPersonal() throws IOException { mostrarPantalla(Controller.OPCION_PERSONAL);}
	public void pantallaVentas() throws IOException { mostrarPantalla(Controller.OPCION_VENTAS);}
	public void pantallaInventario() throws IOException { mostrarPantalla(Controller.OPCION_INVENTARIO);}
	public void pantallaCompras() throws IOException { mostrarPantalla(Controller.OPCION_COMPRAS); }
	public void pantallaConfiguracion() throws IOException { mostrarPantalla(Controller.OPCION_CONFIGURACION); }
	public void pantallaProveedores() throws IOException { mostrarPantalla(Controller.OPCION_PROVEEDORES); }

}
