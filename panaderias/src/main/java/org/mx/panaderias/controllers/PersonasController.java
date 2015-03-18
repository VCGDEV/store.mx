package org.mx.panaderias.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;



public class PersonasController {
	
	@FXML TextField nombre;
	@FXML TextField direccion;
	@FXML TextField rfc;
	@FXML TextField telefono;
	@FXML TextField celular;
	@FXML TextField email;
	
	public void guardarDatos() {
		System.out.println("Guardar datos");
	}
	
	
}
