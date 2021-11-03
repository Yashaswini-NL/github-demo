package com.elocalshops.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ConfigsProvider {

	static Properties props = new Properties();
	
	public ConfigsProvider() {
		File configFilePath = new File("./TestData/config.properties");
		FileInputStream configFile;
		try {
			configFile = new FileInputStream(configFilePath);
			props.load(configFile);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
		}
		
		
	}
	public String getConfig(String configName) {
		return props.getProperty(configName);
	}
}