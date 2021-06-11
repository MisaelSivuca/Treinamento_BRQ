package parte_05_Java.P05PRF;
// https://github.com/MisaelSivuca

import java.util.Scanner;

public class P5PRF {
	public static Scanner ze = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Que tipo de Lampada voce quer usar?");
		System.out.println("Digite 0 para Incandescente e 1 para Flourescente  ");
		int tipo = Integer.parseInt(ze.nextLine());
		FabricaLampada philips = new FabricaLampada();
		Lampada lamp = philips.construir(tipo);
		lamp.ligar();
		lamp.desligar();
		FabricaLampada.imprime();
	}
}
