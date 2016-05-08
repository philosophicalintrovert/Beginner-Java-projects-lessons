import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class GraphicsDrawing extends JFrame{
	
	public GraphicsDrawing(){
		setTitle("Testing");
		setSize(800, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void paint(Graphics g){
		g.setColor(Color.RED);
		g.fillRect(0, 0, 1000, 100);
		g.setColor(Color.YELLOW);
		g.drawRect(10, 200, 200, 400);
		g.setColor(Color.BLACK);
		g.drawString("Testing.", 90, 180);
	}
	
	public static void main(String[] args){
		GraphicsDrawing graphics = new GraphicsDrawing();
	}
}
