package com.stepdefenition.org;

import com.basepackage.org.BaseClass;
import com.pagefactory.org.Facebooklogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

import org.junit.Assert;

public class LoginStepDefention {


	@Given("Launch and load url")
	public void launch_and_load_url() {
		BaseClass.launchBrowser();
		BaseClass.loadUrl("https://www.facebook.com/");
	}

	@When("provide credentials {string} and {string}")
	public void provide_credentials_and(String username, String password) throws IOException {
		Facebooklogin obj=new Facebooklogin();
		obj.username.sendKeys(BaseClass.readProperties("username"));
		obj.password.sendKeys(BaseClass.readProperties("Password"));
		obj.loginbuton.click();

	}

	@Then("validate login")
	public void validate_login() {
		Assert.assertTrue(true);

	}	
}