import java.awt.Color;

public class AccelParticle extends Particle{
	int ax;
	int ay;

	public AccelParticle(String name, int x, int y, Color color) {
		super(name, x, y, color);
		// TODO Auto-generated constructor stub
		this.ax = 0;
		this.ay = 5;
	}
	@Override
	public boolean update() {
		// increment particle's position by velocity
		vx += ax;
		
		x += vx;
		y += vy;

		// TODO:
		// check for collision and bounce off the wall
		if (x > 1000 || x < 0) {
			vx = vx * -1;
		}else {
			vy += ay;
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


}
