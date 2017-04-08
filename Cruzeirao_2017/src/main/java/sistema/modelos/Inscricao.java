package sistema.modelos;

public class Inscricao {
	
	private String dataFinJogador;
	private String dataFinTime;
	private String dataFinCampeonato;
	private float taxa;
	public String getDataFinJogador() {
		return dataFinJogador;
	}
	public void setDataFinJogador(String dataFinJogador) {
		this.dataFinJogador = dataFinJogador;
	}
	public String getDataFinTime() {
		return dataFinTime;
	}
	public void setDataFinTime(String dataFinTime) {
		this.dataFinTime = dataFinTime;
	}
	public String getDataFinCampeonato() {
		return dataFinCampeonato;
	}
	public void setDataFinCampeonato(String dataFinCampeonato) {
		this.dataFinCampeonato = dataFinCampeonato;
	}
	public float getTaxa() {
		return taxa;
	}
	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}
	@Override
	public String toString() {
		return "Inscricao [dataFinJogador=" + dataFinJogador + ", dataFinTime=" + dataFinTime + ", dataFinCampeonato="
				+ dataFinCampeonato + ", taxa=" + taxa + "]";
	}
	
	
}
