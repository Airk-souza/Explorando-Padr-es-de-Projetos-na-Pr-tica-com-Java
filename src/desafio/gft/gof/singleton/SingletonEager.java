package desafio.gft.gof.singleton;
/**
 * 	Singleton "Apressado"
 * 
 * 	@author airk;
 * */
public class SingletonEager {
		private static SingletonEager instancia = new SingletonEager();
		
		private SingletonEager() {
			super();
		}
		
		public static SingletonEager getInstancia() {
			return instancia;
		}
}
