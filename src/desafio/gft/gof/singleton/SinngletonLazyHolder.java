package desafio.gft.gof.singleton;

/**
 * 	Singleton "Holder"
 * 
 * 	@author airk;
 * */

public class SinngletonLazyHolder {
	
	private static class Holder{
		public static SinngletonLazyHolder instancia = new SinngletonLazyHolder();
	}
		private SinngletonLazyHolder() {
			super();
		}
		
		public static SinngletonLazyHolder getInstancia() {
			return Holder.instancia;
		}
}
