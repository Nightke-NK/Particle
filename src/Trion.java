import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Trion extends Particle {
	int[] xPoint = new int[4];
	int[] yPoint = new int[4];
	public Trion(String name, int x, int y, Color color) {
		super(name, x, y, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(Graphics g) {

		Graphics2D g2d = (Graphics2D) g.create();
		// g2d.fillOval(x - (size / 2), y - (size / 2), size, size);

		g2d.setColor(color);
		this.xPoint[0] = x-size/2;
		this.xPoint[1] = x;
		this.xPoint[2] = x+size/2;
		this.yPoint[0] = y+size/2;
		this.yPoint[1] = y-size/2;
		this.yPoint[2] = y+size/2;
		g2d.fillPolygon(xPoint,yPoint,3);

		// TODO: display particle's info next to the particle object

		g2d.dispose();
	}
}
