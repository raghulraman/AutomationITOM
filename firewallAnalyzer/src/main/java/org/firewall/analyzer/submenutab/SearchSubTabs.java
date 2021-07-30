package org.firewall.analyzer.submenutab;
import java.io.IOException;

import org.firewall.analyzer.firewallAnalyzer.*;

public class SearchSubTabs extends MenuTab{
	
	public void selAggregatedSearch() throws InterruptedException {
		driver.findElementByXPath("//a/span[text()='Aggregated Search']").click();
	}
	public void selRAWSearch() throws InterruptedException {
		driver.findElementByXPath("//a/span[text()='RAW Search']").click();
	}
	public void selRAWSettings() throws InterruptedException {
		driver.findElementByXPath("//a/span[text()='RAW Settings']").click();
	}

	
	/*public static void main(String[] args) throws IOException, InterruptedException {
		BrowserFunctionality bw = new BrowserFunctionality();
		bw.browserInvoke();
		Thread.sleep(1000);
		LoginPage lp = new LoginPage();
		lp.login();
		
		MenuTab mt = new MenuTab();
		mt.selSearch();
		Thread.sleep(1000);
		SearchSubTabs ss = new SearchSubTabs();
		ss.selAggregatedSearch();
		Thread.sleep(1000);
		ss.selRAWSearch();
		Thread.sleep(1000);
		ss.selRAWSettings();
		
	}*/
	
	
	
	
}
