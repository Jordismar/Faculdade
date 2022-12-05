public class Robo {
	public float x;
	public float y;
	
	public void aumentaX() {
		this.x += x;
		System.out.println("X -> " + x);
	}
	
	public void aumentaY() {
		this.y += y;
		System.out.println("Y -> " + y);
	}
	
	public void diminuiX() {
		this.x -= x;
		System.out.println("X -> " + x);
	}
	
	public void diminuiY() {
		this.y -= y;
		System.out.println("Y -> " + y);
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	public void mostraPosicao() {
		System.out.println("Posição: X -> "+ x +", Y -> "+ y +"\n");
	}
}