package org.demoguru.stepdefinition;

import org.openqa.selenium.WebElement;

public class DemoBase {
	public void url(String url) {
		Hook.driver.get(url);
		Hook.driver.manage().window().maximize();
	}
	public void type(WebElement w,String name) {
		w.sendKeys(name);
		
	}
	public void btn(WebElement w) {
		w.click();
	}

}
