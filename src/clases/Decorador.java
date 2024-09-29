package clases;

import interfaz.Componente;

public abstract class Decorador implements Componente {
	protected Componente componente;
	
	

	public Decorador(Componente componente) {
		super();
		this.componente = componente;
	}



	@Override
	public void operar() {
		// TODO Auto-generated method stub
		componente.operar();
	}
}
