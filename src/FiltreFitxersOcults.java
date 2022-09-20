import java.io.File;
import java.io.FilenameFilter;

public class FiltreFitxersOcults implements FilenameFilter{

	@Override
	public boolean accept(File pfile, String string) {
		File file = new File(pfile, string);
		return !file.isHidden();
	}
	
}
