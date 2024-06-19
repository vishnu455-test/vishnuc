package create;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;

public class Participants extends NewTest {

	public static void Participants_Button() {
		driver.findElement(participentsOption_groupInfo).click();
		threadSleep(2);
	}

	public static void participents_options() {
		Participants_Button();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		cm.scrollToUpp(0.8, 0.2);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		groupnameParticipents = driver.findElement(By.id("com.tvisha.clapmessenger:id/header_view_title")).getText();
		nameParticipent = driver.findElement(NameTextView).getText();
		driver.findElement(optionsButton).click();
		//driver.findElement(By.xpath("//android.widget.RelativeLayout[2]/descendant::android.widget.ImageView")).click();
	}

	public static void participents_optionsvalidation() {
		count_1 = false;
		int countAdmin = 0;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List < MobileElement > allNames = driver.findElements(By.xpath("//*[@class='android.widget.TextView']"));
		for (MobileElement oneOpt: allNames) {
			adminoptions[countAdmin] = oneOpt.getText();
			System.out.println(adminoptions[countAdmin]);
			countAdmin++;
		}
		if ((adminoptions[countAdmin - 5].equals("Message")) && (adminoptions[countAdmin - 4].equals("View Profile")) && (adminoptions[countAdmin - 3].equals("Make as Group admin")) && (adminoptions[countAdmin - 2].equals("Make as Moderator")) && (adminoptions[countAdmin - 1].equals("Remove from group")))
			count_1 = true;
	}

	public static void participents_optionsvalidation_Search() {
		Participants_Button();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//scrollToUpp(0.8,0.2);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		nameParticipent = driver.findElement(Name_nonRole).getText();
		nameParticipent = StringUtils.chop(nameParticipent);
		//driver.findElement(searchMember).sendKeys(nameParticipent.substring(1));
		searchMemberTextView.sendKeys(nameParticipent.substring(1));
		driver.hideKeyboard();
		driver.findElement(optionsButton).click();
	}

	public static void participents_Message() {
		count_1 = false;
		driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @text='Message']")).click();
		if (nameParticipent.contains(driver.findElement(By.id("com.tvisha.clapmessenger:id/tvChatName")).getText()))
			count_1 = true;
	}

	public static void participents_Viewprofile() {
		count_1 = false;
		driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @text='View Profile']")).click();
		if (nameParticipent.contains(driver.findElement(By.id("com.tvisha.clapmessenger:id/userNameTVID")).getText()))
			count_1 = true;
	}

	public static void participents_makeadminPopup() {
		count_1 = false;
		participents_options();
		driver.findElement(makeasAdmin).click();
		String testMakeadmin = driver.findElement(By.id("com.tvisha.clapmessenger:id/alertTitleTVID")).getText();
		if ((testMakeadmin.contains(nameParticipent)) && (testMakeadmin.contains(groupnameParticipents)))
			count_1 = true;
	}

	public static void participents_makeadminClose() {
		countNo = false;
		countClose = false;
		participents_options();
		driver.findElement(makeasAdmin).click();
		driver.findElement(optionsPopup_No).click();
		if (driver.findElements(By.id("com.tvisha.clapmessenger:id/alertImageID")).size() == 0)
			countNo = true;
		driver.findElement(optionsButton).click();
		driver.findElement(makeasAdmin).click();
		driver.findElement(optionsPopup_Close).click();
		if (driver.findElements(By.id("com.tvisha.clapmessenger:id/alertImageID")).size() == 0)
			countClose = true;
	}

	public static void participents_makeAdmin() {
		String roleCheckname = null;
		count_1 = false;
		//driver.findElement(By.id("com.tvisha.clapmessenger:id/moreIMVID")).click();
		driver.findElement(makeasAdmin).click();
		driver.findElement(optionsPopup_Yes).click();
		threadSleep(5);
		List < MobileElement > allNames = driver.findElements(By.xpath("//*[@class='android.widget.TextView']"));
		for (MobileElement oneOpt: allNames) {
			roleCheckname = oneOpt.getText();
		}
		//System.out.println(roleCheckname+" "+nameParticipent);
		if ((roleCheckname.contains("admin")) && (roleCheckname.contains(nameParticipent)))
			count_1 = true;
	}

	public static void participents_makemoderatorPopup() {
		count_1 = false;
		participents_options();
		driver.findElement(makeasModerator).click();
		String testMakeadmin = driver.findElement(By.id("com.tvisha.clapmessenger:id/alertTitleTVID")).getText();
		if ((testMakeadmin.contains(nameParticipent)) && (testMakeadmin.contains(groupnameParticipents)))
			count_1 = true;
	}

	public static void participents_makemoderator_Close() {
		countNo = false;
		countClose = false;
		participents_options();
		driver.findElement(makeasModerator).click();
		driver.findElement(optionsPopup_No).click();
		if (driver.findElements(By.id("com.tvisha.clapmessenger:id/alertImageID")).size() == 0)
			countNo = true;
		driver.findElement(optionsButton).click();
		driver.findElement(makeasModerator).click();
		driver.findElement(optionsPopup_Close).click();
		if (driver.findElements(By.id("com.tvisha.clapmessenger:id/alertImageID")).size() == 0)
			countClose = true;
	}

	public static void participents_makeModerator() {
		String roleCheckname = null;
		count_1 = false;
		//driver.findElement(By.id("com.tvisha.clapmessenger:id/moreIMVID")).click();
		driver.findElement(makeasModerator).click();
		driver.findElement(optionsPopup_Yes).click();
		threadSleep(5);
		List < MobileElement > allNames = driver.findElements(By.xpath("//*[@class='android.widget.TextView']"));
		for (MobileElement oneOpt: allNames) {
			roleCheckname = oneOpt.getText();
		}
		//System.out.println(roleCheckname+" "+nameParticipent);
		if ((roleCheckname.contains("Moderator")) && (roleCheckname.contains(nameParticipent)))
			count_1 = true;
	}

	public static void participents_removefromgroupPopup() {
		count_1 = false;
		participents_options();
		driver.findElement(removeFromgroup).click();
		String testMakeadmin = driver.findElement(By.id("com.tvisha.clapmessenger:id/alertTitleTVID")).getText();
		if ((testMakeadmin.contains(nameParticipent)) && (testMakeadmin.contains(groupnameParticipents)))
			count_1 = true;
	}

	public static void participents_removefromgroup_Close() {
		countNo = false;
		countClose = false;
		participents_options();
		driver.findElement(removeFromgroup).click();
		driver.findElement(optionsPopup_No).click();
		if (driver.findElements(By.id("com.tvisha.clapmessenger:id/alertImageID")).size() == 0)
			countNo = true;
		driver.findElement(optionsButton).click();
		driver.findElement(removeFromgroup).click();
		driver.findElement(optionsPopup_Close).click();
		if (driver.findElements(By.id("com.tvisha.clapmessenger:id/alertImageID")).size() == 0)
			countClose = true;
	}

	public static void participents_removefromGroup() {
		String roleCheckname = null;
		//driver.findElement(By.id("com.tvisha.clapmessenger:id/moreIMVID")).click();
		driver.findElement(removeFromgroup).click();
		driver.findElement(optionsPopup_Yes).click();
		threadSleep(7);
		/* List < MobileElement > allNames = driver.findElements(By.xpath("//*[@class='android.widget.TextView']")); 
		   for(MobileElement oneOpt: allNames) { roleCheckname = oneOpt.getText(); } */
		roleCheckname = driver.findElement(By.xpath("(//*[contains(@class,'android.widget.TextView')])[last()]")).getText();
		//System.out.println(roleCheckname+" "+nameParticipent);
		if ((roleCheckname.contains("removed")) && (roleCheckname.contains(nameParticipent)))
			System.out.println("Remove from group option working properly,Passed");
		else
			System.out.println("Remove from group option not working properly,Failed");
	}

	public static void participents_checkRemovemember() {
		String roleCheckname;
		count_1 = false;
		driver.findElement(groupHeader).click();
		Participants_Button();
		List < AndroidElement > allNames = (List < AndroidElement > ) NameMultipleTextView;
		for (MobileElement oneOpt: allNames) {
			roleCheckname = oneOpt.getText();
			if (roleCheckname.equals(nameParticipent))
				count_1 = true;
		}
	}

	public static void participents_search() {
		searchField_participants();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		cm.searchedList();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		int check = 0;
		count_1 = false;
		for (i = 0; i < chParticipants; i++) {
			if (listParticipants[i].contains(searchText)) {
				searchListmembers[check] = listParticipants[i];
				check++;
			}
		}
		for (i = 0; i < check; i++) {
			if (!searchListmembers[i].equals(listofMembersclear[i])) {
				count_1 = true;
				break;
			}
		}
	}

	public static void searchField_participants() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// WebElement search = driver.findElement(By.id("com.tvisha.clapmessenger:id/membersSearchETID"));
		searchMemberTextView.sendKeys(searchTest);
		driver.hideKeyboard();
	}

	public static void participents_searchOptions() {
		count_1 = false;
		Participants_Button();
		searchField_participants();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(optionsButton).click();
		int chountAdmin = 0;
		List < MobileElement > allNames = driver.findElements(By.xpath("//*[@class='android.widget.TextView']"));
		for (MobileElement oneOpt: allNames) {
			adminoptions[chountAdmin] = oneOpt.getText();
			chountAdmin++;
		}
		if ((adminoptions[chountAdmin - 5].equals("Message")) && (adminoptions[chountAdmin - 4].equals("View Profile")) && (adminoptions[chountAdmin - 3].equals("Make as Group Admin")) && (adminoptions[chountAdmin - 2].equals("Make as Moderator")) && (adminoptions[chountAdmin - 1].equals("Remove from group")))
			count_1 = true;
	}

	public static void participents_searchModerator() {
		count_1 = false;
		Participants_Button();
		nameParticipent = driver.findElement(NameModerator).getText();
		nameParticipent = StringUtils.chop(nameParticipent);
		threadSleep(5);
		// WebElement search = driver.findElement(By.id("com.tvisha.clapmessenger:id/membersSearchETID"));
		searchMemberTextView.sendKeys(nameParticipent.substring(1));
		driver.hideKeyboard();
		if ((driver.findElement(By.id("com.tvisha.clapmessenger:id/groupUserRoleTVID")).getText()).equals("Moderator"))
			count_1 = true;
	}

	public static void participents_searchModerator_Options() {
		Participants_Button();
		nameParticipent = driver.findElement(NameModerator).getText();
		nameParticipent = StringUtils.chop(nameParticipent);
		threadSleep(5);
		searchMemberTextView.sendKeys(nameParticipent.substring(1));
		driver.hideKeyboard();
		participents_optionsModerator();
	}

	public static void participents_optionsModerator() {
		count_1 = false;
		//driver.findElement(By.id("com.tvisha.clapmessenger:id/llChatHeader")).click();
		Participants_Button();
		//System.out.println(driver.findElement(optionsButton_Moderator).getText());
		driver.findElement(optionsButton_Moderator).click();
		int chountAdmin = 0;
		List < MobileElement > allNames = driver.findElements(By.xpath("//*[@class='android.widget.TextView']"));
		for (MobileElement oneOpt: allNames) {
			adminoptions[chountAdmin] = oneOpt.getText();
			chountAdmin++;
		}
		if ((adminoptions[chountAdmin - 4].equals("Message")) && (adminoptions[chountAdmin - 3].equals("View Profile")) && (adminoptions[chountAdmin - 2].equals("Make as Group admin")) && (adminoptions[chountAdmin - 1].equals("Remove from group")))
			count_1 = true;
	}

	public static void participents_searchAdmin() {
		count_1 = false;
		Participants_Button();
		nameParticipent = driver.findElement(NameAdmin).getText();
		nameParticipent = StringUtils.chop(nameParticipent);
		threadSleep(5);
		// WebElement search = driver.findElement(By.id("com.tvisha.clapmessenger:id/membersSearchETID"));
		searchMemberTextView.sendKeys(nameParticipent.substring(1));
		driver.hideKeyboard();
		if ((driver.findElement(By.id("com.tvisha.clapmessenger:id/groupUserRoleTVID")).getText()).equals("Admin"))
			count_1 = true;
		searchMemberTextView.clear();
	}

	public static void participents_searchAdmin_Options() {
		Participants_Button();
		nameParticipent = driver.findElement(NameAdmin).getText();
		nameParticipent = StringUtils.chop(nameParticipent);
		threadSleep(5);
		searchMemberTextView.sendKeys(nameParticipent.substring(1));
		driver.hideKeyboard();
		participents_optionsAdmin();
	}

	public static void participents_optionsAdmin() {
		count_1 = false;
		//driver.findElement(By.id("com.tvisha.clapmessenger:id/llChatHeader")).click();
		driver.findElement(optionsButton_Admin).click();
		int chountAdmin = 0;
		List < MobileElement > allNames = driver.findElements(By.xpath("//*[@class='android.widget.TextView']"));
		for (MobileElement oneOpt: allNames) {
			adminoptions[chountAdmin] = oneOpt.getText();
			chountAdmin++;
		}
		if ((adminoptions[chountAdmin - 4].equals("Message")) && (adminoptions[chountAdmin - 3].equals("View Profile")) && (adminoptions[chountAdmin - 2].equals("Make as Moderator")) && (adminoptions[chountAdmin - 1].equals("Remove from group")))
			count_1 = true;
	}

	public static void groupoptions_Nonadmin() {
		count_1 = false;
		count_2 = false;
		count_3 = false;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@text='Last Edit ']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(groupHeader).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//scrollToBottom(0.8,0.2);
		if (driver.findElements(By.id("com.tvisha.clapmessenger:id/editID")).size() == 0)
			count_1 = true;
		if (driver.findElements(cameraButton_groupInfo).size() == 0)
			count_2 = true;
		if (driver.findElements(addMember_button).size() == 0)
			count_3 = true;
	}

	public static void participantsoptions_Nonadmin() {
		count_1 = false;
		int chountNonadmin = 0;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@text='Last Edit ']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(groupHeader).click();
		Participants_Button();
		driver.findElement(optionsButton).click();
		List < MobileElement > allNames = driver.findElements(By.xpath("//*[@class='android.widget.TextView']"));
		for (MobileElement oneOpt: allNames) {
			adminoptions[chountNonadmin] = oneOpt.getText();
			chountNonadmin++;
		}
		if ((adminoptions[chountNonadmin - 2].equals("Message")) && (adminoptions[chountNonadmin - 1].equals("View Profile")))
			count_1 = true;
	}

	public static void participentsList_Groupinfo() {
		Participants_Button();
		//scrollToBottom(0.8,0.2);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List < AndroidElement > allNames = (List < AndroidElement > ) NameMultipleTextView;
		for (MobileElement oneOpt: allNames) {
			listParticipants[chParticipants] = oneOpt.getText();
			//System.out.println(listParticipants[chParticipants]);
			chParticipants++;
		}
		while (driver.findElements(By.xpath("//*[@class='android.widget.TextView' and @text='+919133066545']")).size() == 0) {
			cm.scrollToBottom(0.8, 0.2);
			participentsList();
		}
	}

	public static void participents_Groupinfo() {
		//System.out.println(lastMember);
		infoSize = driver.findElement(By.id("com.tvisha.clapmessenger:id/header_view_sub_title")).getText();
		infoSize = infoSize.substring(0, infoSize.length() - 8);
		Participants_Button();
		//scrollToBottom();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		cm.gettingList(NameMultipleTextView);
		listParticipants = getList.clone();
		chParticipants = chList;
		//getList = null;
		while (driver.findElements(By.xpath("//*[@class='android.widget.TextView' and @text='You ']")).size() == 0) {
			cm.scrollToBottom(0.8, 0.2);
			participentsList();
		}
		infoMembersize = Integer.parseInt(infoSize);
		if (infoMembersize == chParticipants)
			System.out.println("Group members count was same in info and participants screen,Passed");
		else
			System.out.println("Group members count was not same in info and participants screen,Failed");
	}

	public static void participentsList() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		k = 0;
		List < AndroidElement > allNamesafter = (List < AndroidElement > ) NameMultipleTextView;
		int countofMembersafter = allNamesafter.size();
		for (MobileElement oneOpt: allNamesafter) {
			cm.listofMembersafter[k] = oneOpt.getText();
			k++;
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		for (a = 0; a < k; a++) {
			if (listParticipants[chParticipants - 1].equals(listofMembersafter[a])) {
				eq = a;
				break;
			}
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		for (eq++; eq < countofMembersafter; eq++) {
			listParticipants[chParticipants] = listofMembersafter[eq];
			System.out.println(listParticipants[chParticipants]);
			chParticipants++;
		}
	}
}