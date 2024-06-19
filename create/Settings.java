package create;

import org.openqa.selenium.By;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import utility.utility;

public class Settings extends NewTest {

	public static void Open_Settings() throws Exception {
		threadSleep(10);
		driver.findElement(By.id("com.tvisha.clapmessenger:id/moreIMVID")).click();
		threadSleep(2);
		driver.findElement(By.id(utility.fetchLocatorSettings("Open_Settings_id"))).click();//Open_Settings_id
		threadSleep(2);
	}

	public static void Profile_Option() throws Exception{
		threadSleep(2);
		driver.findElement(By.id(utility.fetchLocatorSettings("Settings_Profile_id"))).click();//Settings_Profile_id
		threadSleep(2);
	}

	public static void Account_Option() throws Exception{
		threadSleep(2);
		driver.findElement(By.xpath(utility.fetchLocatorSettings("Settings_Account_xpath"))).click();//Settings_Account_xpath
		threadSleep(2);
	}

	public static void Notifications_Option() throws Exception{
		threadSleep(2);
		driver.findElement(By.xpath(utility.fetchLocatorSettings("Settings_Notifications_xpath"))).click();//Settings_Notifications_xpath
		threadSleep(2);
	}

	public static void Media_Option() throws Exception{
		threadSleep(2);
		driver.findElement(By.xpath(utility.fetchLocatorSettings("Settings_Media_xpath"))).click();//Settings_Media_xpath
		threadSleep(2);
	}

	public static void General_Option() throws Exception{
		threadSleep(2);
		driver.findElement(By.xpath(utility.fetchLocatorSettings("Settings_General_xpath"))).click();//Settings_General_xpath
		threadSleep(2);
	}

	public static void Security_Option() throws Exception{
		threadSleep(2);
		driver.findElement(By.xpath(utility.fetchLocatorSettings("Settings_Security_xpath"))).click();//Settings_Security_xpath
		threadSleep(2);
	}

	public static void Help_Option() throws Exception{
		threadSleep(2);
		driver.findElement(By.xpath(utility.fetchLocatorSettings("Settings_Help_xpath"))).click();//Settings_Help_xpath
		threadSleep(2);
	}

	public static void Back_Settings() throws Exception{
		threadSleep(2);
		driver.findElement(By.id(utility.fetchLocatorSettings("Settings_Back_id"))).click();//Settings_Back_id
		threadSleep(2);
	}

	public static void Back_Option() throws Exception{ //wrong utility
		threadSleep(2);
		driver.findElement(By.id(utility.fetchLocatorSettings("Status_Settings_StatusTime_24Hours_id"))).click();
		threadSleep(2);
	}

	public static void Terms_Help() throws Exception{
		threadSleep(2);
		driver.findElement(By.id(utility.fetchLocatorSettings("Terms_Help_id"))).click();//Terms_Help_id
		threadSleep(8);
		String urlname = driver.findElement(By.id(utility.fetchLocatorSettings("Terms_Help_URL_id"))).getText();//Terms_Help_URL_id
		if (urlname.contains("clapmessenger.com/privacy-policy"))
			check = true;
	}

	public static void Back_Terms_Help() throws Exception{
		driver.navigate().back();
		threadSleep(3);
		check = false;
		if (driver.findElement(By.id("com.tvisha.clapmessenger:id/headerTitleTVID")).getText().contains("Help"))
			check = true;
	}

	public static void Audio_Media() throws Exception{
		threadSleep(3);
		driver.findElement(By.xpath(utility.fetchLocatorSettings("Media_Audio_xpath"))).click();
		threadSleep(3);//Media_Audio_xpath
	}

	public static void Video_Media() throws Exception{
		threadSleep(3);
		driver.findElement(By.xpath(utility.fetchLocatorSettings("Media_Video_xpath"))).click();
		threadSleep(3);//Media_Video_xpath
	}

	public static void Photo_Media() throws Exception{
		threadSleep(3);
		driver.findElement(By.xpath(utility.fetchLocatorSettings("Media_Photo_xpath"))).click();
		threadSleep(3);//Media_Photo_xpath
	}

	public static void Photo_Zoom_Media() {
		new TouchAction(driver).press(PointOption.point(328, 185)).release().perform().press(PointOption.point(338, 185)).release().perform();
		threadSleep(2);
	}

	public static void Audio_play() throws Exception{
		driver.findElement(By.id(utility.fetchLocatorSettings("Media_Audio_play_id"))).click();//Media_Audio_play_id
		//threadSleep(2);
	}

	public static void Audio_pause() throws Exception{
		driver.findElement(By.id(utility.fetchLocatorSettings("Media_Audio_pause_id"))).click();//Media_Audio_pause_id
		//threadSleep(2);
	}

	public static void Video_options() throws Exception{
		driver.findElement(By.id(utility.fetchLocatorSettings("Media_Video_options_id"))).click();//Media_Video_options_id
		threadSleep(1);
	}

	public static void Video_play() throws Exception{
		Video_options();
		driver.findElement(By.id(utility.fetchLocatorSettings("Media_Video_play_id"))).click();//Media_Video_play_id
		threadSleep(2);
	}

	public static void Video_pause() throws Exception{
		driver.findElement(By.id(utility.fetchLocatorSettings("Media_Video_pause_id"))).click();//Media_Video_pause_id
		threadSleep(5);
	}

	public static void Video_forward() throws Exception{
		driver.findElement(By.id(utility.fetchLocatorSettings("Media_Video_forward_id"))).click();//Media_Video_forward_id
		//threadSleep(2);
	}

	public static void Video_backword() throws Exception{
		driver.findElement(By.id(utility.fetchLocatorSettings("Media_Video_backword_id"))).click();//Media_Video_backword_id
		//threadSleep(2);
	}

	public static void Media_Docs() throws Exception{
		driver.findElement(By.id(utility.fetchLocatorSettings("Media_Docs_id"))).click();
		threadSleep(3);
	}

	public static void Media_Docs_View() throws Exception{
		driver.findElement(By.id(utility.fetchLocatorSettings("Media_Docs_View_id"))).click();
		threadSleep(3);
	}

	public static void Media_Links() throws Exception{
		driver.findElement(By.id(utility.fetchLocatorSettings("Media_Links_id"))).click();
		threadSleep(3);
	}

	public static void Media_Links_Click() throws Exception{
		driver.findElement(By.id(utility.fetchLocatorSettings("Media_Links_Click_id"))).click();
		threadSleep(3);
	}

	public static void Back_Clicked_links() throws Exception {
		driver.navigate().back();
		threadSleep(3);
		check = false;
		if (driver.findElement(By.id(utility.fetchLocatorSettings("Media_Links_id"))).getText().contains("Links"))
			check = true;
	}

	public static void General_MobileData() throws Exception{
		driver.findElement(By.id(utility.fetchLocatorSettings("General_MobileData_id"))).click();
		threadSleep(5);
	}

	public static void General_WIFI() throws Exception{
		driver.findElement(By.id(utility.fetchLocatorSettings("General_WIFI_id"))).click();
		threadSleep(3);
	}

	public static void General_Cancel_Options() throws Exception{
		driver.findElement(By.id(utility.fetchLocatorSettings("General_Cancel_Options_id"))).click();
		threadSleep(2);
	}

	public static void General_Ok_Options() throws Exception{
		driver.findElement(By.id(utility.fetchLocatorSettings("General_Ok_Options_id"))).click();
		threadSleep(2);
	}

	public static void General_Photos_checkbox() throws Exception{
		driver.findElement(By.id(utility.fetchLocatorSettings("General_Photos_checkbox_id"))).click();
		threadSleep(2);
	}

	public static void General_Videos_checkbox() throws Exception{
		driver.findElement(By.id(utility.fetchLocatorSettings("General_Videos_checkbox_id"))).click();
		threadSleep(2);
	}

	public static void General_Audio_checkbox() throws Exception{
		driver.findElement(By.id(utility.fetchLocatorSettings("General_Audio_checkbox_id"))).click();
		threadSleep(2);
	}

	public static void General_Documents_checkbox() throws Exception{
		driver.findElement(By.id(utility.fetchLocatorSettings("General_Documents_checkbox"))).click();
		threadSleep(2);
	}
}