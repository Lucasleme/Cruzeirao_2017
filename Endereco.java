package sistema.modelos;

public class Endereco {
	
	private String rua;
	private String Cidade;
	private String Bairro;
	private String Estado;
	
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getBairro() {
		return Bairro;
	}
	public void setBairro(String bairro) {
		Bairro = bairro;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", Cidade=" + Cidade + ", Bairro=" + Bairro + ", Estado=" + Estado + "]";
	}
	
	
	

}
