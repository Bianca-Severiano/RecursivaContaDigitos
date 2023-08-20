package view;

import controller.ControllerContaDigitos;

public class PrincipalContaDigito {

	public static void main(String[] args) {
		int v = 1000000;

		ControllerContaDigitos cd = new ControllerContaDigitos();
		int res = (cd.ContaDigitos(v));
		System.out.println(res);

	}

}
