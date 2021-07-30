package org.firewall.analyzer.submenutab;
import java.io.IOException;

import org.firewall.analyzer.firewallAnalyzer.*;

public class ComplianceSubTabs extends MenuTab{
	
	public void selStandards() throws InterruptedException {
		driver.findElementByXPath("//li[@data-title='FWACompliance']/ul/li/a/span[text()='Standards']").click();
	}
	public void selChangeManagement() throws InterruptedException {
		driver.findElementByXPath("//a/span[text()='Change Management']").click();
	}
	public void selSecurityAudit() throws InterruptedException {
		driver.findElementByXPath("//a/span[text()='Security Audit']").click();
	}
	public void selAuditLogs() throws InterruptedException {
		driver.findElementByXPath("//a/span[text()='Audit Logs']").click();
	}

	/*public static void main(String[] args) throws IOException, InterruptedException {
		BrowserFunctionality bw = new BrowserFunctionality();
		bw.browserInvoke();
		Thread.sleep(1000);
		LoginPage lp = new LoginPage();
		lp.login();
		
		MenuTab mt = new MenuTab();
		mt.selCompliance();
		ComplianceSubTabs cmp = new ComplianceSubTabs();
		cmp.selStandards();
		Thread.sleep(1000);
		cmp.selChangeManagement();
		Thread.sleep(1000);
		cmp.selSecurityAudit();
		Thread.sleep(1000);
		cmp.selAuditLogs();
	
	
}*/

}