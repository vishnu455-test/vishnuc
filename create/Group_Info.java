package create;

import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;

public class Group_Info extends NewTest {

	public static void created_Groupdetails() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		infoName = driver.findElement(By.id("com.tvisha.clapmessenger:id/tvChatName")).getText();
		infoSize = driver.findElement(By.id("com.tvisha.clapmessenger:id/tvLastSeen")).getText();
		infoSize = infoSize.substring(0, infoSize.length() - 8);
		driver.findElement(groupHeader).click();
	}

	public static void back_info() {
		count_1 = false;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='android.widget.ImageButton']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		if (driver.findElements(groupHeader).size() > 0)
			count_1 = true;
	}

	public static void created_GroupnameInfo() {
		count_1 = false;
		count_2 = false;
		count_3 = false;
		String infogroupName = driver.findElement(By.id("com.tvisha.clapmessenger:id/header_view_title")).getText();
		String infogroupSize = driver.findElement(By.id("com.tvisha.clapmessenger:id/header_view_sub_title")).getText();
		String infoinfo = driver.findElement(By.id("com.tvisha.clapmessenger:id/infoTVID")).getText();
		infogroupName = StringUtils.chop(infogroupName);
		infoName = StringUtils.chop(infoName);
		if (infogroupName.equals(infoName) && infogroupName.equals(groupName))
			count_1 = true;
		infogroupSize = infogroupSize.substring(0, infogroupSize.length() - 8);
		if (infoSize.equals(infogroupSize))
			count_2 = true;
		if (groupInfo.equals(infoinfo))
			count_3 = true;
	}

	public static void groupinfo_DP_optionspopup() throws Exception {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(cameraButton_groupInfo).click();
		mp.DPoptionspopup();
		if (driver.findElements(cameraButton_groupInfo).size() > 0)
			System.out.println("Add DP options popup closed by clicking on 'x' button in group info screen,Passed");
		else
			System.out.println("Add DP options popup not closed by clicking on 'x' button in group info screen,Failed");
	}

	public static void groupDp_groupInfo() throws Exception {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(cameraButton_groupInfo).click();
		mp.addDP_Camera();
		cm.checkAddedDP_creat();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(cameraButton_groupInfo).click();
		mp.addDP_Gallery();
		cm.checkAddedDP_creat();
	}

	public static void ownerDetails() {
		count_1 = false;
		count_2 = false;
		String ownernameInfo = driver.findElement(By.id("com.tvisha.clapmessenger:id/ownerNameTVID")).getText();
		System.out.println(ownernameInfo);
		//if (ownernameInfo.equals(numberProfile))
		if (ownernameInfo.equals("You "))
			count_1 = true;
	}

	public static void editButton_groupInfo() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("com.tvisha.clapmessenger:id/edit")).click();
	}

	public static void editInfo() {
		// scrollToBottom(0.8,0.2);
		editButton_groupInfo();
		cm.editOptioncreat();
		// editParticipents();
	}

	public static void backButton_editInfo() {
		count_1 = false;
		threadSleep(5);
		backButton();
		if (driver.findElements(addMember_button).size() > 0)
			count_1 = true;
	}

	public static void editInfochange() {
		driver.findElement(groupName_field).clear();
		driver.findElement(groupName_field).sendKeys(nameEdit);
	}

	public static void editParticipents() {
		cm.scrollToUpp(0.6, 0.8);
		cm.listDetails();
		int editCheck = 0;
		for (i = 0; i < Countdetails; i++) {
			if (!selectedDetails[i].equals(selectedCreat[i])) {
				editCheck = 1;
				//System.out.println("Check");
				break;
			}
		}
		if (editCheck == 0)
			System.out.println("In edit screen showing participents list was same as creat screen,Passed");
		else
			System.out.println("In edit screen showing participents list was not same as creat screen,Failed");
	}

	public static void nextButton() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(next_Icon).click();
	}

	public static void CheckGroupcreat_Edit() {
		count_1 = false;
		threadSleep(3);
		// 	driver.refresh();
		driver.getPageSource();
		String name = driver.findElement(NameTextView).getText();
		String subNamedp = driver.findElement(subNameTextView).getText();
		name = StringUtils.chop(name);
		if (nameEdit.equals(name) && subNamedp.contains("You changed group details"))
			count_1 = true;
		// driver.findElement(By.id("com.tvisha.clapmessenger:id/displayNameTVID")).click();   
	}

	public static void backButton() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("com.tvisha.clapmessenger:id/backImageID")).click();
		threadSleep(2);
	}
}