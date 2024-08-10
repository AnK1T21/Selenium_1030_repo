package hybridFrameWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public String readTheDataFromPropertyFile(String key) throws IOException {
		FileInputStream file= new FileInputStream("./src/test/Resources/DemoWeb.properties");
		Properties prj = new Properties();
		prj.load(file);
		String file1 = prj.getProperty(key);
		return file1;
	}

}
