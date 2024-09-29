package clases;

import interfaz.Componente;

public class DecoradorConcretoB extends Decorador {

	public DecoradorConcretoB(Componente componente) {
		super(componente);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void operar() {
        super.operar();
        agregarFuncionalidadA();
    }

	private void agregarFuncionalidadA() {
		System.out.println("Funcionalidad adicional B.");
		
	}

}
