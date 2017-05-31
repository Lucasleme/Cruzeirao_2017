package sistema.modelos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Campeonato {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;

	private String nome;

	// @OneToMany(mappedBy="local")
	private List<Local> locais = new ArrayList<Local>();

	// @OneToMany(mappedBy="juiz")
	private List<Juiz> juizes = new ArrayList<Juiz>();

	private Categoria categoria;
	private Calendar dataInicioInscricao = Calendar.getInstance();
	private Calendar dataFimCampeonato = Calendar.getInstance();
	private double valorTaxa;

	public Calendar getDataInicioInscricao() {
		return dataInicioInscricao;
	}

	public void setDataInicioInscricao(Calendar dataInicioInscricao) {
		this.dataInicioInscricao = dataInicioInscricao;
	}

	public Calendar getDataFimCampeonato() {
		return dataFimCampeonato;
	}

	public void setDataFimCampeonato(Calendar dataFimCampeonato) {
		this.dataFimCampeonato = dataFimCampeonato;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Local> getLocais() {
		return locais;
	}

	public void setLocais(List<Local> locais) {
		this.locais = locais;
	}

	public List<Juiz> getJuizes() {
		return juizes;
	}

	public void setJuizes(List<Juiz> juizes) {
		this.juizes = juizes;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public double getValorTaxa() {
		return valorTaxa;
	}

	public void setValorTaxa(double valorTaxa) {
		this.valorTaxa = valorTaxa;
	}

	@Override
	public String toString() {
		return "Campeonato [ID=" + ID + ", nome=" + nome + ", locais=" + locais + ", juizes=" + juizes + ", categoria="
				+ categoria + ", dataInicioInscricao=" + dataInicioInscricao + ", dataFimCampeonato="
				+ dataFimCampeonato + ", valorTaxa=" + valorTaxa + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + ((dataFimCampeonato == null) ? 0 : dataFimCampeonato.hashCode());
		result = prime * result + ((dataInicioInscricao == null) ? 0 : dataInicioInscricao.hashCode());
		result = prime * result + ((juizes == null) ? 0 : juizes.hashCode());
		result = prime * result + ((locais == null) ? 0 : locais.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valorTaxa);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Campeonato other = (Campeonato) obj;
		if (ID != other.ID)
			return false;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (dataFimCampeonato == null) {
			if (other.dataFimCampeonato != null)
				return false;
		} else if (!dataFimCampeonato.equals(other.dataFimCampeonato))
			return false;
		if (dataInicioInscricao == null) {
			if (other.dataInicioInscricao != null)
				return false;
		} else if (!dataInicioInscricao.equals(other.dataInicioInscricao))
			return false;
		if (juizes == null) {
			if (other.juizes != null)
				return false;
		} else if (!juizes.equals(other.juizes))
			return false;
		if (locais == null) {
			if (other.locais != null)
				return false;
		} else if (!locais.equals(other.locais))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(valorTaxa) != Double.doubleToLongBits(other.valorTaxa))
			return false;
		return true;
	}

}
