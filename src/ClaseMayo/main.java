package ClaseMayo;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Por favor ingrese aqui el titular de la cuenta: ");
		String titular = tc.nextLine();
		
		System.out.println("Por favor ingrese aqui cantidad inicial de la cuenta: ");
		double cant = tc.nextDouble();
		
		cuenta cuenta = new cuenta(titular, cant);
		
		System.out.println("Por favor ingrese aqui la cantidad a ingresar: ");
		double cantIngreso = tc.nextDouble();
		cuenta.ingresar(cantIngreso);
		
		System.out.println("Por favor ingrese aqui la cantidad a retirar: ");
		double cantRetiro = tc.nextDouble();
		
		cuenta.retirar(cantRetiro);
		
		System.out.println("Titular: " + cuenta.getTitular());
		System.out.println("Cantidad: " + cuenta.getCant());
		
		tc.close();
	}
}
