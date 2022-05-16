package desafio.gft.gof;
import desafio.gft.gof.facade.Facade;
import desafio.gft.gof.singleton.*;
import desafio.gft.gof.strategy.*;
public class Teste {

	public static void main(String[] args) {
		// Singleton
		
			SingletonLazy lazy = SingletonLazy.getInstancia();
			System.out.println(lazy);
			lazy = SingletonLazy.getInstancia();
			System.out.println(lazy+ "\n");
			
			SingletonEager eager = SingletonEager.getInstancia();
			System.out.println(eager);
			lazy = SingletonLazy.getInstancia();
			System.out.println(eager+ "\n");
			
			SinngletonLazyHolder holder = SinngletonLazyHolder.getInstancia();
			System.out.println(holder);
			holder = SinngletonLazyHolder.getInstancia();
			System.out.println(holder+ "\n");
			
		//Strategy
			
			Comportamento normal = new ComportamentoNormal();
			Comportamento defensivo = new ComportamentoDefensivo();
			Comportamento ofensivo = new ComportamentoOfensivo();
			System.out.println("\n");
			Robozito robo = new Robozito();
			robo.setEstrategia(normal);
			robo.mover();
			
			robo.setEstrategia(ofensivo);
			robo.mover();
			
			robo.setEstrategia(defensivo);
			robo.mover();
			System.out.println("\n");
		//Facade
		Facade facade = new Facade();
		facade.migrarCliente("Wellingthon", "18550-000");
		
	}
}
