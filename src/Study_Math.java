
public class Study_Math {
	
	//A API Math não precisa ser importada por meio de código
	public static void main(String[] args) {
		double a = 8;
		double b = 3;
		double c = 7.43;
		
		//Alguns exemplos de métodos da API Math são:
		
		//Método abs retorna o valor absoluto do parâmetro inserido:
		System.out.println("O valor absoluto de a é: " + Math.abs(a));
		//Método ceil retorna o valor arredondado pra cima do parâmetro inserido:
		System.out.println("O valor de c arrendondado pra cima é: " + Math.ceil(c));
		//Método floor retorna o valor arredondado pra baixo do parâmetro inserido:
		System.out.println("O valor de c arrendondado pra baixo é: " + Math.floor(c));
		//Método max retorna o maior valor entre dois parâmetros:
		System.out.println("O maior valor entre a e b é: " + Math.max(a, b));
		//Método min retorna o maior valor entre dois parâmetros:
		System.out.println("O maior valor entre a e b é: " + Math.max(a, b));
		//Método pow retorna a potenciação do primeiro parâmetro pelo segundo:
		System.out.println("O valor de a elevado a b é: " + Math.pow(a,b));
		//Método sqrt retorna a raíz quadrado do parâmetro inserido:
		System.out.println("A raiz quadrada de a é: " + Math.sqrt(a));
		//Método log10 retorna o logaritmo de 10 ná base do parâmetro inserido:
		System.out.println("O log de 10 na base c é: " + Math.log10(c));
		//Método random retorna um valor double aleatório (Não possui parâmetros):
		System.out.println("Valor aleatório: " + Math.random());
		//Método hypot retorna a hipotenusa entre dois parâmetros:
		System.out.println("Hipotenusa entre b e c: " + Math.hypot(b,c));

		
		

	}

}
