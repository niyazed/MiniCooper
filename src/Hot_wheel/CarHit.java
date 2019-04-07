package Hot_wheel;
import java.awt.Rectangle;

public class CarHit extends Thread {

	private Car mycar;
	private Coin[] coins;
	private GameBoard gameBoard;
	public CarHit(Car mycar, Coin[] coins, GameBoard gameBoard) {
		this.mycar = mycar;
		this.coins = coins;
		this.gameBoard = gameBoard;
	}

public void run(){
		
		while(mycar.getX() > 0 && mycar.getY()> 0){
			
			
			
			checkCollision();
		
			
			gameBoard.repaint();
		}
		}
		
	public void checkCollision(){
		
		Rectangle carRect = new Rectangle(mycar.getX(),mycar.getY(),35,35);
		
		for(int i = 0; i < coins.length; i++){
			
			Rectangle coinRect = new Rectangle(coins[i].getX(),coins[i].getY(),15,15);
			
			if(carRect.intersects(coinRect) == true){
				coins[i].setHit(false);
				coins[i].setY(-3000);
				GameSound.CarHitSound();
				GameBoard.score++;
				break;
			}
			
		}
	

	
	
	
	}}
