package org.testleaf.zoomcar.teatcases;

import org.testleaf.zoomcar.base.ProjectSpecificMethods;
import org.testleaf.zoomcar.pages.HomePage;
import org.testng.annotations.Test;

public class ZoomCarTC001 extends ProjectSpecificMethods {
	
	
	@Test
	public void findNameCar() throws InterruptedException {
		new HomePage()
		.clickStart()
		.clickThuraipakkam()
		.clickNext()
		.clickTomorrow()
		.clickNext()
		.clickDone()
		.clickSort()
		.getFirstCarName();
		
		
		
	}

}
