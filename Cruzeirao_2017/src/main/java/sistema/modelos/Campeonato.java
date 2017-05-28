package sistema.modelos;

import java.util.List;

public class Campeonato {

	private String nome;
	private List<Local> locais;
	private List<Juiz> juizes;
	private Categoria categoria;
	private Date dataInicioInscricao;
	private Date dataFimCampeonato;
	private double valorTaxa;

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

	public Date getDataInicioInscricao() {
		return dataInicioInscricao;
	}

	public void setDataInicioInscricao(Date dataInicioInscricao) {
		this.dataInicioInscricao = dataInicioInscricao;
	}

	public Date getDataFimCampeonato() {
		return dataFimCampeonato;
	}

	public void setDataFimCampeonato(Date dataFimCampeonato) {
		this.dataFimCampeonato = dataFimCampeonato;
	}

	public double getValorTaxa() {
		return valorTaxa;
	}

	public void setValorTaxa(double valorTaxa) {
		this.valorTaxa = valorTaxa;
	}

	@Override
	public String toString() {
		return "Campeonato [nome=" + nome + ", juizes=" + juizes + ", categoria=" + categoria + ", dataInicioInscricao="
				+ dataInicioInscricao + ", dataFimCampeonato=" + dataFimCampeonato + ", valorTaxa=" + valorTaxa + "]";
	}

}
