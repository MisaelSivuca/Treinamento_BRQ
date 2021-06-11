package parte_05_Java.P05PRF;
// https://github.com/MisaelSivuca

public class FabricaLampada {

	public class Incandescente implements Lampada {
		public void ligar() {
			System.out.println("A Lampada Incandescente esta Ligada!");
		}
		public void desligar() {
			System.out.println("A Lampada Incandescente esta desligada!");
		}
	}

	public class Fluorescente implements Lampada {
		public void ligar() {
			System.out.println("A Lampada Fluorescente esta  Ligada!");
		}
		public void desligar() {
			System.out.println("A Lampada Fluorescente esta desligada!");
		}
	}
	
	public static void imprime() {
		System.out.println("Fabrica de lampadas!");
	}
	
	public Lampada construir(int tipo){
		if(tipo==0) 
			return new Incandescente();
		return new Fluorescente();		
	}


}