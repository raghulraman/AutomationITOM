package org.firewall.analyzer.importLogs;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.firewall.analyzer.firewallAnalyzer.*;
import org.firewall.analyzer.submenutab.*;
import org.openqa.selenium.WebElement;

public class LocalImport extends SettingsSubTabs{
	
	WebElement importLogButton = driver.findElementByXPath("//a/div[text()='Import Log']");
	
	public void selImportLogButton() {		
		importLogButton.click();		
	}
	public void selLocalFileImport() throws IOException, InterruptedException {
		WebElement pathLocal=driver.findElementById("filePath");
		FileInputStream file = new FileInputStream("config.properties");
		Properties prop = new Properties();
		prop.load(file);
		String log = prop.getProperty("FortLog");
		pathLocal.sendKeys(log);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement importButton = driver.findElementByXPath("//div/div[text()='Import']");
		importButton.click();
	}
	
	
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		BrowserFunctionality bw = new BrowserFunctionality();
		bw.browserInvoke();
		Thread.sleep(1000);
		LoginPage lp = new LoginPage();
		lp.login();
		
		MenuTab mt = new MenuTab();
		mt.selSettings();
		Thread.sleep(1000);
		SettingsSubTabs ss = new SettingsSubTabs();
		ss.selImportLogs();
		Thread.sleep(1000);
		LocalImport importLog = new LocalImport();
		importLog.selImportLogButton();
		Thread.sleep(5000);
		importLog.selLocalFileImport();
	
}	

}
