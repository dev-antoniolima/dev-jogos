package inicio_logica_games;

import java.util.ArrayList;

public class Game implements Runnable {
	
	private boolean isRunning;
	private Thread thread;
	
	private ArrayList<Entidade> entidades;
	
	public Game() {
		entidades.add(new Entidade());
		
		for(int i = 0; i< entidades.size(); i++) {
			Entidade e = entidades.get(0);
			
		}
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		game.start();
	}
	
	public synchronized void start() {
		isRunning = true;
		thread = new Thread(this);
		thread.start();
		
	}
	
	
	public void endCicle() {
		//Atualizar o jogo.
		System.out.println("Ciclo");
	}
	
	public void render() {
		//Renderizar o jogo.
		System.out.println("Render");
	}
	
	public void run () {
		while(isRunning) {
			endCicle();
			render();
//			try {
//			Thread.sleep(1000);
//			} 
//			catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			
			
		}
	}

}
