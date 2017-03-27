package sistema.modelos;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Partida {
	
	private Array times;
	private String data;
	private String horario;
	private int placarVencedor;
	private int placarPerdedor;
	private String endereco;
	private ArrayList<Jogador> gools;
	private ArrayList<Jogador> cartoesAmarelos; 
	private ArrayList<Jogador> cartoesVermelhos;
	
	
	public Array getTimes() {
		return times;
	}
	public void setTimes(Array times) {
		this.times = times;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public int getPlacarVencedor() {
		return placarVencedor;
	}
	public void setPlacarVencedor(int placarVencedor) {
		this.placarVencedor = placarVencedor;
	}
	public int getPlacarPerdedor() {
		return placarPerdedor;
	}
	public void setPlacarPerdedor(int placarPerdedor) {
		this.placarPerdedor = placarPerdedor;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public ArrayList<Jogador> getGools() {
		return gools;
	}
	public void setGools(ArrayList<Jogador> gools) {
		this.gools = gools;
	}
	public ArrayList<Jogador> getCartoesAmarelos() {
		return cartoesAmarelos;
	}
	public void setCartoesAmarelos(ArrayList<Jogador> cartoesAmarelos) {
		this.cartoesAmarelos = cartoesAmarelos;
	}
	public ArrayList<Jogador> getCartoesVermelhos() {
		return cartoesVermelhos;
	}
	public void setCartoesVermelhos(ArrayList<Jogador> cartoesVermelhos) {
		this.cartoesVermelhos = cartoesVermelhos;
	}
	@Override
	public String toString() {
		return "Partida [data=" + data + ", horario=" + horario + ", placarVencedor=" + placarVencedor
				+ ", placarPerdedor=" + placarPerdedor + ", endereco=" + endereco + "]";
	}
	
	

}
