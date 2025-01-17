package Scarpati.inf.Model;

import java.util.ArrayList;
import java.util.List;

import Scarpati.inf.DAO.CittaDAO;
import Scarpati.inf.DAO.ProvinceDAO;
import Scarpati.inf.DAO.RegioniDAO;

public class Model {
	
	public List<Regioni> getRegioni() {
		List<Regioni> regioni = new ArrayList<Regioni>();
		regioni.clear();
		regioni.addAll(new RegioniDAO().getRegioni());
		return regioni;
	}
//ritorna tutte le province di una regione
	public List<Province> getProvince(Regioni reg) {
		List<Province> prov = new ArrayList<Province>();

				new ProvinceDAO().setPronvice(reg);
				prov = reg.getProvince();
	
		return prov;
	}
//ritorna tutte le citta di una provincia
	public List<Citta> getCitta(Province prov) {
		List<Citta> citta = new ArrayList<Citta>();
		new CittaDAO().setCitta(prov);
		citta = prov.getCitta();
	return citta;
	}
public void rimuoviReg() {
	
}
}

