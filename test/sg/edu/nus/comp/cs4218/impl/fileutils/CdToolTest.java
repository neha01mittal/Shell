package sg.edu.nus.comp.cs4218.impl.fileutils;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CdToolTest {

	private CdTool			cdTool;
	private Path			rootDirectory;
	private String			rootDirectoryString;
	private List<Path>		testDirectoryList;
	private List<String>	testDirectoryListRelativeString;
	private List<String>	testDirectoryListAbsoluteString;

	@Before
	public void before() throws IOException {

		// create new dir and files inside
		rootDirectoryString = System.getProperty("user.dir") + "/cdToolTest";
		System.setProperty("user.dir", rootDirectoryString);

		rootDirectory = Paths.get(rootDirectoryString);
		Files.createDirectory(rootDirectory);

		testDirectoryList = new ArrayList<Path>();
		testDirectoryListRelativeString = new ArrayList<String>();
		testDirectoryListAbsoluteString = new ArrayList<String>();

		String dirPath = "";
		for (int i = 0; i < 5; i++) {
			try {
				dirPath += "level-" + i;

				Path temp = FileSystems.getDefault().getPath(rootDirectoryString + "/" + dirPath);
				Files.createDirectory(temp);

				testDirectoryList.add(temp);
				testDirectoryListRelativeString.add(dirPath);
				testDirectoryListAbsoluteString.add(rootDirectoryString + "/" + dirPath);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@After
	public void after() throws IOException {
		cdTool = null;

		for (int i = 0; i < testDirectoryList.size(); i++) {
			Files.deleteIfExists(testDirectoryList.get(i));
		}
		Files.deleteIfExists(rootDirectory);
	}

	// @Test
	// public void testCdWithNoArguments() {
	// cdTool = new CdTool(null);
	//
	// cdTool.execute(new File(rootDirectoryString), "");
	// }
	//
	// @Test
	// public void testCdWithInvalidArguments() {
	// String[] args = new String[] { testDirectoryListString.get(0) };
	// cdTool = new CdTool(args);
	//
	// cdTool.execute(new File(rootDirectoryString), "");
	// }

	@Test
	public void testChangeDirectoryWithRelativePath() {
		cdTool = new CdTool(null);

		File result = cdTool.changeDirectory(testDirectoryListRelativeString.get(0));

		assertEquals(new File(testDirectoryListAbsoluteString.get(0)), result);
	}
}
