package org.firewall.analyzer.submenutab;
import java.io.IOException;

import org.firewall.analyzer.firewallAnalyzer.*;

public class RuleManagementSubTabs extends MenuTab{
	public void selPolicyOverview() throws InterruptedException {
		driver.findElementByXPath("//a/span[text()='Policy Overview']").click();
	}
	public void selPolicyOptimization() throws InterruptedException {
		driver.findElementByXPath("//a/span[text()='Policy Optimization']").click();
	}
	public void selRuleCleanup() throws InterruptedException {
		driver.findElementByXPath("//a/span[text()='Rule Cleanup']").click();
	}
	public void selRuleReorder() throws InterruptedException {
		driver.findElementByXPath("//a/span[text()='Rule Reorder']").click();
	}
	public void selRuleImpact() throws InterruptedException {
		driver.findElementByXPath("//a/span[text()='Rule Impact']").click();
	}
	public void selRuleAdministration() throws InterruptedException {
		driver.findElementByXPath("//a/span[text()='Rule Administration']").click();
	}
	
	/*public static void main(String[] args) throws IOException, InterruptedException {
		BrowserFunctionality bw = new BrowserFunctionality();
		bw.browserInvoke();
		Thread.sleep(1000);
		LoginPage lp = new LoginPage();
		lp.login();
		
		MenuTab mt = new MenuTab();
		mt.selRuleManagement();
		RuleManagementSubTabs rm = new RuleManagementSubTabs();
		rm.selPolicyOverview();
		Thread.sleep(1000);
		rm.selPolicyOptimization();
		Thread.sleep(1000);
		rm.selRuleCleanup();
		Thread.sleep(1000);
		rm.selRuleReorder();
		Thread.sleep(1000);
		rm.selRuleImpact();
		Thread.sleep(1000);
		rm.selRuleAdministration();

}*/

}