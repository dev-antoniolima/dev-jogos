package oo;

public class Main {
	
	private static int exemplo() {
		return 10;
	}
	
	private static String exemplo2() {
		return "Antonio";
	}
	
	public void outroMetodo(int n1, String nome) {
		System.out.println(n1);
		System.out.println(nome);
	}
	
	public static void main(String[]args) {
		/*
		 * new Player2().nascer(); Player2 player2 = new Player2(); player2.nascer();
		 */
		System.out.println(exemplo());
		System.out.println(exemplo2());
		
		new Main().outroMetodo(10, "Antonio");
}
	
	
}