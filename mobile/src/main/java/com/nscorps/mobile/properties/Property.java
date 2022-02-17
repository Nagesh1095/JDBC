package com.nscorps.mobile.properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Property {
	public static void main(String[] args) throws IOException {
		FileReader fileReader =null; 
		try {
			fileReader = new FileReader("UP.properties");
			Properties p = new Properties();
			p.load(fileReader);
			String user = p.getProperty("user");
			String password =p.getProperty("password");
			System.out.println("user = "+user);
			System.out.println("password ="+password);
		}finally {
			if (fileReader != null) {
				fileReader.close();
			}
		}
	}
}
