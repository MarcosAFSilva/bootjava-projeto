package sequencial;

import java.util.Scanner;

public class Aumento1 {

	public static void main(String[] args) {

		double salarioBruto, porcentagemAumento;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o sal�rio bruto: R$ ");
		salarioBruto = sc.nextDouble();
		
		System.out.println("Informe a porcentagem a ser aplicada: (%)");
		porcentagemAumento = sc.nextDouble();
		
		salarioBruto = salarioBruto * (1 + (porcentagemAumento / 100));
		
		System.out.printf("O novo sal�rio bruto � R$ %.2f", salarioBruto);
		
		
		sc.close();
	}

}
