package org.testleaf.zoomcar.pages;

import org.testleaf.zoomcar.base.ProjectSpecificMethods;

public class DropOffPage extends ProjectSpecificMethods {
	
	public CarBookPage clickDone() {
		driver.findElementByXPath("//button[@class='proceed']").click();
		return new CarBookPage();
	}

}
