package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class ProjectModule extends BaseClass {

	@Test
	public void testCreateProject() throws EncryptedDocumentException, IOException
	{
		FileLib f=new FileLib();
		String custName = f.getExceldata("CreateCustomer", 1, 3);
		String custDesc = f.getExceldata("CreateCustomer", 1, 4);
		Reporter.log("CreateCustomer",true);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.setTasktab();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNewBtn().click();
	}
}
