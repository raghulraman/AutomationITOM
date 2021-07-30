package org.firewall.analyzer.firewallAnalyzer;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginPage extends BrowserFunctionality{
	

	public void login() throws IOException {
		
		FileInputStream file = new FileInputStream("config.properties");
	    Properties prop = new Properties();
	    prop.load(file);
	    String user=prop.getProperty("username1");
	    String pwd=prop.getProperty("password1");
	    driver.findElementById("userName").sendKeys(user);
	    driver.findElementById("password").sendKeys(pwd);
	    driver.findElementById("btnSubmit").click();
	}
	
	
}
