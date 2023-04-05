package programa_leitura;

import java.util.Scanner;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/*
		 * String nome, idade, peso, cidade, estado, pais;
		 * System.out.println("Por favor digite o seu nome: "); nome = in.nextLine();
		 * System.out.println("Por favor digite a sua idade: "); idade = in.nextLine();
		 * System.out.println("Por favor digite o seu peso: "); peso = in.nextLine();
		 * System.out.println("Por favor digite a sua cidade: "); cidade =
		 * in.nextLine();
		 * 
		 * if(cidade != "rio de janeiro" || cidade != "rj" || cidade !=
		 * "Rio de Janeiro") { System.out.println("Que sorte em, aqui a bala come"); }
		 * 
		 * System.out.println("Por favor digite o seu estado: "); estado =
		 * in.nextLine(); System.out.println("Por favor digite o seu país: "); pais =
		 * in.nextLine(); // Gerar resultado final; System.out.println(".......");
		 * System.out.println("Aqui está o resultado do teste: ");
		 * System.out.println("Nome: "+nome); System.out.println("Idade: "+idade);
		 * System.out.println("Peso: "+peso); System.out.println("Cidade: "+cidade);
		 * System.out.println("Estado: "+estado); System.out.println("País: "+pais);
		 */
		
		Random rand = new Random();
		String nome;
		String direcao;
		String comando;
		int sangue_protagonista;
		Double sangue_inimigo;
		
		
		System.out.println("Seja bem-vindo ao jogo! Insira o seu nome:");
		nome = in.nextLine();
		
		System.out.println("Seja muito Bem-Vindo " +nome);
		
		sangue_protagonista = 100;
		sangue_inimigo = 45.5;
		
		System.out.println("Você deseja avançar para qual direção ?(w, s, a, d)");
		direcao = in.nextLine();
		
		System.out.println("Um inimigo surgiu, o que deseja fazer ? (a = atacar,c = correr)");
		 comando = in.nextLine();
		 
		 if(comando.equals("a") && sangue_protagonista < 10) {
			 System.out.println("Seu sangue está muito baixo, não é possível atacar, fuja !!!");
		 }
		
		if(comando.equals ("a") && sangue_protagonista > 10) {
			sangue_inimigo = 45.5;
			if(rand.nextInt(100) < 75 && sangue_inimigo.equals(45.5)) {
				System.out.println("Você ganhou, o inimigo fugiu com:  !"+sangue_inimigo+" de hp");
			}
			else {
				System.out.println("Você perdeu");
			}
			
			
		} if(comando.equals("c")) {
			System.out.println("Você correu! O jogo terminou !");
		}
		
	
	}
}