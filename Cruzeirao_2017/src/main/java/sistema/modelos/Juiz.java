package sistema.modelos;

public class Juiz extends Usuario {

	private int JuizID;

	private Tipo tipo;
	private Usuario usuario;

	public int getJuizID() {
		return JuizID;
	}

	public void setJuizID(int juizID) {
		JuizID = juizID;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
