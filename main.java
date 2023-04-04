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
		/*
		 * String[] nome = new String[5]; nome[0] = "Guilherme"; nome[1] = "João";
		 * 
		 * // Array Multidimensional
		 * 
		 * String[][] var2 = new String[5][5]; var2[0][0] = "Felipe";
		 * System.out.println(var2[0][0]);
		 */
		
		// Condicionais //
		
		/*
		 * int vida = 100; if (vida == 100) { vida+=100;
		 * System.out.println("Minha vida é igual a 100"); } else {
		 * System.out.println("Minha vida não é igual a 100"); }
		 * 
		 * 
		 * String nome = "Guilherme"; if(nome == "Guilherme") {
		 * System.out.println("Meu nome é: "+nome); } else if(nome == "Joao") {
		 * 
		 * } else if (nome == "Felipe") {
		 * 
		 * }
		 * 
		 * if(nome != "joao") { System.out.println("O nome é diferente de João"); }
		 * 
		 * boolean var = true; if(var) System.out.println("Verdadeiro"); else {
		 * System.out.println("Falso"); }
		 */
		
		// Switch e Case //
		
		/*
		 * int vida = 100;
		 * 
		 * switch(vida) { case 90:
		 * System.out.println("Quero que meu personagem corra mais rápido");
		 * 
		 * break;
		 * 
		 * case 30: System.out.println("Minha vida é igual a 30");
		 * 
		 * break;
		 * 
		 * default: System.out.println("Nenhuma condição bateu");
		 * 
		 * break; }
		 */
		
		//Operadores Lógicos//
		
		/*
		 * int vida_1 = 100; int vida_2 = 100; int vida_3 = 200; int vida_final = vida_1
		 * + vida_2 + vida_3;
		 * 
		 * int vida_final2 = ((vida_1 + vida_2) / 2 * 2);
		 * System.out.println(vida_final2);
		 * 
		 * String nome = "Antonio"; boolean terGato = true;
		 * 
		 * if ((nome == "Antonio" || nome == "Simba") && terGato) {
		 * System.out.println("Uma das condições é verdadeira e tem gato");
		 * 
		 * }
		 */
		
	int contador = 0;
	
	/*
	 * while(contador <= 10) { System.out.println("Conte: "+contador); contador++; }
	 */
	/*
	 * for(int i = 0; i<=10; i++) { System.out.println("Conte: "+i);
	 * 
	 * }
	 */
		
	do {
		System.out.println(contador++);
	} while (contador < 3);
	
 }
}