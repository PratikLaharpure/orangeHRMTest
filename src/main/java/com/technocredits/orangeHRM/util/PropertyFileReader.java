package com.technocredits.orangeHRM.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.technocredits.orangHRM.constant.Constant;

public class PropertyFileReader {
	Properties prop=null;
	//String path = "W:\\GitPractic\\orangeHRMTest\\src\\main\\java\\om\\technocredits\\test\\orangeHRM\\properties\\LoginpageProperties.properties";
	public Properties initializePropertyFile(String propFileName){
		File file = new File(Constant.PROPERTIES+File.separator+ propFileName+".properties");
		FileInputStream input;
		try {
			input = new FileInputStream(file);
			prop = new Properties();
			try {
				prop.load(input);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}

}
