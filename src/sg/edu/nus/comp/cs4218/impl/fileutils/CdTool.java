package sg.edu.nus.comp.cs4218.impl.fileutils;

import java.io.File;

import sg.edu.nus.comp.cs4218.fileutils.ICdTool;
import sg.edu.nus.comp.cs4218.impl.ATool;

/**
 * change directory
 * 
 */
public class CdTool extends ATool implements ICdTool {

	public CdTool(String[] arguments) {
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
	public File changeDirectory(String newDirectory) {
		// TODO Auto-generated method stub
		return null;
	}
}
