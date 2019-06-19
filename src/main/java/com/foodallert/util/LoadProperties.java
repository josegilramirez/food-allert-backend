/**
 * 
 */
package com.foodallert.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * @author Jose Gil Ramirez Sanchez
 *
 */
public class LoadProperties {
	private static final String PROPERTIES_FILE_NAME = "credentials.properties";
	private static final Logger logger = Logger.getLogger(LoadProperties.class);
	
	public static String getProperty(String property) {
		String value = null;
		Properties properties = null;
		InputStream inputStream = null;
		
		try {
			
			properties = new Properties();
			inputStream = LoadProperties.class.getClassLoader().getResourceAsStream(PROPERTIES_FILE_NAME);
			properties.load(inputStream);      
			value = properties.getProperty(property);
			
		} catch (IOException e) {
			logger.error("Properties File not found -> ", e);
		}
				
		return value;
	}
}
