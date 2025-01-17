package Scarpati.inf.Model;

public class Citta implements Comparable<Citta> {
	private int codice, provincia;
	String nome, cap;

	@Override
	public String toString() {
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
		Citta other = (Citta) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	
	public int compareTo(Citta citta) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(citta.nome);
	}

	public Citta(int codice, String nome, String cap, int provincia) {
		super();
		this.codice = codice;
		this.provincia = provincia;
		this.nome = nome;
		this.cap = cap;
	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public int getProvincia() {
		return provincia;
	}

	public void setProvincia(int provincia) {
		this.provincia = provincia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

}
