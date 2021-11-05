package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage1 {
	public ActiTimePage1(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}

	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}

	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public  WebElement getLogin()
	{
		return oLogin;
	}
	private  WebElement gettingStartedShortcutsPanelId;
	public  WebElement gettingStartedShortcutsPanelId()
	{
		return gettingStartedShortcutsPanelId;
	}
	@FindBy(xpath="//div[text()='USERS']")
	private WebElement oUsers;
	public WebElement getUsers()
	{
		return oUsers;
	}
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement oAddUser;
	public WebElement getAddUser()
	{
		return oAddUser;
	}
	private WebElement userDataLightBox_firstNameField;
	public WebElement getFname()
	{
		return userDataLightBox_firstNameField;
	}
	private WebElement userDataLightBox_lastNameField;
	public WebElement getlname()
	{
		return userDataLightBox_lastNameField;
	}
	private WebElement userDataLightBox_emailField;
	public WebElement getEmail()
	{
		return userDataLightBox_emailField;
	}
	private WebElement userDataLightBox_usernameField;
	public WebElement getUserName1()
	{
		return userDataLightBox_usernameField;
	}
	private WebElement userDataLightBox_passwordField;
	public WebElement getpassword()
	{
		return userDataLightBox_passwordField;
	}
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement getRetypePassword()
	{
		return userDataLightBox_passwordCopyField;
	}
	private WebElement userDataLightBox_commitBtn;
	public WebElement getCommit()
	{
		return userDataLightBox_commitBtn;
	}
	@FindBy(xpath="//table[@class='userNameContainer']")
	private WebElement oSelect;
	public WebElement getselect()
	{
		return oSelect;
	}
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getdelete()
	{
		return userDataLightBox_deleteBtn;
	}
	private WebElement logoutLink;
	public WebElement getLogout()
	{
		return logoutLink;
	}
	@FindBy(xpath="//span[text()='Save Changes']")
	private WebElement oSave;
	public WebElement getSave()
	{
		return oSave;
	}
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement oCustomer;
	public WebElement gettask()
	{
		return  oCustomer;
	}
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement oAddNew;
	public WebElement getAddnew()
	{
		return  oAddNew;
	}
	@FindBy(xpath="//div[@class='item createNewCustomer ellipsis']")
	private WebElement oNewcustomer;
	public WebElement getnewCustomer()
	{
		return  oNewcustomer;	
	}
	private WebElement customerLightBox_nameField;
	public WebElement getCustomerName()
	{
		return customerLightBox_nameField;
	}
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement oCommitCustomer;
	public WebElement getcommitCustomer()
	{
		return oCommitCustomer;
	}
	@FindBy(xpath="//div[@class='editButton available']")
	private WebElement oEdit;
	public WebElement getEdit()
	{
		return  oEdit;
	}
	@FindBy(xpath="//div[@class='action']")
	private WebElement oAction;
	public WebElement getAction()
	{
		return  oAction;
	}
	@FindBy(xpath="//div[text()='Delete']")
	private WebElement odelete;
	public WebElement getDelete()
	{
		return  odelete;
	}
	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement getdeletepermanantly()
	{
		return customerPanel_deleteConfirm_submitTitle;
	}
	@FindBy(xpath="//textarea[@class='textarea']")
	private WebElement odescrption;
	public WebElement getdescrption()
	{
		return  odescrption;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
	private WebElement odelete1;
	public WebElement getDelete1()
	{
		return odelete1;
	}
	@FindBy(xpath="//div[@class='item createNewProject ellipsis']")
	private WebElement oNewProject;
	public WebElement getNewProject()
	{
		return  oNewProject;
	}
	private WebElement projectPopup_projectNameField;
	public WebElement getprojectName()
	{
		return projectPopup_projectNameField;
	}
	@FindBy(xpath="//span[text()='Create Project']")
	private WebElement oCreateProject;
	public WebElement getCreateProject1()
	{
		return oCreateProject;
	}
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement oEdit2;
	public WebElement getEdit2()
	{
		return  oEdit2;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement oAction1;
	public WebElement getAction1()
	{
		return  oAction1;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
	private WebElement oDelete;
	public WebElement getdelete2()
	{
		return oDelete;
	}
	@FindBy(xpath="//span[@id='projectPanel_deleteConfirm_submitTitle']")
	private WebElement odeletePermanently;
	public WebElement getdeletepermanently1()
	{
		return odeletePermanently;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement odescription2;
	public WebElement getdescription2()
	{
		return odescription2;
	}
	@FindBy(xpath="//div[text()='Add New Task']")
	private WebElement oaddtask;
	public WebElement getAddTask()
	{
		return oaddtask;
	}
	@FindBy(xpath="//div[@class='item createNewTask ellipsis']")
	private WebElement ocreateTask;
	public WebElement getCreateTask()
	{
		return  ocreateTask;
	}
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder']")
	private WebElement oinputTask;
	public WebElement getInputTask()
	{
		return   oinputTask;
	}
	@FindBy(xpath="//span[text()='Create Tasks']")
	private WebElement oCommitTask;
	public WebElement getCommitbutton()
	{
		return oCommitTask;
	}
	@FindBy(xpath="//div[@class='taskRowCellWrapper']")
	private WebElement oSelect1;
	public WebElement getSelect1()
	{
		return  oSelect1;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement oAction2;
	public WebElement getAction2()
	{
		return  oAction2;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")
	private WebElement oDelete4;
	public WebElement getOdelete4()
	{
		return oDelete4;
	}
	private WebElement taskPanel_deleteConfirm_submitTitle;
	public WebElement getconfirmdelete()
	{
		return taskPanel_deleteConfirm_submitTitle;
	}
}
