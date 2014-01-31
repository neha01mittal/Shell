package sg.edu.nus.comp.cs4218.impl.extended1;

import java.io.File;

import sg.edu.nus.comp.cs4218.extended1.IGrepTool;
import sg.edu.nus.comp.cs4218.impl.ATool;

/**
 * The grep command searches one or more input files for lines containing a
 * match to a specified pattern. The grep tool must work on all characters in
 * UTF-8 encoding.
 * 
 * Command Format - grep [OPTIONS] PATTERN [FILE] PATTERN - This specifies a
 * regular expression pattern that describes a set of strings FILE - Name of the
 * file, when no file is present (denoted by "-") use standard input OPTIONS -A
 * NUM : Print NUM lines of trailing context after matching lines -B NUM : Print
 * NUM lines of leading context before matching lines -C NUM : Print NUM lines
 * of output context -c : Suppress normal output. Instead print a count of
 * matching lines for each input file -o : Show only the part of a matching line
 * that matches PATTERN -v : Select non-matching (instead of matching) lines
 * -help : Brief information about supported options
 */
public class GrepTool extends ATool implements IGrepTool {

	public GrepTool(String[] arguments) {
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
	public int getCountOfMatchingLines(String pattern, String input) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getOnlyMatchingLines(String pattern, String input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMatchingLinesWithTrailingContext(int option_A, String pattern, String input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMatchingLinesWithLeadingContext(int option_B, String pattern, String input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMatchingLinesWithOutputContext(int option_C, String pattern, String input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMatchingLinesOnlyMatchingPart(String pattern, String input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNonMatchingLines(String pattern, String input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}
}
