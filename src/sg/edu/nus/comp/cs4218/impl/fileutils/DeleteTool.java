package sg.edu.nus.comp.cs4218.impl.fileutils;

import java.io.File;

import sg.edu.nus.comp.cs4218.fileutils.IDeleteTool;
import sg.edu.nus.comp.cs4218.impl.ATool;

/**
 * delete a file
 */
public class DeleteTool extends ATool implements IDeleteTool {

	public DeleteTool(String[] arguments) {
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
	public boolean delete(File toDelete) {
		// TODO Auto-generated method stub
		return false;
	}
}
