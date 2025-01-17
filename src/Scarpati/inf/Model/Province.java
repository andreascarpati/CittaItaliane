package Scarpati.inf.Model;

import java.util.List;

public class Province implements Comparable<Province> {
	int codice, regione;
	String nome, sigla;
	List<Citta> citta;

	@Override
	public String toString() {
		return nome;
	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public int getRegione() {
		return regione;
	}

	public void setRegione(int regione) {
		this.regione = regione;
	}

	public String getNome() {
		if(nome==null)
			return null;
		return nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Province other = (Province) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public List<Citta> getCitta() {
		return citta;
	}

	public void setCitta(List<Citta> citta) {
		this.citta = citta;
	}

	public Province(int codice, String nome, String sigla, int regione) {
		super();
		this.codice = codice;
		this.regione = regione;
		this.sigla = sigla;
		this.nome = nome;
	}

	
	public int compareTo(Province prov) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(prov.nome);
	}

}
