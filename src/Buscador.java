import java.io.File;
import java.util.Scanner;

public class Buscador {
	
	public static void main(String[] args) {
	Scanner entradaEscanner = new Scanner(System.in);
	
	System.out.println("Escriu la ruta:");
	String entrada = entradaEscanner.nextLine();
		
	File carpeta = new File(entrada);
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
