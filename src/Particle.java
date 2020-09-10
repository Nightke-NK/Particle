import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Particle {

	private static final int avgSpeed = 5; // average speed in pixels/frame
	private static final int avgSize = 30; // average size in pixels
	private static final int avgLife = 50; // average life in milliseconds

	int x;
	int y;
	int vx;
	int vy;
	int size;
	int life;
	Color color;
	String name;
	int shape;

	public Particle(String name, int x, int y, Color color) {
		// TODO: your constructor code goes here
		// assign starting position (x,y) and color of the particle
		this.x = x;
		this.y = y;
		this.name = name;
		this.color = color;
		this.vx = 5;
		this.vy = 5;
		this.life = 100;
		// TODO: use Math.random() to initialize random values for size, life, and
		// velocity of the particle
		// the average size, life, and velocity over all particles must be avgSize,
		// avgLife, and avgSpeed, respectively
		shape = ((int) (Math.random() * 100)) + 1;
		size = ((int) (Math.random() * 50)) + 20;
		life = ((int) (Math.random() * 80)) + 40;
		vx = ((int) (Math.random() * 40) + (-20));
		vy = ((int) (Math.random() * 40) + (-20));

	}
	// Update particle's position and life
	// Return true if the particle is dead (life == 0)

	public boolean update() {
		// increment particle's position by velocity
		x += vx;
		y += vy;

		// TODO:
		// check for collision and bounce off the wall
		if (x > 1000 || x < 0) {
			vx = vx * -1;
		}
		if (y > 740 || y < 0) {
			vy = vy * -1;
		}

		// TODO:
		// update particle's remaining life
		life = life - 1;

		// TODO:
		// check if life is negative (particle is dead). if so, return true
		if (life == 0) {
			return true;
		}

		return false;
	}

	// Draw particle on the screen
	public void render(Graphics g) {

		Graphics2D g2d = (Graphics2D) g.create();
			//g2d.fillOval(x - (size / 2), y - (size / 2), size, size);
		if (shape < 33) {
			g2d.setColor(Color.CYAN);
			g2d.fillOval(x - (size / 2), y - (size / 2), size, size);
		} else if (shape > 33 && shape < 66) {
			g2d.setColor(Color.GREEN);
			g2d.fillRect(x - (size / 2), y - (size / 2), size, size);
		}else {
			g2d.setColor(color);
			g2d.fillArc(x - (size / 2), y - (size / 2), size*2, size*2,220, 90);
		}
		// TODO: display particle's info next to the particle object

		g2d.dispose();
	}

	public String toString() {
		return "Particle " + name + " at (" + x + ", " + y + ")";
	}

}

/* 2017 revision */
