package dataProvider;

import org.testng.annotations.DataProvider;

public class Data {
	@DataProvider
	public String[][] loginData(){
		String[][] data= {{"admin","admin"},{"user","user"},{"ank@123","ak1234"}};
		return data;
	}
	@DataProvider
	public String[][] register(){
		String[][] data= {{"admin","admin"},{"user","user"},{"ank@123","ak1234"}};
		return data;
	}

}
