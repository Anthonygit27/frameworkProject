package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuestionThree extends BaseClass {

	public QuestionThree() {

		PageFactory.initElements(driver, this);
	}

	@FindAll({ @FindBy(xpath = "(//span[@class='red_text'])[6]"), @FindBy(className = "red_text") })
	private WebElement pgDown;

	@FindBy(xpath = "//u[text()='Greens Technologys Software Training Centers in Chennai']")
	private WebElement pgUp;

	@FindBy(xpath = "//a[text()='Certifications']")
	private WebElement certClick;

	@FindBy(xpath="(//a[text()='Course Content'])[29]")
	private WebElement selCourseContent;

	@FindAll({ @FindBy(xpath="//a[text()='COURSES']"), @FindBy(xpath="//a[@class='activeLink']") })
	private WebElement mouseCourse;

	 @FindBy(xpath="//a[text()='Java Training ']") 
	private WebElement mouseJava;

	@FindBy(xpath="//a[text()='Core Java Training']") 
	private WebElement coreJavaClick;

	 @FindBy(xpath="//h2[text()='Java training Reviews from Anitha']")
	private WebElement scrollToJava;

	 @FindBy(xpath="//a[text()='CAREERS']")
	private WebElement careerClick;

	@FindAll({ @FindBy(xpath="(//a[text()='contact@greenstechnologys.com'])[1]"), @FindBy(xpath="(//a[@title='contact@greenstechnologys.com'])[1]") })
	private WebElement careerPgdown;

//	@FindAll({ @FindBy(), @FindBy() })
//	private WebElement testiClick;

	@FindAll({ @FindBy(className="//a[@class='login-myact contactus']"), @FindBy(xpath="(//a[@title='Contact Us'])[1]") })
	private WebElement contactBtn;

	@FindAll({ @FindBy(xpath="//h3[text()='Our Main Branches In Chennai ']"), @FindBy(xpath="//h3[@class='title divider-3']") })
	private WebElement mainBranch;

	 @FindBy(xpath="//p[text()='Copyright © 2018 Greens Technology. All rights reserved.']")
	private WebElement copyrightText;

	public WebElement getPgDown() {
		return pgDown;
	}

	public WebElement getPgUp() {
		return pgUp;
	}

	public WebElement getCertClick() {
		return certClick;
	}

	public WebElement getSelCourseContent() {
		return selCourseContent;
	}

	public WebElement getMouseCourse() {
		return mouseCourse;
	}

	public WebElement getMouseJava() {
		return mouseJava;
	}

	public WebElement getCoreJavaClick() {
		return coreJavaClick;
	}

	public WebElement getScrollToJava() {
		return scrollToJava;
	}

	public WebElement getCareerClick() {
		return careerClick;
	}

	public WebElement getCareerPgdown() {
		return careerPgdown;
	}

	public WebElement getContactBtn() {
		return contactBtn;
	}

	public WebElement getMainBranch() {
		return mainBranch;
	}

	public WebElement getCopyrightText() {
		return copyrightText;
	}

	 
}
