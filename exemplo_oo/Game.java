package exemplo_oo;

public class Game {
	
	private Player player;
	private Enemy enemy;
	
	public Game() {
		if(player == null) {
			System.out.println("O player não foi inicializado");
			player = new Tipo01();
		}
		
			if(player instanceof Player) {
			System.out.println("O player foi inicializado com sucesso e faz referência a classe Player");
		}
			
			if(player instanceof Tipo01) {
				System.out.println("");
			}
			
			else if (player instanceof Player) {
				
			}
		
			enemy = new Enemy();
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public Enemy getEnemy() {
		return enemy;
	}
	
	
	public static void main(String[] args) {
		Game game = new Game();
		Player player = game.getPlayer();
		player.atacarInimigo(game.getEnemy());
		System.out.println(game.getEnemy().life);
		
	}

}
