package sg.edu.nus.comp.cs4218.impl.fileutils;

import java.io.File;

import sg.edu.nus.comp.cs4218.fileutils.ICopyTool;
import sg.edu.nus.comp.cs4218.impl.ATool;

/**
 * copy a file to a given location
 * 
 */
public class CopyTool extends ATool implements ICopyTool {

	public CopyTool(String[] arguments) {
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
	public boolean copy(File from, File to) {
		// TODO Auto-generated method stub
		return false;
	}
}
