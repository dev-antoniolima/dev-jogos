package aula;

public class main {
	
	public static void main(String[] args) {
		/*
		 * int idade = 24; System.out.println("Minha idade é"+idade); idade = 25;
		 * System.out.println("Minha idade é"+idade); idade = 26;
		 * System.out.println("Minha idade é"+idade);
		 */
		
		// Tipos de Variáveis
		/*
		 * int numero = 24; String frase = "Olá mundo"; boolean var = true; char var2 =
		 * 'a'; double var3 = 24.9;
		 * 
		 * System.out.println(numero); System.out.println(frase);
		 * System.out.println(var); System.out.println(var2); System.out.println(var3);
		 */
		
		// Constantes
		
		/*
		 * final int vidaMaxima = 10; System.out.println(vidaMaxima);
		 */
		
		// Array Normal
		String[] nome = new String[5];
		nome[0] = "Guilherme";
		nome[1] = "João";
		
		// Array Multidimensional
		
		String[][] var2 = new String[5][5];
		var2[0][0] = "Felipe";
		System.out.println(var2[0][0]);
	}

}
