package clases;

import interfaz.Componente;

public class DecoradorConcretoA extends Decorador {

	public DecoradorConcretoA(Componente componente) {
		super(componente);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void operar() {
        super.operar();
        agregarFuncionalidadA();
    }

	private void agregarFuncionalidadA() {
		// TODO Auto-generated method stub
		System.out.println("Funcionalidad adicional A");
		
	}

	
	
}
