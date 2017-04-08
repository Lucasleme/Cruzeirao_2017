package sistema.modelos;

import java.util.ArrayList;

public class Campeonato {
	
	private ArrayList<Categoria> categorias;
	private ArrayList<Time> times;
	private ArrayList<Endereco> enderecos; 
	private String dataIni;
	private Inscricao inscricao; 
	private String anoCampeonato;
	private String cidade;
	private String nome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
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

	public String getAnoCampeonato() {
		return anoCampeonato;
	}
	public void setAnoCampeonato(String anoCampeonato) {
		this.anoCampeonato = anoCampeonato;
	}

	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public ArrayList<Endereco> getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(ArrayList<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	public Inscricao getInscricao() {
		return inscricao;
	}
	public void setInscricao(Inscricao inscricao) {
		this.inscricao = inscricao;
	}
	@Override
	public String toString() {
		return "Campeonato [dataIni=" + dataIni + ", dataFin=" + inscricao.getDataFinCampeonato() + ", anoCampeonato=" + anoCampeonato
				+ ", taxaInscricao=" + inscricao.getTaxa() + ", cidade=" + cidade
				+",nome=" + nome + "]";
	}
	
	public boolean ValidaDadosTime(String time){
		return false;
	}
	
	
	
}
