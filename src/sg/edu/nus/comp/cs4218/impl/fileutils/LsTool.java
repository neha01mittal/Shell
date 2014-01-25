package sg.edu.nus.comp.cs4218.impl.fileutils;

import java.io.File;
import java.util.List;

import sg.edu.nus.comp.cs4218.fileutils.ILsTool;
import sg.edu.nus.comp.cs4218.impl.ATool;

/**
 * list the contents of a directory
 */
public class LsTool extends ATool implements ILsTool {

	public LsTool(String[] arguments) {
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
	public List<File> getFiles(File directory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getStringForFiles(List<File> files) {
		// TODO Auto-generated method stub
		return null;
	}
}
