package create;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import utility.utility;

public class My_profile extends NewTest {

	public static void Open_MyProfile() throws Exception {
		threadSleep(10);
		driver.findElement(By.id(utility.fetchLocatorStatus("Clap_Options_id"))).click();
		threadSleep(2);
		driver.findElement(By.id(utility.fetchLocatorStatus("Open_MyProfile_id"))).click();
		threadSleep(2);
	}

	public static void Back_button() throws Exception {
		threadSleep(2);
		driver.findElement(By.xpath(utility.fetchLocatorStatus("MyProfile_Back_button_xpath"))).click();
		threadSleep(2);
	}

	public static void Update_DP_ikon() throws Exception {
		threadSleep(2);
		driver.findElement(By.id(utility.fetchLocatorStatus("MyProfile_Update_DP_id"))).click();
		threadSleep(2);
	}

	public static void Edit_Profile() throws Exception {
		threadSleep(2);
		driver.findElement(By.id(utility.fetchLocatorStatus("MyProfile_Edit_Profile_id"))).click();
		threadSleep(2);
	}

	public static void Back_EditProfile() throws Exception {
		threadSleep(2);
		driver.findElement(By.id(utility.fetchLocatorStatus("Back_EditProfile_id"))).click();
		threadSleep(2);
	}

	public static void DisplayName_EditProfile() throws Exception {
		threadSleep(2);
		driver.findElement(By.id(utility.fetchLocatorStatus("EditProfile_DisplayName_id"))).clear();
		driver.findElement(By.id(utility.fetchLocatorStatus("EditProfile_DisplayName_id"))).sendKeys("Test Automation");
		threadSleep(2);
	}

	public static void Update_EditProfile() throws Exception {
		threadSleep(2);
		driver.findElement(By.id(utility.fetchLocatorStatus("EditProfile_Update_id"))).click();
		threadSleep(2);
	}

	public static void AddDP_Close() throws Exception {
		threadSleep(2);
		Update_DP_ikon();
		DPoptionspopup();
	}

	public static void AddDP_camera() throws Exception {
		threadSleep(2);
		Update_DP_ikon();
		addDP_Camera();
	}

	public static void AddDP_gallery() throws Exception {
		threadSleep(2);
		Update_DP_ikon();
		addDP_Gallery();
	}

	public static void view_DP() throws Exception {
		threadSleep(2);
		driver.findElement(By.id(utility.fetchLocatorStatus("MyProfile_View_DP_id"))).click();
		threadSleep(2);
	}
	
	public static void DPoptionspopup() throws Exception {
		countDP = false;
		if ((driver.findElementsById(utility.fetchLocatorStatus("addDP_Camera_id")).size() > 0) && (driver.findElementsById(utility.fetchLocatorStatus("addDP_Gallery_id")).size() > 0))
			countDP = true;
		driver.findElement(By.id(utility.fetchLocatorStatus("addDP_Options_Close_id"))).click();
	}
	
	public static void addDP_Camera() throws Exception {
		dpCheck = "Camera";
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id(utility.fetchLocatorStatus("addDP_Camera_id"))).click();
		threadSleep(3);
		driver.findElement(By.id(utility.fetchLocatorStatus("addDP_Camera_Capture_id"))).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id(utility.fetchLocatorStatus("addDP_Camera_Capture_Done_id"))).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id(utility.fetchLocatorStatus("addDP_Save_id"))).click();
	}
	
	public static void addDP_Gallery() throws Exception {
		dpCheck = "Gallery";
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id(utility.fetchLocatorStatus("addDP_Gallery_id"))).click();
		threadSleep(5);
		driver.findElement(By.xpath(utility.fetchLocatorStatus("addDP_Gallery_Picture_xpath"))).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='android.view.ViewGroup' and @bounds='[0,281][176,457]']")).click();
		//driver.findElement(By.xpath("//android.view.ViewGroup[@clickable='true']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id(utility.fetchLocatorStatus("addDP_Save_id"))).click();
	}
}