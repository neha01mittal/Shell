package sg.edu.nus.comp.cs4218.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Scanner;

import sg.edu.nus.comp.cs4218.IShell;
import sg.edu.nus.comp.cs4218.ITool;
import sg.edu.nus.comp.cs4218.impl.fileutils.PWDTool;

/**
 * The Shell is used to interpret and execute user's commands. Following
 * sequence explains how a basic shell can be implemented in Java
 */
public class Shell implements IShell {

	private final String	currentDirectory	= ".";

	@Override
	public ITool parse(String commandline) {
		if (commandline.contains("|")) {
			return new PWDTool();
		} else if (commandline.startsWith("cat")) {
			return new PWDTool();
		} else if (commandline.startsWith("cd")) {
			return new PWDTool();
		} else if (commandline.startsWith("copy")) {
			return new PWDTool();
		} else if (commandline.startsWith("delete")) {
			return new PWDTool();
		} else if (commandline.startsWith("echo")) {
			return new PWDTool();
		} else if (commandline.startsWith("ls")) {
			return new PWDTool();
		} else if (commandline.startsWith("move")) {
			return new PWDTool();
		} else if (commandline.startsWith("pwd")) {
			return new PWDTool();
		} else if (commandline.startsWith("grep")) {
			return new PWDTool();
		} else {
			return null;
		}
	}

	@Override
	public Runnable execute(final ITool tool) {

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				String returnedValue = tool.execute(new File(currentDirectory), "");
				System.out.println(returnedValue);
				for (int i = 50; i > 0; i--) {
					System.out.println("Child Thread: " + i);
					// Let the thread sleep for a while.
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};

		return runnable;
	}

	@Override
	public void stop(Runnable toolExecution) {

		Thread toolThread = new Thread(toolExecution);
		toolThread.interrupt();
	}

	/**
	 * Do Forever 1. Wait for a user input 2. Parse the user input. Separate the
	 * command and its arguments 3. Create a new thread to execute the command
	 * 4. Execute the command and its arguments on the newly created thread.
	 * Exit with the status code of the executed command 5. In the shell, wait
	 * for the thread to complete execution 6. Report the exit status of the
	 * command to the user
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(in);
		Shell shell = new Shell();

		while (true) {
			// 1. Wait for a user input
			System.out.print("$: ");
			try {
				// 2. Parse the user input
				ITool itool = shell.parse(scanner.nextLine());
				// 3. Create a new thread to execute the command
				if (itool != null) {
					Runnable toolExecution = shell.execute(itool);
					Thread toolThread;
					toolThread = new Thread(toolExecution);
					// 4. Execute the command on the newly created thread.
					toolThread.start();
					// 5. In the shell, wait for the thread to complete
					int line = 0;
					while (toolThread.isAlive()) {
						// wait with simple blocking
						// Thread.sleep(100);
						line = scanner.nextByte();
						System.out.println(">>" + line);
					}

					// 6. Report the exit status
					System.out.println("Exit with status code: " + itool.getStatusCode());
				}
			} catch (Exception e) {
				System.out.println("Exception:\n" + e.getMessage());
			}
		}
	}

}
