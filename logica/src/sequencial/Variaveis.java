package sequencial;

public class Variaveis {

	public static void main(String[] args) {

		int quantidade = 1500;
		float valorMercadoria = 750.28f;
		double peso = 78.3;
		char genero = 'F';
		
		System.out.printf("A quantidade de itens em estoque � %d\n", quantidade);
		System.out.printf("O valor da parcela � R$ %.2f\n", valorMercadoria);
		System.out.printf("O peso do produto � %f kg\n", peso);
		System.out.printf("Existem %d alunas matriculadas do g�nero %c\n", quantidade, genero);
	}

}
