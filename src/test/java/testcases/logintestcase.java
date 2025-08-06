package testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.libarayclass;

public class logintestcase extends libarayclass{

@BeforeTest	
public void launch() {
	initializeBrowser();
}




@Test
public void login() {
	
}

@AfterTest
public void close() {
	
}
}
