package sistema.modelos;

import java.util.List;

public class Usuario {

	private int UsuarioID;

	private String email;
	private String nome;
	private Date dataNascimento;
	private List<Equipe> equipes;
	private List<Inscrito> inscricoes;
	private List<Campeonato> campeonatos;
	private Tipo tipo;
	private String telefoneFixo;
	private String telefoneMovel;
	private String endereco;
	private String CPF;
	private String RG;
	private Sexo sexo;
	private String senha;

	public int getUsuarioID() {
		return UsuarioID;
	}

	public void setUsuarioID(int usuarioID) {
		UsuarioID = usuarioID;
	}

	public List<Equipe> getEquipes() {
		return equipes;
	}

	public void setEquipes(List<Equipe> equipes) {
		this.equipes = equipes;
	}

	public void addEquipes(Equipe equipe) {
		equipes.add(equipe);
	}

	public List<Inscrito> getInscricoes() {
		return inscricoes;
	}

	public void setInscricoes(List<Inscrito> inscricoes) {
		this.inscricoes = inscricoes;
	}

	public void addInscritos(Inscrito inscrito) {
		inscricoes.add(inscrito);
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento1(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public List<Campeonato> getCampeonatos() {
		return campeonatos;
	}

	public void setCampeonatos(List<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}

	public void addCampeonato(Campeonato campeonato) {
		campeonatos.add(campeonato);
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public String getTelefoneFixo() {
		return telefoneFixo;
	}

	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}

	public String getTelefoneMovel() {
		return telefoneMovel;
	}

	public void setTelefoneMovel(String telefoneMovel) {
		this.telefoneMovel = telefoneMovel;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [email=" + email + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", campeonatos="
				+ campeonatos + ", tipo=" + tipo + ", telefoneFixo=" + telefoneFixo + ", telefoneMovel=" + telefoneMovel
				+ ", endereco=" + endereco + ", CPF=" + CPF + ", RG=" + RG + ", sexo=" + sexo + ", senha=" + senha
				+ "]";
	}

}
