package com.pagefactory.org;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basepackage.org.BaseClass;

public class Facebooklogin extends BaseClass  {
	public Facebooklogin () {	
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	public WebElement username;

	@FindBy(id="pass")
	public WebElement password;

	@FindBy(name="login")
	public WebElement loginbuton;



}


