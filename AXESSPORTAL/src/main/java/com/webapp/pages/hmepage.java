package com.webapp.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Factory;

import com.webapp.utility.FunctionLibrary;

import cucumber.api.java.en.Then;

public class hmepage  extends FunctionLibrary {

	public hmepage() {

		PageFactory.initElements(driver,this);	
	}
	
	

	
	@FindBy(xpath="//p[@class='homePage__Slogan-sc-4qvmg-5 bFbWKR']")
	WebElement Text1;
	
	@FindBy(xpath="//div[@class='col-sm-4 col-lg-6 defaultBoxes']/h2")
	WebElement Text2;
	
	@FindBy(xpath="//div[@class='col-sm-4 col-lg-6 defaultBoxes']//h2")
	List<WebElement> Text3;
	
	@FindBy(xpath="//div[@class='content']//p")
	List<WebElement> Text4;
	@FindBy(xpath="//div[@class='content']//p")
	List<WebElement> Text5;
	
	@FindBy(xpath="//button[@class='homePage__ExploreApiButton-sc-4qvmg-6 gElhun']")
	List<WebElement> clickbutton;
	
	@FindBy(xpath="//li[@class='nav-item']")
	List<WebElement> aboutpage;
	
	@FindBy(xpath="//button[@class='homePage__WatchNowButton-sc-4qvmg-7 jqiryo']")
	List<WebElement> watchnow;
	
	@FindBy(xpath="//button[@class='KalturaModal__CloseButton-sc-8m9azf-2 xBIMv']")
	WebElement close;
	
public void validateText1() {
		Assert.assertEquals(Text1.getText(), "A connection to enable innovation via an open platform and APIs for developer communities");
			}
	
public void validateText2() {
		//System.out.println(Text2.getText());
		Assert.assertEquals(Text2.getText(), "Imagine what we could do together");	
	}
	
public void validateText3() {
	for(int i=0;i<=Text3.size();i++) {
	//System.out.println(Text3.get(1).getText());		
		Assert.assertEquals(Text3.get(1).getText(), "aXess prepares us for Open Banking");	
		break;
					}
				}
public void validateText4() {
	for(int i=0;i<Text4.size();i++){
		System.out.println(Text4.get(0).getText());
		Assert.assertEquals(Text4.get(0).getText(), "Let's build the future of banking together to address our client needs across Asia, Africa, and the Middle East.");	

		break;		
	}
}
	
public void validateText5() {
		for(int i=0;i<Text5.size();i++){
			
			Assert.assertEquals(Text5.get(1).getText(), "Learn how we are investing in our capabilities and community to build our Open Banking future.");	

			System.out.println(Text5.get(1).getText());	
			break;		
		}	}
public void ExploreourAPIs() {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,350)");
		
		for(int i=0;i<clickbutton.size();i++){
				clickbutton.get(0).click();
		}		
	}
public void returnback() {
        driver.navigate().back();
	}
	
public void Watchnow() {
		
		for(int i=0;i<watchnow.size();i++){
			watchnow.get(0).click();	
	}	}

public void XSymbol() {

		close.click();
		
	}
}
