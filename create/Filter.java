package create;

import java.time.Duration;
import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import utility.utility;

public class Filter extends NewTest {

	public static void Open_Filter() throws Exception{
		threadSleep(5);
		driver.findElement(By.id(utility.fetchLocatorFilter("Chat_Options_id"))).click();
		threadSleep(2);
		driver.findElement(By.id(utility.fetchLocatorFilter("Open_Filter_id"))).click();
		threadSleep(2);
	}

	public static void Filter_Reset_Icon() throws Exception{
		threadSleep(3);
		driver.findElement(By.id(utility.fetchLocatorFilter("Filter_Reset_id"))).click();
	}

	public static void Filter_Cancel_Icon() throws Exception{
		threadSleep(3);
		driver.findElement(By.id(utility.fetchLocatorFilter("Filter_Cancel_id"))).click();
	}

	public static void Filter_Gallery_Icon() throws Exception{
		threadSleep(3);
		driver.findElement(By.id(utility.fetchLocatorFilter("Filter_Gallery_id"))).click();
	}

	public static void Filter_Video_Icon() throws Exception{
		threadSleep(3);
		driver.findElement(By.id(utility.fetchLocatorFilter("Filter_Video_id"))).click();
	}

	public static void Filter_Audio_Icon() throws Exception{
		threadSleep(3);
		driver.findElement(By.id(utility.fetchLocatorFilter("Filter_Audio_id"))).click();
	}

	public static void Filter_Files_Icon() throws Exception{
		threadSleep(3);
		driver.findElement(By.id(utility.fetchLocatorFilter("Filter_Files_id"))).click();
	}

	public static void Filter_Links_Icon() throws Exception{
		threadSleep(3);
		driver.findElement(By.id(utility.fetchLocatorFilter("Filter_Links_id"))).click();
	}

	public static void Filter_Contacts_Icon() throws Exception{
		threadSleep(3);
		driver.findElement(By.id(utility.fetchLocatorFilter("Filter_Contacts_id"))).click();
	}

	public static void Filter_Locations_Icon() throws Exception{
		threadSleep(3);
		driver.findElement(By.id(utility.fetchLocatorFilter("Filter_Locations_id"))).click();
	}

	public static void Filter_Flag_Icon() throws Exception{
		threadSleep(3);
		driver.findElement(By.id(utility.fetchLocatorFilter("Filter_Flag_id"))).click();
	}

	public static void Filter_Pin_Icon() throws Exception{
		threadSleep(3);
		driver.findElement(By.id(utility.fetchLocatorFilter("Filter_Pin_id"))).click();
	}

	public static void swipe_filterList() {
		threadSleep(3);
		@SuppressWarnings("rawtypes")
		TouchAction action = new TouchAction(driver);
		//MobileElement titleC = driver.findElement(By.id("com.tvisha.clapmessenger:id/filterFilesID"));
		MobileElement titleC = driver.findElement(By.className("android.widget.HorizontalScrollView"));
		/*
		 * action.longPress(ElementOption.element(titleC)).perform();
		 * action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(7000)));
		 * action.moveTo(ElementOption.element(titleC, 0, 0));
		 * action.release().perform();
		 */
		action.longPress(LongPressOptions.longPressOptions()
				.withElement(ElementOption.element(titleC))
				.withDuration(Duration.ofMillis(700)))
			.perform();
		// action.longPress(ElementOption.element(titleC)).perform();
		//action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(700)));
		MobileElement titleLock = driver.findElement(By.id("com.tvisha.clapmessenger:id/filterAudioID"));
		action.moveTo(ElementOption.element(titleLock)).release().perform();
	}

	public static void scrollTohorizontal1() {
		threadSleep(3);
		int start_y = (int)(driver.manage().window().getSize().width * 0.8);
		MobileElement obj = driver.findElement(By.className("android.widget.HorizontalScrollView"));
		start_y = start_y * -1;
		@SuppressWarnings("rawtypes")
		TouchAction action = new TouchAction(driver);
		action.longPress(ElementOption.element(obj));
		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)));
		action.moveTo(ElementOption.element(obj, start_y, 0));
		action.release();
		action.perform();
	}

	public void leftRightSwipe() {
		/*
		 * // duration should be in milliseconds Dimension size =
		 * driver.manage().window().getSize(); int startx = (int) (size.width * 0.8);
		 * int endx = (int) (size.width * 0.20); int starty = size.height / 2;
		 * //driver.swipe(startx, starty, endx, starty, 1000);
		 */
		threadSleep(3);
		/*
		 * TouchAction action = new TouchAction(driver); //Using PointOption class to
		 * specify the co-ordinates for touch action PointOption pointStart =
		 * PointOption.point(600,0); PointOption pointEnd = PointOption.point(100,0);
		 * //Performing touch action, press at the start point and moving it till end
		 * point action.press(pointStart).moveTo(pointEnd).release().perform();
		 */
		//	driver.findElemen(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Display\"))")).click(); 
		String country = "Algeria";
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"" +country +"\"))").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.HorizontalScrollView\").scrollable(true)).scrollIntoView(resourceId(\"com.tvisha.clapmessenger:id/filterLinkID\")");
	}

	public static void Open_Search() throws Exception{
		threadSleep(5);
		driver.findElement(By.id(utility.fetchLocatorFilter("Chat_Options_id"))).click();
		threadSleep(2);
		driver.findElement(By.id(utility.fetchLocatorFilter("Open_Search_id"))).click();
		threadSleep(2);
	}

	public static void back_search_chat() throws Exception{
		driver.findElement(By.id(utility.fetchLocatorFilter("Search_Back_id"))).click();
		threadSleep(2);
	}

	public static void Enter_Search_chat(String message) throws Exception{
		driver.findElement(By.id(utility.fetchLocatorFilter("Search_Field_id"))).sendKeys(message);
		threadSleep(2);
		Count = 0;
		if (driver.findElements(By.id("com.tvisha.clapmessenger:id/panelID")).size() > 0)
			Count = 1;
		//driver.executeScript(“mobile: performEditorAction”, ImmutableMap.of(“action”, “Go”));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
	}

	public static void Clear_search_chat() throws Exception{
		driver.findElement(By.id(utility.fetchLocatorFilter("Search_Clear_id"))).click();
		threadSleep(2);
	}

	public static void nextMatch_Button_search_chat() throws Exception{ //to move from 1st to 2nd match
		threadSleep(2);
		driver.findElement(By.id(utility.fetchLocatorFilter("Searchdata_Nextmatch_id"))).click();
		threadSleep(2);
	}

	public static void previousMatch_Button_search_chat() throws Exception { //to move from 2nd to 1st match
		threadSleep(2);
		driver.findElement(By.id(utility.fetchLocatorFilter("Searchdata_Previousmatch_id"))).click();
		threadSleep(2);
	}
}