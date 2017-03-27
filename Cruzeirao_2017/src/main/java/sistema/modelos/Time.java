package sistema.modelos;

import java.util.ArrayList;

public class Time {
	private String nome;
	private String responsavel;
	private ArrayList<Pessoa> Jogadores;
	private String enderecos;
	private String cidade;
	private String diretorTime;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public ArrayList<Pessoa> getJogadores() {
		return Jogadores;
	}
	public void setJogadores(ArrayList<Pessoa> jogadores) {
		Jogadores = jogadores;
	}
	public String getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(String enderecos) {
		this.enderecos = enderecos;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getDiretorTime() {
		return diretorTime;
	}
	public void setDiretorTime(String diretorTime) {
		this.diretorTime = diretorTime;
	}
	@Override
	public String toString() {
		return "Time [nome=" + nome + ", responsavel=" + responsavel + ", enderecos=" + enderecos + ", cidade=" + cidade
				+ ", diretorTime=" + diretorTime + "]";
	}
	
	public boolean Validar_jogadores(){
		return true;
	}
}
