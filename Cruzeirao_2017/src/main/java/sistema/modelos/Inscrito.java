package sistema.modelos;

public class Inscrito {

	private int InscritoID;

	private Tipo tipo;
	private Usuario usuario;
	private Inscricao inscricao;
	private boolean aceiteUsuario;
	private boolean InscricaoValidada;

	public int getInscritoID() {
		return InscritoID;
	}

	public void setInscritoID(int inscritoID) {
		InscritoID = inscritoID;
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

	public Inscricao getInscricao() {
		return inscricao;
	}

	public void setInscricao(Inscricao inscricao) {
		this.inscricao = inscricao;
	}

	public boolean isAceiteUsuario() {
		return aceiteUsuario;
	}

	public void setAceiteUsuario(boolean aceiteUsuario) {
		this.aceiteUsuario = aceiteUsuario;
	}

	public boolean isInscricaoValidada() {
		return InscricaoValidada;
	}

	public void setInscricaoValidada(boolean inscricaoValidada) {
		InscricaoValidada = inscricaoValidada;
	}

	@Override
	public String toString() {
		return "Inscrito [tipo=" + tipo + ", usuario=" + usuario + ", inscricao=" + inscricao + ", aceiteUsuario="
				+ aceiteUsuario + ", InscricaoValidada=" + InscricaoValidada + "]";
	}

}
