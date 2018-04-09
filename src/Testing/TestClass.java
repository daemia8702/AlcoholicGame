package Testing;


import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import com.daemia.alcoholic.states.GameState;

// this class is just for testing
public class TestClass {
	
	private static GameState game = new GameState();
	
	public static void main(String[] args) {
		writeTest();
		System.out.println("Writing ready...");
	}

	
	private static void writeTest() {
		
		try(BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("gamingTestGettingDrunk.txt"), "UTF-8"))) {
			out.write(testCases() + "\r\n");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private static String testCases() {
		
		
		StringBuilder sb = new StringBuilder();
		while (game.getManager().getPlayer().getAlcoholLevel() < 30) {
			game.update();
			
			
			sb.append(game.getManager().getItemsList().get(0));
			sb.append(game.getManager().getPlayer());
			
			
			//System.out.println(game.getManager().getItemsList().get(0));
			//System.out.println(game.getManager().getPlayer());
		}
		
		return sb.toString();
	
	}
	/*private static String testCases() {
		int x = 0;
		StringBuilder sb = new StringBuilder();
		
		while (x <= 800) {
			game.update();
			
			sb.append(game.getManager().getPlayer());
			x++;
		}
		
		return sb.toString();
	}*/
	
	/*private static void testCases() {
		int x = 0;
		
		while (x <= 800) {
			game.update();
			
			
			//System.out.println(game.getManager().getItemsList().get(0));
			System.out.println(game.getManager().getPlayer());
			x++;
		}
		
	}*/
}
