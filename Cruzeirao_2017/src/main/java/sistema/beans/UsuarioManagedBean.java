package sistema.beans;


import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import sistema.modelos.Tipo;
import sistema.modelos.Usuario;
import sistema.service.UsuarioService;

public class UsuarioManagedBean {
	private UsuarioService service = new UsuarioService();
	private Usuario usuario = new Usuario();

	private Tipo tipo;

	public UsuarioService getService() {
		return service;
	}

	public void setService(UsuarioService service) {
		this.service = service;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public void salvar() {
		service.salvar(usuario);
		usuario = new Usuario();
		FacesMessage msg = new FacesMessage("Successful", "Welcome :" + usuario.getNome());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

}
