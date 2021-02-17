package com.webapp.steps;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import com.webapp.pages.hmepage;
import com.webapp.utility.FunctionLibrary;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AxessSteps extends FunctionLibrary {
	hmepage home;
	Scenario scenario;

	@Before
	public void setUp(Scenario scenario) {
		this.scenario= scenario;
		

	}
   
	@After
	public void tearDown() {
		if(scenario.isFailed()) {
	byte[] data=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    scenario.embed(data,"image/png");
		}
	}
	
	
	
	@Given("the user launches the url")
	
	public void the_user_launches_the_url() {
		
		scenario.write("===============Browser Started==============");

		FunctionLibrary.browserFactory();
		
		scenario.write("===============Login page launched==============");

	}
	
	@When("verify the text")
	public void verify_the_text() {
		
          home= new hmepage();
          home.validateText1();
          
  		scenario.write("=============text1================");

	}
	
	@Then("Verify the text2")
	public void Verify_the_text2() {
        home=new hmepage();
        home.validateText2();
  		scenario.write("==============text2===============");

	}
	@And("Verify the text3")	
	public void Verify_the_text3() {
		home =new hmepage();
		home.validateText3();
  		scenario.write("===============text3==============");

	}
	
	@And("Verify the text4")	
	public void Verify_the_text4() {
		home =new hmepage();
		home.validateText4();
  		scenario.write("================text4=============");

	}
	
	@And("Verify the text5")
	public void Verify_the_text5() {
		home= new hmepage();
		home.validateText5();
  		scenario.write("================text5=============");

	}
	@And("click the Exploreourapi button")
	public void click_the_Exploreourapi_button() {
		home=new hmepage();
		home.ExploreourAPIs();
  		scenario.write("===============clickonbutton==============");

	}
	
	@Then("Return back to homepage")
	public void Return_back_to_homepage() {

		home=new hmepage();
		home.returnback();
		scenario.write("===============Navigate back to homepage=============");
	}
	
	@And ("Click on watchnow")
	public void Click_on_watchnow() {

		home=new hmepage();
		home.Watchnow();
		
	}
	
	@And("click on the Xsymbol")
	public void click_on_the_Xsymbol() {
		home=new hmepage();
		home.XSymbol();
		
	}

	
}
