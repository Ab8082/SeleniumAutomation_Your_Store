package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	Properties prop;

	public ConfigReader() throws IOException {

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/test/resources/Config.properties");

		prop = new Properties();
		prop.load(fis);

		fis.close();
	}

	public String getBrowser() {

		return prop.getProperty("browser");
	}

	public String getUrl() {

		return prop.getProperty("url");
	}

	public String getUserName() {
		return prop.getProperty("username");

	}

	public String getPassWord() {

		return prop.getProperty("password");
	}
}
