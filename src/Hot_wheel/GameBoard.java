package Hot_wheel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class GameBoard extends JPanel implements KeyListener {

	Car mycar;

	Coin []coins = new Coin[8];
	static int score = 0;
	
	
	
	
	String [] imagesD;
	
	

	int imageIndexD = 0;
	
	public GameBoard(){
		super();
		
		super.addKeyListener(this);
		super.setFocusable(true);
		
		imagesD = new String []{
"Image/0.png",
"Image/1.png",
"Image/2.png",
"Image/3.png",
"Image/4.png",
"Image/5.png",
"Image/6.png",
"Image/7.png",
"Image/8.png",
"Image/9.png",
"Image/10.png",
"Image/11.png",
"Image/12.png",
"Image/13.png",
"Image/14.png",
"Image/15.png",
"Image/16.png",
"Image/17.png",
"Image/18.png",
"Image/19.png"
};


		
	
		mycar = new Car(85,330,"Image/0.png");
		int xCoin = 30,yCoin = 30;
        
			
			coins[0] = new Coin(xCoin,yCoin,true,"Image/coin1.png");
			coins[0].setX(130);
			coins[0].setY(100);
			
            coins[1] = new Coin(xCoin,yCoin,true,"Image/coin1.png");
			coins[1].setX(300);
			coins[1].setY(140);
			
			coins[2] = new Coin(xCoin,yCoin,true,"Image/coin1.png");
			coins[2].setX(600);
			coins[2].setY(120);
			
			coins[3] = new Coin(xCoin,yCoin,true,"Image/coin1.png");
			coins[3].setX(710);
			coins[3].setY(212);
			
			coins[4] = new Coin(xCoin,yCoin,true,"Image/coin1.png");
			coins[4].setX(676);
			coins[4].setY(308);
			
			coins[5] = new Coin(xCoin,yCoin,true,"Image/coin1.png");
			coins[5].setX(535);
			coins[5].setY(360);
			
			coins[6] = new Coin(xCoin,yCoin,true,"Image/coin1.png");
			coins[6].setX(358);
			coins[6].setY(347);
			
			coins[7] = new Coin(xCoin,yCoin,true,"Image/coin1.png");
			coins[7].setX(192);
			coins[7].setY(370);
			
		
			
	}
	
   public void paint(Graphics g){
	   
		
		ImageIcon background = new ImageIcon("Image/back.jpg");
		g.drawImage(background.getImage(), 0, 0, null);
		mycar.draw(g);
		for(int i = 0; i < coins.length; i++)
			if(coins[i].isNotHit() == true)
				coins[i].draw(g);
		g.setColor(Color.BLACK);
		g.drawString("Score: " + score, 680, 20);
		
   }
@Override
public void keyPressed(KeyEvent e) {
	if(e.getKeyCode() == KeyEvent.VK_LEFT){
		if(mycar.getX() > 0)
			mycar.setX(mycar.getX() - 3);
	
      }
	else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
		if(mycar.getX()<1400)
		mycar.setX(mycar.getX( )+ 3);
		
	}
	
	else if(e.getKeyCode() == KeyEvent.VK_UP){
		if(mycar.getY()>0)
			mycar.setY(mycar.getY( )- 3 );
		}
	else if(e.getKeyCode() == KeyEvent.VK_DOWN){
		if(mycar.getY()<768)
			mycar.setY(mycar.getY()+3);
		}
	else if(e.getKeyCode()== KeyEvent.VK_D){
		imageIndexD = (imageIndexD + 1)% imagesD.length;
		mycar.setImagePath(imagesD[imageIndexD]);
		repaint();
		
	}

	super.repaint();
		
}	
@Override
public void keyReleased(KeyEvent e) {

}
@Override
public void keyTyped(KeyEvent e) {
	
	
}

	
	
	
}
	