package Testing;


import States.GameState;

// this class is just for testing
public class TestClass {
	
	private static GameState game = new GameState();
	
	public static void main(String[] args) {
		testCases();
	}

	
	/*private static void writeTest() {
		
		try(BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("collisionTest.txt"), "UTF-8"))) {
			out.write(testCases() + "\r\n");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}*/
	
	/*private static String testCases() {
		int x = 0;
		
		StringBuilder sb = new StringBuilder();
		while (x <= 800) {
			game.update();
			
			 sb.append(game.getManager().getEntityList().get(0));
			 
			 x++;
		}
		
		return sb.toString();
	}*/
	
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
	
	private static void testCases() {
		int x = 0;
		
		while (x <= 500) {
			game.update();
			
			System.out.println(game.getManager().getPlayer().getPosX());
			x++;
		}
		
	}
}
