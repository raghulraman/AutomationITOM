package org.firewall.analyzer.submenutab;
import java.io.IOException;

import org.firewall.analyzer.firewallAnalyzer.*;

public class AlarmSubTabs extends MenuTab{
	
	public void selActiveAlarms() throws InterruptedException {
		driver.findElementByXPath("//a/span[text()='Active Alarms']").click();
	}
	public void selAllAlarms() throws InterruptedException {
		driver.findElementByXPath("//a/span[text()='All Alarms']").click();
	}
	public void selEvents() throws InterruptedException {
		driver.findElementByXPath("//a/span[text()='Events']").click();
	}
	
	/*public static void main(String[] args) throws IOException, InterruptedException {
		BrowserFunctionality bw = new BrowserFunctionality();
		bw.browserInvoke();
		Thread.sleep(1000);
		LoginPage lp = new LoginPage();
		lp.login();
		
		MenuTab mt = new MenuTab();
		mt.selAlarms();
		AlarmSubTabs al = new AlarmSubTabs();
		al.selActiveAlarms();
		Thread.sleep(1000);
		al.selAllAlarms();
		Thread.sleep(1000);
		al.selEvents();

}*/
}