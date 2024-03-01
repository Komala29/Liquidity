package Utilities;

import java.util.Date;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.File;

public class ConfigReader {
	
	public static  Properties intializeProperties() {
		
		Properties prop = new Properties();
		File propfile = new File(System.getProperty("user.dir")+"//src/test/resources//Config//config.properties");
		
		try {
			
			FileInputStream fis = new FileInputStream(propfile);
			prop.load(fis);
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return prop;
	}
	
}
