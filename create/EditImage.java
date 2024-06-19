package create;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import utility.utility;

public class EditImage extends NewTest {

	public static void EditImage_Crop() throws Exception{
		driver.findElement(By.id(utility.fetchLocatorEditimage("EditImage_Crop_id"))).click();
		threadSleep(3);
	}

	public static void EditImage_Pen() throws Exception{
		driver.findElement(By.id(utility.fetchLocatorEditimage("EditImage_Pen_id"))).click();
		threadSleep(3);
	}

	public static void EditImage_Text() throws Exception{
		driver.findElement(By.id(utility.fetchLocatorEditimage("EditImage_Text_id"))).click();
		threadSleep(3);
	}

	public static void EditImage_Filter() throws Exception{
		driver.findElement(By.id(utility.fetchLocatorEditimage("EditImage_Filter_id"))).click();
		threadSleep(3);
	}

	public static void EditImage_Crop_Save() throws Exception{
		driver.findElement(By.id(utility.fetchLocatorEditimage("EditImage_Crop_Save_id"))).click();
		threadSleep(3);
	}

	public static void EditImage_Pen_Forward() throws Exception{
		driver.findElement(By.id(utility.fetchLocatorEditimage("EditImage_Pen_Forward_id"))).click();
		threadSleep(3);
	}

	public static void EditImage_Pen_Backward() throws Exception{
		driver.findElement(By.id(utility.fetchLocatorEditimage("EditImage_Pen_Backward_id"))).click();
		threadSleep(3);
	}

	public static void EditImage_Pen_Colour() throws Exception{
		threadSleep(2);
		driver.findElement(By.xpath(utility.fetchLocatorEditimage("EditImage_Pen_Colour_xpath"))).click();
		threadSleep(3);
	}

	public static void EditImage_Pen_Swipe(int wid, double sta, double end) {
		threadSleep(3);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		int x = driver.manage().window().getSize().width / wid;
		int end_y = (int)(driver.manage().window().getSize().height * sta);
		int start_y = (int)(driver.manage().window().getSize().height * end);
		@SuppressWarnings("rawtypes")
		TouchAction action = new TouchAction(driver);
		action.press(PointOption.point(x, start_y));
		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)));
		action.moveTo(PointOption.point(x, end_y));
		action.release();
		action.perform();
		threadSleep(3);
	}

	public static void EditImage_Text_Message(String text) throws Exception{
		driver.findElement(By.id(utility.fetchLocatorEditimage("EditImage_Text_Message_id"))).sendKeys(text);
		threadSleep(3);
	}

	public static void EditImage_Text_Done() throws Exception{
		driver.findElement(By.id(utility.fetchLocatorEditimage("EditImage_Text_Done_id"))).click();
		threadSleep(3);
	}

	public static void EditImage_Text_Emoji() throws Exception{
		driver.findElement(By.id(utility.fetchLocatorEditimage("EditImage_Text_Emoji_id"))).click();
		threadSleep(3);
	}

	public static void EditImage_Text_Emoji_Select() throws Exception{
		//driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.tvisha.clapmessenger:id/txtEmoji' and @index='2']")).click();
		driver.findElement(By.xpath(utility.fetchLocatorEditimage("EditImage_Text_Emoji_Select_id"))).click();
		threadSleep(3);
	}

	public static void EditImage_Filter_Option() throws Exception{
		driver.findElement(By.xpath(utility.fetchLocatorEditimage("EditImage_Filter_Option_xpath"))).click();
		threadSleep(3);
	}

	public static void EditImage_Back() throws Exception{
		driver.findElement(By.id(utility.fetchLocatorEditimage("EditImage_Back_id"))).click();
		threadSleep(3);
	}
}