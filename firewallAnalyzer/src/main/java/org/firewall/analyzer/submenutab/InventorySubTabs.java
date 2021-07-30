package org.firewall.analyzer.submenutab;
import java.io.IOException;

import org.firewall.analyzer.firewallAnalyzer.*;
import org.openqa.selenium.WebElement;

public class InventorySubTabs extends MenuTab {	
	
	WebElement hovDev = driver.findElementByXPath("//a/span[text()='Devices']");
	
	public void selAddFirewallInv() throws InterruptedException {
		act.moveToElement(hovDev).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Add Firewall']").click();
	}
	public void selTerminalInv() throws InterruptedException {
		act.moveToElement(hovDev).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Terminal ( SSH/TELNET )']").click();
	}
	public void selSimulateInv() throws InterruptedException {
		act.moveToElement(hovDev).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Simulate']").click();
	}
	public void selInterfaces() throws InterruptedException {
		driver.findElementByXPath("//a/span[text()='Interfaces']").click();
	}
	public void selUsersInv() throws InterruptedException {
		driver.findElementByXPath("//a[@href='#/Inventory/List/LogMgmt/Users']/span[text()='Users']").click();
	}
	public void selCloudsInv() throws InterruptedException {
		driver.findElementByXPath("//a/span[text()='Cloud Services']").click();
	}
	public void selUsedRulesInv() throws InterruptedException {
		driver.findElementByXPath("//a/span[text()='Used Rules']").click();
	}
	
	/*public static void main(String[] args) throws IOException, InterruptedException {
		BrowserFunctionality bw = new BrowserFunctionality();
		bw.browserInvoke();
		Thread.sleep(1000);
		LoginPage lp = new LoginPage();
		lp.login();
		
		MenuTab mt = new MenuTab();
		mt.selInventory();
		InventorySubTabs it=new InventorySubTabs();
		it.selAddFirewallInv();
		Thread.sleep(1000);
		it.selTerminalInv();
		Thread.sleep(1000);
		it.selSimulateInv();
		Thread.sleep(2000);
		mt.selInventory();
		Thread.sleep(2000);
		it.selInterfaces();
		Thread.sleep(2000);
		it.selUsersInv();
		Thread.sleep(2000);
		it.selCloudsInv();
		Thread.sleep(2000);
		it.selUsedRulesInv();
		
		
		
	
	
	}
*/
}
