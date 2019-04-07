package Hot_wheel;
import java.awt.Graphics;

import javax.swing.ImageIcon;
public class Coin {

	private int x,y;
	private boolean isNotHit;
	private String imagePath;
	
	public Coin(int x, int y, boolean isNotHit, String imagePath) {
		
		this.x = x;
		this.y = y;
		this.isNotHit= isNotHit;
		this.imagePath = imagePath;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isNotHit() {
		return isNotHit;
	}

	public void setHit(boolean isNotHit) {
		this.isNotHit = isNotHit;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	public void draw(Graphics g){
		
		ImageIcon Coin = new ImageIcon(imagePath);
		g.drawImage(Coin.getImage(), x, y, null);
		
	}

	
}
