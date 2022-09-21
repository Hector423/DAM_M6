import java.io.File;
import java.util.Scanner;

public class Buscador {
	
	public static void main(String[] args) {
	String entrada = "";
	File carpeta = new File(entrada);
	
	try (Scanner entradaEscanner = new Scanner (System.in)) {
		entrada = entradaEscanner.nextLine();
	}
	String[] llistat = carpeta.list();
	
	if(llistat == null) {
		System.out.println("No hi ha res a la carpeta");
	}else {
		for (int i=0; i<llistat.length; i++) {
			System.out.println(llistat[i]);
		}
	}
	}
}
