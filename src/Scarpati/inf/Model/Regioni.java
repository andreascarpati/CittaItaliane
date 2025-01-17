package Scarpati.inf.Model;

import java.util.List;

public class Regioni implements Comparable<Regioni>{
	private List<Province> province;
	private int CodRegione;
	private String nome,popolazione;

	public Regioni(int codRegione, String nome, String popolazione) {
		super();
		CodRegione = codRegione;
		this.nome = nome;
		this.popolazione = popolazione;
	}

	public List<Province> getProvince() {
		return province;
	}

	public void setProvince(List<Province> province) {
		this.province = province;
	}

	public int getCodRegione() {
		return CodRegione;
	}

	public void setCodRegione(int codRegione) {
		CodRegione = codRegione;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPopolazione() {
		return popolazione;
	}

	public void setPopolazione(String popolazione) {
		this.popolazione = popolazione;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return nome;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Regioni other = (Regioni) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	
	public int compareTo(Regioni reg) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(reg.nome);
	}
}
