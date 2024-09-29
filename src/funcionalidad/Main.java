package funcionalidad;
import clases.*;
import interfaz.*;
public class Main {

	public static void main(String[] args) { //metodo principal
		
		Componente componente = new ComponenteConcreto();
		Componente decoradoA = new DecoradorConcretoA(componente);
		Componente decoradoB = new DecoradorConcretoB(componente);
		decoradoB.operar();
		
	}

}
