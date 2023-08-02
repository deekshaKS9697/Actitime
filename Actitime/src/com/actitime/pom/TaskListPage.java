package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement createNewCustBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement custNameTbx;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement custDescTbx;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustDd;
	
	@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement bigBangBtn;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actCustCreated;
	
	//create project
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement createNewProjectBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter Project Name' and @class]")
	private WebElement projectNameTbx;
	
	@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --' and @class]")
	private WebElement CustSelectDd;
	
	@FindBy(xpath="//div[text()='ICICI_001' and @class='itemRow cpItemRow ']")
	private WebElement iciciCustBtn;
	
	@FindBy(xpath="//textarea[@placeholder='Add Project Description' and @class]")
	private WebElement projectDescTbx;
	
	public TaskListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getCreateNewCustBtn() {
		return createNewCustBtn;
	}

	public WebElement getCustNameTbx() {
		return custNameTbx;
	}

	public WebElement getCustDescTbx() {
		return custDescTbx;
	}

	public WebElement getSelectCustDd() {
		return selectCustDd;
	}

	public WebElement getBigBangBtn() {
		return bigBangBtn;
	}

	public WebElement getCreateCustBtn() {
		return createCustBtn;
	}

	public WebElement getActCustCreated() {
		return actCustCreated;
	}
	
	
	
}
