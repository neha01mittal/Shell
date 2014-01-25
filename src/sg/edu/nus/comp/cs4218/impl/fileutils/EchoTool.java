package sg.edu.nus.comp.cs4218.impl.fileutils;

import java.io.File;

import sg.edu.nus.comp.cs4218.fileutils.IEchoTool;
import sg.edu.nus.comp.cs4218.impl.ATool;

/**
 * echo writes its arguments separated by blanks and terminated by a newline on
 * the standard output
 */
public class EchoTool extends ATool implements IEchoTool {

	public EchoTool(String[] arguments) {
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
	public String echo(String toEcho) {
		// TODO Auto-generated method stub
		return null;
	}
}
