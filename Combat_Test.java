package aula;

public class Combat_Test {
	public static void main(String[]args) {
		String player_1 = "Antonio";
		String player_2 = "Matheus";
		
		final int hp_player_1 = 100;
		final int stg_player_1 = 10;	
		final int dfs_player_1 = 5;
		
		final int hp_player_2 = 100;
		final int stg_player_2 = 10;
		final int dfs_player_2 = 5;
		
		final int attack_player_1 = (stg_player_1 - dfs_player_2);
		final int attack_player_2 = (stg_player_2 - dfs_player_1);
				
		/*
		 *Player 1 dies
		
		int post_battle_hp_player_1 = (hp_player_1 - attack_player_2);
		while (post_battle_hp_player_1 >= 0) {
			System.out.println("Your HP is "+post_battle_hp_player_1);
			post_battle_hp_player_1 = post_battle_hp_player_1 - attack_player_2;
			if (post_battle_hp_player_1 == 0) {
				System.out.println(player_1+" is dead.");
			}
		}
		*/
		
		/*
		 *Player 2 dies 
		int post_battle_hp_player_2 = (hp_player_2 - attack_player_1);
		while (post_battle_hp_player_2 >= 0) {
			System.out.println("Your HP is "+post_battle_hp_player_2);
			post_battle_hp_player_2 = post_battle_hp_player_2 - attack_player_1;
			if (post_battle_hp_player_2 == 0) {
				System.out.println(player_2+" is dead.");
			}
			}
			*/
		}

	}	
