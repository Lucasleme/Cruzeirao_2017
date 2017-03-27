package sistema.modelos;

import java.util.ArrayList;

public class Campeonato {
	
	private ArrayList<Categoria> categorias;
	private ArrayList<Time> times;
	private String dataIni;
	private String dataFin;
	private String anoCampeonato;
	private float taxaInscricao;
	private String periodoInscricao;
	private String cidade;
	//private String nome;
	
	
	
	/*public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}*/
	public ArrayList<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(ArrayList<Categoria> categorias) {
		this.categorias = categorias;
	}
	public ArrayList<Time> getTimes() {
		return times;
	}
	public void setTimes(ArrayList<Time> times) {
		this.times = times;
	}
	public String getDataIni() {
		return dataIni;
	}
	public void setDataIni(String dataIni) {
		this.dataIni = dataIni;
	}
	public String getDataFin() {
		return dataFin;
	}
	public void setDataFin(String dataFin) {
		this.dataFin = dataFin;
	}
	public String getAnoCampeonato() {
		return anoCampeonato;
	}
	public void setAnoCampeonato(String anoCampeonato) {
		this.anoCampeonato = anoCampeonato;
	}
	public float getTaxaInscricao() {
		return taxaInscricao;
	}
	public void setTaxaInscricao(float taxaInscricao) {
		this.taxaInscricao = taxaInscricao;
	}
	public String getPeriodoInscricao() {
		return periodoInscricao;
	}
	public void setPeriodoInscricao(String periodoInscricao) {
		this.periodoInscricao = periodoInscricao;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	@Override
	public String toString() {
		return "Campeonato [dataIni=" + dataIni + ", dataFin=" + dataFin + ", anoCampeonato=" + anoCampeonato
				+ ", taxaInscricao=" + taxaInscricao + ", periodoInscricao=" + periodoInscricao + ", cidade=" + cidade
				/*+ ",nome=" + nome*/ + "]";
	}
	
	public boolean ValidaDadosTime(String time){
		return false;
	}
	
	
	
}
