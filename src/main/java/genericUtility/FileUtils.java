package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtils {
	public String getDataFromPropertyFile(String key) throws IOException {
		FileInputStream fisForProp = new FileInputStream("./src/test/resources/properties.properties");
		Properties property = new Properties();
		property.load(fisForProp);
		return property.getProperty(key);
	}
}
