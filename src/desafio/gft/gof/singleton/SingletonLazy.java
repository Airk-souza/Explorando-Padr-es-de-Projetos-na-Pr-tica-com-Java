package desafio.gft.gof.singleton;
/**
 * 	Singleton "preguiçoso"
 * 
 * 	@author airk;
 * */
public class SingletonLazy {
	
	private static SingletonLazy instancia;
	//Construtor privado
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
