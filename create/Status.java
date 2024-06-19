package create;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import utility.utility;

public class Status extends NewTest {
	
	public static void Open_Status() throws Exception{
		threadSleep(10);
		driver.findElement(By.xpath(utility.fetchLocatorStatus("Status_click_xpath"))).click();
		threadSleep(2);
	}

	public static void Status_Create() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorStatus("Status_create_id"))).click();
		threadSleep(2);
	}

	public static void Status_Create_Close() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorStatus("Status_create_close_id"))).click();
		threadSleep(3);
	}

	public static void Status_Create_Camera() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorStatus("Status_create_Camera_id"))).click();//
		threadSleep(3);
	}

	public static void Status_Create_Gallery() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorStatus("Status_create_Gallery_id"))).click();
		threadSleep(3);
	}

	public static void Status_Create_Note() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorStatus("Status_create_Note_id"))).click();
		threadSleep(3);
	}

	public static void Status_Create_Link() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorStatus("Status_create_Link_id"))).click();
		threadSleep(3);
	}

	public static void AddStatus_Note(String name) throws Exception {
		driver.findElement(By.id(utility.fetchLocatorStatus("AddStatus_Note_id"))).sendKeys(name);
		threadSleep(3);
	}

	public static void AddStatus_Note_Doubletap() {
		new TouchAction(driver).press(PointOption.point(328, 185)).release().perform().press(PointOption.point(338, 185)).release().perform();
		threadSleep(3);
	}

	public static void AddStatus_Back() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorStatus("AddStatus_Back_id"))).click();
		threadSleep(3);
	}

	public static void AddStatus_Gallery_Back() throws Exception {
		threadSleep(2);
		driver.findElement(By.id(utility.fetchLocatorStatus("AddStatus_Gallery_Back_id"))).click();
		threadSleep(3);
	}

	public static void AddStatus_Change_FontStyle() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorStatus("AddStatus_Note_FontStyle_id"))).click();
		threadSleep(3);
	}

	public static void AddStatus_Change_Background() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorStatus("AddStatus_Note_Background_id"))).click();
		threadSleep(3);
	}

	public static void AddStatus_ADD() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorStatus("AddStatus_ADD_id"))).click();
		threadSleep(3);
	}
	
	public static void AddStatus_Discart_NO() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorStatus("AddStatus_Discart_NO_id"))).click();
		threadSleep(3);
	}

	public static void AddStatus_Discart_YES() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorStatus("AddStatus_Discart_YES_id"))).click();
		threadSleep(3);
	}

	public static void Select_Gallery_Image() throws Exception {
		driver.findElement(By.xpath(utility.fetchLocatorStatus("AddStatus_Select_Gallery_Image_xpath"))).click();
		threadSleep(3);
	}

	public static void Select_Gallery_Video() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorStatus("AddStatus_Select_Gallery_Video_id"))).click();
		threadSleep(3);
	}

	public static void AddStatus_Swipe_Gallery() {
		threadSleep(3);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		int x = driver.manage().window().getSize().width / 2;
		int end_y = (int)(driver.manage().window().getSize().height * 0.2);
		int start_y = (int)(driver.manage().window().getSize().height * 0.8);
		@SuppressWarnings("rawtypes")
		TouchAction action = new TouchAction(driver);
		action.press(PointOption.point(x, start_y));
		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)));
		action.moveTo(PointOption.point(x, end_y));
		action.release();
		action.perform();
		threadSleep(3);
	}

	public static void AddStatus_Camera_Back() {
		driver.navigate().back();
		threadSleep(3);
	}
	
	public static void AddStatus_Video_Back() throws Exception {
		driver.findElement(By.className(utility.fetchLocatorStatus("AddStatus_Video_Back_classname"))).click();
		threadSleep(3);
	}
	
	public static void AddStatus_WhocanView() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorStatus("AddStatus_WhocanView_id"))).click();
		threadSleep(3);
	}
	
	public static void WhocanView_AllContacts() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorStatus("WhocanView_AllContacts_id"))).click();
		threadSleep(3);
	}
	
	public static void WhocanView_AllContactsExcept() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorStatus("WhocanView_AllContactsExcept_id"))).click();
		threadSleep(3);
	}
	
	public static void WhocanView_SelectContacts() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorStatus("WhocanView_SelectContacts_id"))).click();
		threadSleep(3);
	}

	public static void WhocanView_Done() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorStatus("WhocanView_Done_id"))).click();
		threadSleep(3);
	}
	
	public static void WhocanView_SelectMembers_Back() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorStatus("WhocanView_SelectMembers_Back_id"))).click();
		threadSleep(3);
	}
	
	public static void WhocanView_SelectMembers_Search() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorStatus("WhocanView_SelectMembers_Search_id"))).sendKeys("test");
		threadSleep(3);
	}
	
	public static void WhocanView_SelectMembers_Search_Select() {
		threadSleep(3);
		driver.findElement(By.xpath("//android.widget.RelativeLayout[2]")).click();
	}
	
	public static void WhocanView_SelectMembers_SearchClear() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorStatus("WhocanView_SelectMembers_SearchClear_id"))).click();
		threadSleep(3);
	}
	
	public static void WhocanView_SelectMembers_CheckSearchData() {
		threadSleep(3);
		chName = 0;
		List<MobileElement> allNames = driver.findElements(By.id("com.tvisha.clapmessenger:id/displayNameTVID"));
		//List < AndroidElement > allNames = (List < AndroidElement > ) NameMultipleTextView;
		for (MobileElement oneOpt: allNames) {
			searchListmembers[chName] = oneOpt.getText();
			chName++;
		}
		for(i=0;i<chName;i++) {
			//System.out.println(searchListmembers[i]);
			if(!searchListmembers[i].contains("Test")) {
				System.out.println("Not Working");
			}
		}	
	}
	
	public static void WhocanView_SelectMembers() {
		threadSleep(3);
		driver.findElement(By.xpath("//android.widget.RelativeLayout[4]")).click();
		//driver.findElement(By.id("com.tvisha.clapmessenger:id/dataRLID")).click();
		//selected1Name = driver.findElement(sel).getText();
		//System.out.println(selected1Name);
		driver.findElement(By.xpath("//android.widget.RelativeLayout[3]")).click();
		driver.findElement(By.xpath("//android.widget.RelativeLayout[6]")).click();
		driver.findElement(By.xpath("//android.widget.RelativeLayout[7]")).click();
		threadSleep(2);
	}
	
	public static void WhocanView_SelectMembers_Save() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorStatus("WhocanView_SelectMembers_Save_id"))).click();
		threadSleep(3);
	}
	
	public static void Status_Options() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorStatus("Status_Options_id"))).click();
		threadSleep(3);
	}

	public static void Status_Options_Settings() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorStatus("Status_Options_Settings_id"))).click();
		threadSleep(3);
	}
	
	public static void Status_Settings_WhocanView() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorStatus("Status_Settings_WhocanView_id"))).click();
		threadSleep(3);
	}
	
	public static void Status_Settings_StatusTime() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorStatus("Status_Settings_StatusTime_id"))).click();
		threadSleep(3);
	}
	
	public static void Status_Settings_StatusTime_24Hours() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorStatus("Status_Settings_StatusTime_24Hours_id"))).click();
		threadSleep(3);
	}
	
	public static void Status_Settings_StatusTime_48Hours() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorStatus("Status_Settings_StatusTime_48Hours_id"))).click();
		threadSleep(3);
	}
	
	public static void Status_Settings_StatusTime_72Hours() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorStatus("Status_Settings_StatusTime_72Hours_id"))).click();
		threadSleep(3);
	}
	
	public static void Status_Settings_StatusTime_1Week() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorStatus("Status_Settings_StatusTime_1Week_id"))).click();
		threadSleep(3);
	}
	
	public static void Status_Options_AllStatus() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorStatus("Status_Options_AllStatus_id"))).click();
		threadSleep(3);
	}
	
	public static void Status_MystoryList_View() {
		driver.findElement(By.id("com.tvisha.clapmessenger:id/mainLLID")).click();
		threadSleep(3);
	}
	
	public static void Status_MystoryList_Options() {
		driver.findElement(By.id("com.tvisha.clapmessenger:id/myStatusInfoID")).click();
		threadSleep(3);
	}
}