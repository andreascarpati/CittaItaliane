/**
 * Sample Skeleton for 'CittaItaliane.fxml' Controller Class
 */

package Scarpati.inf.viewControl;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

import Scarpati.inf.Model.Citta;
import Scarpati.inf.Model.Model;
import Scarpati.inf.Model.Province;
import Scarpati.inf.Model.Regioni;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class CittaItalianeController {

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML
	private ComboBox<Regioni> cmbRegioni;

	@FXML // fx:id="cmbCitta"
	private ComboBox<Citta> cmbCitta; // Value injected by FXMLLoader

	@FXML // fx:id="cmbProvince"
	private ComboBox<Province> cmbProvince; // Value injected by FXMLLoader
	private Model m ;
	private List<Regioni> reg = new ArrayList<Regioni>();
	private List<Citta> citta = new ArrayList<Citta>();
	private List<Province> prov = new ArrayList<Province>();
	
	@FXML
	void province(ActionEvent event) {
		Province prov = null;

		if (!cmbProvince.getItems().isEmpty()) {
			prov = cmbProvince.getValue();

			citta =  m.getCitta(prov);
			Collections.sort(citta);
			cmbCitta.getItems().clear();
			cmbCitta.getItems().addAll(citta);
		}
	}

	@FXML
	void regione(ActionEvent event) {
		
	//	if (!cmbRegioni.getItems().isEmpty()) {
		cmbRegioni.getItems().clear();
		cmbProvince.getItems().clear();
		cmbCitta.getItems().clear();
		reg = m.getRegioni();
		Collections.sort(reg);
	cmbRegioni.getItems().addAll(reg);

		Regioni r = cmbRegioni.getValue();
		prov = m.getProvince(r);
		Collections.sort(prov);
		cmbProvince.getItems().addAll(prov);
	//	}
	}

	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {
		assert cmbRegioni != null : "fx:id=\"cmbRegioni\" was not injected: check your FXML file 'CittaItaliane.fxml'.";
		assert cmbCitta != null : "fx:id=\"cmbCitta\" was not injected: check your FXML file 'CittaItaliane.fxml'.";
		assert cmbProvince != null : "fx:id=\"cmbProvince\" was not injected: check your FXML file 'CittaItaliane.fxml'.";
	}

	public void setModel(Model model) {
		// TODO Auto-generated method stub
		
		
		this.m = model;
		cmbRegioni.getItems().clear();
		m.rimuoviReg();
	reg = m.getRegioni();
	Collections.sort(reg);
	cmbRegioni.getItems().addAll(reg);

	}
}
