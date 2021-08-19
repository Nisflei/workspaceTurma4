package implementacao;

import beans.Televisor;

public class ExecutarTelevisor {

	public static void main(String[] args) {
		
		Televisor tv = new Televisor();
		
		System.out.println(tv.mostrarStatus());
		
		tv.setLigado(true);
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.setCanal(100);
		
		System.out.println(tv.mostrarStatus());
		
		//tv.setVolume(9);
		System.out.println(tv.mostrarStatus());
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();

		System.out.println(tv.mostrarStatus());
		
		//tv.setVolume(20);
		tv.aumentarVolume();
		tv.aumentarVolume();
		System.out.println(tv.mostrarStatus());

	}

}
