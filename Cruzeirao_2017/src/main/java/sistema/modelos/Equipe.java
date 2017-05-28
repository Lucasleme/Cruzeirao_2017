package sistema.modelos;

import java.util.List;

public class Equipe {

	private int EquipeID;

	private String nome;
	private String dataFundacao;
	private String cidade;
	private List<Usuario> diretores;

	public int getEquipeID() {
		return EquipeID;
	}

	public void setEquipeID(int equipeID) {
		EquipeID = equipeID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(String dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public List<Usuario> getDiretores() {
		return diretores;
	}

	public void setDiretores(List<Usuario> diretores) {
		this.diretores = diretores;
	}

	@Override
	public String toString() {
		return "Equipe [nome=" + nome + ", dataFundacao=" + dataFundacao + ", cidade=" + cidade + ", diretores="
				+ diretores + "]";
	}

}
