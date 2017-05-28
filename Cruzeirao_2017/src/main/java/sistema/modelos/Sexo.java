package sistema.modelos;

public enum Sexo {
	Masculino(1), Feminino(2);
	
	private int valor;
	
	Sexo(int valor){
		this.valor = valor;
	}
	
	public int getValor(){
		return valor;
	}
}
