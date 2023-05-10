package graficos;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable {
	

	public static JFrame frame;
	private Thread thread;
	private boolean isRunning = true;
	private final int WIDTH = 160;
	private final int HEIGHT = 120;
	private final int SCALE = 3;
	
	public Game() {
		
		initFrame();
	}
	
	public void initFrame() {
		this.setPreferredSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
		frame = new JFrame();
		frame.add(this);
		frame.pack();
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	
	
	public synchronized void start() {
		thread = new Thread(this);
		isRunning = true;
		thread.start();
		
	}
	
	public synchronized void stop() {
	
		
	}
	
	public static void main(String args[]) {
		Game game = new Game();
		game.start();
		
	}
	
	
	public void endCicle() {
		
	}
	
	public void render() {
		
	}
	
	
	public void run() {
		
		long lastTime = System.nanoTime();
		double amountOfCicles = 60.0;
		double nanosecs = 1000000000 / amountOfCicles;
		double delta = 0;
		int frames = 0;
		double timer = System.currentTimeMillis();

		
		while(isRunning) {

			long now = System.nanoTime();
			delta+= (now - lastTime) / nanosecs;
			lastTime = now;
				if(delta >= 1) {
					endCicle();
					render();
					frames++;
					delta--;
				}
				
			if(System.currentTimeMillis() - timer >= 1000) {
				System.out.println("FPS: " +frames);
				frames = 0;
				timer+=1000;
				
			}
		}
			
	}
	
}
