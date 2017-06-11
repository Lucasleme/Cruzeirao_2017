package sistema.beans;

import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Usuario;
import sistema.service.UsuarioService;

@ManagedBean
@SessionScoped
public class UsuarioManagedBean {

	private Usuario usuario = new Usuario();
	private List<Usuario> usuarios;
	private UsuarioService service = new UsuarioService();
	private Date dataNascimento;
	
	   public Date getDataNascimento() {
	        return dataNascimento;
	    }
	 
	    public void setDataNascimento(Date dataNascimento) {
	        this.dataNascimento = dataNascimento;
	    }
	    
	public void salvar() {
		service.salvar(usuario);

		if (usuario != null)
			usuarios.add(usuario);

		usuario = new Usuario();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getUsuarios() {
		if (usuarios == null)
			usuarios = service.getUsuarios();

		return usuarios;
	}

	public void remover(Usuario usuario) {
		service.remover(usuario);
		usuarios.remove(usuario);

	}

}
