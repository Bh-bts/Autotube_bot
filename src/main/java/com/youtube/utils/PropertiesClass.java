package com.youtube.utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {

	public static Properties a;

	public static Properties fileConfig() throws IOException {

		String projectPath = System.getProperty("user.dir");

		File file = new File(projectPath + "/src/main/resources/Config/config.properties");
		FileReader reader = new FileReader(file);

		Properties prop = new Properties();
		prop.load(reader);

		return a = prop;

	}

	public static String getURL() throws IOException {

		fileConfig();
		String getUrl = a.getProperty("url");
		return getUrl;

	}

	public static String getChannel() throws IOException {

		fileConfig();
		String getChannel = a.getProperty("channel");
		return getChannel;
	}

	public static String getTab() throws IOException {

		fileConfig();
		String getTab = a.getProperty("tab");
		return getTab;
	}

	public static String getBrowser() throws IOException {

		fileConfig();
		String getBrowser = a.getProperty("browser");
		return getBrowser;
	}

}
