package sistema.modelos;

import java.util.ArrayList;

public class Categoria {
	
	private int idadeMinima;
	private String sexo;
	private int quantidadeMaxJogadores;
	private int quantidadeMinJogadores;
	private int quantidadeMaxTimes;
	private ArrayList<Partida> partidas;
	private ArrayList<Time> times;
	private boolean validarJogador;
	private boolean validarTime;
	
	
	public ArrayList<Time> getTimes() {
		return times;
	}
	public void setTimes(ArrayList<Time> times) {
		this.times = times;
	}
	public boolean isValidarJogador() {
		return validarJogador;
	}
	public void setValidarJogador(boolean validarJogador) {
		this.validarJogador = validarJogador;
	}
	public boolean isValidarTime() {
		return validarTime;
	}
	public void setValidarTime(boolean validarTime) {
		this.validarTime = validarTime;
	}
	public int getIdadeMinima() {
		return idadeMinima;
	}
	public void setIdadeMinima(int idadeMinima) {
		this.idadeMinima = idadeMinima;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getQuantidadeMaxJogadores() {
		return quantidadeMaxJogadores;
	}
	public void setQuantidadeMaxJogadores(int quantidadeMaxJogadores) {
		this.quantidadeMaxJogadores = quantidadeMaxJogadores;
	}
	public int getQuantidadeMinJogadores() {
		return quantidadeMinJogadores;
	}
	public void setQuantidadeMinJogadores(int quantidadeMinJogadores) {
		this.quantidadeMinJogadores = quantidadeMinJogadores;
	}
	public int getQuantidadeMaxTimes() {
		return quantidadeMaxTimes;
	}
	public void setQuantidadeMaxTimes(int quantidadeMaxTimes) {
		this.quantidadeMaxTimes = quantidadeMaxTimes;
	}
	public ArrayList<Partida> getPartidas() {
		return partidas;
	}
	public void setPartidas(ArrayList<Partida> partidas) {
		this.partidas = partidas;
	}
	
	public void gerarChave(){
		
	}
	
	public boolean addTime(Time time){
		return false;
	}
	
	public boolean addJogador(Jogador jogador){
		return false;
	}	
	
	public void switchTimes(boolean validarTime){
		
	}

	public void switchJogador(boolean validarJogador){
		
	}	
	
	public int validarCategoria(ArrayList<Time> times){
		return 0;
	}
	
	@Override
	public String toString() {
		return "Categoria [idadeMinima=" + idadeMinima + ", sexo=" + sexo + ", quantidadeMaxJogadores="
				+ quantidadeMaxJogadores + ", quantidadeMinJogadores=" + quantidadeMinJogadores
				+ ", quantidadeMaxTimes=" + quantidadeMaxTimes + ", partidas=" + partidas + ", times=" + times
				+ ", validarJogador=" + validarJogador + ", validarTime=" + validarTime + "]";
	}
	
}
