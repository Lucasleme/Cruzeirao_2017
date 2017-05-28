package sistema.modelos;

import java.util.List;

public class Categoria {

	private int CategoriaID;

	private String nome;
	private int nascidoApartirDe;
	private List<Inscricao> inscricoes;
	private Campeonato campeonato;
	private List<Grupo> grupos;
	private int minJogadores;
	private int maxJogadores;
	private Sexo sexo;

	public int getCategoriaID() {
		return CategoriaID;
	}

	public void setCategoriaID(int categoriaID) {
		CategoriaID = categoriaID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNascidoApartirDe() {
		return nascidoApartirDe;
	}

	public void setNascidoApartirDe(int nascidoApartirDe) {
		this.nascidoApartirDe = nascidoApartirDe;
	}

	public List<Inscricao> getInscricoes() {
		return inscricoes;
	}

	public void setInscricoes(List<Inscricao> inscricoes) {
		this.inscricoes = inscricoes;
	}

	public void addInscricoes(Inscricao inscricao){
		inscricoes.add(inscricao);
	}
	
	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}

	public List<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}
	
	public void addGrupo(Grupo grupo){
		grupos.add(grupo);
	}

	public int getMinJogadores() {
		return minJogadores;
	}

	public void setMinJogadores(int minJogadores) {
		this.minJogadores = minJogadores;
	}

	public int getMaxJogadores() {
		return maxJogadores;
	}

	public void setMaxJogadores(int maxJogadores) {
		this.maxJogadores = maxJogadores;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	
	//***********faltando implementar, gerar a chave************
	public void gerarChave() {

	}
	
	//***********faltando implementar, validar as equipes*********
	public int validarCategoria(){
		return 0;
	}

}
