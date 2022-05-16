package desafio.gft.gof.strategy;

public class Robozito {
	private Comportamento estrategia;
	
	public void setEstrategia(Comportamento estrategia) {
		this.estrategia = estrategia;
	}
	
	public void mover() {
		estrategia.mover();
	}
}
