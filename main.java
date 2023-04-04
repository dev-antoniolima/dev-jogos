package aula;

public class Main {
	
	public static void main(String[] args) {
		/*
		int idade = 24;
		System.out.println("minha idade e " +idade); 
		idade = 25;
		System.out.println("minha idade e " +idade);
		*/
		
		
		//Tipos de variaves
		/*
		int numero = 24;
		String frase = "Ola mundo";
		boolean var = true;
		char var2 = 'a';
		double var3 = 24.9;
		
		System.out.println(numero);
		System.out.println(frase);
		System.out.println(var);
		System.out.println(var2);
		System.out.println(var3);
		*/
		/*
		//Constantes
		final int vida_maxima = 10;
		
	
		System.out.println(vida_maxima);
		*/
		/*
		 * 
		 * Array Normal
		 */
		/*
		String[] nome = new String[5];
		nome[0] = "guilherme";
		nome[1] = "joao";
		/*
		 * 
		 * Array Multidimensional
		 */
		/*
		String[][] var2 = new String [5][5];
		var2[0][0] = "felipe";
		System.out.println(var2[0][0]);
		*/
		
		
		
		//Condicioniais
		/*
		int vida = 101;
		if(vida > 100) {
			vida+=100;
			System.out.println("minha vida e maior a 100!");
		}else {
			System.out.println("minha vida nao e igual a 100!");
		}
		String nome = "matheus";
				if(nome == "matheus") {
					System.out.println("meu nome e " +nome);
				}
				if(nome != "matheus") {
					System.out.println("meu nome nao e mateus");
				}
				boolean var = true;
				if(var) {
					System.out.println("verdade");
			
				}
			*/
		//Switch Case
		/*
		    int vida = 100;
		    
		    switch(vida)
		    {
		    case 90:
		    System.out.println("quero que meu personagem corra mais rapido!");
		    break;
		    case 30:
		    System.out.println("minha vida e igual a 30!");
		    break;
		    default:
		    System.out.println("nenhuma condicao bateu!");
		    break;
		    }
		 */
		
		//Operadores
		/*
		int vida_1 = 100;
		int vida_2 = 100;
		int vida_final = vida_1+vida_2;
		
		System.out.println(vida_final);
		
		int vida_final2 = ((vida_1 + vida_2) /2) *2;
		*/
		/*
		String nome_jogador = "matheus";
		int skill = 100;
		if(nome_jogador == "matheus" && skill == 100) {
			System.out.println("verdade");
		}
	
		if ((nome_jogador == "matheus" || nome_jogador == "antonio") && skill >= 100) {
			System.out.println("comece o jogo");
		}
        */
		
		//Loopings
		/*
		int contador = 0;
		
		while(contador <= 10) {
			System.out.println(contador);
			contador++;
		}
		*/
		/*
		for(int i = 0;i<=10;i++) {
			System.out.println(i);
		}
		*forma mais complexa
		*/
		/*
		contador = 0;
        do {
        	System.out.println(contador);
			contador++;
		}while(contador <= 100);
		*casos mais expeccificos
		*/
		int contador = 0;
		for(int i = 0;i<=10;i--) {
			System.out.println(i);
		}
	}
}