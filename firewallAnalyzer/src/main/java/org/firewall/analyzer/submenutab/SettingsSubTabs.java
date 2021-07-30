package org.firewall.analyzer.submenutab;
import java.io.IOException;

import org.firewall.analyzer.firewallAnalyzer.*;

import org.openqa.selenium.WebElement;

public class SettingsSubTabs extends MenuTab{
	
	WebElement genSet = driver.findElementByXPath("//a/span[text()='General Settings']");
	WebElement disc = driver.findElementByXPath("//a/span[text()='Discovery']");
	WebElement fireSvr = driver.findElementByXPath("//a/span[text()='Firewall Server']");
	WebElement sys = driver.findElementByXPath("//a/span[text()='System']");
	WebElement adm = driver.findElementByXPath("//a/span[text()='Admin']");
	WebElement security = driver.findElementByXPath("//a/span[text()='Security']");
	WebElement others = driver.findElementByXPath("//a/span[text()='Others']");
	
	
	public void selMailServer() throws InterruptedException {
		act.moveToElement(genSet).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Mail server settings']").click();
		System.out.println("mail");
	}	
	public void selSMS() throws InterruptedException {
		act.moveToElement(genSet).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='SMS Server Settings']").click();
		System.out.println("sms");
	}
	public void selUserMgmt() throws InterruptedException {
		act.moveToElement(genSet).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='User Management']").click();
		System.out.println("user");
	}
	public void selSSH() throws InterruptedException {
		act.moveToElement(genSet).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='SSH Settings']").click();
		System.out.println("ssh");
	}
	public void selSysSet() throws InterruptedException {
		act.moveToElement(genSet).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='System Settings']").click();
		System.out.println("syst");
	}
	public void selRebranding() throws InterruptedException {
		act.moveToElement(genSet).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Rebranding']").click();
		System.out.println("brand");
	}
	public void selRestAPI() throws InterruptedException {
		act.moveToElement(genSet).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='REST API']").click();
		System.out.println("api");
	}
	public void selDeviceSnap() throws InterruptedException {
		act.moveToElement(genSet).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Device Snapshot Settings']").click();
		System.out.println("snap");
	}
	public void selSelfMonitor() throws InterruptedException {
		act.moveToElement(genSet).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Self Monitoring']").click();
		System.out.println("mnt");
	}
	public void selSecuritySett() throws InterruptedException {
		act.moveToElement(genSet).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Security Settings']").click();
		System.out.println("sec");
	}
	public void selPrivacy() throws InterruptedException {
		act.moveToElement(genSet).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Privacy Settings']").click();
		System.out.println("privacy");
	}
	
	
	public void selAddFirewallSettings() throws InterruptedException {
		act.moveToElement(disc).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[@href='#/SettingsSummary']/following-sibling::ul/li[2]//a[@href='#/Settings/Discovery/CLI']//span[text()='Add Firewall']").click();
		System.out.println("fw");
	}
	public void selTerminalSettings() throws InterruptedException {
		act.moveToElement(disc).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[@href='#/SettingsSummary']/following-sibling::ul/li[2]//a[@href='#/Settings/Discovery/FWATerminal/Custom']//span").click();
		System.out.println("cli");
	}
	public void selSimulatorSettings() throws InterruptedException {
		act.moveToElement(disc).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[@href='#/SettingsSummary']/following-sibling::ul/li[2]//a[@href='#/Settings/Discovery/FwaSimulate']//span").click();
		System.out.println("sm");
	}
	
	
	
	public void selSyslogPort() throws InterruptedException {
		act.moveToElement(fireSvr).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Syslog Server']").click();
		System.out.println("log port");
	}
	public void selCheckPoint() throws InterruptedException {
		act.moveToElement(fireSvr).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Check Point']").click();
		System.out.println("cp");
	}
	public void selDeviceRule() throws InterruptedException {
		act.moveToElement(fireSvr).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Device Rule']").click();
		System.out.println("dr");
	}
	public void selExcludeCriteria() throws InterruptedException {
		act.moveToElement(fireSvr).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Exclude Criteria']").click();
		System.out.println("ex");
	}
	public void selCredentialProfile() throws InterruptedException {
		act.moveToElement(fireSvr).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Credential Profile']").click();
		System.out.println("crd prf");
	}
	public void selDiagnoseConnections() throws InterruptedException {
		act.moveToElement(fireSvr).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Diagnose connections']").click();
		System.out.println("dg con");
	}
	public void selAvailabilityAlert() throws InterruptedException {
		act.moveToElement(fireSvr).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Availability Alert']").click();
		System.out.println("av al");
	}
	public void selDeviceDetails() throws InterruptedException {
		act.moveToElement(fireSvr).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Device Details']").click();
		System.out.println("dev dt");
	}
	
	
	
	public void selImportLogs() throws InterruptedException {
		act.moveToElement(sys).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Imported Log Files']").click();
		System.out.println("import");
	}
	public void selProtocolGroups() throws InterruptedException {
		act.moveToElement(sys).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Protocol Groups']").click();
		System.out.println("prot");
	}
	public void selArchivedFiles() throws InterruptedException {
		act.moveToElement(sys).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Archived Files']").click();
		System.out.println("arch");
	}
	public void selCustomizeReport() throws InterruptedException {
		act.moveToElement(sys).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Customize Report']").click();
		System.out.println("cust");
	}
	public void selDNS() throws InterruptedException {
		act.moveToElement(sys).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='DNS']").click();
		System.out.println("dns");
	}
	public void selWorkingHours() throws InterruptedException {
		act.moveToElement(sys).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Working Hours']").click();
		System.out.println("work");
	}
	public void selDeviceGroup() throws InterruptedException {
		act.moveToElement(sys).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Device Group']").click();
		System.out.println("dev grp");
	}
	
	
	
	
	
	
	public void selIntranet() throws InterruptedException {
		act.moveToElement(adm).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Intranet']").click();
		System.out.println("intra");
	}
	public void selDataStorage() throws InterruptedException {
		act.moveToElement(adm).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Data Storage']").click();
		System.out.println("storage");
	}
	public void selLicenseManagement() throws InterruptedException {
		act.moveToElement(adm).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='License Management']").click();
		System.out.println("lic");
	}
	public void selRepository() throws InterruptedException {
		act.moveToElement(adm).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Repository']").click();
		System.out.println("repo");
	}
	public void selExcludeHosts() throws InterruptedException {
		act.moveToElement(adm).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Exclude Hosts']").click();
		System.out.println("exclude");
	}	
	
	
	
	
	public void selArchiveEncryption() throws InterruptedException {
		driver.findElementByXPath("//li//a[@href='#/Settings/FirewallConfig/Security/ArchieveEncription']").click();
		System.out.println("timestamp");
	}
	
	
	
	
	public void selSNMPSettings() throws InterruptedException {
		act.moveToElement(others).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='SNMP Settings']").click();
		System.out.println("snmp");
	}
	public void selAlarmProfiles() throws InterruptedException {
		act.moveToElement(others).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='Alarm Profiles']").click();
		System.out.println("ala");
	}
	public void selIPMapping() throws InterruptedException {
		act.moveToElement(others).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//a/span[text()='UserName-IP Mapping']").click();
		System.out.println("map");
	}
	
	
	
	
	
	
	
	
	
	
/*public static void main(String[] args) throws InterruptedException, IOException {
		
		BrowserFunctionality bw = new BrowserFunctionality();
		bw.browserInvoke();
		Thread.sleep(1000);
		LoginPage lp = new LoginPage();
		lp.login();
		
		MenuTab mt = new MenuTab();
		mt.selSettings();
		Thread.sleep(1000);
		SettingsSubTabs ss = new SettingsSubTabs();*/
		/*ss.selMailServer();
		Thread.sleep(1000);
		ss.selSMS();
		Thread.sleep(1000);
		ss.selUserMgmt();
		Thread.sleep(1000);
		ss.selSSH();
		Thread.sleep(1000);
		ss.selSysSet();
		Thread.sleep(1000);
		ss.selRebranding();
		Thread.sleep(1000);
		ss.selRestAPI();
		Thread.sleep(1000);
		ss.selDeviceSnap();
		Thread.sleep(1000);
		ss.selSelfMonitor();
		Thread.sleep(1000);
		ss.selSecuritySett();
		Thread.sleep(1000);
		ss.selPrivacy();*/
		
		
		/*ss.selAddFirewallSettings();
		Thread.sleep(1000);
		ss.selTerminalSettings();
		Thread.sleep(1000);
		ss.selSimulatorSettings();*/
		
		
		/*ss.selAddFirewallSettings();
		Thread.sleep(1000);
		ss.selCheckPoint();
		Thread.sleep(1000);
		ss.selDeviceRule();
		Thread.sleep(1000);
		ss.selExcludeCriteria();
		Thread.sleep(1000);
		ss.selCredentialProfile();
		Thread.sleep(1000);
		ss.selDiagnoseConnections();
		Thread.sleep(1000);
		ss.selAvailabilityAlert();
		Thread.sleep(1000);
		ss.selDeviceDetails();*/
		
		
		/*ss.selImportLogs();
		Thread.sleep(1000);
		ss.selProtocolGroups();
		Thread.sleep(1000);
		ss.selArchivedFiles();
		Thread.sleep(1000);
		ss.selCustomizeReport();
		Thread.sleep(1000);
		ss.selDNS();
		Thread.sleep(1000);
		ss.selWorkingHours();
		Thread.sleep(1000);
		ss.selDeviceGroup();*/
		
		
		
		/*ss.selIntranet();
		Thread.sleep(1000);
		ss.selDataStorage();
		Thread.sleep(1000);
		ss.selLicenseManagement();
		Thread.sleep(1000);
		ss.selRepository();
		Thread.sleep(1000);
		ss.selExcludeHosts();*/
		
		
		
		//ss.selArchiveEncryption();
	
	
	
		/*ss.selSNMPSettings();
		Thread.sleep(1000);
		ss.selAlarmProfiles();
		Thread.sleep(1000);
		ss.selIPMapping();
	*/
	
	
	
//}	
	
	
}
