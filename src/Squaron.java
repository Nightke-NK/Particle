import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Squaron extends AccelParticle {
	public Squaron(String name, int x, int y, Color color) {
		super(name, x, y, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(Graphics g) {

		Graphics2D g2d = (Graphics2D) g.create();
		GradientPaint gradient = new GradientPaint(x, y,Color.red, x+size/2, y+size/2, Color.white);
		g2d.setPaint(gradient);
		g2d.fillRect(x - (size / 2), y - (size / 2), size, size);
		g2d.drawString(getarea(), x - (size / 2), y - (size / 2));
		// TODO: display particle's info next to the particle object
		g2d.dispose();
	}

	String getarea() {
		return String.valueOf(size * size);
	}
}
