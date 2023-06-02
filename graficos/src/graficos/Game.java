package graficos;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable {
	

	public static JFrame frame;
	private Thread thread;
	private boolean isRunning = true;
	private final int WIDTH = 160;
	private final int HEIGHT = 120;
	private final int SCALE = 3;
	
	private BufferedImage image;
	
	public Game() {
		
		initFrame();
		image = new BufferedImage(WIDTH,HEIGHT, BufferedImage.TYPE_INT_RGB);
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
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = image.getGraphics();
		g.setColor(new Color(255,0,0));
		g.fillRect(0,0,160,120);
		g = bs.getDrawGraphics();
		g.drawImage(image, 0, 0, WIDTH*SCALE, HEIGHT*SCALE,null);
		bs.show();
;	}
	
	
	public void run() {
		
		long lastTime = System.nanoTime(); // Retorna o valor em milissegundo desde a última execução.
		double amountOfCicles = 60.0;
		double nanosecs = 1000000000 / amountOfCicles; // Converte para decimal
		double delta = 0;
		int frames = 0;
		double timer = System.currentTimeMillis(); // Tempo de Processamento da tarefa (ciclo).

		
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
				System.out.println("FPS: " +frames); // Mostra o FPS a cada 1 segundo.
				frames = 0;
				timer+=1000;
				
			}
		}
			
	}
	
}
