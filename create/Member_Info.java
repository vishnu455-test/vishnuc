package create;

import java.time.Duration;
import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import utility.utility;

public class Member_Info extends NewTest{
	
	public static void Open_MemberInfo() throws Exception{
		threadSleep(10);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.tvisha.clapmessenger:id/displayNameTVID' and not(preceding-sibling::android.widget.ImageView)]")).click();
		threadSleep(3);
		driver.findElement(By.id("com.tvisha.clapmessenger:id/entityNameTVID")).click();
		threadSleep(3);
	}

	public static void MemberInfo_Back() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorMemberInfo("MemberInfo_Back_id"))).click();
		threadSleep(2);
	}
	
	public static void MemberInfo_Options() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorMemberInfo("MemberInfo_Options_id"))).click();
		threadSleep(2);
	}
	
	public static void MemberInfo_ShareContact() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorMemberInfo("MemberInfo_ShareContact_id"))).click();
		threadSleep(2);
	}
	
	public static void MemberInfo_AddContact() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorMemberInfo("MemberInfo_AddToContact_id"))).click();
		threadSleep(2);
	}
	
	public static void MemberInfo_AddContact_Save() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorMemberInfo("MemberInfo_AddToContact_Save_id"))).click();
		threadSleep(2);
	}
	
	public static void MemberInfo_DP() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorMemberInfo("MemberInfo_DP_id"))).click();
		threadSleep(2);	
	}
	
	public static void longpress(MobileElement holdOn) {
		//MobileElement obj = driver.findElement(By.id("com.tvisha.clapmessenger:id/userNameTVID"));
		@SuppressWarnings("rawtypes")
		TouchAction action = new TouchAction(driver);
		action.longPress(ElementOption.element(holdOn));
		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)));
		action.release();
		action.perform();
	}
	
	public static void MemberInfo_VideoCall() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorMemberInfo("MemberInfo_VideoCall_id"))).click();
		threadSleep(2);	
	}
	
	public static void MemberInfo_AudioCall() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorMemberInfo("MemberInfo_AudioCall_id"))).click();
		threadSleep(2);	
	}
	
	public static void MemberInfo_Groups() throws Exception {
		driver.findElement(By.xpath(utility.fetchLocatorMemberInfo("MemberInfo_Groups_xpath"))).click();
		threadSleep(2);	
	}
	
	public static void MemberInfo_Groups_Open() throws Exception {
		driver.findElement(By.id(utility.fetchLocatorMemberInfo("MemberInfo_Groups_List_id"))).click();
		threadSleep(2);	
	}
}
