package org.firewall.analyzer.submenutab;
import java.io.IOException;

import org.firewall.analyzer.firewallAnalyzer.*;
import org.openqa.selenium.WebElement;

public class ReportsSubTabs extends MenuTab{
	
	public void selCustomReport() throws InterruptedException {
		WebElement customRep = driver.findElementByXPath("//a/span[text()='Custom Report']");
		act.moveToElement(customRep).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Create Report Profile']").click();
		System.out.println("new pro");
	}
	public void selScheduleList() throws InterruptedException {
		WebElement schedule = driver.findElementByXPath("//a/span[text()='Schedule List']");
		act.moveToElement(schedule).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Add Schedule']").click();
		System.out.println("new sch");
	}
	public void selReportFilters() throws InterruptedException {
		WebElement repFilt = driver.findElementByXPath("//a/span[text()='Report Filters']");
		act.moveToElement(repFilt).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Add filter']").click();
		System.out.println("new filtr");
	}
	public void selReportTypes() throws InterruptedException {
		WebElement repTyp = driver.findElementByXPath("//a/span[text()='Report Types']");
		act.moveToElement(repTyp).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Add Report Type']").click();
		System.out.println("new typ");
	}
	public void selFirewallReports() throws InterruptedException {
		driver.findElementByXPath("//a/span[text()='Firewall Reports']").click();
	}
	public void selProxyReports() throws InterruptedException {
		driver.findElementByXPath("//a/span[text()='Proxy Reports']").click();
	}
	public void selApiAccess() throws InterruptedException {
		driver.findElementByXPath("//a/span[text()='API Access']").click();
	}
	public void selGeneral() throws InterruptedException {
		driver.findElementByXPath("//a/span[text()='General']").click();
	}
	
	
	/*public static void main(String[] args) throws IOException, InterruptedException {
	BrowserFunctionality bw = new BrowserFunctionality();
	bw.browserInvoke();
	Thread.sleep(1000);
	LoginPage lp = new LoginPage();
	lp.login();
	
	MenuTab mt = new MenuTab();
	mt.selReports();
	ReportsSubTabs rs = new ReportsSubTabs();
	rs.selCustomReport();
	Thread.sleep(1000);
	rs.selScheduleList();
	Thread.sleep(1000);
	rs.selReportFilters();
	Thread.sleep(1000);
	rs.selReportTypes();
	Thread.sleep(1000);
	rs.selFirewallReports();
	Thread.sleep(1000);
	rs.selProxyReports();
	Thread.sleep(1000);
	rs.selApiAccess();
	Thread.sleep(1000);
	rs.selGeneral();
}*/
	
}