import java.io.File;

import ioc.dam.m6.exemples.gestiofitxers.FormatVistes;
import ioc.dam.m6.exemples.gestiofitxers.GestioFitxersException;
import ioc.dam.m6.exemples.gestiofitxers.MainGUI;
import ioc.dam.m6.exemples.gestiofitxers.TipusOrdre;

public class GestioFitxersApp {
	
	public static void main(String[] args) {
		String rutaInicial = File.listRoots()[0].toString();
		try {
			GestioFitxersImpl getFitxersImpl = new GestioFitxersImpl();
		getFitxersImpl.setAdrecaCarpeta(rutaInicial);
		getFitxersImpl.setOrdenat(TipusOrdre.NOM);
		getFitxersImpl.setMostrarOcults(false);
		getFitxersImpl.setFormatContingut(FormatVistes.CARPETES_I_FITXERS);
		new MainGUI(getFitxersImpl).setVisible(true);
		} catch (GestioFitxersException ex) {
			ex.printStackTrace();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
		}
	}

}
