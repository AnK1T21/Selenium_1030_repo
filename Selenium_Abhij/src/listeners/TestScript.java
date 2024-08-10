package listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerImplementation.class)
public class TestScript {
	@Test
	public void login() {
		Reporter.log("Open browser",true);
		Reporter.log("Navigate to url",true);
		Reporter.log("Click on login Link",true);
		Reporter.log("Enter Email",true);
		Reporter.log("Enter PassWord",true);
		Reporter.log("Click on login Button",true);
        Assert.assertEquals(true, false);
	}

}
