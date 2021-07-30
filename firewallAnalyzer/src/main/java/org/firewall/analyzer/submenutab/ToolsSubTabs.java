package org.firewall.analyzer.submenutab;
import java.io.IOException;

import org.firewall.analyzer.firewallAnalyzer.*;
import org.openqa.selenium.WebElement;

public class ToolsSubTabs extends MenuTab{
	
	WebElement pngTool = driver.findElementByXPath("//a/span[text()='Ping Tools']");
	WebElement addMnt = driver.findElementByXPath("//a/span[text()='Address Monitoring']");
	WebElement netMnt = driver.findElementByXPath("//a/span[text()='Network Monitoring']");
	WebElement snmpTool = driver.findElementByXPath("//a/span[text()='SNMP Tools']");
	WebElement cisTool = driver.findElementByXPath("//a/span[text()='Cisco Tools']");
	
	
	public void selPing() throws InterruptedException {
		act.moveToElement(pngTool).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Ping']").click();
		System.out.println("ping");
	}
	public void selSNMPPing() throws InterruptedException {
		act.moveToElement(pngTool).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='SNMP Ping']").click();
		System.out.println("snmp ping");
	}
	public void selProxyPing() throws InterruptedException {
		act.moveToElement(pngTool).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Proxy Ping']").click();
		System.out.println("proxy ping");
	}
	public void selTraceRoute() throws InterruptedException {
		act.moveToElement(pngTool).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Trace Route']").click();
		System.out.println("trace route");
	}
	
	
	
	public void selMACAddressResolver() throws InterruptedException {
		act.moveToElement(addMnt).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='MAC Address Resolver']").click();
		System.out.println("mac");
	}
	public void selDNSResolver() throws InterruptedException {
		act.moveToElement(addMnt).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='DNS Resolver']").click();
		System.out.println("dns");
	}
	
	
	
	
	public void selPortScanner() throws InterruptedException {
		act.moveToElement(netMnt).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Port Scanner']").click();
		System.out.println("port scan");
	}
	public void selSystemExplorer() throws InterruptedException {
		act.moveToElement(netMnt).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='System Explorer']").click();
		System.out.println("sys exp");
	}
	public void selTCPReset() throws InterruptedException {
		act.moveToElement(netMnt).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='TCP Reset']").click();
		System.out.println("tcp reset");
	}
	public void selSystemDetailsUpdate() throws InterruptedException {
		act.moveToElement(netMnt).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='System Details Update']").click();
		System.out.println("sys upd");
	}
	
	
	
	public void selSNMPGraph() throws InterruptedException {
		act.moveToElement(snmpTool).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='SNMP Graph']").click();
		System.out.println("snmp g");
	}
	public void selCommunityChecker() throws InterruptedException {
		act.moveToElement(snmpTool).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Community Checker']").click();
		System.out.println("com chk");
	}
	
	
	
	
	public void selDeviceScan() throws InterruptedException {
		act.moveToElement(cisTool).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Device Scan']").click();
		System.out.println("device scan");
	}
	public void selDeviceExplorer() throws InterruptedException {
		act.moveToElement(cisTool).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Device Explorer']").click();
		System.out.println("dev exp");
	}
	
	
	public void selForwarSyslog() throws InterruptedException {
		driver.findElementByXPath("//a/span[text()='Forward Syslog']").click();
	}
	
	
	/*public static void main(String[] args) throws InterruptedException, IOException {
		
		BrowserFunctionality bw = new BrowserFunctionality();
		bw.browserInvoke();
		Thread.sleep(1000);
		LoginPage lp = new LoginPage();
		lp.login();
		
		MenuTab mt = new MenuTab();
		mt.selTools();
		Thread.sleep(1000);
		ToolsSubTabs ts = new ToolsSubTabs();
		ts.selPing();
		Thread.sleep(1000);
		ts.selSNMPPing();
		Thread.sleep(1000);
		ts.selProxyPing();
		Thread.sleep(1000);
		ts.selTraceRoute();
		Thread.sleep(1000);
		ts.selMACAddressResolver();
		Thread.sleep(1000);
		ts.selDNSResolver();
		Thread.sleep(1000);
		ts.selPortScanner();
		Thread.sleep(1000);
		ts.selSystemExplorer();
		Thread.sleep(1000);
		ts.selTCPReset();
		Thread.sleep(1000);
		ts.selSystemDetailsUpdate();
		Thread.sleep(1000);
		ts.selSNMPGraph();
		Thread.sleep(1000);
		ts.selCommunityChecker();
		Thread.sleep(1000);
		ts.selDeviceScan();
		Thread.sleep(1000);
		ts.selDeviceExplorer();
		Thread.sleep(1000);
		ts.selForwarSyslog();
		
	}
	*/
	
}
	