/*package org.firewall.analyzer.firewallAnalyzer;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class SubTabs extends MenuTab{
	public void selFirewallSummary() throws InterruptedException {
		WebElement hovOv = driver.findElementByXPath("//a/span[text()='Overview']");
		act.moveToElement(hovOv).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Firewall Summary']").click();
	}
	public void selSystePerformance() throws InterruptedException {
		WebElement hovOv = driver.findElementByXPath("//a/span[text()='Overview']");
		act.moveToElement(hovOv).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='System Performance']").click();
	}
	public void selLiveTraffic() throws InterruptedException {
		driver.findElementByXPath("//a/span[text()='Live Traffic']").click();
		System.out.println("live");
	}
	public void selCloudControl() throws InterruptedException {
		driver.findElementByXPath("//a/span[text()='Cloud Control']").click();
		System.out.println("cloud");
	}
	public void selUsers() throws InterruptedException {
		driver.findElementByXPath("//a/span[text()='Users']").click();
		System.out.println("user");
	}
	public void selVPN() throws InterruptedException {
		driver.findElementByXPath("//a/span[text()='VPN']").click();
		System.out.println("vpn");
	}
	public void selRuleMgmt() throws InterruptedException {
		driver.findElementByXPath("//a/span[text()='Rule Mgmt']").click();
		System.out.println("rule");
	}
	public void selSecurity() throws InterruptedException {
		driver.findElementByXPath("//a/span[text()='Security']").click();
		System.out.println("secure");
	}
	public void selStandards() throws InterruptedException {
		driver.findElementByXPath("//a/span[text()='Standards']").click();
		System.out.println("std");
	}
	public void selCustomDashboard() throws InterruptedException {
		WebElement dash1 = driver.findElementByXPath("//a/span[text()='Custom']");
		act.moveToElement(dash1).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Create New Dashboard']").click();
		System.out.println("new dash");
	}
	public void selNOCview() throws InterruptedException {
		WebElement noc = driver.findElementByXPath("//a/span[text()='NOC Views']");
		act.moveToElement(noc).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Create NOC View']").click();
		System.out.println("new noc");
	}
		
		public static void main(String[] args) throws IOException, InterruptedException {
			BrowserFunctionality bw = new BrowserFunctionality();
			bw.browserInvoke();
			Thread.sleep(1000);
			LoginPage lp = new LoginPage();
			lp.login();
			
			MenuTab mt = new MenuTab();
			mt.selDashboard();
			Thread.sleep(2000);
			SubTabs subs = new SubTabs();
			subs.selSystePerformance();
			Thread.sleep(3000);
			mt.selDashboard();
			subs.selFirewallSummary();
			Thread.sleep(3000);
			mt.selDashboard();
			subs.selLiveTraffic();
			Thread.sleep(3000);
			mt.selDashboard();
			subs.selUsers();
			Thread.sleep(3000);
			mt.selDashboard();
			subs.selCloudControl();
			Thread.sleep(3000);
			mt.selDashboard();
			subs.selVPN();
			Thread.sleep(3000);
			mt.selDashboard();
			subs.selRuleMgmt();
			Thread.sleep(3000);
			mt.selDashboard();
			subs.selStandards();
			Thread.sleep(3000);
			mt.selDashboard();
			subs.selSecurity();
			Thread.sleep(3000);
			mt.selDashboard();
			subs.selCustomDashboard();
			Thread.sleep(3000);
			mt.selDashboard();
			subs.selNOCview();
		}
}
*/