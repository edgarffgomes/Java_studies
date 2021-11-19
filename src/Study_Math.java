
public class Study_Math {
	
	//A API Math n�o precisa ser importada por meio de c�digo
	public static void main(String[] args) {
		double a = 8;
		double b = 3;
		double c = 7.43;
		
		//Alguns exemplos de m�todos da API Math s�o:
		
		//M�todo abs retorna o valor absoluto do par�metro inserido:
		System.out.println("O valor absoluto de a �: " + Math.abs(a));
		//M�todo ceil retorna o valor arredondado pra cima do par�metro inserido:
		System.out.println("O valor de c arrendondado pra cima �: " + Math.ceil(c));
		//M�todo floor retorna o valor arredondado pra baixo do par�metro inserido:
		System.out.println("O valor de c arrendondado pra baixo �: " + Math.floor(c));
		//M�todo max retorna o maior valor entre dois par�metros:
		System.out.println("O maior valor entre a e b �: " + Math.max(a, b));
		//M�todo min retorna o maior valor entre dois par�metros:
		System.out.println("O maior valor entre a e b �: " + Math.max(a, b));
		//M�todo pow retorna a potencia��o do primeiro par�metro pelo segundo:
		System.out.println("O valor de a elevado a b �: " + Math.pow(a,b));
		//M�todo sqrt retorna a ra�z quadrado do par�metro inserido:
		System.out.println("A raiz quadrada de a �: " + Math.sqrt(a));
		//M�todo log10 retorna o logaritmo de 10 n� base do par�metro inserido:
		System.out.println("O log de 10 na base c �: " + Math.log10(c));
		//M�todo random retorna um valor double aleat�rio (N�o possui par�metros):
		System.out.println("Valor aleat�rio: " + Math.random());
		//M�todo hypot retorna a hipotenusa entre dois par�metros:
		System.out.println("Hipotenusa entre b e c: " + Math.hypot(b,c));

		
		

	}

}
