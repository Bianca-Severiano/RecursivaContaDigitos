package controller;

public class ControllerContaDigitos {

	public ControllerContaDigitos() {
		super();
	}

	public int ContaDigitos(int a) {
		int cont = 0;
		if (a == 0) { // Quando valor for igual a 0, não há mais números a contar, então retorna 0
			return 0;
		} else {
			cont = 1 + ContaDigitos(a / 10); // A cada execução onde valor for != 0 somar 1 ao contador
			return cont;
		}
	}
}
