package org.testleaf.zoomcar.pages;

import org.testleaf.zoomcar.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	
	public StartPage clickStart() {
		driver.findElementByXPath("//a[@class='search']").click();
		return new StartPage();
	}

}
