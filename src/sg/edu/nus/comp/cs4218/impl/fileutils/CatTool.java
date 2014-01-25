package sg.edu.nus.comp.cs4218.impl.fileutils;

import java.io.File;

import sg.edu.nus.comp.cs4218.fileutils.ICatTool;
import sg.edu.nus.comp.cs4218.impl.ATool;

/**
 * cat copies each file or standard input ( denoted by �-�) if no files are
 * given to the standard output
 */
public class CatTool extends ATool implements ICatTool {

	public CatTool(String[] arguments) {
		super(arguments);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String execute(File workingDir, String stdin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getStatusCode() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getStringForFile(File toRead) {
		// TODO Auto-generated method stub
		return null;
	}

}
