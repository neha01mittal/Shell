package sg.edu.nus.comp.cs4218.impl.extended1;

import java.io.File;

import sg.edu.nus.comp.cs4218.ITool;
import sg.edu.nus.comp.cs4218.extended1.IPipingTool;
import sg.edu.nus.comp.cs4218.impl.ATool;

/**
 * The pipe tools allows the output of one program to be sent to the input of
 * another program. With the help of pipe tool multiple small (and simple)
 * programs can be connected to accomplish large number of tasks.
 * 
 * Command Format - PROGRAM-1-STANDARD_OUTPUT | PROGRAM-2-STANDARD_INPUT Where
 * "|" is the pipe operator and PROGRAM-1-STANDARD_OUTPUT is the standard output
 * of program 1 and PROGRAM-2-STANDARD_INPUT is the standard input of program 2.
 * 
 */
public class PipingTool extends ATool implements IPipingTool {

	public PipingTool(String[] arguments) {
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
	public String pipe(ITool from, ITool to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String pipe(String stdout, ITool to) {
		// TODO Auto-generated method stub
		return null;
	}
}
