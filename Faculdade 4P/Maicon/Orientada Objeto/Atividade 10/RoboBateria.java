public class RoboBateria extends Robo {
	public float carga;
	
	public RoboBateria(float carga) {
		super();
		this.carga = carga;
	}
	
	public void aumentaX() {
		if (consumirCarga() == true) {
			super.x += 1;
			System.out.println("X -> " + x);
		}
	}
	
	public void aumentaY() {
		if (consumirCarga() == true) {
			super.y += 1;
			System.out.println("Y -> " + y);
		}
	}
	
	public void diminuiX() {
		if (consumirCarga() == true) {
			super.x -= 1;
			System.out.println("X -> " + x);
		}
	}
	
	public void diminuiY() {
		if (consumirCarga() == true) {
			super.y -= 1;
			System.out.println("Y -> " + y);
		}
	}
	
	public boolean consumirCarga() {
		if(carga < 1) {
			System.out.println("Não é possível realizar mais movimentos, sem Bateria");
			return false;
		}

		this.carga -= 1;
		
		System.out.println("Nivel de Bateria -> "+ this.carga);

		return true;
	}
}