package com.franprados.ProyectoConversor;

import com.franprados.ProyectoConversor.model.Operaciones;
import com.franprados.ProyectoConversor.model.TipoMonedas;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

	@FXML
    public ChoiceBox<String> tipoMoneda;
	
	@FXML
	public ChoiceBox<String> tipoMonedaDerecha;
	
	@FXML
	private TextField campo1;
	
	@FXML
	private TextArea campo2;
	
	@FXML
	private Button convertir;
    
    public void initialize() {
        if (tipoMoneda != null) {
            for (TipoMonedas _tipo : TipoMonedas.values()) {
                tipoMoneda.getItems().add(_tipo.getType());
            }
        }
        if (tipoMonedaDerecha != null) {
			for (TipoMonedas _tipo : TipoMonedas.values()) {
				tipoMonedaDerecha.getItems().add(_tipo.getType());
			}
		}
    }
    
    @FXML
    private void convertir() {
    	double valor = Double.parseDouble(campo1.getText());
    	String tm = tipoMoneda.getValue();
    	String tmd = tipoMonedaDerecha.getValue();
    	
    	Operaciones puente = new Operaciones();
    	puente.setValor(valor);
    	puente.setTm(tm);
    	puente.setTmd(tmd);
    	
    	double resultadofinal = puente.convertir();
    	
    	campo2.setText("");
    	campo2.appendText("" + resultadofinal);
    }
}
