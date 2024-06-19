package create;

import java.time.Duration;
import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import utility.utility;

public class Send_Message extends NewTest {

	public static void gallery_Send() throws Exception {
		//threadSleep(1);
		driver.findElement(By.xpath(utility.fetchLocatorSendMessage("SendMessage_Gallery_Download_xpath"))).click();
		threadSleep(2);
		//driver.findElement(By.id("com.tvisha.clapmessenger:id/selectID[2]")).click();
		driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[182,156][358,315]']")).click();
		driver.findElement(By.id("com.tvisha.clapmessenger:id/sendLLID")).click();
		threadSleep(2);
	}

	public static void gallery_close() throws Exception {
		driver.findElement(By.xpath(utility.fetchLocatorSendMessage("SendMessage_Gallery_Download_xpath"))).click();
		threadSleep(2);
		//driver.findElement(By.id("com.tvisha.clapmessenger:id/selectID[2]")).click();
		driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[182,156][358,315]']")).click();
		threadSleep(2);
		Back_icon();
		threadSleep(2);
	}

	public static void Capture_Image() throws Exception {
		driver.findElement(By.id("com.tvisha.clapmessenger:id/image_view_change_camera")).click();
		threadSleep(2);
		//driver.findElement(By.id("com.tvisha.clapmessenger:id/messageETID")).click();
		Capture_Caption();
		send_Button();
	}

	public static void Capture_Video() {
		driver.findElement(By.id("com.tvisha.clapmessenger:id/videoTVID")).click();
		threadSleep(2);
		driver.findElement(By.id("com.tvisha.clapmessenger:id/image_view_change_camera")).click();
		threadSleep(2);
		driver.findElement(By.id("com.tvisha.clapmessenger:id/image_view_video_red_bg")).click();
		threadSleep(5);
		driver.findElement(By.id("com.tvisha.clapmessenger:id/image_view_video_red_bg")).click();
		threadSleep(2);
	}

	public static void Capture_Caption() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorSendMessage("Gallery_Caption_id"))).sendKeys("Eclipse +919012345678");
		threadSleep(2);
	}

	public static void gallery_Send_Multiple() throws Exception {
		//threadSleep(1);
		driver.findElement(By.xpath(utility.fetchLocatorSendMessage("SendMessage_Gallery_Download_xpath"))).click();
		threadSleep(2);
		driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[362,156][538,315]']")).click();
		driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[182,319][358,478]']")).click();
		driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[542,482][718,641]']")).click();
		driver.findElement(By.id("com.tvisha.clapmessenger:id/sendLLID")).click();
		threadSleep(2);
		send_Button();
	}

	public static void files_Send() {
		driver.findElement(By.xpath("//android.widget.CompoundButton[@text='Documents']")).click();
		threadSleep(2);
		driver.findElement(By.id("com.google.android.documentsui:id/item_root")).click();
		threadSleep(2);
	}

	public static void location_Send() throws Exception {
		threadSleep(2);
		driver.findElement(By.id(utility.fetchLocatorSendMessage("Location_Send_id"))).click();
		threadSleep(2);
	}

	public static void contacts_Select() {
		//threadSleep(1);
		driver.findElement(By.xpath("//android.widget.RelativeLayout[@resource-id='com.tvisha.clapmessenger:id/mainItemRLID'][2]")).click();
		threadSleep(2);
	}

	public static void contacts_Send_Multiple() {
		driver.findElement(By.xpath("//android.widget.RelativeLayout[@resource-id='com.tvisha.clapmessenger:id/mainItemRLID'][2]")).click();
		driver.findElement(By.xpath("//android.widget.RelativeLayout[@resource-id='com.tvisha.clapmessenger:id/mainItemRLID'][5]")).click();
		driver.findElement(By.xpath("//android.widget.RelativeLayout[@resource-id='com.tvisha.clapmessenger:id/mainItemRLID'][3]")).click();
		threadSleep(2);
		cm.nextButton();
		threadSleep(2);
	}

	public static void audio_Select() {
		//threadSleep(1);
		driver.findElement(By.xpath("//android.widget.RelativeLayout[@focusable='true'][2]")).click();
		threadSleep(2);
	}

	public static void audio_Send_Multiple() {
		driver.findElement(By.xpath("//android.widget.RelativeLayout[@focusable='true'][2]")).click();
		driver.findElement(By.xpath("//android.widget.RelativeLayout[@focusable='true'][5]")).click();
		driver.findElement(By.xpath("//android.widget.RelativeLayout[@focusable='true'][3]")).click();
		threadSleep(2);
		cm.nextButton();
		threadSleep(2);
	}

	public static void camera_open() {
		threadSleep(4);
		driver.findElement(By.id("com.tvisha.clapmessenger:id/cameraIMVID")).click();
		threadSleep(4);
		if (driver.findElementsById("com.tvisha.clapmessenger:id/continueTVID").size() > 0) {
			driver.findElement(By.id("com.tvisha.clapmessenger:id/continueTVID")).click();
			threadSleep(4);
		}
		if (driver.findElementsById("com.tvisha.clapmessenger:id/image_view_click").size() > 0)
			System.out.println("Camera was opened by clicking on camera,Passed");
		else
			System.out.println("Camera was not opened by clicking on camera,Failed");
	}

	public static void camera_image() {
		driver.findElement(By.id("com.tvisha.clapmessenger:id/image_view_click")).click();
		threadSleep(3);
	}

	public static void send_Button() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorSendMessage("send_voiceMessage_id"))).click();
		threadSleep(5);
	}

	public static void voiceMessage_lock() throws Exception {
		threadSleep(3);
		@SuppressWarnings("rawtypes")
		TouchAction action = new TouchAction(driver);
		MobileElement titleC = driver.findElement(By.id(utility.fetchLocatorSendMessage("send_voiceMessage_id")));
		action.longPress(LongPressOptions.longPressOptions()
				.withElement(ElementOption.element(titleC))
				.withDuration(Duration.ofMillis(700)))
			.perform();
		MobileElement titleLock = driver.findElement(By.id(utility.fetchLocatorFilter("Chat_Options_id")));
		action.moveTo(ElementOption.element(titleLock)).release().perform();
	}

	public static void send_voiceMessage_ikon() throws Exception {
		threadSleep(2);
		driver.findElement(By.id(utility.fetchLocatorSendMessage("send_voiceMessage_id"))).click();
	}

	public static void voiceMessage_Cancel() throws Exception {
		threadSleep(3);
		int start_y = (int)(driver.manage().window().getSize().width * 0.5);
		start_y = start_y * -1;
		@SuppressWarnings("rawtypes")
		TouchAction action = new TouchAction(driver);
		MobileElement titleC = driver.findElement(By.id(utility.fetchLocatorSendMessage("send_voiceMessage_id")));
		action.longPress(LongPressOptions.longPressOptions()
				.withElement(ElementOption.element(titleC))
				.withDuration(Duration.ofMillis(700)))
			.perform();
		MobileElement titleLock = driver.findElement(By.id("com.tvisha.clapmessenger:id/glowing_mic"));
		action.moveTo(ElementOption.element(titleLock)).release().perform();
		threadSleep(5);
	}

	public static void voiceMessage_lock_cancel() throws Exception {
		threadSleep(3);
		driver.findElement(By.id(utility.fetchLocatorSendMessage("voiceMessage_lock_cancel_id"))).click();
		threadSleep(2);
	}

	public static void MessageOptions_icon() throws Exception {
		threadSleep(4);
		driver.findElement(By.id(utility.fetchLocatorSendMessage("MessageOptions_id"))).click();
		threadSleep(1);
	}

	public static void Gallery_icon() throws Exception{
		driver.findElement(By.xpath(utility.fetchLocatorSendMessage("MessageOptions_Gallery_xpath"))).click();
		threadSleep(2);
	}

	public static void Files_icon() throws Exception{
		driver.findElement(By.xpath(utility.fetchLocatorSendMessage("MessageOptions_Files_xpath"))).click();
		threadSleep(2);
	}

	public static void Location_icon() throws Exception{
		driver.findElement(By.xpath(utility.fetchLocatorSendMessage("MessageOptions_Location_xpath"))).click();
		threadSleep(2);
	}

	public static void Contacts_icon() throws Exception{
		driver.findElement(By.xpath(utility.fetchLocatorSendMessage("MessageOptions_Contacts_xpath"))).click();
		threadSleep(2);
		driver.findElement(By.id(utility.fetchLocatorSendMessage("MessageOptions_Contacts_Continue_id"))).click();
		threadSleep(2);
	}

	public static void Audio_icon() throws Exception{
		threadSleep(4);
		driver.findElement(By.xpath(utility.fetchLocatorSendMessage("MessageOptions_Audio_xpath"))).click();
		threadSleep(2);
	}

	public static void Video_icon() throws Exception{
		threadSleep(4);
		driver.findElement(By.xpath(utility.fetchLocatorSendMessage("MessageOptions_Video_xpath"))).click();
		threadSleep(2);
	}

	public static void Back_icon() throws Exception{
		threadSleep(2);
		driver.findElement(By.id(utility.fetchLocatorSendMessage("MessageOptions_Back_id"))).click();
		threadSleep(2);
	}

	public static void default_Back() {
		threadSleep(2);
		driver.navigate().back();
		threadSleep(2);
	}

	public static void scrollTohorizontal_Location() {
		int start_y = (int)(driver.manage().window().getSize().width * 0.8);
		MobileElement obj = driver.findElement(By.id("com.tvisha.clapmessenger:id/pin_map"));
		start_y = start_y * -1;
		@SuppressWarnings("rawtypes")
		TouchAction action = new TouchAction(driver);
		action.longPress(ElementOption.element(obj));
		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)));
		action.moveTo(ElementOption.element(obj, start_y, 0));
		action.release();
		action.perform();
	}

	public static void click_holdOn(AndroidElement holdOn) throws Exception {
		threadSleep(8);
		@SuppressWarnings("rawtypes")
		TouchAction action = new TouchAction(driver);
		MobileElement titleC = driver.findElement(By.id(utility.fetchLocatorSendMessage("send_voiceMessage_id")));
		action.longPress(LongPressOptions.longPressOptions()
				.withElement(ElementOption.element(titleC))
				.withDuration(Duration.ofMillis(7000)))
			.release()
			.perform();
		threadSleep(3);
	}
}