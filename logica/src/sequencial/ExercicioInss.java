package sequencial;

import java.util.Scanner;

public class ExercicioInss {

	public static void main(String[] args) {
		//O exerc�cio � calcular o desconto de INSS (11%) no sal�rio de um funcion�rio.
		
		
		double salarioBruto, descontoInss, salarioLiquido;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o sal�rio bruto do funcion�rio: R$ ");
		salarioBruto = sc.nextDouble();
		descontoInss = salarioBruto * 0.11;
		salarioLiquido = salarioBruto - descontoInss;
		
		System.out.printf("DESCONTO: O valor de desconto do INSS sobre o sal�rio bruto � R$ %.2f\n", descontoInss);
		System.out.printf("SAL�RIO L�QUIDO: R$ %.2f", salarioLiquido);
	}

}
