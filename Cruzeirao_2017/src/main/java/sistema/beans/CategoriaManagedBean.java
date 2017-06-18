package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Categoria;
import sistema.service.CategoriaService;

@ManagedBean
@SessionScoped
public class CategoriaManagedBean {
	

	private Categoria categoria = new Categoria();
	private List<Categoria> categorias;
	private CategoriaService service = new CategoriaService();
	
	
	public void salvar()
	{
		service.salvar(categoria);
		
		if (categorias != null)
			categorias.add(categoria);

		
		categoria = new Categoria();
		
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Categoria> getCategorias() {
		return service.getCategorias();
	}

	
}
