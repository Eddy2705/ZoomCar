package org.testleaf.zoomcar.pages;

import java.util.concurrent.TimeUnit;

import org.testleaf.zoomcar.base.ProjectSpecificMethods;

public class CarBookPage extends ProjectSpecificMethods {
	
	public CarBookPage clickSort() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElementByXPath("//div[text()=' Price: High to Low ']").click();
		Thread.sleep(5000);
		return this;
		
	}

	public CarBookPage getFirstCarName() {
		String CarName = driver.findElementByXPath("//div[@class='details']//h3").getText();
		System.out.println(CarName);
		return this;
	}
}
