package sequencial;

import java.util.Scanner;

public class ExercicioMedia4 {

	//O exerc�cio pedia para calcular as m�dias ponderadas de 4 valores informados pelo usu�rio.
	//O exerc�cio declarava os valores, por�m decidi incrementar uma possibilidade para o pr�prio usu�rio escolher os pesos.
	
	public static void main(String[] args) {
		
		double n1, n2, n3, n4, peso1, peso2, peso3, peso4, mediaPonderada;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor:");
		n1 = sc.nextDouble();
		System.out.println("Este valor ter� peso:");
		peso1 = sc.nextDouble();
		
		n1 = n1 * peso1;
		
		System.out.printf("O primeiro valor agora �: %.2f\n", n1);
		
		System.out.println("Informe o segundo valor:");
		n2 = sc.nextDouble();
		System.out.println("Este valor ter� peso:");
		peso2 = sc.nextDouble();
		
		n2 = n2 * peso2;
		
		System.out.printf("O segundo valor agora �: %.2f\n", n2);
				
		System.out.println("Informe o terceiro valor:");
		n3 = sc.nextDouble();
		System.out.println("Este valor ter� peso:");
		peso3 = sc.nextDouble();
		
		n3 = n3 * peso3;
		
		System.out.printf("O terceiro valor agora �: %.2f\n", n3);
				
		System.out.println("Informe o quarto valor:");
		n4 = sc.nextDouble();
		System.out.println("Este valor ter� peso:");
		peso4 = sc.nextDouble();
		
		n4 = n4 * peso4;
		
		System.out.printf("O quarto valor agora �: %.2f\n", n4);
		
		mediaPonderada = (n1 + n2 + n3 + n4)/ 4;
		
		System.out.printf("A m�dia ponderada dos valores digitados �: %.2f", mediaPonderada);
		sc.close();
		
	}

}
