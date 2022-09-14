import java.io.File;

import ioc.dam.m6.exemples.gestiofitxers.FormatVistes;
import ioc.dam.m6.exemples.gestiofitxers.GestioFitxers;
import ioc.dam.m6.exemples.gestiofitxers.GestioFitxersException;
import ioc.dam.m6.exemples.gestiofitxers.TipusOrdre;

public class GestioFitxersImpl implements GestioFitxers{
	private Object[][] contingut;
	private File carpetaDeTreball = null;
	
	public GestioFitxersImpl() {
		carpetaDeTreball = File.listRoots()[0];
		actualitza();
	}
	
	private void actualitza() {

	}

	@Override
	public void amunt() {
		throw new UnsupportedOperationException("Not supported yet.");
		
	}

	@Override
	public void creaCarpeta(String arg0) throws GestioFitxersException {
		throw new UnsupportedOperationException("Not supported yet.");		
	}

	@Override
	public void creaFitxer(String arg0) throws GestioFitxersException {
		throw new UnsupportedOperationException("Not supported yet.");		
	}

	@Override
	public void elimina(String arg0) throws GestioFitxersException {
		throw new UnsupportedOperationException("Not supported yet.");		
	}

	@Override
	public void entraA(String arg0) throws GestioFitxersException {
		throw new UnsupportedOperationException("Not supported yet.");		
	}

	@Override
	public boolean esPotEscriure(String arg0) throws GestioFitxersException {
		throw new UnsupportedOperationException("Not supported yet.");
		//return false;
	}

	@Override
	public boolean esPotExecutar(String arg0) throws GestioFitxersException {
		throw new UnsupportedOperationException("Not supported yet.");
		//return false;
	}

	@Override
	public boolean esPotLlegir(String arg0) throws GestioFitxersException {
		throw new UnsupportedOperationException("Not supported yet.");
		//return false;
	}

	@Override
	public String getAdrecaCarpeta() {
		throw new UnsupportedOperationException("Not supported yet.");
		//return null;
	}

	@Override
	public int getColumnes() {
		throw new UnsupportedOperationException("Not supported yet.");
		//return 0;
	}

	@Override
	public Object[][] getContingut() {
		throw new UnsupportedOperationException("Not supported yet.");
		//return null;
	}

	@Override
	public String getEspaiDisponibleCarpetaTreball() {
		throw new UnsupportedOperationException("Not supported yet.");
		//return null;
	}

	@Override
	public String getEspaiTotalCarpetaTreball() {
		throw new UnsupportedOperationException("Not supported yet.");
		//return null;
	}

	@Override
	public int getFiles() {
		throw new UnsupportedOperationException("Not supported yet.");
		//return 0;
	}

	@Override
	public FormatVistes getFormatContingut() {
		throw new UnsupportedOperationException("Not supported yet.");
		//return null;
	}

	@Override
	public String getInformacio(String arg0) throws GestioFitxersException {
		throw new UnsupportedOperationException("Not supported yet.");
		//return null;
	}

	@Override
	public boolean getMostrarOcults() {
		throw new UnsupportedOperationException("Not supported yet.");
		//return false;
	}

	@Override
	public String getNomCarpeta() {
		throw new UnsupportedOperationException("Not supported yet.");
		//return null;
	}

	@Override
	public TipusOrdre getOrdenat() {
		throw new UnsupportedOperationException("Not supported yet.");
		//return null;
	}

	@Override
	public String[] getTitolColumnes() {
		throw new UnsupportedOperationException("Not supported yet.");
		//return null;
	}

	@Override
	public long getUltimaModificacio(String arg0) throws GestioFitxersException {
		throw new UnsupportedOperationException("Not supported yet.");
		//return 0;
	}

	@Override
	public String nomArrel(int arg0) {
		throw new UnsupportedOperationException("Not supported yet.");
		//return null;
	}

	@Override
	public int numArrels() {
		throw new UnsupportedOperationException("Not supported yet.");
		//return 0;
	}

	@Override
	public void reanomena(String arg0, String arg1) throws GestioFitxersException {
		throw new UnsupportedOperationException("Not supported yet.");		
	}

	@Override
	public void setAdrecaCarpeta(String arg0) throws GestioFitxersException {
		throw new UnsupportedOperationException("Not supported yet.");		
	}

	@Override
	public void setColumnes(int arg0) {
		throw new UnsupportedOperationException("Not supported yet.");		
	}

	@Override
	public void setEsPotEscriure(String arg0, boolean arg1) throws GestioFitxersException {
		throw new UnsupportedOperationException("Not supported yet.");		
	}

	@Override
	public void setEsPotExecutar(String arg0, boolean arg1) throws GestioFitxersException {
		throw new UnsupportedOperationException("Not supported yet.");		
	}

	@Override
	public void setEsPotLlegir(String arg0, boolean arg1) throws GestioFitxersException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFormatContingut(FormatVistes arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMostrarOcults(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setOrdenat(TipusOrdre arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setUltimaModificacio(String arg0, long arg1) throws GestioFitxersException {
		// TODO Auto-generated method stub
		
	}

}
