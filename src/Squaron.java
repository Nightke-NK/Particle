import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Squaron extends Particle {

	public Squaron(String name, int x, int y, Color color) {
		super(name, x, y, color);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void render(Graphics g) {

		Graphics2D g2d = (Graphics2D) g.create();
			//g2d.fillOval(x - (size / 2), y - (size / 2), size, size);
		
			g2d.setColor(Color.GREEN);
			g2d.fillRect(x - (size / 2), y - (size / 2), size, size);
	
		// TODO: display particle's info next to the particle object

		g2d.dispose();
	}
}
