package Hot_wheel;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		GameBoard gb = new GameBoard();
		
		JFrame gameFrame = new JFrame();
		gameFrame.setTitle("Mini Cooper");
		gameFrame.setSize(760,464);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.add(gb);
		
		gameFrame.setVisible(true);
	
		
		
		
		
	}

}
