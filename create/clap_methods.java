package create;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class clap_methods extends NewTest {

	public static void search() { //home screen search
		driver.findElementById("com.tvisha.clapmessenger:id/contactSearchIMVID").click();
		driver.findElementById("com.tvisha.clapmessenger:id/contactSearchETID").sendKeys("Testong1");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		// driver.hideKeyboard();
		driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @text='Testong1 ']")).click();
	}

	public static void threedotsButton() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(optionsButton).click();
	}

	public static void openCreatgroup() {
		threedotsButton();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("com.tvisha.clapmessenger:id/newGroupTVID")).click();
	}

	public static void backButton_Select() {
		backButton();
		count_1 = false;
		if (driver.findElements(By.id("com.tvisha.clapmessenger:id/backImageID")).size() == 0)
			count_1 = true;
	}

	public static void validationSelect() {
		threadSleep(2);
		count_1 = false;
		count_2 = false;
		if (driver.findElements(next_Icon).size() == 0)
			count_1 = true;
		if (driver.findElementsById("com.tvisha.clapmessenger:id/rcvSelectedList").size() == 0)
			count_2 = true;
	}

	public static void validationSelect_afterselecting() {
		threadSleep(3);
		driver.findElement(subNameTextView).click();
		count_1 = false;
		count_2 = false;
		if (driver.findElements(next_Icon).size() > 0)
			count_1 = true;
		if (driver.findElementsById("com.tvisha.clapmessenger:id/rcvSelectedList").size() > 0)
			count_2 = true;
	}

	public static void validationSelect_afterdisselecting() {
		threadSleep(3);
		driver.findElement(subNameTextView).click();
		driver.findElement(selectedMembersCount).click();
		count_1 = false;
		count_2 = false;
		if (driver.findElements(next_Icon).size() == 0)
			count_1 = true;
		if (driver.findElementsById("com.tvisha.clapmessenger:id/rcvSelectedList").size() == 0)
			count_2 = true;
	}

	public static void gettingNames() {
		gettingList_scroll(NameMultipleTextView);
		listofNames = doopList.clone();
		//doopList = null;
		/* driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        chName = 0;
        List < MobileElement > allNames = driver.findElements(Name);
        for (MobileElement oneOpt: allNames) {
            listofNames[chName] = oneOpt.getText();
            chName++;
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        while (driver.findElements(By.xpath("//*[@class='android.widget.TextView' and @text='Venky Android ']")).size() == 0) {
        	scrollToBottom(0.8,0.2);
            gettingNameslist();
        }
        //for(int z=0;z<chName;z++) System.out.println(listofNames[z]);
    }

    public static void gettingNameslist() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        k = 0;
        List < MobileElement > allNamesafter = driver.findElements(Name);
        for (MobileElement oneOpt: allNamesafter) {
            listofMembersafter[k] = oneOpt.getText();
            k++;
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        for (a = 0; a < k; a++) {
            if (listofNames[chName - 1].equals(listofMembersafter[a])) {
                eq = a;
                break;
            }
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        for (eq++; eq < k; eq++) {
            listofNames[chName] = listofMembersafter[eq];
            chName++;
        } */
	}

	public static void gettingList_scroll(List < AndroidElement > doop) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		chName = 0;
		List < AndroidElement > allNames = (List < AndroidElement > ) doop;
		for (MobileElement oneOpt: allNames) {
			doopList[chName] = oneOpt.getText();
			chName++;
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		while (driver.findElements(By.xpath("//*[@class='android.widget.TextView' and @text='Venky Android ']")).size() == 0) {
			scrollToBottom(0.8, 0.2);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			k = 0;
			List < AndroidElement > allNamesafter = (List < AndroidElement > ) doop;
			for (MobileElement oneOpt: allNamesafter) {
				doopList_continue[k] = oneOpt.getText();
				k++;
				//System.out.println(doopList_continue[k]);
			}
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//System.out.println(k);
			for (a = 0; a < k; a++) {
				if (doopList[chName - 1].equals(doopList_continue[a])) {
					eq = a;
					break;
				}
			}
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			for (eq++; eq < k; eq++) {
				doopList[chName] = doopList_continue[eq];
				//System.out.println(doopList[chName]);
				chName++;
			}
		}
		/* System.out.println(chName); 
		 * for(int z=0;z<chName;z++)
		     System.out.println(doopList[chName]); */
	}

	public static void gettingList(List < AndroidElement > get) {
		chList = 0;
		List < AndroidElement > selectedListafter = (List < AndroidElement > ) get;
		for (AndroidElement oneOpt: selectedListafter) {
			System.out.println(oneOpt);
			getList[chList] = oneOpt.getText();
			chList++;
		}
		/* System.out.println(chList);
		 for (int mk = 0; mk < chList; mk++)
		 	System.out.println(getList[mk]); */
	}

	public static void check_Duplicates() {
		int memberCheck = 0;
		threadSleep(2);
		gettingList_scroll(subNameMultipleTextView);
		listofMembers = doopList.clone();
		//doopList = null;
		memberCheck = chName;

		for (i = 0; i < b; i++) {
			for (j = i + 1; j < b; j++) {
				if (listofMembers[i].equals(listofMembers[j]))
					memberCheck = 1;
			}
			if (memberCheck == 1)
				System.out.println(listofMembers[i] + " gets duplicated");
			memberCheck = 0;
		}
		//for (i = 0; i < b; i++) System.out.println(listofMembers[i]);
		scrollToUpp(0.3, 0.9);
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Hahah \"));");
	}

	public static void select_memberclick() {
		threadSleep(2);
		String selectcheck = driver.findElement(NameTextView).getText();
		driver.findElement(NameTextView).click();
		String selectcheckafter = driver.findElement(selectedMemberTextView).getText();
		//System.out.println(selectcheck + ", "+selectcheckafter);
		count_1 = false;
		if (selectcheck.equals(selectcheckafter))
			count_1 = true;
	}

	public static void disselect_memberclick() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(subNameTextView).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(subNameTextView).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		count_1 = false;
		if (driver.findElements(selectedMembersCount).size() == 0)
			count_1 = true;
	}

	public static void disselect_selectedmembers() {
		driver.findElement(subNameTextView).click();
		deselectButton();
		count_1 = false;
		if (driver.findElements(selectedMembersCount).size() == 0)
			count_1 = true;
	}

	public static void select_disselectedMember() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(NameTextView).click();
		deselectButton();
		driver.findElement(NameTextView).click();
		count_1 = false;
		if (driver.findElements(selectedMembersCount).size() == 1)
			count_1 = true;
	}

	public static void search_close() {
		driver.findElement(By.id("com.tvisha.clapmessenger:id/closeImageID")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		count_1 = false;
		if (driver.findElement(searchImageTextView).isDisplayed())
			count_1 = true;
	}

	public static void searchedList() {
		// searchButton();
		count_1 = false;
		gettingList(NameMultipleTextView);
		listofMembersclear = getList.clone();
		searchCount = chList;
		// getList = null;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		for (i = 0; i < searchCount; i++) {
			// System.out.println(listofMembersclear[i]);
			if (!listofMembersclear[i].contains(searchText)) {
				count_1 = true;
				break;
			}
		}
		// System.out.println(searchCheck);
	}

	public static void searchListcheck() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		int check = 0;
		count_2 = false;
		for (i = 0; i < chName; i++)
			if (listofNames[i].contains(searchText)) {
				searchListmembers[check] = listofNames[i];
				check++;
			}
		for (i = 0; i < check; i++)
			if (!searchListmembers[i].equals(listofMembersclear[i])) {
				count_2 = true;
				break;
			}
	}

	public static void search_Invalid() {
		count_1 = false;
		if (driver.findElements(By.id("com.tvisha.clapmessenger:id/cbSelectItem")).size() == 0)
			count_1 = true;
	}

	public static void selectingMember_afterSearch() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @text='+918341409066']")).click();
		driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @text='+919347243214']")).click();
		driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @text='+917032285906']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		gettingList(selectedMemberMultipleTextView);
		listofMembersclear = getList.clone();
		Count = chList;
		// getList = null;
		backButton();
	}

	public static void creatGroup_previousSelected_Search() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(NameTextView).click();
		selectedbefore = driver.findElement(selectedMemberTextView).getText();
		searchButton();
		searchField();
		driver.findElement(searchTextView).clear();
		String selectedafter = driver.findElement(selectedMemberTextView).getText();
		count_1 = false;
		if (selectedbefore.equals(selectedafter))
			count_1 = true;
	}

	public static void creatGroup_previousSelected_SearchDisselect_selectedList() {
		driver.findElement(NameTextView).click();
		selectedbefore = driver.findElement(selectedMemberTextView).getText();
		driver.findElement(By.xpath("//android.widget.CheckBox[@checked='false']")).click();
		searchButton();
		searchField();
		driver.findElement(disselectLast_selectedList).click();
		driver.findElement(searchTextView).clear();
		String selectedafter = driver.findElement(selectedMemberTextView).getText();
		if (selectedbefore.equals(selectedafter))
			System.out.println("Previous selected member was showing as selected after disselecting a member by clicking on 'X' button on that member in selected list after searching,Passed");
		else
			System.out.println("Previous selected member was not showing as selected after deselecting a new member by clicking on 'X' button on that member in selected list after searching,Failed");
	}

	public static void creatGroup_previousSelected_Searchselected() {
		count_1 = false;
		driver.findElement(NameTextView).click();
		selectedbefore = driver.findElement(selectedMemberTextView).getText();
		searchButton();
		searchField();
		driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @text='+919347243214']")).click();
		backButton();
		String selectedafter = driver.findElement(selectedMemberTextView).getText();
		if (selectedbefore.equals(selectedafter))
			count_1 = true;
	}

	public static void creatGroup_previousSelected_Searchdeselect() {
		creatGroup_previousSelected_Searchselected();
		searchButton();
		searchField();
		driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @text='+919347243214']")).click();
		backButton();
		String selectedafter = driver.findElement(selectedMemberTextView).getText();
		if (selectedbefore.equals(selectedafter))
			System.out.println("Previous selected member was showing as selected after deselecting a new member by searching that member,Passed");
		else
			System.out.println("Previous selected member was not showing as selected after deselecting a new member by searching that member,Failed");
	}

	public static void creatGroup_previousSelected_selectedlistdeselect() {
		driver.findElement(By.id("com.tvisha.clapmessenger:id/dataRLID")).click();
		selectedbefore = driver.findElement(selectedMemberTextView).getText();
		driver.findElement(By.xpath("//android.widget.CheckBox[@checked='false']")).click();
		driver.findElement(disselectLast_selectedList).click();
		String selectedafter = driver.findElement(selectedMemberTextView).getText();
		if (selectedbefore.equals(selectedafter))
			System.out.println("Previous selected member was showing as selected after deselecting a new member by clicking on 'X' button on that member in selected list,Passed");
		else
			System.out.println("Previous selected member was not showing as selected after deselecting a new member by clicking on 'X' button on that member in selected list,Failed");
	}

	public static void checkselectedMembers_AfterSearchClear() {
		i = 0;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		/* while (driver.findElements(By.xpath("//*[@class='android.widget.TextView' and @text='Venky Android ']")).size() == 0) {
		 	scrollToBottom(0.8,0.2);
		 gettingList(selectedMember);
		 } */
		gettingList_scroll(selectedMemberMultipleTextView);
		selectedList = doopList.clone();
		//doopList = null;
		int searchlistch = 0;
		/* for (int l = 0; l < Count; l++) System.out.println(selectedList[l] + " " + listofMembersclear[l]);
		for (int l = 0; l < Count; l++) {
		    if (!selectedList[l].equals(listofMembersclear[l]))
		        searchlistch = 1;
		}
		if (searchlistch == 0)*/
		if (chName == Count)
			System.out.println("In search screen selected member is showing as selected in list screen,Passed");
		else
			System.out.println("In search screen selected member is not showing as selected in list screen,Failed");
	}

	public static void checkselectedmembers_Aftersearch() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		searchButton();
		searchField();
		count_1 = false;
		gettingList(selectedMemberMultipleTextView);
		listofMembers_afterSearch = getList.clone();
		Count = chList;
		//getList = null;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		for (i = 0; i < Count; i++) {
			if (!listofMembers_afterSearch[i].equals(listofMembersclear[i]))
				count_1 = true;
		}
	}

	public static void searchlist_Deselection() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @text='+918341409066']")).click();
		driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @text='+919347243214']")).click();
		driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @text='+919573247035']")).click();
		backButton();
		coun = 0;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List < AndroidElement > allSelectedlist = (List < AndroidElement > ) selectedMemberMultipleTextView;
		coun = allSelectedlist.size();
		if (Count == 0)
			System.out.println("Deselected list in search list was showing correct from search screen to list,Passed");
		else
			System.out.println("Deselected list in search list was showing not correct from search screen to list,Failed");
	}

	public static void selectMembers() {
		threadSleep(3);
		driver.findElement(By.xpath("//android.view.ViewGroup[4]")).click();
		//driver.findElement(By.id("com.tvisha.clapmessenger:id/dataRLID")).click();
		threadSleep(2);
		selected1Name = driver.findElement(sel).getText();
		System.out.println(selected1Name);
		driver.findElement(By.xpath("//android.view.ViewGroup[3]")).click();
		driver.findElement(By.xpath("//android.view.ViewGroup[6]")).click();
		driver.findElement(By.xpath("//android.view.ViewGroup[7]")).click();
	}

	public static void selectedList_back() {
		i = 0;
		List < AndroidElement > selectedListafter = (List < AndroidElement > ) selectedMemberMultipleTextView;
		for (MobileElement oneOpt: selectedListafter) {
			selectedList[i] = oneOpt.getText();
			i++;
		}
	}

	public static void chackingFirstselectedname() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(NameTextView).click();
		selected1Name = driver.findElement(selectedMemberTextView).getText();
		selected1Name = checkname1(selected1Name);
		//System.out.println(selected1Name);
		selectedName = driver.findElement(By.id("com.tvisha.clapmessenger:id/tvUserName")).getText();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		if (selectedName.contains(selected1Name))
			System.out.println("First selected name is same in selected and below members list,Passed");
		else
			System.out.println("First selected name is different or not shown in selected and below members list,Failed");
	}

	public static void chackingFirstselectedname_disselect() {
		deselectButton();
		selected1Name = selectedMembers_selectedLisTextView.getText();
		selectedName = driver.findElement(By.id("com.tvisha.clapmessenger:id/tvUserName")).getText();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		if (selected1Name.contains(selectedName))
			System.out.println("First member name is same in selected and below members list after disselecting first member,Passed");
		else
			System.out.println("First member name is different or not shown in selected and below members list after disselecting first member,Failed");
	}

	public static void selectedList() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		gettingList(selectedMembers_selectedListMultipleTextView);
		selectedListmembers = getList.clone();
		Countlist = chList;
		//getList = null;
		membersNamechange();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		gettingList(selectedMemberMultipleTextView);
		selectedList = getList.clone();
		Count = chList;
		/* getList = null;
		for(i=0;i<=Count;i++) { for(int r=0;r<Count;r++) { 
		   if(!selectedListmembers[i].contains(selectedList[r])) countChe=1; } } */
		if (countChe != 1 && Count == Countlist)
			System.out.println("Selected members was same in selected and below members selected list,Passed");
		else
			System.out.println("Selected members was different in selected and below members selected list,Failed");
	}

	public static void deselectMembers() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		selectedMembers_selectedLisTextView.click();
		deselectButton();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(selectedMembersCount).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List < AndroidElement > allSelectedmembers = (List < AndroidElement > ) selectedMembers_selectedListMultipleTextView;
		CountlistDeselect = allSelectedmembers.size();
		List < MobileElement > allSelectedlist = driver.findElements(selectedMembersCount);
		CountDeselect = allSelectedlist.size();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		if (CountlistDeselect == CountDeselect)
			System.out.println("After deselecting members count was same in selected members list and bolow list selected members count,Passed");
		else
			System.out.println("After deselecting members count was different in selected members list and bolow list selected members count,Failed");
		//firstName = driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @bounds='[0,277][168,310]']")).getText();
	}

	public static void selectedMemberslist() {
		threadSleep(1);
		gettingList(selectedMemberMultipleTextView);
		selectedList = getList.clone();
		i = chList;
		//getList = null;
		int cla = 0;
		while (driver.findElements(By.xpath("//*[@class='android.widget.TextView' and @text='Venky Android ']")).size() == 0) {
			scrollToBottom(0.8, 0.2);
			driver.findElement(By.xpath("//android.widget.RelativeLayout[3]")).click();
			driver.findElement(By.xpath("//android.widget.RelativeLayout[5]")).click();
			lastSelected = driver.findElement(By.xpath("//android.widget.RelativeLayout[5]/descendant::android.widget.LinearLayout/descendant::android.widget.TextView")).getText();
			lastSelected = checkname(lastSelected); //Checking last selected name size
			//System.out.println(lastSelected);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			// gettingList(selectedList);
			List < AndroidElement > selectedListafterscroll = (List < AndroidElement > ) selectedMemberMultipleTextView;
			for (MobileElement oneOpt: selectedListafterscroll) {
				for (int j = 0; j < i; j++) {
					if (selectedList[j].equals(oneOpt.getText()))
						cla = 1;
				}
				if (cla == 0) {
					selectedList[i] = oneOpt.getText();
					i++;
				}
				cla = 0;
			}
		}
		Countselect = i;
		//  for(int dp=0;dp<Countselect;dp++) System.out.println(selectedList[dp]);
		bottomSelect = driver.findElement(By.id("com.tvisha.clapmessenger:id/tvSelectedList")).getText();
		lastMember = selectedList[i - 1];
		lastMember = StringUtils.chop(lastMember);
	}

	public static void selectedMembersorder() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		i = 0;
		List < AndroidElement > selectedListafter = (List < AndroidElement > ) selectedMembers_selectedListMultipleTextView;
		for (MobileElement oneOpt: selectedListafter) {
			selectedListmembers[i] = oneOpt.getText();
			i++;
		}
		int cla = 0;
		while (!selectedListmembers[i - 1].contains(lastSelected)) {
			//if (driver.findElementsByAndroidUIAutomator("new UiSelector().scrollable(true)").size() > 0)
			scrollTohorizontal();
			List < AndroidElement > selectedListafterscroll = (List < AndroidElement > ) selectedMembers_selectedListMultipleTextView;
			for (MobileElement oneOpt: selectedListafterscroll) {
				for (int j = 0; j < i; j++) {
					if (selectedListmembers[j].equals(oneOpt.getText()))
						cla = 1;
				}
				if (cla == 0) {
					selectedListmembers[i] = oneOpt.getText();
					i++;
				}
				cla = 0;
			}
		}
		Countlist = i;
		membersNamechange();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		nextButton();
		// for(int r=0;r<i;r++) System.out.println(selectedListmembers[r]);
	}

	public static void validationDetails() {
		count_1 = false;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		nextButton();
		if (driver.findElements(cameraButton_details).size() > 0)
			count_1 = true;
	}

	public static void validationDetailsnext() {
		count_1 = false;
		if (driver.findElements(cameraButton_creat).size() == 0)
			count_1 = true;
	}

	public static void validationfill_Nameonly() {
		driver.findElement(groupName_field).sendKeys(groupNameonly);
		nextButton();
		validationDetailsnext();
	}

	public static void validationfill_Infoonly() {
		count_1 = false;
		driver.findElement(groupInfo_field).sendKeys(groupInfo);
		nextButton();
		if (driver.findElements(cameraButton_creat).size() == 0)
			count_1 = true;
	}

	public static void groupdetails_DP_optionspopup() throws Exception {
		count_1 = false;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(cameraButton_details).click();
		mp.DPoptionspopup();
		if (driver.findElements(By.id("com.tvisha.clapmessenger:id/imagePreview")).size() > 0)
			count_1 = true;
	}

	public static void groupDpdetails() throws Exception {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		threadSleep(2);
		driver.findElement(cameraButton_details).click();
		mp.addDP_Camera();
		checkAddedDpdetails();
		if (driver.findElements(cameraButton_details).size() > 0)
			driver.findElement(cameraButton_details).click();
		else
			driver.findElementById("com.tvisha.clapmessenger:id/selectedImageID").click();
		mp.addDP_Gallery();
		checkAddedDpdetails();
	}

	public static void groupDetails_namefield() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String test = "group name field accepting chatacters size";
		driver.findElement(groupName_field).sendKeys(test);
		groupNamedetails = driver.findElement(groupName_field).getText();
		if (test.equals(groupNamedetails))
			System.out.println("there is no validation limit for name field");
	}

	public static void groupDetails() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(groupName_field).sendKeys(groupName);
		driver.findElement(groupInfo_field).sendKeys(groupInfo);
		//groupNamedetails = driver.findElement(By.id("com.tvisha.clapmessenger:id/etGroupName")).getText();
		//groupInfodetails = driver.findElement(By.id("com.tvisha.clapmessenger:id/etGroupInfo")).getText();
		bottomDetails = driver.findElement(By.id("com.tvisha.clapmessenger:id/tvSelectedList")).getText();
	}

	public static void listDetails() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		i = 0;
		List < AndroidElement > selectedListdetails = (List < AndroidElement > ) NameMultipleTextView;
		Countdetails = selectedListdetails.size();
		for (MobileElement oneOpt: selectedListdetails) {
			selectedDetails[i] = oneOpt.getText();
			i++;
		}
		int chackList = 0;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		while (chackList == 0) {
			for (int d = 0; d < i; d++) {
				//System.out.println(selectedDetails[d]+ ", "+ lastMember);
				if (lastMember.equals(selectedDetails[d])) {
					//if (selectedDetails[d].equals("Test Si")) {
					chackList = 1;
					break;
				}
			}
			if (chackList == 0)
				listscrollDetails();
		}
		Countdetails = i;
		//for(int d=0;d<i;d++) System.out.println(selectedDetails[d]);  nextButton();
	}

	public static void listscrollDetails() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		scrollToBottom(0.8, 0.6);
		List < AndroidElement > selectedListdetails = (List < AndroidElement > ) NameMultipleTextView;
		int cla = 0;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		for (MobileElement oneOpt: selectedListdetails) {
			for (int j = 0; j < i; j++) {
				if (selectedDetails[j].equals(oneOpt.getText()))
					cla = 1;
			}
			if (cla == 0) {
				selectedDetails[i] = oneOpt.getText();
				i++;
			}
			cla = 0;
		}
	}

	public static void back_details() {
		count_1 = false;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		backButton();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		if (driver.findElements(By.id("com.tvisha.clapmessenger:id/searchImageID")).size() > 0)
			count_1 = true;
	}

	public static void back_details_selectedlist() {
		coun = 0;
		count_1 = false;
		backButton();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		gettingList(selectedMemberMultipleTextView);
		listofMembersclear = getList.clone();
		coun = chList;
		//getList = null;
		for (int dp = 0; dp < coun; dp++) {
			if (!selectedList[dp].equals(listofMembersclear[dp]))
				count_1 = true;
		}
	}

	public static void validationcreat() {
		count_1 = false;
		if (driver.findElements(cameraButton_creat).size() > 0)
			count_1 = true;
	}

	public static void groupcreat_DP_optionspopup() throws Exception {
		count_1 = false;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(cameraButton_creat).click();
		mp.DPoptionspopup();
		if (driver.findElements(cameraButton_creat).size() > 0)
			count_1 = true;
	}

	public static void groupDpcreat() throws Exception {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(cameraButton_creat).click();
		mp.addDP_Camera();
		checkAddedDP_creat();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(cameraButton_creat).click();
		mp.addDP_Gallery();
		checkAddedDP_creat();
	}

	public static void creatGroup() {
		count_1 = false;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		groupNamecreat = driver.findElement(By.id("com.tvisha.clapmessenger:id/groupNameTVID")).getText();
		groupInfocreat = driver.findElement(By.id("com.tvisha.clapmessenger:id/groupInfoTVID")).getText();
		if (groupName.equals(groupNamecreat) && groupInfo.equals(groupInfocreat))
			count_1 = true;
	}

	public static void listCreat() {
		threadSleep(5);
		i = 0;
		List < AndroidElement > selectedListcreat = (List < AndroidElement > ) NameMultipleTextView;
		Countcreat = selectedListcreat.size();
		for (MobileElement oneOpt: selectedListcreat) {
			selectedCreat[i] = oneOpt.getText();
			i++;
		}
		int chackList = 0;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		while (chackList == 0) {
			for (int d = 0; d < i; d++) {
				if (lastMember.equals(selectedCreat[d])) {
					chackList = 1;
					break;
				}
			}
			if (chackList == 0)
				listscrollCreat();
		}
		// for(int d=0;d<i;d++) System.out.println(selectedCreat[d]);
		Countcreat = i;
		//	nextButton();
	}

	public static void listscrollCreat() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		scrollToBottom(0.8, 0.2);
		List < AndroidElement > selectedListdetails = (List < AndroidElement > ) NameMultipleTextView;
		int cla = 0;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		for (MobileElement oneOpt: selectedListdetails) {
			for (int j = 0; j < i; j++) {
				if (selectedCreat[j].equals(oneOpt.getText()))
					cla = 1;
			}
			if (cla == 0) {
				selectedCreat[i] = oneOpt.getText();
				i++;
			}
			cla = 0;
		}
	}

	public static void editButton_creat() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("com.tvisha.clapmessenger:id/editImageID")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		if (driver.findElements(next_Icon).size() > 0)
			System.out.println("By clicking edit button group details screen opened,Passed");
		else
			System.out.println("By clicking edit button group details screen not opened,Failed");
	}

	public static void backButton_editCreat() {
		backButton();
		if (driver.findElements(By.id("com.tvisha.clapmessenger:id/searchImageID")).size() > 0)
			System.out.println("Back button is working fine in edit group details screen from group creat,Passed");
		else
			System.out.println("Back button is not working in edit group details screen from group creat,Failed");
	}

	public static void editDetails_back() {
		String nameEdit = "Test_edit";
		driver.findElement(groupName_field).sendKeys(nameEdit);
	}

	public static void editOptioncreat() {
		count_1 = false;
		groupNamedetails = driver.findElement(groupName_field).getText();
		groupInfodetails = driver.findElement(groupInfo_field).getText();
		if (groupNamedetails.equals(groupName) && groupInfodetails.equals(groupInfo))
			count_1 = true;
	}

	public static void editDetails() throws Exception {
		groupDpdetails();
		driver.findElement(groupName_field).clear();
		String nameEdit = "Test_edit";
		driver.findElement(groupName_field).sendKeys(nameEdit);
		nextButton();
		groupNamedetails = driver.findElement(By.id("com.tvisha.clapmessenger:id/groupNameTVID")).getText();
		if ((groupNamedetails.equals(nameEdit)) && (driver.findElementsById("com.tvisha.clapmessenger:id/groupImageID").size() > 0))
			System.out.println("We can able to edit the group details including DP by using edit button,Passed");
		else
			System.out.println("Can't able to edit the group details including DP by using edit button, Failed");
	}

	public static void addOptioncreat() {
		am.addmembersButton();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		if (driver.findElementsById("com.tvisha.clapmessenger:id/searchImageID").size() > 0)
			System.out.println("By clicking add members button select members screen opened,Passed");
		else
			System.out.println("By clicking add members button select members screen not opened,Failed");
	}

	/*public static void addChecklist() {
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    i = 0;
	    List < MobileElement > selectedListafter = driver.findElements(selectedMember);
	    for (MobileElement oneOpt: selectedListafter) {
	        listofMembersafter[i] = oneOpt.getText();
	        i++;
	    }
	    int cla = 0;
	    while (driver.findElements(By.xpath("//*[@class='android.widget.TextView' and @text='Venky Android ']")).size() == 0) {
	        if (driver.findElementsByAndroidUIAutomator("new UiSelector().scrollable(true)").size() > 0)
	            scrollToBottom();
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        List < MobileElement > selectedListafterscroll = driver.findElements(selectedMember);
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
	    int duplicate = 0;
	    for (int n = 0; n < i; n++) {
	        //        	System.out.println(listofMembersafter[n]+","+selectedList[n]);
	        if (!listofMembersafter[n].equals(selectedList[n]))
	            duplicate = 1;
	    }
	    if (duplicate == 0 && Countselect == i)
	        System.out.println("previously selected list was same after clicking on add members button,Passed");
	    else
	        System.out.println("previously selected list was not same after clicking on add members button,Failed");
	    //        nextButton();
	    backButton();
	} */

	public static void checkSelectedlist() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		for (i = 0; i < Count - 1; i++) {
			if ((selectedDetails[i].equals(selectedCreat[i])) && (selectedDetails[i].contains(selectedListmembers[i])))
				countselectedList = 0;
			else {
				countselectedList = 1;
				break;
			}
		}
		if (countselectedList == 0)
			System.out.println("List was same in group details and creat screen,Passed");
		else
			System.out.println("List was not same in group details and creat screen,Failed");
		if ((Countselect == Countdetails) && (Countselect == Countcreat))
			System.out.println("Selected members count was same in all screens,Passed" + Countselect + Countdetails + Countcreat);
		else
			System.out.println("Selected members count was not same in all screens,Failed" + Countselect + Countdetails + Countcreat);
	}

	public static void checkbottomName() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//bottomCreate = driver.findElement(By.id("com.tvisha.clapmessenger:id/groupSelectedListTVID")).getText();
		if (bottomSelect.equals(bottomDetails))
			System.out.println("Bottom showing text is same in select members and group details screens,Passed");
		else
			System.out.println("Bottom showing text is different in select members and group details screens,Failed");
		selected1Name = checkname1(selected1Name);
		if (bottomDetails.contains(selected1Name))
			System.out.println("First selected name shown in bottom text, Passed");
		else
			System.out.println("First selected name was not shown in bottom text, Failed");
		//  nextButton();
	}

	public static void back_creat() {
		count_1 = false;
		backButton();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		if (driver.findElements(groupName_field).size() > 0)
			count_1 = true;
	}

	public static void CheckGroupcreat() {
		count_1 = false;
		threadSleep(3);
		// 	driver.refresh();
		driver.getPageSource();
		String name = driver.findElement(Name1).getText();
		String subNamedp = driver.findElement(subName1).getText();
		name = StringUtils.chop(name);
		if (groupName.equals(name) && subNamedp.contains("You created group"))
			count_1 = true;
		driver.findElement(Name1).click();
	}

	public static void open_created_Group() {
		threadSleep(10);
		driver.findElement(By.id("com.tvisha.clapmessenger:id/mainDataLLID")).click();
		threadSleep(3);
		//        if (driver.findElement(NameTextView).getText().equals("Space 123 "))
		//            driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @text='Space 123 ']")).click();
		//        else
		//            driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @text='Test_edit_info ']")).click();
	}

	public static void getProfilenumber() {
		threedotsButton();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("com.tvisha.clapmessenger:id/llMyProfile")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		nameProfile = driver.findElement(By.id("com.tvisha.clapmessenger:id/nameTVID")).getText();
		numberProfile = driver.findElement(By.id("com.tvisha.clapmessenger:id/numberTVID")).getText();
		//System.out.println(nameProfile + numberProfile);
		backButton_profile();
	}

	public static void getContactsnumber() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		checkname = 0;
		contactsButton();
		k = 0;
		int ka = 0;
		List < AndroidElement > allNames = (List < AndroidElement > ) NameMultipleTextView;
		for (MobileElement oneOpt: allNames) {
			contactsList[ka] = oneOpt.getText();
			ka++;
		}
		List < AndroidElement > allNumbers = (List < AndroidElement > ) subNameMultipleTextView;
		for (MobileElement oneOpt: allNumbers) {
			//System.out.println(oneOpt.getText());
			if (numberProfile.equals(oneOpt.getText())) {
				checkname = 1;
				break;
			}
			k++;
		}
		if (checkname == 1) {
			selfName = contactsList[k - 1];
			System.out.println("testself");
		}
		//System.out.println("testself");
		// while ((driver.findElements(By.id("com.tvisha.clapmessenger:id/inviteTextID")).size() > 0) && (checkname == 0)) {
		while (checkname == 0) {
			System.out.println("test");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			k = 0;
			ka = 0;
			scrollToBottom(0.8, 0.2);
			List < AndroidElement > allNamesafter = (List < AndroidElement > ) NameMultipleTextView;
			for (MobileElement oneOpt: allNamesafter) {
				contactsList[ka] = oneOpt.getText();
				ka++;
			}
			List < AndroidElement > allNumbersafter = (List < AndroidElement > ) subNameMultipleTextView;
			for (MobileElement oneOpt: allNumbersafter) {
				if (numberProfile.equals(oneOpt.getText())) {
					checkname = 1;
					break;
				}
				k++;
			}
			if (checkname == 1)
				selfName = contactsList[k - 1];
		}
		//System.out.println(selfName);
		homeButton();
	}

	public static void nextButton() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(next_Icon).click();
	}

	public static void backButton_Addmember() {
		count_1 = false;
		am.backButton_Addmember_Info();
		threadSleep(3);
		if (driver.findElements(addMember_button).size() > 0)
			count_1 = true;
	}

	public static void selectAddmember() {
		driver.findElement(checkBox).click();
	}

	public static void contactsList() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		conName = 0;
		List < AndroidElement > allNames = (List < AndroidElement > ) NameMultipleTextView;
		for (MobileElement oneOpt: allNames) {
			contactsList[conName] = oneOpt.getText();
			conName++;
		}
		/* for (int z = 0; z < conName; z++) System.out.println(contactsList[z]);
		   System.out.println(conName); */
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		while (driver.findElements(By.xpath("//*[@class='android.widget.TextView' and @text='Venky Android ']")).size() == 0) {
			scrollToBottom(0.8, 0.2);
			getting_Contactslist();
		}
		//for (int z = 0; z < conName; z++) System.out.println(contactsList[z]);
	}

	public static void getting_Contactslist() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		k = 0;
		List < AndroidElement > allNamesafter = (List < AndroidElement > ) NameMultipleTextView;
		for (MobileElement oneOpt: allNamesafter) {
			listofMembersafter[k] = oneOpt.getText();
			k++;
			//System.out.println(listofMembersafter[k]);
		}
		System.out.println(k);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		for (a = 0; a < k; a++) {
			if (contactsList[conName - 1].equals(listofMembersafter[a])) {
				eq = a;
				break;
			}
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		for (eq++; eq < k; eq++) {
			contactsList[conName] = listofMembersafter[eq];
			conName++;
		}
	}

	public static void groupOnlyname() {
		threadSleep(5);
		driver.findElement(NameTextView).click();
		threadSleep(3);
		driver.findElement(groupHeader).click();
		threadSleep(3);
		if (driver.findElements(By.id("com.tvisha.clapmessenger:id/infoID")).size() > 0)
			System.out.println("Info details are showing in group info for info not added while creating group,Failed");
		else
			System.out.println("Info details are not showing in group info for info not added while creating group,Passed");

		if (driver.findElements(By.id("com.tvisha.clapmessenger:id/noImageID")).size() > 0)
			System.out.println("Empty DP showing in group info for DP not added while creating group,Passed");
		else
			System.out.println("DP was showing in group info for DP not added while creating group,Failed");
	}

	public static void groupOnlyname_edit() {
		threadSleep(5);
		driver.findElement(NameTextView).click();
		threadSleep(3);
		driver.findElement(groupHeader).click();
		//scrollToBottom(0.8,0.2);
		gi.editButton_groupInfo();
		if (driver.findElement(groupInfo_field).getText().equals(""))
			System.out.println("Info field was showing as Empty in edit group details screen for info not added while creating group,Passed");
		else
			System.out.println("Info field was not showing as Empty in edit group details screen for info not added while creating group,Failed");
	}

	public static void groupOnlyname_editAddinfo() {
		driver.findElement(groupInfo_field).sendKeys(groupInfo);
		nextButton();
		threadSleep(5);
		driver.findElement(NameTextView).click();
		threadSleep(3);
		driver.findElement(groupHeader).click();
		threadSleep(3);
		String infoinfo = driver.findElement(By.id("com.tvisha.clapmessenger:id/infoTVID")).getText();
		if (driver.findElements(By.id("com.tvisha.clapmessenger:id/infoID")).size() > 0) {
			if (groupInfo.equals(infoinfo))
				System.out.println("Edit added info was showing in group info for info not added while creating group,Passed");
		} else
			System.out.println("Info details are not showing in group info for info not added while creating group,Passed");
	}

	public static void contactsButton() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='BottomBarItem' and @bounds='[360,1402][540,1473]']")).click();
	}

	public static void homeButton() {
		driver.findElement(By.xpath("//*[@class='BottomBarItem' and @bounds='[0,1402][180,1473]']")).click();
	}

	public static String checkname(String nameCheck) {
		if (nameCheck.length() > 8) {
			while (nameCheck.length() > 8)
				nameCheck = StringUtils.chop(nameCheck);
		} else
			nameCheck = StringUtils.chop(nameCheck);
		return nameCheck;
	}

	public static String checkname1(String nameCheck) {
		while (nameCheck.length() > 8)
			nameCheck = StringUtils.chop(nameCheck);
		return nameCheck;
	}

	public static void membersNamechange() {
		for (int r = 0; r < Countlist; r++) {
			while (selectedListmembers[r].length() > 9) {
				selectedListmembers[r] = StringUtils.chop(selectedListmembers[r]);
			}
		}
	}

	public static void searchButton() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("com.tvisha.clapmessenger:id/searchImageID")).click();
	}

	public static void searchField() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//WebElement search = driver.findElement(By.id("com.tvisha.clapmessenger:id/searchETID"));
		driver.findElement(searchTextView).sendKeys(searchText);
		driver.hideKeyboard();
	}

	public static void searchField_invalid() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//WebElement search = driver.findElement(By.id("com.tvisha.clapmessenger:id/searchETID"));
		driver.findElement(searchTextView).sendKeys(searchText_invalid);
		driver.hideKeyboard();
	}

	public static void backButton() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("com.tvisha.clapmessenger:id/backImageID")).click();
		threadSleep(2);
	}

	public static void backButton_profile() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='android.widget.ImageView' and @bounds='[9,69][77,137]']")).click();
	}

	public static void backButton_chatscreen() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("com.tvisha.clapmessenger:id/ivBackArrow")).click();
	}

	public static void deselectButton() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("com.tvisha.clapmessenger:id/ivClose")).click();
	}

	public static void scrollToBottom(Double start, Double end) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		int x = driver.manage().window().getSize().width / 2;
		int end_y = (int)(driver.manage().window().getSize().height * end); //0.2
		int start_y = (int)(driver.manage().window().getSize().height * start); //0.8
		@SuppressWarnings("rawtypes")
		TouchAction action = new TouchAction(driver);
		action.press(PointOption.point(x, start_y));
		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)));
		action.moveTo(PointOption.point(x, end_y));
		action.release();
		action.perform();
	}

	public static void scrollToUpp(Double start, Double end) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		int x = driver.manage().window().getSize().width / 2;
		int start_y = (int)(driver.manage().window().getSize().height * start); //0.3
		int end_y = (int)(driver.manage().window().getSize().height * end); //0.9
		@SuppressWarnings("rawtypes")
		TouchAction action = new TouchAction(driver);
		action.press(PointOption.point(x, start_y));
		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)));
		action.moveTo(PointOption.point(x, end_y));
		action.release();
		action.perform();
	}

	/* public static void scrollToBottomdetails1() {
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     int x = driver.manage().window().getSize().width / 2;
	     int end_y = (int)(driver.manage().window().getSize().height * 0.6);
	     int start_y = (int)(driver.manage().window().getSize().height * 0.8);
	     @SuppressWarnings("rawtypes")
	     TouchAction action = new TouchAction(driver);
	     action.press(PointOption.point(x, start_y));
	     action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)));
	     action.moveTo(PointOption.point(x, end_y));
	     action.release();
	     action.perform();
	 } 

	 public static void scrollToUppdetails1() {
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     int x = driver.manage().window().getSize().width / 2;
	     int start_y = (int)(driver.manage().window().getSize().height * 0.6);
	     int end_y = (int)(driver.manage().window().getSize().height * 0.8);
	     @SuppressWarnings("rawtypes")
	     TouchAction action = new TouchAction(driver);
	     action.press(PointOption.point(x, start_y));
	     action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)));
	     action.moveTo(PointOption.point(x, end_y));
	     action.release();
	     action.perform();
	 }

	 public static void scrollToBottomAddmember1() {
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     int x = driver.manage().window().getSize().width / 2;
	     int end_y = (int)(driver.manage().window().getSize().height * 0.4);
	     int start_y = (int)(driver.manage().window().getSize().height * 0.8);
	     @SuppressWarnings("rawtypes")
	     TouchAction action = new TouchAction(driver);
	     action.press(PointOption.point(x, start_y));
	     action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)));
	     action.moveTo(PointOption.point(x, end_y));
	     action.release();
	     action.perform();
	 } */

	public static void scrollTohorizontal() {
		int start_y = (int)(driver.manage().window().getSize().width * 0.8);
		MobileElement obj = driver.findElement(By.id("com.tvisha.clapmessenger:id/tvNoUserPicName"));
		start_y = start_y * -1;
		@SuppressWarnings("rawtypes")
		TouchAction action = new TouchAction(driver);
		action.longPress(ElementOption.element(obj));
		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)));
		action.moveTo(ElementOption.element(obj, start_y, 0));
		action.release();
		action.perform();
	}

	public static void checkAddedDpdetails() {
		if (driver.findElementsById("com.tvisha.clapmessenger:id/selectedImageID").size() > 0)
			System.out.println("Dp added successfully for group through " + dpCheck + ",Passed");
		else
			System.out.println("Dp not added successfully for group through " + dpCheck + ",Failed");
	}

	public static void checkAddedDP_creat() {
		if (driver.findElementsById("com.tvisha.clapmessenger:id/noImageID").size() > 0)
			System.out.println("Dp not added successfully for group through " + dpCheck + ",Failed");
		else
			System.out.println("Dp added successfully for group through " + dpCheck + ",Passed");
	}

	public static void capabilities() {
		driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @text='Clap']")).click();
	}

	public static void Participants_Button() {
		driver.findElement(participentsOption_groupInfo).click();
		threadSleep(2);
	}
}