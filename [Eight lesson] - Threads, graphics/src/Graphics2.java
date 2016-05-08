import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

/*
 * The origin (0 (x), 0 (y)) of the coordinate system on a monitor is the top left not bottom left. 
 * This means that the Y values increase as you go down the screen.
 */

/*
 * g.clearRect(int x, int y, int width, int height); - creates a filled rectangle with the current color
 * (or default color if g.setColor() has not been called)
 * with the top left corner at (0 (x), 0 (y)) with width "width" and height "height".
 * 
 * g.setColor(Color c); - sets the current color of "g" as "Color c".
 * 
 * g.drawString(String str, int x, int y); - draws whatever string "str" at the point (x, y).
 * 
 * g.drawRect(int x, int y, int width, int height); - draws the outline of a rectangle beginning at (x, y)
 * with width "width" and height "height".
 * 
 * g.fillRect(int x, int y, int width, int height); - creates a filled-in rectangle at the point (x, y), with the width
 * "width" and the height "height".
 */

public class Graphics2 extends JFrame{

	//Constructor
	public Graphics2(){
		setTitle("Graphics class"); //Sets the windows' title to "Graphics class".
		setSize(800, 480); //Sets the windows' size.
		setVisible(true); //Makes the window visible for when we create it.
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Allows the window to close properly.
	}
	
	public void paint(Graphics g){
		g.setColor(Color.WHITE); //Sets the color to white.
		g.fillRect(0, 0, 800, 400); //Sets the position and the parameters of the rectangle.
		g.setColor(Color.BLUE); //Sets the color to blue.
		g.drawRect(60, 200, 100, 250); //Sets the position and the parameters of the rectangle.
		g.setColor(Color.BLACK); //Sets the color to black.
		g.drawString("My name is James", 200, 400); //Draws a string "My name is James" at the custom position.
	}
	
	public static void main(String[] args){
		Graphics2 graphics = new Graphics2(); //Creates a new object using the constructor defined above.
	}
	
}
