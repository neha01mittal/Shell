package sg.edu.nus.comp.cs4218.impl.fileutils;

import java.io.File;
import java.io.IOException;

import sg.edu.nus.comp.cs4218.fileutils.ICdTool;
import sg.edu.nus.comp.cs4218.impl.ATool;

/**
 * change directory
 * 
 */
public class CdTool extends ATool implements ICdTool {

	public CdTool(String[] arguments) {
		super(arguments);
	}

	@Override
	public String execute(File workingDir, String stdin) {

		// check for argument number
		if (args == null || args.length < 1) {
			return "No argument recieved.";
		}

		File newdir = changeDirectory(args[0]);
		if (newdir != null) {
			try {
				// get the nicely looking path
				System.setProperty("user.dir", newdir.getCanonicalPath());
				return "";
			} catch (IOException e) {
				// error code 2: IOException to get canonical path
				setStatusCode(2);
				e.printStackTrace();
			}
		}
		return "   cd: " + args[0] + ": No such directory or not directory";
	}

	@Override
	public File changeDirectory(String newDirectory) {

		System.out.println(newDirectory);

		File newdir = new File(newDirectory);

		// Error Handling
		if (newdir == null || !newdir.exists() || !newdir.isDirectory()) {
			// error code 1: Path not valid, not exist
			setStatusCode(1);
			return null;
		}

		return newdir;
	}
}
