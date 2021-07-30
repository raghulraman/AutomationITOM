package org.firewall.analyzer.firewallAnalyzer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MenuTab extends LoginPage{
	
	public static Actions act = new Actions(driver);
	
	public void selDashboard(){
		WebElement hovDash = driver.findElementByXPath("//a/span[text()='Dashboard']");
		act.moveToElement(hovDash).perform();
	}
	public void selInventory() {
		driver.findElementByXPath("//a/span[text()='Inventory']").click();
		System.out.println("inv");
	}
	public void selAlarms() {
		driver.findElementByXPath("//a/span[text()='Alarms']").click();
		System.out.println("ala");
	}
	public void selReports(){
		driver.findElementByXPath("//a/span[text()='Reports']").click();
		System.out.println("rep");
	}
	public void selRuleManagement() {
		driver.findElementByXPath("//a/span[text()='Rule Management']").click();
	    System.out.println("RulMgt");
	}
	public void selCompliance() {
		driver.findElementByXPath("//a/span[text()='Compliance']").click();
		System.out.println("comp");
	}
	public void selSearch() {
		driver.findElementByXPath("//a/span[text()='Search']").click();
		System.out.println("search");
	}
	public void selTools() {
		driver.findElementByXPath("//a/span[text()='Tools']").click();
		System.out.println("tool");
	}
	public void selSettings() {
		driver.findElementByXPath("//a/span[text()='Settings']").click();
		System.out.println("sett");
	}
	public void selSupport() {
		driver.findElementByXPath("//a/span[text()='Support']").click();
		System.out.println("sup");
	}

	/*public static void main(String[] args) throws IOException, InterruptedException {
		BrowserFunctionality bw = new BrowserFunctionality();
		bw.browserInvoke();
		Thread.sleep(1000);
		LoginPage lp = new LoginPage();
		lp.login();
		
		MenuTab mt = new MenuTab();
		mt.selDashboard();
		mt.selInventory();
		mt.selAlarms();
		mt.selReports();
		mt.selRuleMgmt();
		mt.selCompliance();
		mt.selSearch();
		mt.selTools();
		mt.selSettings();
		mt.selSupport();
		
		bw.browserClose();
	}*/
	
	
}
