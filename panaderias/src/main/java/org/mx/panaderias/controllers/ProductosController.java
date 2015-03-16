package org.mx.panaderias.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Binding;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableMap;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.util.StringConverter;

import org.mx.panaderias.domain.Producto;
import org.mx.panaderias.domain.ProductoWrapper;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductosController implements Initializable {
	@FXML TextField descripcion; 
	@FXML TextField codigo;
	@FXML TextField idFamilia;
	@FXML TextField idUnidad;
	@FXML TextField precioCompra;
	@FXML TextField precioVenta;
	
	ProductoWrapper productoW = new ProductoWrapper();
	StringConverter integerSC = new StringConverter<Integer>() {
		public Integer fromString(String arg0) { return Integer.parseInt(arg0); }
		public String toString(Integer arg0)   { return String.valueOf(arg0); }
	};
	StringConverter doubleSC = new StringConverter<Double>() {
		public Double fromString(String arg0) { return Double.parseDouble(arg0); }
		public String toString(Double arg0)   { return String.valueOf(arg0); }
		
	};
	
	public void mostrarMensaje() {
		 System.out.println(productoW.toString());
	    System.out.println(productoW.getProducto().toString());
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		descripcion.textProperty().bindBidirectional(productoW.getDescripcionP());
		codigo.textProperty().bindBidirectional(productoW.getCodigoP());
		idFamilia.textProperty().bindBidirectional(productoW.getIdFamiliaP(),integerSC);
		idUnidad.textProperty().bindBidirectional(productoW.getIdUnidadP(), integerSC);
		precioCompra.textProperty().bindBidirectional(productoW.getPrecioCompraP(), doubleSC);
		precioVenta.textProperty().bindBidirectional(productoW.getPrecioVentaP(), doubleSC);
	}

}
