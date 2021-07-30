package org.firewall.analyzer.firewallAnalyzer;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFunctionality {

	static {System.setProperty("webdriver.chrome.driver", "E:\\TestLeaf\\feb_5\\chromedriver.exe"); }
	public static ChromeDriver driver = new ChromeDriver();

	public void browserInvoke() throws IOException {
		driver.manage().window().maximize();

		FileInputStream file = new FileInputStream("config.properties");
		Properties prop = new Properties();
		prop.load(file);
		String url = prop.getProperty("URL");
		driver.get(url);
	}

	public void browserClose() {
		driver.close();
	}

}
