package sistema.modelos;

public enum Tipo {
	Adm(1),Organizador(2),Massagista(3),JuntaTecnica(4),Torcedor(5),Tecnico(6),
	Diretor(7),PreparadorFisico(8),AssistentesCampo(9),Goleiro(10),Marcador(11),
	CentroAvante(12),AlaDireita(13),AlaEsquerda(14),Pivo(15),Passador(16),Armador(17),
	Finalizador(18);
	
	private int valor;
	
	Tipo(int valor){
		this.valor = valor;
	}
	
	public int getValor(){
		return valor;
	}
}
