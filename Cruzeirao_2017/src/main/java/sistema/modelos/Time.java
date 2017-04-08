package sistema.modelos;

import java.util.ArrayList;

public class Time {
	private String nome;
	private String responsavel;
	private ArrayList<Usuario> Jogadores;
	private Endereco endereco;
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
	public ArrayList<Usuario> getJogadores() {
		return Jogadores;
	}
	public void setJogadores(ArrayList<Usuario> jogadores) {
		Jogadores = jogadores;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
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
		return "Time [nome=" + nome + ", responsavel=" + responsavel + ", enderecos=" + endereco + ", cidade=" + cidade
				+ ", diretorTime=" + diretorTime + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Jogadores == null) ? 0 : Jogadores.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((diretorTime == null) ? 0 : diretorTime.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((responsavel == null) ? 0 : responsavel.hashCode());
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
		Time other = (Time) obj;
		if (Jogadores == null) {
			if (other.Jogadores != null)
				return false;
		} else if (!Jogadores.equals(other.Jogadores))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (diretorTime == null) {
			if (other.diretorTime != null)
				return false;
		} else if (!diretorTime.equals(other.diretorTime))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (responsavel == null) {
			if (other.responsavel != null)
				return false;
		} else if (!responsavel.equals(other.responsavel))
			return false;
		return true;
	}
	public boolean Validar_jogadores(){
		return true;
	}
}
