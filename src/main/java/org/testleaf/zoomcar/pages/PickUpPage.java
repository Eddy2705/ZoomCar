package org.testleaf.zoomcar.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testleaf.zoomcar.base.ProjectSpecificMethods;

public class PickUpPage extends ProjectSpecificMethods{
	public PickUpPage clickTomorrow() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath("//div[@class='day low-price'][1]").click();
		return this;
	}
	public DropOffPage clickNext() {
		driver.findElementByXPath("//button[@class='proceed']").click();
		return new DropOffPage();
	}

}
