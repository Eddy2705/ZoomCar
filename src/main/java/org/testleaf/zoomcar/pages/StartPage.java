package org.testleaf.zoomcar.pages;

import org.testleaf.zoomcar.base.ProjectSpecificMethods;

public class StartPage extends ProjectSpecificMethods {

	public StartPage clickThuraipakkam() {
		driver.findElementByXPath("//div[@class='items'][1]").click();
		return this;
	}
	public PickUpPage clickNext() {
		driver.findElementByXPath("//button[@class='proceed']").click();
		return new PickUpPage();
	}
}
