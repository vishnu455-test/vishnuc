package create;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;

public class AddMember extends NewTest {

	public static void addmembersButton_groupInfo() {
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(addMember_button).click();
	}

	public static void addmembersButton() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("com.tvisha.clapmessenger:id/addImageViewID")).click();
	}

	public static void addmember_Info() {
		int checkAdd = 0;
		am.addmembersButton_groupInfo();
		am.gettingNames_addmember();
		for (i = 0; i < chNameaddinfo; i++) {
			//System.out.println(listofNamesaddinfo[i]+" "+listofNames[i]);
			if (!listofNamesaddinfo[i].equals(listofNames[i])) {
				checkAdd = 1;
				break;
			}
		}
		if (checkAdd == 0)
			System.out.println("Showing list was same in select members and add members screen,Passed");
		else
			System.out.println("Showing list was not same in select members and add members screen,Failed");
	}

	public static void searchAddmember() {
		cm.searchButton();
		cm.searchField();
		cm.searchedList();
	}

	public static void scrollToUPP_addmember() {
		//System.out.println(listofNamesaddinfo[0]);
		//if (!driver.findElement(Name).getText().equals(listofNamesaddinfo[0]))  scrollToUpp(0.3,0.9);
		int season = 0;
		while (season == 0) {
			List < AndroidElement > list = (List < AndroidElement > ) NameMultipleTextView;
			for (MobileElement oneOpt: list) {
				//System.out.println(oneOpt.getText());
				if ((oneOpt.getText()).equals(listofNamesaddinfo[0]))
					season = 1;
			}
			cm.scrollToUpp(0.3, 0.9);
		}		
	}

	public static void addmember_select(){
		//String kol = driver.findElement(By.xpath("//android.widget.CheckBox/preceding-sibling::android.widget.LinearLayout/descendant::android.widget.TextView")).getText();
		driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @text='+918341409066']//preceding-sibling::android.widget.TextView")).click();
		//System.out.println(kol);
	}

	public static void addmember_selectedList() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		cm.scrollToUpp(0.3, 0.9);
		i = 0;
		List < MobileElement > selectedListafter = driver.findElements(By.xpath("//android.widget.CheckBox/preceding-sibling::android.widget.LinearLayout/descendant::android.widget.TextView[1]"));
		// List < MobileElement > selectedListafter = driver.findElements(By.xpath("//*[@class='android.widget.TextView' and @text='Already added in this group']/preceding-sibling::android.widget.TextView[0]"));
		for (MobileElement oneOpt: selectedListafter) {
			listofMembersafter[i] = oneOpt.getText();
			//System.out.println(listofMembersafter[i]);
			i++;
		}
		int cla = 0;
		while (driver.findElements(By.xpath("//*[@class='android.widget.TextView' and @text='Venky Android ']")).size() == 0) {
			if (driver.findElementsByAndroidUIAutomator("new UiSelector().scrollable(true)").size() > 0)
				cm.scrollToBottom(0.8, 0.4);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			List < MobileElement > selectedListafterscroll = driver.findElements(By.xpath("//android.widget.CheckBox/preceding-sibling::android.widget.LinearLayout/descendant::android.widget.TextView[1]"));
			for (MobileElement oneOpt: selectedListafterscroll) {
				for (int j = 0; j < i; j++) {
					if (listofMembersafter[j].equals(oneOpt.getText()))
						cla = 1;
				}
				if (cla == 0) {
					listofMembersafter[i] = oneOpt.getText();
					i++;
				}
				cla = 0;
			}
		}
		for (int n = 0; n < i; n++)
			System.out.println(listofMembersafter[n] + " " + n);
		int duplicate = 0;
		int f = 0, g = 0;
		for (int n = 0; n < chNameaddinfo; n++) {
			if (!listofNamesaddinfo[n].equals(listofMembersafter[f])) {
				selectedlistaddinfo[g] = listofNamesaddinfo[n];
				g++;
			} else
				f++;
		}
		countaddselectedlist = g;
		for (int n = 0; n < g; n++)
			System.out.println(selectedlistaddinfo[n] + " " + n);
		if (duplicate == 0 && Countselect == i)
			System.out.println("previously selected list was same after clicking on add members button,Passed");
		else
			System.out.println("previously selected list was not same after clicking on add members button,Failed");
	}

	public static void addmemberheaderlistInfo(String hori) {
		//System.out.println(hori);
		hori = StringUtils.chop(hori);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		i = 0;
		List < AndroidElement > selectedListafter = (List < AndroidElement > ) selectedMembers_selectedListMultipleTextView;
		for (MobileElement oneOpt: selectedListafter) {
			selectedListAddmember[i] = oneOpt.getText();
			//System.out.println(selectedListAddmember[i]);
			i++;
		}
		int cla = 0;
		while (!selectedListAddmember[i - 1].contains(hori)) {
			//while (driver.findElementsByXPath("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().resourceIdMatches(\".*com.tvisha.clapmessenger:id/rcvSelectedList.*\"))").size()>0) {
			//while(driver.findElementsByXPath("//android.widget.TextView[@scrollable='true']").size()>0)	{
			//if (driver.findElementsByAndroidUIAutomator("new UiSelector().scrollable(true)").size() > 0)
			cm.scrollTohorizontal();
			List < AndroidElement > selectedListafterscroll = (List < AndroidElement > ) selectedMembers_selectedListMultipleTextView;
			for (MobileElement oneOpt: selectedListafterscroll) {
				for (int j = 0; j < i; j++) {
					if (selectedListAddmember[j].equals(oneOpt.getText()))
						cla = 1;
				}
				if (cla == 0) {
					selectedListAddmember[i] = oneOpt.getText();
					i++;
				}
				cla = 0;
			}
		}
		Countaddlist = i;
		cm.membersNamechange();
		//for (int r = 0; r < i; r++) System.out.println(selectedListAddmember[r]);
	}

	public static void checkaddmemberlist_Info() {
		addmemberheaderlistInfo(lastSelected);
		int check = 0;
		Count = 0;
		for (int t = 0; t < countaddselectedlist; t++) {
			for (int l = 0; l < Countaddlist; l++) {
				System.out.println(selectedlistaddinfo[t] + " " + selectedListAddmember[l]);
				if (selectedlistaddinfo[t].contains(selectedListAddmember[l])) {
					check = 1;
				}
			}
			if (check == 0) {
				Count = 0;
				break;
			} else
				Count = 1;
		}
		if ((Count == 1) && (countaddselectedlist == Countaddlist - 1))
			System.out.println("Showing selected list was same in both selected list and below showing list,Passed");
		else
			System.out.println("Showing selected list was not same in both selected list and below showing list,Failed");
	}

	public static void checkaddmemberlist_selectedCreat() {
		//addmemberheaderlistInfo("Test Sa");
		int check = 0;
		Count = 0;
		for (int t = 0; t < countaddselectedlist; t++) {
			for (int l = 0; l < Countselect; l++) {
				if (selectedlistaddinfo[t].equals(selectedList[l])) {
					check = 1;
				}
			}
			if (check == 0) {
				Count = 0;
				break;
			} else
				Count = 1;
		}
		if ((Count == 1) && (countaddselectedlist == Countselect))
			System.out.println("Showing selected list was same in both group creat and add member screens showing list,Passed");
		else
			System.out.println("Showing selected list was not same in both group creat and add member screens showing list,Failed");
	}

	public static void gettingNames_addmember() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		chNameaddinfo = 0;
		List < AndroidElement > allNames = (List < AndroidElement > ) NameMultipleTextView;
		for (MobileElement oneOpt: allNames) {
			listofNamesaddinfo[chNameaddinfo] = oneOpt.getText();
			chNameaddinfo++;
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		while (driver.findElements(By.xpath("//*[@class='android.widget.TextView' and @text='Venky Android ']")).size() == 0) {
			cm.scrollToBottom(0.8, 0.4);
			gettingNameslist_addmember();
		}
		// for(int z=0;z<chNameaddinfo;z++) System.out.println(listofNamesaddinfo[z]+" "+z);
	}

	public static void gettingNameslist_addmember() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		k = 0;
		List < AndroidElement > allNamesafter = (List < AndroidElement > ) NameMultipleTextView;
		int countofMembersafter = allNamesafter.size();
		for (MobileElement oneOpt: allNamesafter) {
			listofMembersafter[k] = oneOpt.getText();
			k++;
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		for (a = 0; a < k; a++) {
			if (listofNamesaddinfo[chNameaddinfo - 1].equals(listofMembersafter[a])) {
				eq = a;
				break;
			}
		}
		eq = eq + 1;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		for (; eq < countofMembersafter; eq++) {
			// System.out.println(listofMembersafter[eq]);
			listofNamesaddinfo[chNameaddinfo] = listofMembersafter[eq];
			chNameaddinfo++;
		}
	}

	public static void addsearchListcheck() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		int check = 0, checking = 0;
		for (i = 0; i < chNameaddinfo; i++)
			if (listofNamesaddinfo[i].contains(searchText)) {
				searchListmembers[check] = listofNamesaddinfo[i];
				// System.out.println(searchListmembers[check]);
				check++;
			}
		for (i = 0; i < check; i++)
			if (!searchListmembers[i].equals(listofMembersclear[i])) {
				checking = 1;
				break;
			}
		if (checking == 0)
			System.out.println("searched list was showing correct from search screen to add member list,Passed");
		else
			System.out.println("after searching list was showing wrong from search screen to add member list,Failed");
	}

	public static void addsearch_Select() {
		if (driver.findElements(checkBox).size() > 0) {
			driver.findElement(By.xpath("//android.widget.CheckBox[1]")).click();
			String nameaddsearchselectcheck = null;
			nameaddsearchselect = driver.findElement(selectedMemberTextView).getText();
			driver.findElement(searchTextView).clear();
			while (driver.findElements(selectedMembersCount).size() == 0) {
				cm.scrollToBottom(0.8, 0.2);
			}
			nameaddsearchselectcheck = driver.findElement(selectedMemberTextView).getText();
			if (nameaddsearchselectcheck.equals(nameaddsearchselect))
				System.out.println("Selected member was showing as selected after search data clears,Passed");
			else
				System.out.println("Selected member was not showing as selected after search data clears,Failed");
		} else {
			System.out.println("All Searched elements are selected allready try to search another member");
		}
	}

	public static void addsearch_Disselect() {
		int countdeselect = 0;
		cm.searchField();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		if (driver.findElements(selectedMembersCount).size() > 0) {
			System.out.println("Selected member was showing as selected after searching,Passed");
			driver.findElement(selectedMembersCount).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(searchTextView).clear();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			if (driver.findElements(selectedMembersCount).size() == 0) {
				countdeselect = 1;
			}
			while (driver.findElements(By.xpath("//*[@class='android.widget.TextView' and @text='Venky Android ']")).size() == 0) {
				cm.scrollToBottom(0.8, 0.2);
				if (driver.findElements(selectedMembersCount).size() == 0) {
					countdeselect = 1;
				}
			}
			if (countdeselect == 1)
				System.out.println("Diselected member was showing as diselected after search data clears,Passed");
			else
				System.out.println("Diselected member was showing as selected after search data clears,Failed");
		} else
			System.out.println("Selected member was showing as not selected after searching,Failed");
	}

	public static void addmemberselectedlist_afterSelect() {
		driver.findElement(By.xpath("//android.widget.CheckBox[1]")).click();
		nameaddsearchselect = driver.findElement(selectedMemberTextView).getText();
		nameaddsearchselect = cm.checkname1(nameaddsearchselect);
		addmemberheaderlistInfo(nameaddsearchselect);
		if (selectedListAddmember[Countaddlist - 1].contains(nameaddsearchselect))
			System.out.println("Selected member was showing in selected members list,Passed");
		else
			System.out.println("Selected member was not showing in selected members list,Failed");
	}

	public static void addmemberselectedlist_crossButton() {
		//driver.findElement(By.xpath("//*[@class='android.widget.ImageView' and @bounds='[646,158][696,208]")).click();
		driver.findElement(disselectLast_selectedList).click();
		int cla = 0;
		List < AndroidElement > selectedListcheck = (List < AndroidElement > ) selectedMembers_selectedListMultipleTextView;
		for (MobileElement oneOpt: selectedListcheck) {
			if (oneOpt.getText().contains(nameaddsearchselect)) {
				cla = 1;
				break;
			}
		}
		if (driver.findElements(selectedMembersCount).size() > 0)
			cla = 1;
		if (cla == 0)
			System.out.println("For 'x'button clicked member was removed from selected members list and that member was disselected in members list,Passed");
		else
			System.out.println("For 'x'button clicked member was not removed from selected members list or that member was not disselected in members list,Failed");
	}

	public static void addmember_previousselected_Search() {
		driver.findElement(checkBox).click();
		nameaddsearchselect = driver.findElement(selectedMemberTextView).getText();
		cm.searchButton();
		cm.searchField();
		driver.findElement(searchTextView).clear();
		String checkName = driver.findElement(selectedMemberTextView).getText();
		if (nameaddsearchselect.equals(checkName))
			System.out.println("After searching previous selected member was showing as selected,Passed");
		else
			System.out.println("After searching previous selected member was not showing as selected,Failed");
	}

	public static void addmember_previousselected_Searchselected() {
		String checkName;
		int cla = 0;
		driver.findElement(checkBox).click();
		nameaddsearchselect = driver.findElement(selectedMemberTextView).getText();
		cm.searchButton();
		cm.searchField();
		driver.findElement(checkBox).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(searchTextView).clear();
		checkName = driver.findElement(selectedMemberTextView).getText();
		if (driver.findElements(selectedMembersCount).size() == 0)
			cla = 1;
		else {
			if (!nameaddsearchselect.equals(checkName))
				cla = 1;
		}
		if (cla == 0)
			System.out.println("Selecting a member by searching that member previous selected member was showing as selected,Passed");
		else
			System.out.println("Selecting a member by searching that member previous selected member was not showing as selected,Failed");
	}

	public static void addmember_previousselected_Searchdisselected() {
		String checkName;
		int cla = 0;
		cm.searchField();
		driver.findElement(selectedMembersCount).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(searchTextView).clear();
		checkName = nameaddsearchselect = driver.findElement(selectedMemberTextView).getText();
		if (driver.findElements(selectedMembersCount).size() == 0)
			cla = 1;
		else {
			if (!nameaddsearchselect.equals(checkName))
				cla = 1;
		}
		if (cla == 0)
			System.out.println("Disselecting a member by searching that member previous selected member was showing as selected,Passed");
		else
			System.out.println("Disselecting a member by searching that member previous selected member was not showing as selected,Failed");
	}

	public static void addmember_previousselectedheader() {
		driver.findElement(checkBox).click();
		nameaddsearchselect = driver.findElement(selectedMemberTextView).getText();
		nameaddsearchselect = cm.checkname1(nameaddsearchselect);
		String check = driver.findElement(By.xpath("//android.widget.CheckBox[@checked='false']/preceding-sibling::android.widget.LinearLayout/descendant::android.widget.TextView[1]")).getText();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		while (check.length() > 7)
			check = StringUtils.chop(check);
		driver.findElement(By.xpath("//android.widget.CheckBox[@checked='false']")).click();
		//driver.findElement(By.xpath("//android.widget.RelativeLayout[2]/descendant::android.widget.CheckBox")).click();
		addmemberheaderlistInfo(check);
		//driver.findElement(By.xpath("//*[@class='android.widget.ImageView' and @bounds='[646,158][696,208]']")).click();
		driver.findElement(disselectLast_selectedList).click();
		int cla = 0, clacu = 0;
		List < AndroidElement > selectedListcheck = (List < AndroidElement > ) selectedMembers_selectedListMultipleTextView;
		for (MobileElement oneOpt: selectedListcheck) {
			if (oneOpt.getText().contains(check)) {
				cla = 1;
				break;
			}
			if (oneOpt.getText().contains(nameaddsearchselect)) {
				clacu = 1;
			}
		}
		if (cla == 0 && clacu == 1) {
			System.out.println("Only one member is removed after clicking on 'x' button in selected members list,Passed");
			if (driver.findElements(selectedMembersCount).size() > 1)
				System.out.println("Only one member is disselected after clicking on 'x' button in below members list,Passed");
		} else
			System.out.println("More than one member is disselected after clicking on 'x' button in below members or selected members list,Failed");
	}

	public static void addmemberCheck() {
		driver.findElement(checkBox).click();
		nameaddsearchselect = driver.findElement(selectedMemberTextView).getText();
		String check = driver.findElement(By.xpath("//android.widget.CheckBox[@checked='false']/preceding-sibling::android.widget.LinearLayout/descendant::android.widget.TextView[1]")).getText();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.CheckBox[@checked='false']")).click();
		cm.nextButton();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		pa.participentsList_Groupinfo();
		count_1 = false;
		count_2 = false;
		for (int t = 0; t < chParticipants; t++) {
			if (listParticipants[t] == nameaddsearchselect)
				count_1 = true;
			if (listParticipants[t] == check)
				count_2 = true;
		}
	}

	public static void backButton_Addmember_Info() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("com.tvisha.clapmessenger:id/backImageViewID")).click();
	}

	public static void search_back() {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		count_1 = false;
		if (!driver.findElement(By.id("com.tvisha.clapmessenger:id/searchImageID")).isDisplayed())
			count_1 = true;
	}
}