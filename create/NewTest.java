package create;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.remote.MobileCapabilityType;
import utility.utility;

import org.testng.annotations.BeforeSuite;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;

public class NewTest {

	static String bottomSelect, bottomDetails, selected1Name, selectedName, firstName, searchText = "man", searchTest = "test", searchText_invalid = "Test1234", lastMember,
		groupNamedetails, groupInfodetails, groupNamecreat, groupInfocreat, dpCheck, infoName, membersCountgroupChat, lastSelected, groupName = "Test123",
		groupInfo = "Automation", groupNameonly = "Test add name", numberProfile, nameProfile, nameEdit = "Test_edit_info", roleCheck,
		selectedbefore, selfName, nameaddsearchselect, groupnameParticipents, nameParticipent, infoSize;
	static int Count, Countlist, CountDeselect, CountlistDeselect, size, i, countChe = 0, Countselect, Countdetails, Countcreat, countselectedList = 0, j, k = 0, a = 0, b = 0,
		c = 0, d = 0, eq = 0, searchCount, chName, chList, conName = 0, checkname = 0, coun = 0, chNameaddinfo, countaddselectedlist, Countaddlist, infoMembersize, chParticipants = 0;
	static boolean count_1 = false, count_2 = false, count_3 = false, countNo = false, countClose = false, countDP = false, check = false;

	static String[] selectedDetails = new String[30]; //details screen list
	static String[] selectedListmembers = new String[30]; //List screen above list
	static String[] selectedList = new String[30]; //list screen below list
	static String[] selectedCreat = new String[30]; //create screen list
	static String[] listofMembers = new String[30]; // list screen members numbers
	static String[] listofMembersafter = new String[60];
	static String[] listofMembersclear = new String[30]; // to get the shown searched list
	static String[] listofNames = new String[60]; // list screen members names
	static String[] searchListmembers = new String[30]; // to get specified searched list from all members list in screen 
	static String[] contactsList = new String[100]; //contacts screen list
	static String[] doopList = new String[100]; //contacts screen list
	static String[] doopList_continue = new String[100]; //contacts screen list
	static String[] getList = new String[20]; //contacts screen list
	static String[] listofMembers_afterSearch = new String[20];
	static String[] listofNamesaddinfo = new String[60]; // add members info screen members names
	static String[] selectedlistaddinfo = new String[30]; // selected members list add members info screen
	static String[] selectedListAddmember = new String[30]; //Add Member screen above list 
	static String[] listParticipants = new String[30];
	static String[] adminoptions = new String[30]; //Admin options list in

	@AndroidFindBy(id = "com.tvisha.clapmessenger:id/displayNameTVID")
	static List < AndroidElement > NameMultipleTextView;
	static By groupHeader = By.id("com.tvisha.clapmessenger:id/llChatHeader");
	static By searchTextView = By.id("com.tvisha.clapmessenger:id/searchETID");
	static By searchImageTextView = By.id("com.tvisha.clapmessenger:id/searchImageID");
	static By NameTextView = By.id("com.tvisha.clapmessenger:id/displayNameTVID");
	//static By Name = By.id("com.tvisha.clapmessenger:id/displayNameTVID");
	static By addMember_button = By.id("com.tvisha.clapmessenger:id/addMember");
	static By Name1 = By.id("com.tvisha.clapmessenger:id/tvChatName");
	@AndroidFindBy(id = "com.tvisha.clapmessenger:id/displaySubNameTVID")
	static List < AndroidElement > subNameMultipleTextView;
	//static By subName = By.id("com.tvisha.clapmessenger:id/displaySubNameTVID");
	static By subName1 = By.id("com.tvisha.clapmessenger:id/msgNotifyTVID");
	static By sel = By.xpath("//android.widget.CheckBox[@checked='true']/preceding-sibling::android.widget.LinearLayout/descendant::android.widget.TextView[1]");
	static By selectedMemberTextView = By.xpath("//android.widget.CheckBox[@checked='true']/preceding-sibling::android.widget.LinearLayout/descendant::android.widget.TextView[1]");
	@AndroidFindBy(xpath = "//android.widget.CheckBox[@checked='true']/preceding-sibling::android.widget.LinearLayout/descendant::android.widget.TextView[1]")
	static List < AndroidElement > selectedMemberMultipleTextView;
	//static By selectedMember = By.xpath("//android.widget.CheckBox[@checked='true']/preceding-sibling::android.widget.LinearLayout/descendant::android.widget.TextView[1]");
	static By selectedMembersCount = By.xpath("//android.widget.CheckBox[@checked='true']");
	static By disselectLast_selectedList = By.xpath("(//*[contains(@resource-id,'com.tvisha.clapmessenger:id/ivClose')])[last()]");
	@AndroidFindBy(xpath = "//android.widget.TextView[@index='1']")
	static List < AndroidElement > selectedMembers_selectedListMultipleTextView;
	@AndroidFindBy(xpath = "//android.widget.TextView[@index='1']")
	static AndroidElement selectedMembers_selectedLisTextView;
	//static By selectedMembers_selectedList = By.xpath("//android.widget.TextView[@index='1']");
	static By groupName_field = By.id("com.tvisha.clapmessenger:id/etGroupName");
	static By groupInfo_field = By.id("com.tvisha.clapmessenger:id/etGroupInfo");
	static By cameraButton_details = By.id("com.tvisha.clapmessenger:id/imagePreview");
	static By cameraButton_creat = By.id("com.tvisha.clapmessenger:id/confirmSearchImageID");
	static By optionsButton = By.id("com.tvisha.clapmessenger:id/moreIMVID");
	static By participentsOption_groupInfo = By.xpath("//*[@class='android.widget.TextView' and @text='Participants']");
	static By next_Icon = By.id("com.tvisha.clapmessenger:id/ivMoveToCreateGroup");
	static By subNameTextView = By.id("com.tvisha.clapmessenger:id/displaySubNameTVID");
	@AndroidFindBy(id = "com.tvisha.clapmessenger:id/record_button")
	static AndroidElement voice_icon;
	@AndroidFindBy(id = "com.tvisha.clapmessenger:id/image_view_click")
	static AndroidElement holdOn;
	static By checkBox = By.xpath("//android.widget.CheckBox");
	static By cameraButton_groupInfo = By.id("com.tvisha.clapmessenger:id/camera");
	static By Name_nonRole = By.xpath("//android.widget.TextView[@resource-id='com.tvisha.clapmessenger:id/displayNameTVID' and not(following-sibling::android.widget.TextView)]"); //[@resource-id='com.tvisha.clapmessenger:id/groupUserRoleTVID']
	@AndroidFindBy(id = "com.tvisha.clapmessenger:id/membersSearchETID")
	static MobileElement searchMemberTextView;
	static By makeasAdmin = By.xpath("//*[@class='android.widget.TextView' and @text='Make as Group admin']");
	static By makeasModerator = By.xpath("//*[@class='android.widget.TextView' and @text='Make as Moderator']");
	static By removeFromgroup = By.xpath("//*[@class='android.widget.TextView' and @text='Remove from group']");
	static By optionsPopup_No = By.id("com.tvisha.clapmessenger:id/noBtn");
	static By optionsPopup_Close = By.id("com.tvisha.clapmessenger:id/closeIMVID");
	static By optionsPopup_Yes = By.id("com.tvisha.clapmessenger:id/yesBtn");
	static By NameModerator = By.xpath("//android.widget.TextView[@text='Moderator']/preceding-sibling::android.widget.TextView");
	static By optionsButton_Moderator = By.xpath("//android.widget.TextView[@text='Moderator']/ancestor::android.widget.LinearLayout[2]/following-sibling::android.widget.ImageView");
	static By NameAdmin = By.xpath("//android.widget.TextView[@text='Admin' and not(@text='You ')]/preceding-sibling::android.widget.TextView");
	static By optionsButton_Admin = By.xpath("//android.widget.TextView[@text='Admin' and not(@text='You ')]/ancestor::android.widget.LinearLayout[2]/following-sibling::android.widget.ImageView");

	public static AndroidDriver < MobileElement > driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	static clap_methods cm = new clap_methods();
	static Send_Message sm = new Send_Message();
	static Filter fi = new Filter();
	static My_profile mp = new My_profile();
	static Settings se = new Settings();
	static Status st = new Status();
	static Participants pa = new Participants();
	static Group_Info gi = new Group_Info();
	static AddMember am = new AddMember();
	static EditImage ed = new EditImage();
	static Member_Info mi = new Member_Info();

	@Test
	public void TC_001() {
		try {
			cm.openCreatgroup();
			ExtentTest test = extent.createTest("To open creat group screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_001 Test case is Failed");
		}
	}

	@Test
	public void TC_002() {
		try {
			cm.openCreatgroup();
			cm.backButton_Select();
			ExtentTest test = extent.createTest("To verify back button before selecting members");
			Assert.assertTrue(cm.count_1 == true, "Back button was not working");
			test.pass("Back button is working fine in select members screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_002 Test case is Failed");
		}
	}

	@Test
	public void TC_003() {
		try {
			cm.openCreatgroup();
			cm.selectMembers();
			cm.backButton_Select();
			ExtentTest test = extent.createTest("To verify back button after selecting members");
			Assert.assertTrue(cm.count_1 == true, "Back button was not working");
			test.pass("Back button is working fine in select members screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_003 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_004() {
		try {
			cm.openCreatgroup();
			cm.validationSelect();
			ExtentTest test = extent.createTest("To check 'Next' button and selected members window before selecting member in screen");
			Assert.assertTrue(cm.count_1 == true, "Next button was showing");
			test.pass("Next button not showing without selecting a member");
			Assert.assertTrue(cm.count_2 == true, "Selected members list window was showing");
			test.pass("Selected members list window was not showing without selecting a member");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_004 Test case is Failed");
		}
	}

	@Test
	public void TC_005() {
		try {
			cm.openCreatgroup();
			cm.validationSelect_afterselecting();
			ExtentTest test = extent.createTest("To check 'Next' button and selected members window after selecting member in screen");
			Assert.assertTrue(cm.count_1 == true, "Next button was not showing");
			test.pass("Next button was showing after selecting a member");
			Assert.assertTrue(cm.count_2 == true, "Selected members list window was not showing");
			test.pass("Selected members list window was showing after selecting a member");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_005 Test case is Failed");
		}
	}

	@Test
	public void TC_006() {
		try {
			cm.openCreatgroup();
			cm.validationSelect_afterdisselecting();
			ExtentTest test = extent.createTest("To check 'Next' button and selected members window after disselecting all selected members in screen");
			Assert.assertTrue(cm.count_1 == true, "Next button was showing");
			test.pass("Next button was not showing after dis-selecting a member");
			Assert.assertTrue(cm.count_2 == true, "Selected members list window was showing");
			test.pass("Selected members list window was not showing after dis-selecting a member");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_006 Test case is Failed");
		}
	}

	@Test
	public void TC_007() { //not
		try {
			cm.openCreatgroup();
			//cm.gettingNames();
			//cm.gettingNameslist();
			cm.check_Duplicates();
			ExtentTest test = extent.createTest("To check any duplicated members are showing in the list");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_007 Test case is Failed");
		}
	}

	@Test
	public void TC_008() {
		try {
			cm.openCreatgroup();
			//cm.gettingNames();
			//cm.gettingNameslist();
			cm.select_memberclick();
			ExtentTest test = extent.createTest("To check by clicking on the member");
			Assert.assertTrue(cm.count_1 == true, "Clicked member not selected");
			test.pass("Clicked member is showing as selected");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_008 Test case is Failed");
		}
	}

	@Test
	public void TC_009() {
		try {
			cm.openCreatgroup();
			//cm.gettingNames();
			//cm.gettingNameslist();
			cm.disselect_memberclick();
			ExtentTest test = extent.createTest("To check by double clicking on the member");
			Assert.assertTrue(cm.count_1 == true, "Selected member was not disselecting");
			test.pass("Selected member was showing as disselected");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_009 Test case is Failed");
		}
	}

	@Test
	public void TC_010() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			//cm.gettingNames();
			//cm.gettingNameslist();
			cm.disselect_selectedmembers();
			ExtentTest test = extent.createTest("To check by clicking on 'x' button in selected members list");
			Assert.assertTrue(cm.count_1 == true, "Selected member was not disselecting by clicking on 'x'");
			test.pass("Member gets disselected by clicking on close button in selected member list window");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_010 Test case is Failed");
		}
	}

	@Test
	public void TC_011() {
		try {
			cm.openCreatgroup();
			//cm.gettingNames();
			//cm.gettingNameslist();
			cm.select_disselectedMember();
			ExtentTest test = extent.createTest("To check by selecting a disselected member");
			Assert.assertTrue(cm.count_1 == true, "Unable to select previous disselected member");
			test.pass("Disselected member gets selected by clicking on member");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_011 Test case is Failed");
		}
	}

	@Test
	public void TC_012() {
		try {
			cm.openCreatgroup();
			cm.searchButton();
			cm.search_close();
			ExtentTest test = extent.createTest("To check close button in search field before entering search data");
			Assert.assertTrue(cm.count_1 == true, "Search field is active after clicking on close(X)");
			test.pass("Search field is not active after clicking on close(X)");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_012 Test case is Failed");
		}
	}

	@Test
	public void TC_013() {
		try {
			cm.openCreatgroup();
			cm.searchButton();
			cm.searchField();
			cm.search_close();
			ExtentTest test = extent.createTest("To check close button in search field after entering search data");
			Assert.assertTrue(cm.count_1 == true, "Search field is active after clicking on close(X)");
			test.pass("Search field is not active after clicking on close(X) after entering search data");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_013 Test case is Failed");
		}
	}

	@Test
	public void TC_014() {
		try {
			cm.openCreatgroup();
			cm.searchButton();
			cm.backButton();
			am.search_back();
			ExtentTest test = extent.createTest("To check back button after clicking on search button");
			Assert.assertTrue(cm.count_1 == true, "Create group screen was active after clicking on Back button");
			test.pass("Create group screen was not active after clicking on Back button");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_014 Test case is Failed");
		}
	}

	@Test
	public void TC_015() {
		try {
			cm.openCreatgroup();
			cm.searchButton();
			cm.searchField_invalid();
			cm.search_Invalid();
			ExtentTest test = extent.createTest("To check search field functionality by entering invalid search data");
			Assert.assertTrue(cm.count_1 == true, "Empty list was not showing");
			test.pass("Empty list was showing after entering invalid search data");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_015 Test case is Failed");
		}
	}

	@Test
	public void TC_016() {
		try {
			cm.openCreatgroup();
			cm.searchButton();
			cm.searchField();
			cm.searchedList();
			cm.searchListcheck();
			ExtentTest test = extent.createTest("To check search field functionality before selecting members");
			Assert.assertTrue(cm.count_1 == false, "list was not containing searched text");
			test.pass("After searching list was containing the searched text in name");
			Assert.assertTrue(cm.count_2 == false, "Wrong search data was showing");
			test.pass("searched list was showing correct from search screen to list");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_016 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_017() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.searchButton();
			cm.searchField();
			cm.selectingMember_afterSearch();
			ExtentTest test = extent.createTest("Select members after searching");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_017 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_018() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.searchButton();
			cm.searchField();
			cm.selectingMember_afterSearch();
			cm.checkselectedMembers_AfterSearchClear();
			ExtentTest test = extent.createTest("To check selected members after search field clears");
			Assert.assertTrue(cm.chName == cm.Count, "Selected member not showing as selected after search clears");
			test.pass("In search screen selected member is showing as selected in list screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_018 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_019() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.searchButton();
			cm.searchField();
			cm.selectingMember_afterSearch();
			//cm.checkselectedMembers_AfterSearchClear();
			cm.checkselectedmembers_Aftersearch();
			ExtentTest test = extent.createTest("To check selected members after search");
			Assert.assertTrue(cm.count_1 == false, "wrong selected list was showing after searching");
			test.pass("selected list was showing correct from list screen to search");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_019 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_020() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.searchButton();
			cm.searchField();
			cm.selectingMember_afterSearch();
			//cm.checkselectedMembers_AfterSearchClear();
			cm.checkselectedmembers_Aftersearch();
			cm.searchlist_Deselection();
			ExtentTest test = extent.createTest("To check deselecting members after search");
			Assert.assertTrue(cm.count_2 == false, "Members are not showing as disselected after clearing search");
			test.pass("Deselected members are showing as disselected after clearing search");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_020 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_021() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.creatGroup_previousSelected_Search();
			ExtentTest test = extent.createTest("To verify already selected member showing as selected, if after searching a new member");
			Assert.assertTrue(cm.count_1 == true, "Previous selected member gets disselected by searching new member");
			test.pass("Previous selected member was showing as selected after searching a new member");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_021 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_022() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.creatGroup_previousSelected_Searchselected();
			ExtentTest test = extent.createTest("To verify already selected member showing as selected, if selecting a member by searching another member");
			Assert.assertTrue(cm.count_1 == true, "Previous selected member was not showing as selected after selecting a new member by searching that member");
			test.pass("Previous selected member was showing as selected after selecting a new member by searching that member");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_022 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_023() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.creatGroup_previousSelected_Searchdeselect();
			ExtentTest test = extent.createTest("To verify already selected member showing as selected, if disselecting a member by searching another member");
			Assert.assertTrue(cm.count_1 == true, "Previous selected member was not showing as selected after deselecting a new member by searching that member");
			test.pass("Previous selected member was showing as selected after deselecting a new member by searching that member");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_023 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_024() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.creatGroup_previousSelected_selectedlistdeselect();
			ExtentTest test = extent.createTest("To verify already selected member showing as selected, if disselecting a member by clicking on 'X' button on that member in selected list");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_024 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_025() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.creatGroup_previousSelected_SearchDisselect_selectedList();
			ExtentTest test = extent.createTest("To verify already selected member showing as selected, if disselecting a member from selected list after searching");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_025 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_026() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.chackingFirstselectedname();
			ExtentTest test = extent.createTest("To check first selected name is same in selected and below members list");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_026 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_027() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			cm.chackingFirstselectedname_disselect();
			ExtentTest test = extent.createTest("To check First selected name is same in selected and below members list by disselecting first member");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_027 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_028() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			cm.selectedList();
			ExtentTest test = extent.createTest("To check selected members in below list and selected members list");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_028 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_029() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			cm.deselectMembers();
			ExtentTest test = extent.createTest("To check selected members in below list and selected members list after disselecting some members");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_029 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_030() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			cm.selectedMemberslist();
			ExtentTest test = extent.createTest("To select members while scrolling the list");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_030 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_031() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			cm.selectedMemberslist();
			cm.selectedMembersorder();
			ExtentTest test = extent.createTest("To check select members in above selected list");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_031 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_032() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			//cm.selectedMemberslist();
			//cm.selectedMembersorder();
			cm.validationDetails();
			ExtentTest test = extent.createTest("To check group details screen opened or not");
			Assert.assertTrue(cm.count_1 == true, "Group details screen not opened");
			test.pass("Group details screen opened");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_032 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_033() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			//cm.selectedMemberslist();
			//cm.selectedMembersorder();
			cm.nextButton();
			cm.threadSleep(4);
			cm.nextButton();
			cm.validationDetailsnext();
			ExtentTest test = extent.createTest("To check 'Next' button before filling fields data in group details screen");
			Assert.assertTrue(cm.count_1 == true, "Group creat screen opens with out filling mandatory fields");
			test.pass("Group creat screen was not opening with out filling mandatory fields");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_033 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_034() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			//cm.selectedMemberslist();
			//cm.selectedMembersorder();
			cm.nextButton();
			cm.validationfill_Nameonly();
			ExtentTest test = extent.createTest("To check 'Next' button by only filling name field data in group details screen");
			Assert.assertTrue(cm.count_1 == false, "Group creat screen not opened by only filling mandatory fields");
			test.pass("Group creat screen opens by only filling mandatory fields");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_034 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_035() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			//cm.selectedMemberslist();
			//cm.selectedMembersorder();
			cm.nextButton();
			cm.validationfill_Infoonly();
			ExtentTest test = extent.createTest("To check 'Next' button before selecting member in group details screen");
			Assert.assertTrue(cm.count_1 == true, "Group creat screen opened without filling name field");
			test.pass("Group creat screen not opened without filling name field");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_035 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_036() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			//cm.selectedMemberslist();
			cm.nextButton();
			cm.groupdetails_DP_optionspopup();
			ExtentTest test = extent.createTest("To check 'X' button in add DP options popup on group details screen");
			Assert.assertTrue(cm.countDP == true, "Add DP options are not showing properly");
			test.pass("Add DP options are showing properly");
			Assert.assertTrue(cm.count_1 == true, "Add DP options popup was not closing by clicking on 'x' button in group details screen");
			test.pass("Add DP options popup closed by clicking on 'x' button in group details screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_036 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_037() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			//cm.selectedMemberslist();
			cm.nextButton();
			cm.groupDpdetails();
			ExtentTest test = extent.createTest("To check the add DP option in group details screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_037 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_038() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			cm.nextButton();
			cm.groupDetails_namefield();
			ExtentTest test = extent.createTest("To check the name field limit");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_038 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_039() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			cm.nextButton();
			cm.back_details();
			ExtentTest test = extent.createTest("To check back button before entering group name and info fields data");
			Assert.assertTrue(cm.count_1 == true, "Back button not working in group details screen");
			test.pass("Back button working fine in group details screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_039 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_040() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			cm.nextButton();
			cm.groupDetails();
			cm.back_details();
			ExtentTest test = extent.createTest("To check back button after entering group name and info fields data");
			Assert.assertTrue(cm.count_1 == true, "Back button not working in group details screen");
			test.pass("Back button working fine in group details screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_040 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_041() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			cm.selectedList_back();
			cm.nextButton();
			cm.back_details_selectedlist();
			ExtentTest test = extent.createTest("To check selected members list after comming back from details screen");
			Assert.assertTrue(cm.count_1 == false && cm.coun == cm.i, "All previous selected members are not showing as selected in select members screen after clicking back button in group deetails screen");
			test.pass("All previous selected members are showing as selected in select members screen after clicking back button in group deetails screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_041 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_042() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			//cm.selectedMemberslist();
			cm.nextButton();
			cm.groupDetails();
			cm.nextButton();
			cm.validationcreat();
			ExtentTest test = extent.createTest("To check group creat screen opened or not");
			Assert.assertTrue(cm.count_1 == true, "Group creat screen was not opened");
			test.pass("Group creat screen opened");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_042 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_043() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			//cm.selectedMemberslist();
			//cm.selectedMembersorder();
			cm.nextButton();
			cm.groupDetails();
			cm.nextButton();
			cm.groupcreat_DP_optionspopup();
			//cm.groupDpcreat();
			ExtentTest test = extent.createTest("To check 'X' button in add DP options popup on group creat screen");
			Assert.assertTrue(cm.countDP == true, "Add DP options are not showing properly");
			test.pass("Add DP options are showing properly");
			Assert.assertTrue(cm.count_1 == true, "Add DP options popup was not closing by clicking on 'x' button in group creat screen");
			test.pass("Add DP options popup closed by clicking on 'x' button in group creat screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_043 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_044() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			//cm.selectedMemberslist();
			//cm.selectedMembersorder();
			cm.nextButton();
			cm.groupDetails();
			cm.nextButton();
			cm.groupDpcreat();
			ExtentTest test = extent.createTest("To check the add DP option in group creat screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_044 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_045() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			//cm.selectedMemberslist();
			cm.nextButton();
			cm.groupDetails();
			//cm.listDetails();
			cm.nextButton();
			cm.creatGroup();
			ExtentTest test = extent.createTest("To open group creat screen and check the group name and info fields data");
			Assert.assertTrue(cm.count_1 == true, "Given group name and info is not same in both group details and creat screen");
			test.pass("Given group name and info is same in both group details and creat screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_045 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_046() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			cm.selectedMemberslist();
			cm.selectedMembersorder();
			cm.groupDetails();
			cm.listDetails();
			cm.nextButton();
			cm.listCreat();
			cm.checkSelectedlist();
			ExtentTest test = extent.createTest("To check the selected members list in all 3(select members, group details and group creat) screens");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_046 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_047() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			cm.selectedMemberslist();
			cm.nextButton();
			cm.groupDetails();
			cm.checkbottomName();
			ExtentTest test = extent.createTest("To check below showing text in select members and group details screens");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_047 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_048() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			//cm.selectedMemberslist();
			cm.nextButton();
			cm.groupDetails();
			//cm.listDetails();
			cm.nextButton();
			cm.editButton_creat();
			//cm.editOptioncreat();
			ExtentTest test = extent.createTest("To check the Edit button");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_048 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_049() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			//cm.selectedMemberslist();
			cm.nextButton();
			cm.groupDetails();
			//cm.listDetails();
			cm.nextButton();
			cm.editButton_creat();
			cm.backButton_editCreat();
			ExtentTest test = extent.createTest("To check back button in Edit details screen from group creat before editing group data");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_049 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_050() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			//cm.selectedMemberslist();
			cm.nextButton();
			cm.groupDetails();
			//cm.listDetails();
			cm.nextButton();
			cm.editButton_creat();
			cm.editDetails_back();
			cm.backButton_editCreat();
			ExtentTest test = extent.createTest("To check back button in Edit details screen from group creat after editing group data");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_050 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_051() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			//cm.selectedMemberslist();
			cm.nextButton();
			cm.groupDetails();
			//cm.listDetails();
			cm.nextButton();
			cm.editButton_creat();
			cm.editOptioncreat();
			ExtentTest test = extent.createTest("To check the Edit button and after clicking showning data in the name and info fields");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_051 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_052() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			//cm.selectedMemberslist();
			cm.nextButton();
			cm.groupDetails();
			//cm.listDetails();
			cm.nextButton();
			cm.editButton_creat();
			cm.groupdetails_DP_optionspopup();
			ExtentTest test = extent.createTest("To check 'X' button in add DP options popup");
			Assert.assertTrue(cm.countDP == true, "Add DP options are not showing properly");
			test.pass("Add DP options are showing properly");
			Assert.assertTrue(cm.count_1 == true, "Add DP options popup was not closing by clicking on 'x' button in group details screen");
			test.pass("Add DP options popup closed by clicking on 'x' button in group details screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_052 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_053() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			//cm.selectedMemberslist();
			cm.nextButton();
			cm.groupDetails();
			//cm.listDetails();
			cm.nextButton();
			cm.editButton_creat();
			cm.groupDpdetails();
			ExtentTest test = extent.createTest("To check the add DP option in edit group details screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_053 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_054() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			cm.selectedMemberslist();
			cm.nextButton();
			cm.groupDetails();
			//cm.listDetails();
			cm.nextButton();
			cm.creatGroup();
			cm.listCreat();
			cm.editButton_creat();
			gi.editParticipents();
			ExtentTest test = extent.createTest("To check the participents list in edit group details scrren");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_054 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_055() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			//cm.selectedMemberslist();
			cm.nextButton();
			cm.groupDetails();
			//cm.listDetails();
			cm.nextButton();
			cm.editButton_creat();
			//cm.editOptioncreat();
			cm.editDetails();
			ExtentTest test = extent.createTest("To check the group creat screen data after editing the group name, info and DP details");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_055 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	/* @Test
	 public void TC_035() {
	     try {
	         cm.capabilities();
	         cm.threedotsButton();
	         cm.openCreatgroup();
	         cm.selectMembers();
	         //cm.selectedMemberslist();
	         cm.nextButton();
	         cm.groupDetails();
	         //cm.listDetails();
	         cm.nextButton();
	         cm.addOptioncreat();
	         //cm.addChecklist();
	         ExtentTest test = extent.createTest("To check the Add members button");
	     } catch (Exception e) {
	         System.out.println(e);
	         System.out.println("TC_035 Test case is Failed");
	     }
	     cm.terminateApp();
	 }

	 @Test
	 public void TC_036() {
	     try {
	         cm.capabilities();
	         cm.threedotsButton();
	         cm.openCreatgroup();
	         cm.selectMembers();
	         cm.selectedMemberslist();
	         cm.selectedMembersorder();
	         cm.groupDetails();
	         //cm.listDetails();
	         cm.nextButton();
	         cm.addOptioncreat();
	         cm.addChecklist();
	         ExtentTest test = extent.createTest("To check selected members list in add members screen");
	     } catch (Exception e) {
	         System.out.println(e);
	         System.out.println("TC_036 Test case is Failed");
	     }
	     cm.terminateApp();
	 } */

	@Test
	public void TC_056() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			cm.nextButton();
			cm.groupDetails();
			cm.nextButton();
			cm.threadSleep(4);
			cm.back_creat();
			ExtentTest test = extent.createTest("To check back button in creat group screen");
			Assert.assertTrue(cm.count_1 == true, "Back button was not working in group creat screen");
			test.pass("Back button working fine in group creat screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_056 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_057() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			cm.selectedMemberslist();
			cm.selectedMembersorder();
			cm.groupDetails();
			cm.nextButton();
			cm.threadSleep(4);
			cm.nextButton();
			//cm.open_created_Group();
			cm.CheckGroupcreat();
			ExtentTest test = extent.createTest("To check created group was showing in home screen");
			Assert.assertTrue(cm.count_1 == true, "Group was not created with given name");
			test.pass("Group is created with given name");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_057 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_058() {
		try {
			//cm.capabilities();
			/* cm.threedotsButton(); cm.openCreatgroup(); cm.selectMembers();
			 * cm.selectedMemberslist(); cm.selectedMembersorder(); cm.groupDetails();
			 * cm.listDetails(); cm.addOptioncreat(); cm.addChecklist(); */
			cm.open_created_Group();
			gi.created_Groupdetails();
			gi.created_GroupnameInfo();
			ExtentTest test = extent.createTest("To check created group details in info and chat screen");
			Assert.assertTrue(cm.count_1 == true, "Group name was not same in group info screen");
			test.pass("Group name was same in group info screen");
			Assert.assertTrue(cm.count_2 == true, "Group members count was not same in group info screen");
			test.pass("Group members count was same in group info screen");
			Assert.assertTrue(cm.count_3 == true, "Wrong given group info was showing in group info screen");
			test.pass("Given group info was showing in group info screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_058 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_059() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			gi.back_info();
			ExtentTest test = extent.createTest("To check back button in group info screen");
			Assert.assertTrue(cm.count_1 == true, "Back button was not working in group info screen");
			test.pass("Back button working fine in group info screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_059 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_060() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			gi.groupDp_groupInfo();
			ExtentTest test = extent.createTest("To check add DP button in info screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_060 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_061() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			pa.participents_Groupinfo();
			ExtentTest test = extent.createTest("To check members count to participents list count");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_061 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_062() {
		try {
			// cm.capabilities();  cm.getProfilenumber();  cm.getContactsnumber();
			cm.open_created_Group();
			gi.created_Groupdetails();
			gi.ownerDetails();
			ExtentTest test = extent.createTest("To check created group owner details in group info");
			Assert.assertTrue(cm.count_1 == true, "Wrong owner name was showing for the group in info for self created group");
			test.pass("Owner name showing for the group in info was correct for self created group");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_062 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_063() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			gi.editButton_groupInfo();
			ExtentTest test = extent.createTest("To check edit button in group info screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_063 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_064() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			gi.editInfo();
			ExtentTest test = extent.createTest("To check edit group details screen");
			Assert.assertTrue(cm.count_1 == true, "Group name and info was not same in both edit group details and chat screens");
			test.pass("Group name and info was same in both edit group details and chat screens");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_064 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_065() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			gi.editButton_groupInfo();
			gi.backButton_editInfo();
			ExtentTest test = extent.createTest("To check back button in edit group details screen before editing group details");
			Assert.assertTrue(cm.count_1 == true, "Back button was not working in edit group details screen");
			test.pass("Back button is working in edit group details screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_065 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_066() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			gi.editButton_groupInfo();
			gi.editInfochange();
			gi.backButton_editInfo();
			ExtentTest test = extent.createTest("To check back button in edit group details screen after editing group details");
			Assert.assertTrue(cm.count_1 == true, "Back button was not working in edit group details screen after editing group details");
			test.pass("Back button is working in edit group details screen after editing group details");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_066 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_067() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			gi.editInfo();
			gi.editParticipents();
			ExtentTest test = extent.createTest("To check participents list in edit group details screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_067 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_068() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			gi.editInfo();
			gi.editInfochange();
			gi.nextButton();
			gi.CheckGroupcreat_Edit();
			ExtentTest test = extent.createTest("To check for editing group details in edit group details screen");
			Assert.assertTrue(cm.count_1 == true, "Group details are not updating as per updated name and info");
			test.pass("Group details are updating as per updated name and info");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_068 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_069() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			am.addmembersButton_groupInfo();
			ExtentTest test = extent.createTest("To check addmember button");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_069 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_070() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			am.addmembersButton_groupInfo();
			cm.backButton_Addmember();
			ExtentTest test = extent.createTest("To check back button before selecting members");
			Assert.assertTrue(cm.count_1 == true, "Back button was not working in add members screen");
			test.pass("Back button is working fine in add members screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_070 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_071() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			am.addmembersButton_groupInfo();
			cm.selectAddmember();
			cm.backButton_Addmember();
			ExtentTest test = extent.createTest("To check back button after selecting members");
			Assert.assertTrue(cm.count_1 == true, "Back button was not working in add members screen after selecting member");
			test.pass("Back button is working fine in add members screen after selecting member");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_071 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_072() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.gettingNames();
			cm.backButton();
			cm.open_created_Group();
			gi.created_Groupdetails();
			am.addmember_Info();
			ExtentTest test = extent.createTest("To check addmember screen members list to the select members screen list in group creation");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_072 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_073() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			am.addmembersButton_groupInfo();
			am.gettingNames_addmember();
			am.scrollToUPP_addmember();
			//cm.addmember_select();
			am.addmember_selectedList();
			am.checkaddmemberlist_Info();
			ExtentTest test = extent.createTest("To check selected members in selected members list and below showing list");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_073 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_074() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			cm.selectedMemberslist();
			cm.backButton();
			cm.open_created_Group();
			gi.created_Groupdetails();
			am.addmembersButton_groupInfo();
			am.gettingNames_addmember();
			am.scrollToUPP_addmember();
			am.addmember_selectedList();
			am.checkaddmemberlist_selectedCreat();
			ExtentTest test = extent.createTest("To check selected members in selected members list and group creation screen selected list");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_074 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_075() {
		try {
			// cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			am.addmembersButton_groupInfo();
			//cm.gettingNamesaddmember();
			cm.searchButton();
			cm.search_close();
			//cm.addsearchSelect();
			ExtentTest test = extent.createTest("To check close button on search field before entering search data in addmember screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_075 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_076() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			am.addmembersButton_groupInfo();
			//cm.gettingNamesaddmember();
			cm.searchButton();
			cm.searchField();
			cm.search_close();
			//cm.addsearchSelect();
			ExtentTest test = extent.createTest("To check close button on search field after entering search data in addmember screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_076 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_077() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			am.addmembersButton_groupInfo();
			//cm.gettingNamesaddmember();
			cm.searchButton();
			am.backButton_Addmember_Info();
			am.search_back();
			//cm.addsearchSelect();
			ExtentTest test = extent.createTest("To check back button after clicking on search button in addmember screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_077 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_078() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			am.addmembersButton_groupInfo();
			am.gettingNames_addmember();
			am.searchAddmember();
			am.addsearchListcheck();
			//cm.addsearchSelect();
			ExtentTest test = extent.createTest("To verify search field in addmember screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_078 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_079() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			am.addmembersButton_groupInfo();
			//cm.gettingNamesaddmember();
			am.searchAddmember();
			//cm.addsearchListcheck();
			am.addsearch_Select();
			ExtentTest test = extent.createTest("To verify selecting a member after searching a member in add members screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_079 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_080() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			am.addmembersButton_groupInfo();
			//cm.gettingNamesaddmember();
			am.searchAddmember();
			//cm.addsearchListcheck();
			am.addsearch_Select();
			am.addsearch_Disselect();
			ExtentTest test = extent.createTest("To verify disselecting a member after searching a selected member in add members screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_080 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_081() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			am.addmembersButton_groupInfo();
			am.addmemberselectedlist_afterSelect();
			ExtentTest test = extent.createTest("To verify selected member is showing in selected members list in add members screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_081 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_082() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			am.addmembersButton_groupInfo();
			am.addmemberselectedlist_afterSelect();
			am.addmemberselectedlist_crossButton();
			ExtentTest test = extent.createTest("To verify disselecting a selected member from selected members list in add members list");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_082 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_083() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			am.addmembersButton_groupInfo();
			am.addmember_previousselected_Search();
			ExtentTest test = extent.createTest("To verify already selected member showing as selected after searching that member");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_083 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_084() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			am.addmembersButton_groupInfo();
			//cm.addmember_previousselectedSearch();
			am.addmember_previousselected_Searchselected();
			//cm.addmember_previousselected_Searchdisselected();
			ExtentTest test = extent.createTest("To verify already selected member showing as selected, if selecting a member by searching that member");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_084 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_085() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			am.addmembersButton_groupInfo();
			//cm.addmember_previousselectedSearch();
			am.addmember_previousselected_Searchselected();
			am.addmember_previousselected_Searchdisselected();
			ExtentTest test = extent.createTest("To verify already selected member showing as selected, if disselecting a member by searching that member");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_085 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_086() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			am.addmembersButton_groupInfo();
			am.addmember_previousselectedheader();
			ExtentTest test = extent.createTest("To verify already selected member after disselecting a member from selected members list in add members screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_086 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_087() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			am.addmembersButton_groupInfo();
			am.addmemberCheck();
			ExtentTest test = extent.createTest("To verify added members in group");
			Assert.assertTrue(cm.count_1 == true && cm.count_2 == true, "Selected members are not added into group");
			test.pass("Selected members are added into group");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_087 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_088() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			pa.participents_options();
			pa.participents_optionsvalidation();
			ExtentTest test = extent.createTest("To verify admin options by clicking on non admin member options button in participents screen");
			Assert.assertTrue(cm.count_1 == true, "All admin options are not showing for normal member");
			test.pass("All admin options are showing for normal member");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_088 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_089() { //need
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			pa.participents_optionsvalidation_Search();
			pa.participents_optionsvalidation();
			ExtentTest test = extent.createTest("To verify admin options by clicking on non admin member options button in participents screen after searching member");
			Assert.assertTrue(cm.count_1 == true, "All admin options are not showing for normal member after searching member");
			test.pass("All admin options are showing for normal member after searching member");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_089 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_090() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			//cm.participents_options();
			//cm.participentsList_Groupinfo();
			pa.participents_options();
			pa.participents_Message();
			ExtentTest test = extent.createTest("To verify message option for member in participents screen");
			Assert.assertTrue(cm.count_1 == true, "selected member chat screen was not opened");
			test.pass("selected member chat screen was opened");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_090 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_091() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			//cm.participents_options();
			//cm.participentsList_Groupinfo();
			pa.participents_optionsvalidation_Search();
			pa.participents_Message();
			ExtentTest test = extent.createTest("To verify message option for member in participents screen after searching member");
			Assert.assertTrue(cm.count_1 == true, "selected member chat screen was not opened after searching member");
			test.pass("selected member chat screen was opened after searching member");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_091 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_092() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			//cm.participents_options();
			//cm.participentsList_Groupinfo();
			pa.participents_options();
			pa.participents_Viewprofile();
			ExtentTest test = extent.createTest("To verify view profile option for member in participents screen");
			Assert.assertTrue(cm.count_1 == true, "selected member profile screen was not opened");
			test.pass("selected member profile screen was opened");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_092 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_093() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			//cm.participents_options();
			//cm.participentsList_Groupinfo();
			pa.participents_optionsvalidation_Search();
			pa.participents_Viewprofile();
			ExtentTest test = extent.createTest("To verify view profile option for member in participents screen after searching member");
			Assert.assertTrue(cm.count_1 == true, "selected member profile screen was not opened after searching member");
			test.pass("selected member profile screen was opened after searching member");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_093 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_094() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			//cm.participents_options();
			//cm.participentsList_Groupinfo();
			pa.participents_makeadminPopup();
			//cm.participents_makeAdmin();
			ExtentTest test = extent.createTest("To verify make as admin conformation popup details in participents screen");
			Assert.assertTrue(cm.count_1 == true, "In make as admin popup member name and group name was showing wrong");
			test.pass("In make as admin popup member name and group name was showing correctly");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_094 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_095() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			//cm.participents_options();
			//cm.participentsList_Groupinfo();
			pa.participents_makeadminClose();
			//cm.participents_makeAdmin();
			ExtentTest test = extent.createTest("To verify make as admin conformation popup Close and NO buttons in participents screen");
			Assert.assertTrue(cm.countNo == true, "NO button was not working");
			test.pass("NO button is working fine in make as admin popup");
			Assert.assertTrue(cm.countClose == true, "'X' button was not working");
			test.pass("'X' button is working fine in make as admin popup");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_095 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_096() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			//cm.participents_options();
			//cm.participentsList_Groupinfo();
			//cm.participents_makeadminPopup();
			pa.participents_options();
			pa.participents_makeAdmin();
			ExtentTest test = extent.createTest("To verify make as group admin option in participents screen");
			Assert.assertTrue(cm.count_1 == true, "Make as admin option was not working properly");
			test.pass("Make as admin option working properly");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_096 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_097() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			//cm.participents_options();
			//cm.participentsList_Groupinfo();
			//cm.participents_makeadminPopup();
			pa.participents_optionsvalidation_Search();
			pa.participents_makeAdmin();
			ExtentTest test = extent.createTest("To verify make as group admin option in participents screen after searching member");
			Assert.assertTrue(cm.count_1 == true, "Make as admin option was not working properly after searching member");
			test.pass("Make as admin option working properly after searching member");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_097 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_098() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			//cm.participents_makeAdmin();
			pa.participents_searchAdmin();
			ExtentTest test = extent.createTest("To verify searching admin member in participents screen");
			Assert.assertTrue(cm.count_1 == true, "Member is not showing as admin after searching admin member");
			test.pass("Member is showing as admin after searching admin member");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_098 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_099() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			//cm.participents_makeAdmin();
			pa.participents_searchAdmin_Options();
			ExtentTest test = extent.createTest("To verify admin options for other admin member in participents screen after searching member");
			Assert.assertTrue(cm.count_1 == true, "All admin actions are not showing for other admin member after searching member");
			test.pass("All admin actions are showing for other admin member after searching member");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_099 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_100() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			//cm.participents_makeAdmin();
			cm.Participants_Button();
			pa.participents_optionsAdmin();
			ExtentTest test = extent.createTest("To verify admin options for other admin member in participents screen");
			Assert.assertTrue(cm.count_1 == true, "All admin actions are not showing for other admin member");
			test.pass("All admin actions are showing for other admin member");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_100 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_101() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			//cm.participents_options();
			//cm.participentsList_Groupinfo();
			pa.participents_makemoderatorPopup();
			//cm.participents_makeModerator();
			ExtentTest test = extent.createTest("To verify make as moderator conformation popup details in participents screen");
			Assert.assertTrue(cm.count_1 == true, "In make as moderator popup member name and group name was showing wrong");
			test.pass("In make as moderator popup member name and group name was showing correctly");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_101 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_102() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			//cm.participents_options();
			//cm.participentsList_Groupinfo();
			pa.participents_makemoderator_Close();
			//cm.participents_makeModerator();
			ExtentTest test = extent.createTest("To verify make as moderator conformation popup Close and NO buttons in participents screen");
			Assert.assertTrue(cm.countNo == true, "NO button was not working");
			test.pass("NO button is working fine in make as moderator popup");
			Assert.assertTrue(cm.countClose == true, "'X' button was not working");
			test.pass("'X' button is working fine in make as moderator popup");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_102 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_103() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			//cm.participents_options();
			//cm.participentsList_Groupinfo();
			//cm.participents_makemoderatorPopup();
			pa.participents_options();
			pa.participents_makeModerator();
			ExtentTest test = extent.createTest("To verify make as moderator in participents screen");
			Assert.assertTrue(cm.count_1 == true, "Make as moderator option was not working");
			test.pass("Make as moderator option was working properly");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_103 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_104() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			//cm.participents_options();
			//cm.participentsList_Groupinfo();
			//cm.participents_makemoderatorPopup();
			pa.participents_optionsvalidation_Search();
			pa.participents_makeModerator();
			ExtentTest test = extent.createTest("To verify make as moderator in participents screen after searching member");
			Assert.assertTrue(cm.count_1 == true, "Make as moderator option was not working after searching member");
			test.pass("Make as moderator option was working properly after searching member");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_104 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_105() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			//cm.participents_makeModerator();
			pa.participents_searchModerator();
			ExtentTest test = extent.createTest("To verify searching moderator member in participents screen");
			Assert.assertTrue(cm.count_1 == true, "Member was not showing as moderator after searching moderator member");
			test.pass("Member is showing as moderator after searching moderator member");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_105 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_106() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			//cm.participents_makeAdmin();
			pa.participents_searchModerator_Options();
			ExtentTest test = extent.createTest("To verify moderator options for other admin member in participents screen after searching member");
			Assert.assertTrue(cm.count_1 == true, "Wrong admin optionds are showing for moderator member after searching");
			test.pass("Admin optionds are showing correctly for moderator member after searching");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_106 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_107() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			//cm.participents_makeModerator();
			cm.Participants_Button();
			pa.participents_optionsModerator();
			ExtentTest test = extent.createTest("To verify admin options for other moderator member in participents screen");
			Assert.assertTrue(cm.count_1 == true, "Wrong admin optionds are showing for moderator member");
			test.pass("Admin optionds are showing correctly for moderator member");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_107 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_108() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			//cm.participents_options();
			//cm.participentsList_Groupinfo();
			pa.participents_removefromgroupPopup();
			//cm.participents_removefromGroup();
			ExtentTest test = extent.createTest("To verify remove from group conformation popup details in participents screen");
			Assert.assertTrue(cm.count_1 == true, "In remove from group popup member name and group name was showing wrong");
			test.pass("In remove from group popup member name and group name was showing correctly");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_108 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_109() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			//cm.participents_options();
			//cm.participentsList_Groupinfo();
			pa.participents_removefromgroup_Close();
			//cm.participents_removefromGroup();
			ExtentTest test = extent.createTest("To verify remove from group conformation popup Close and NO buttons in participents screen");
			Assert.assertTrue(cm.countNo == true, "NO button was not working");
			test.pass("NO button is working fine in remove members popup");
			Assert.assertTrue(cm.countClose == true, "'X' button was not working");
			test.pass("'X' button is working fine in remove members popup");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_109 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_110() { //check
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			//cm.participents_options();
			//cm.participentsList_Groupinfo();
			//cm.participents_removefromgroupPopup();
			pa.participents_options();
			pa.participents_removefromGroup();
			pa.participents_checkRemovemember();
			ExtentTest test = extent.createTest("To verify remove from group in participents screen");
			Assert.assertTrue(cm.count_1 == false, "Removed member was showing in group participents list");
			test.pass("Removed member not showing in group participents list");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_110 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_111() { //check
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			//cm.participents_options();
			//cm.participentsList_Groupinfo();
			//cm.participents_removefromgroupPopup();
			pa.participents_optionsvalidation_Search();
			pa.participents_removefromGroup();
			pa.participents_checkRemovemember();
			ExtentTest test = extent.createTest("To verify remove from group in participents screen after searching member");
			Assert.assertTrue(cm.count_1 == false, "Removed member was showing in group participents list afetr searching member");
			test.pass("Removed member not showing in group participents list after searching member");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_111 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_112() {
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			pa.participentsList_Groupinfo();
			pa.participents_search();
			ExtentTest test = extent.createTest("To verify searched list in participents screen");
			Assert.assertTrue(cm.count_1 == false, "After searching list was showing wrong from search screen to participents list");
			test.pass("Searched list was showing correct from search screen to participents list");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_112 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_113() { //need
		try {
			//cm.capabilities();
			cm.open_created_Group();
			gi.created_Groupdetails();
			pa.participents_searchOptions();
			ExtentTest test = extent.createTest("To verify admin options for members after searching a member in participents screen");
			Assert.assertTrue(cm.count_1 == true, "All admin options are not showing for normal member after searching member");
			test.pass("All admin options are showing for normal member after searching member");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_113 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_114() {
		try {
			//cm.capabilities();
			pa.groupoptions_Nonadmin();
			//cm.participantsoptionsNonadmin();
			ExtentTest test = extent.createTest("To verify non admin login member showing options for group in info screen");
			Assert.assertTrue(cm.count_1 == true, "Edit group details button is showing for non admin member");
			test.pass("Edit group details button was not showing for non admin member");
			Assert.assertTrue(cm.count_2 == true, "Add group DP button is showing for non admin member");
			test.pass("Add group DP button was not showing for non admin member");
			Assert.assertTrue(cm.count_3 == true, "Add group member button is showing for non admin member");
			test.pass("Add group member button was not showing for non admin member");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_114 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_115() {
		try {
			//cm.capabilities();
			//cm.groupoptionsNonadmin();
			pa.participantsoptions_Nonadmin();
			ExtentTest test = extent.createTest("To verify non admin login member showing options for other group members in participents screen");
			Assert.assertTrue(cm.count_1 == true, "Other non admin actions are also showing for logined non admin member");
			test.pass("Only non admin actions are showing for logined non admin member");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_115 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_116() {
		try {
			//cm.capabilities();
			cm.openCreatgroup();
			cm.selectMembers();
			//cm.selectedMemberslist();
			cm.nextButton();
			cm.validationfill_Nameonly();
			//cm.listDetails();
			cm.nextButton();
			cm.threadSleep(4);
			//cm.nextButton();
			ExtentTest test = extent.createTest("To creat group without adding info and DP");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_116 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_117() {
		try {
			//cm.capabilities();
			cm.groupOnlyname();
			ExtentTest test = extent.createTest("To check info and DP for not added group in group info screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_117 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_118() {
		try {
			//cm.capabilities();
			cm.groupOnlyname_edit();
			ExtentTest test = extent.createTest("To check info field data in edit group details screen for info not added group");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_118 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_119() {
		try {
			//cm.capabilities();
			cm.groupOnlyname_edit();
			cm.groupOnlyname_editAddinfo();
			ExtentTest test = extent.createTest("To check info field data in group info screen after adding from edit details screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_119 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_120() {
		try {
			//cm.capabilities();
			cm.contactsButton();
			cm.contactsList();
			ExtentTest test = extent.createTest("To verify contacts list");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_120 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_121() {
		try {
			cm.open_created_Group();
			sm.MessageOptions_icon();
			sm.Gallery_icon();
			ExtentTest test = extent.createTest("To open gallery screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_121 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_122() {
		try {
			cm.open_created_Group();
			sm.MessageOptions_icon();
			sm.Gallery_icon();
			sm.gallery_Send();
			sm.send_Button();
			ExtentTest test = extent.createTest("To send gallery image");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_122 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_123() {
		try {
			cm.open_created_Group();
			sm.MessageOptions_icon();
			sm.Gallery_icon();
			sm.gallery_Send();
			sm.Capture_Caption();
			sm.send_Button();
			ExtentTest test = extent.createTest("To send gallery image with caption");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_123 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_124() {
		try {
			cm.open_created_Group();
			sm.MessageOptions_icon();
			sm.Gallery_icon();
			sm.gallery_Send_Multiple();
			ExtentTest test = extent.createTest("To send multiple gallery image");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_124 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_125() {
		try {
			cm.open_created_Group();
			sm.MessageOptions_icon();
			sm.Gallery_icon();
			sm.Back_icon();
			ExtentTest test = extent.createTest("Able to exit from gallery screen by clicking on back button");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_125 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_126() {
		try {
			cm.open_created_Group();
			sm.MessageOptions_icon();
			sm.Gallery_icon();
			sm.gallery_close();
			ExtentTest test = extent.createTest("Able to exit from gallery screen by clicking on back button after selecting images");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_126 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_127() {
		try {
			cm.open_created_Group();
			sm.MessageOptions_icon();
			sm.Files_icon();
			ExtentTest test = extent.createTest("To open files screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_127 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_128() {
		try {
			cm.open_created_Group();
			sm.MessageOptions_icon();
			sm.Files_icon();
			sm.files_Send();
			ExtentTest test = extent.createTest("To send file");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_128 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_129() {
		try {
			cm.open_created_Group();
			sm.MessageOptions_icon();
			sm.Files_icon();
			sm.default_Back();
			ExtentTest test = extent.createTest("Able to exit from files screen by clicking on back button");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_129 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_130() {
		try {
			cm.open_created_Group();
			sm.MessageOptions_icon();
			sm.Location_icon();
			ExtentTest test = extent.createTest("To open location screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_130 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_131() {
		try {
			cm.open_created_Group();
			sm.MessageOptions_icon();
			sm.Location_icon();
			sm.location_Send();
			ExtentTest test = extent.createTest("To send location");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_131 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_132() {
		try {
			cm.open_created_Group();
			sm.MessageOptions_icon();
			sm.Location_icon();
			sm.scrollTohorizontal_Location();
			sm.location_Send();
			ExtentTest test = extent.createTest("To send changed location");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_132 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_133() {
		try {
			cm.open_created_Group();
			sm.MessageOptions_icon();
			sm.Location_icon();
			cm.backButton();
			ExtentTest test = extent.createTest("Able to exit from location screen by clicking on back button");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_133 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_134() {
		try {
			cm.open_created_Group();
			sm.MessageOptions_icon();
			sm.Location_icon();
			sm.scrollTohorizontal_Location();
			threadSleep(2);
			cm.backButton();
			ExtentTest test = extent.createTest("Able to exit from location screen by clicking on back button after changing location");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_134 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_135() {
		try {
			cm.open_created_Group();
			sm.MessageOptions_icon();
			sm.Contacts_icon();
			ExtentTest test = extent.createTest("To open contacts screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_135 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_136() {
		try {
			cm.open_created_Group();
			sm.MessageOptions_icon();
			sm.Contacts_icon();
			sm.contacts_Select();
			cm.nextButton();
			ExtentTest test = extent.createTest("To send contact");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_136 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_137() {
		try {
			cm.open_created_Group();
			sm.MessageOptions_icon();
			sm.Contacts_icon();
			sm.contacts_Send_Multiple();
			ExtentTest test = extent.createTest("To send multiple contacts");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_137 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_138() {
		try {
			cm.open_created_Group();
			sm.MessageOptions_icon();
			sm.Contacts_icon();
			cm.backButton();
			ExtentTest test = extent.createTest("Able to exit from contacts screen by clicking on back button");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_138 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_139() {
		try {
			cm.open_created_Group();
			sm.MessageOptions_icon();
			sm.Contacts_icon();
			sm.contacts_Select();
			cm.backButton();
			ExtentTest test = extent.createTest("Able to exit from contacts screen by clicking on back button after selecting contact");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_139 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_140() {
		try {
			cm.open_created_Group();
			sm.MessageOptions_icon();
			sm.Audio_icon();
			ExtentTest test = extent.createTest("To open audios screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_140 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_141() {
		try {
			cm.open_created_Group();
			sm.MessageOptions_icon();
			sm.Audio_icon();
			sm.audio_Select();
			cm.nextButton();
			ExtentTest test = extent.createTest("To send audio file");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_141 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_142() {
		try {
			cm.open_created_Group();
			sm.MessageOptions_icon();
			sm.Audio_icon();
			sm.audio_Send_Multiple();
			ExtentTest test = extent.createTest("To send multiple audio files");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_142 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_143() {
		try {
			cm.open_created_Group();
			sm.MessageOptions_icon();
			sm.Audio_icon();
			cm.backButton();
			ExtentTest test = extent.createTest("Able to exit from audios screen by clicking on back button");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_143 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_144() {
		try {
			cm.open_created_Group();
			sm.MessageOptions_icon();
			sm.Audio_icon();
			sm.audio_Select();
			cm.backButton();
			ExtentTest test = extent.createTest("Able to exit from audios screen by clicking on back button after selecting audios");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_144 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_145() {
		try {
			cm.open_created_Group();
			sm.MessageOptions_icon();
			sm.Video_icon();
			ExtentTest test = extent.createTest("To open videos screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_145 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_146() {
		try {
			cm.open_created_Group();
			sm.MessageOptions_icon();
			sm.Video_icon();
			sm.audio_Select();
			cm.nextButton();
			ExtentTest test = extent.createTest("To send an video");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_146 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_147() {
		try {
			cm.open_created_Group();
			sm.MessageOptions_icon();
			sm.Video_icon();
			sm.audio_Send_Multiple();
			ExtentTest test = extent.createTest("To send multiple videos");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_147 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_148() {
		try {
			cm.open_created_Group();
			sm.MessageOptions_icon();
			sm.Video_icon();
			cm.backButton();
			ExtentTest test = extent.createTest("Able to exit from videos screen by clicking on back button");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_148 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_149() {
		try {
			cm.open_created_Group();
			sm.MessageOptions_icon();
			sm.Video_icon();
			sm.audio_Select();
			cm.backButton();
			ExtentTest test = extent.createTest("Able to exit from videos screen by clicking on back button after selecting an video");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_149 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_150() { //passed
		try {
			cm.open_created_Group();
			sm.camera_open();
			ExtentTest test = extent.createTest("To open camera");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_150 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_151() { //passed
		try {
			cm.open_created_Group();
			sm.camera_open();
			sm.camera_image();
			sm.send_Button();
			ExtentTest test = extent.createTest("To send camera captured image");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_151 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_152() { //passed
		try {
			cm.open_created_Group();
			sm.camera_open();
			sm.camera_image();
			sm.Capture_Caption();
			sm.send_Button();
			ExtentTest test = extent.createTest("To send captured image with caption");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_152 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_153() { //passed
		try {
			cm.open_created_Group();
			sm.camera_open();
			sm.Capture_Video();
			sm.send_Button();
			ExtentTest test = extent.createTest("To send captured video");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_153 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_154() { //pass
		try {
			cm.open_created_Group();
			sm.camera_open();
			//cm.click_holdOn(cm.holdOn);
			sm.Capture_Video();
			sm.Capture_Caption();
			sm.send_Button();
			ExtentTest test = extent.createTest("To send captured video with caption");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_154 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_155() { //pass
		try {
			cm.open_created_Group();
			sm.camera_open();
			sm.default_Back();
			ExtentTest test = extent.createTest("Able to exit from camera screen by clicking on back button");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_155 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_156() { //pass
		try {
			cm.open_created_Group();
			sm.click_holdOn(voice_icon);
			ExtentTest test = extent.createTest("To send voice message by clicking and hold on voice message icon");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_156 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_157() { //pass
		try {
			cm.open_created_Group();
			sm.voiceMessage_lock();
			sm.send_voiceMessage_ikon();
			ExtentTest test = extent.createTest("To send voice message by locking the voice message icon");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_157 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_158() { //pass
		try {
			cm.open_created_Group();
			sm.voiceMessage_Cancel();
			ExtentTest test = extent.createTest("To cancel the voice message by swiping left the voice message icon");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_158 Test case is Failed");
		}
	}

	@Test
	public void TC_159() { //pass
		try {
			cm.open_created_Group();
			sm.voiceMessage_lock();
			sm.voiceMessage_lock_cancel();
			ExtentTest test = extent.createTest("To cancel the voice message by clicking on 'Cancel' after locking the voice message icon");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_159 Test case is Failed");
		}
	}

	@Test
	public void TC_160() { //need to assign	
		try {
			cm.open_created_Group();
			fi.Open_Filter();
			fi.swipe_filterList();
			ExtentTest test = extent.createTest("To 'Swipe' filter list");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_160 Test case is Failed");
		}
	}

	@Test
	public void TC_161() {
		try {
			cm.open_created_Group();
			fi.Open_Filter();
			fi.Filter_Gallery_Icon();
			ExtentTest test = extent.createTest("To apply 'Gallery' filter");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_161 Test case is Failed");
		}
	}

	@Test
	public void TC_162() {
		try {
			cm.open_created_Group();
			fi.Open_Filter();
			fi.Filter_Video_Icon();
			ExtentTest test = extent.createTest("To apply 'Video' filter");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_162 Test case is Failed");
		}
	}

	@Test
	public void TC_163() {
		try {
			cm.open_created_Group();
			fi.Open_Filter();
			fi.Filter_Audio_Icon();
			ExtentTest test = extent.createTest("To apply 'Audio' filter");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_163 Test case is Failed");
		}
	}

	@Test
	public void TC_164() {
		try {
			cm.open_created_Group();
			fi.Open_Filter();
			fi.Filter_Files_Icon();
			ExtentTest test = extent.createTest("To apply 'Files' filter");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_164 Test case is Failed");
		}
	}

	@Test
	public void TC_165() {
		try {
			cm.open_created_Group();
			fi.Open_Filter();
			fi.leftRightSwipe();
			//ts.Filter_Links_Icon();
			ExtentTest test = extent.createTest("To apply 'Links' filter");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_165 Test case is Failed");
		}
	}

	@Test
	public void TC_166() {
		try {
			cm.open_created_Group();
			fi.Open_Filter();
			fi.Filter_Contacts_Icon();
			ExtentTest test = extent.createTest("To apply 'Contacts' filter");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_166 Test case is Failed");
		}
	}

	@Test
	public void TC_167() {
		try {
			cm.open_created_Group();
			fi.Open_Filter();
			fi.Filter_Locations_Icon();
			ExtentTest test = extent.createTest("To apply 'Locations' filter");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_167 Test case is Failed");
		}
	}

	@Test
	public void TC_168() {
		try {
			cm.open_created_Group();
			fi.Open_Filter();
			fi.Filter_Flag_Icon();
			ExtentTest test = extent.createTest("To apply 'Flag' filter");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_168 Test case is Failed");
		}
	}

	@Test
	public void TC_169() {
		try {
			cm.open_created_Group();
			fi.Open_Filter();
			fi.Filter_Pin_Icon();
			ExtentTest test = extent.createTest("To apply 'Pin' filter");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_169 Test case is Failed");
		}
	}

	@Test
	public void TC_170() {
		try {
			cm.open_created_Group();
			fi.Open_Filter();
			fi.Filter_Reset_Icon();
			ExtentTest test = extent.createTest("To check 'Reset' before applying filter");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_170 Test case is Failed");
		}
	}

	@Test
	public void TC_171() {
		try {
			cm.open_created_Group();
			fi.Open_Filter();
			fi.Filter_Gallery_Icon();
			fi.Filter_Reset_Icon();
			ExtentTest test = extent.createTest("To check 'Reset' after applying filter");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_171 Test case is Failed");
		}
	}

	@Test
	public void TC_172() {
		try {
			cm.open_created_Group();
			fi.Open_Filter();
			fi.Filter_Cancel_Icon();
			ExtentTest test = extent.createTest("To check 'Cancel' before applying filter");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_172 Test case is Failed");
		}
	}

	@Test
	public void TC_173() {
		try {
			cm.open_created_Group();
			fi.Open_Filter();
			fi.Filter_Gallery_Icon();
			fi.Filter_Cancel_Icon();
			ExtentTest test = extent.createTest("To check 'Cancel' after applying filter");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_173 Test case is Failed");
		}
	}

	@Test
	public void TC_174() {
		try {
			cm.open_created_Group();
			fi.Open_Search();
			fi.back_search_chat();
			ExtentTest test = extent.createTest("To check 'Back' button before entering search data");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_174 Test case is Failed");
		}
	}

	@Test
	public void TC_175() {
		try {
			cm.open_created_Group();
			fi.Open_Search();
			fi.Enter_Search_chat("Test");
			fi.back_search_chat();
			ExtentTest test = extent.createTest("To check 'Back' button after entering search data");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_175 Test case is Failed");
		}
	}

	@Test
	public void TC_176() {
		try {
			cm.open_created_Group();
			fi.Open_Search();
			fi.Clear_search_chat();
			ExtentTest test = extent.createTest("To check 'Clear' button before entering search data");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_176 Test case is Failed");
		}
	}

	@Test
	public void TC_177() {
		try {
			cm.open_created_Group();
			fi.Open_Search();
			fi.Enter_Search_chat("Te");
			fi.Clear_search_chat();
			ExtentTest test = extent.createTest("To check 'Clear' button after entering search data");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_177 Test case is Failed");
		}
	}

	@Test
	public void TC_178() {
		try {
			cm.open_created_Group();
			fi.Open_Search();
			fi.Enter_Search_chat("Te");
			ExtentTest test = extent.createTest("To check 'search data' by entering valid search data");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_178 Test case is Failed");
		}
	}

	@Test
	public void TC_179() {
		try {
			cm.open_created_Group();
			fi.Open_Search();
			fi.Enter_Search_chat("Invalid");
			ExtentTest test = extent.createTest("To check 'search data' by entering invalid search data");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_179 Test case is Failed");
		}
	}

	@Test
	public void TC_180() {
		try {
			cm.open_created_Group();
			fi.Open_Search();
			fi.Enter_Search_chat("Te");
			fi.nextMatch_Button_search_chat();
			ExtentTest test = extent.createTest("To check 'nextMatch' button");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_180 Test case is Failed");
		}
	}

	@Test
	public void TC_181() {
		try {
			cm.open_created_Group();
			fi.Open_Search();
			fi.Enter_Search_chat("Te");
			fi.previousMatch_Button_search_chat();
			ExtentTest test = extent.createTest("To check 'previousMatch' button");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_181 Test case is Failed");
		}
	}

	@Test
	public void TC_182() {
		try {
			mp.Open_MyProfile();
			mp.AddDP_Close();
			ExtentTest test = extent.createTest("To check 'Close' button on 'Add DP options' in myprofile");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_182 Test case is Failed");
		}
	}

	@Test
	public void TC_183() {
		try {
			mp.Open_MyProfile();
			mp.AddDP_camera();
			ExtentTest test = extent.createTest("To check 'Camera' ikon on 'Add DP options' in myprofile");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_183 Test case is Failed");
		}
	}

	@Test
	public void TC_184() {
		try {
			mp.Open_MyProfile();
			mp.AddDP_gallery();
			ExtentTest test = extent.createTest("To check 'Gallery' ikon on 'Add DP options' in myprofile");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_184 Test case is Failed");
		}
	}

	@Test
	public void TC_185() {
		try {
			mp.Open_MyProfile();
			mp.Back_button();
			ExtentTest test = extent.createTest("To check 'Back' button in myprofile");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_185 Test case is Failed");
		}
	}

	@Test
	public void TC_186() {
		try {
			mp.Open_MyProfile();
			mp.Edit_Profile();
			mp.Back_EditProfile();
			ExtentTest test = extent.createTest("To check 'Back' button in editprofile before editing details");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_186 Test case is Failed");
		}
	}

	@Test
	public void TC_187() {
		try {
			mp.Open_MyProfile();
			mp.Edit_Profile();
			mp.DisplayName_EditProfile();
			mp.Back_EditProfile();
			ExtentTest test = extent.createTest("To check 'Back' button in editprofile after editing details");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_187 Test case is Failed");
		}
	}

	@Test
	public void TC_188() {
		try {
			mp.Open_MyProfile();
			mp.Edit_Profile();
			mp.Update_EditProfile();
			ExtentTest test = extent.createTest("To check 'Update' button in editprofile before editing details");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_188 Test case is Failed");
		}
	}

	@Test
	public void TC_189() {
		try {
			mp.Open_MyProfile();
			mp.Edit_Profile();
			mp.DisplayName_EditProfile();
			mp.Update_EditProfile();
			ExtentTest test = extent.createTest("To check 'Update' button in editprofile after editing details");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_189 Test case is Failed");
		}
	}

	@Test
	public void TC_190() {
		try {
			mp.Open_MyProfile();
			mp.view_DP();
			ExtentTest test = extent.createTest("To view 'DP' in myprofile");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_190 Test case is Failed");
		}
	}

	@Test
	public void TC_191() {
		try {
			mp.Open_MyProfile();
			mp.view_DP();
			mp.Back_EditProfile();
			ExtentTest test = extent.createTest("To check 'Back' button on view profile in myprofile");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_191 Test case is Failed");
		}
	}

	@Test
	public void TC_192() {
		try {
			se.Open_Settings();
			se.Back_Settings();
			ExtentTest test = extent.createTest("To check 'Back' button in settings");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_192 Test case is Failed");
		}
	}

	@Test
	public void TC_193() {
		try {
			se.Open_Settings();
			se.Profile_Option();
			ExtentTest test = extent.createTest("To click on 'profile option' in settings");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_193 Test case is Failed");
		}
	}

	@Test
	public void TC_194() {
		try {
			se.Open_Settings();
			se.Account_Option();
			ExtentTest test = extent.createTest("To click on 'Account option' in settings");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_194 Test case is Failed");
		}
	}

	@Test
	public void TC_195() {
		try {
			se.Open_Settings();
			se.Notifications_Option();
			ExtentTest test = extent.createTest("To click on 'Notifications option' in settings");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_195 Test case is Failed");
		}
	}

	@Test
	public void TC_196() {
		try {
			se.Open_Settings();
			se.Media_Option();
			ExtentTest test = extent.createTest("To click on 'Media option' in settings");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_196 Test case is Failed");
		}
	}

	@Test
	public void TC_197() {
		try {
			se.Open_Settings();
			se.General_Option();
			ExtentTest test = extent.createTest("To click on 'General option' in settings");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_197 Test case is Failed");
		}
	}

	@Test
	public void TC_198() {
		try {
			se.Open_Settings();
			se.Security_Option();
			ExtentTest test = extent.createTest("To click on 'Security option' in settings");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_198 Test case is Failed");
		}
	}

	@Test
	public void TC_199() {
		try {
			se.Open_Settings();
			se.Help_Option();
			ExtentTest test = extent.createTest("To click on 'Help option' in settings");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_199 Test case is Failed");
		}
	}

	@Test
	public void TC_200() {
		try {
			se.Open_Settings();
			se.Help_Option();
			se.Terms_Help();
			ExtentTest test = extent.createTest("To click on 'Terms and Privacy Policy' in help");
			Assert.assertTrue(se.check == true, "CLAP app privacy policys link was not opened");
			test.pass("CLAP app privacy policys link was opened");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_200 Test case is Failed");
		}
	}

	@Test
	public void TC_201() {
		try {
			se.Open_Settings();
			se.Help_Option();
			se.Terms_Help();
			se.Back_Terms_Help();
			ExtentTest test = extent.createTest("To check 'Back' button after clicking on 'Terms and Privacy Policy' in help");
			Assert.assertTrue(se.check == true, "Unable to navigate to clap app help screen from privacy policy link screen");
			test.pass("Navigate to clap app help screen from privacy policy link screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_201 Test case is Failed");
		}
	}

	@Test
	public void TC_202() {
		try {
			se.Open_Settings();
			se.Help_Option();
			se.Back_Option();
			ExtentTest test = extent.createTest("To check 'Back' button in help");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_202 Test case is Failed");
		}
	}

	@Test
	public void TC_203() {
		try {
			se.Open_Settings();
			se.Security_Option();
			se.Back_Option();
			ExtentTest test = extent.createTest("To check 'Back' button in security");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_203 Test case is Failed");
		}
	}

	@Test
	public void TC_204() {
		try {
			se.Open_Settings();
			se.Notifications_Option();
			se.Back_Option();
			ExtentTest test = extent.createTest("To check 'Back' button in notifications");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_204 Test case is Failed");
		}
	}

	@Test
	public void TC_205() {
		try {
			se.Open_Settings();
			se.Media_Option();
			se.Back_Option();
			ExtentTest test = extent.createTest("To check 'Back' button in media");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_205 Test case is Failed");
		}
	}

	@Test
	public void TC_206() {
		try {
			se.Open_Settings();
			se.Media_Option();
			se.Photo_Media();
			ExtentTest test = extent.createTest("To click on 'Photo' in media list");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_206 Test case is Failed");
		}
	}

	@Test
	public void TC_207() {
		try {
			se.Open_Settings();
			se.Media_Option();
			se.Photo_Media();
			se.Photo_Zoom_Media();
			ExtentTest test = extent.createTest("To check 'ZoomIN' for opened image preview in media");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_207 Test case is Failed");
		}
	}

	@Test
	public void TC_208() {
		try {
			se.Open_Settings();
			se.Media_Option();
			se.Photo_Media();
			se.Photo_Zoom_Media();
			se.Photo_Zoom_Media();
			ExtentTest test = extent.createTest("To check 'ZoomOUT' for opened image preview in media");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_208 Test case is Failed");
		}
	}

	@Test
	public void TC_209() {
		try {
			se.Open_Settings();
			se.Media_Option();
			se.Photo_Media();
			se.Back_Option();
			ExtentTest test = extent.createTest("To check 'Back' button on opened image preview in media");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_209 Test case is Failed");
		}
	}

	@Test
	public void TC_210() {
		try {
			se.Open_Settings();
			se.Media_Option();
			se.Audio_Media();
			se.Audio_play();
			ExtentTest test = extent.createTest("To 'play' opened audio file in media");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_210 Test case is Failed");
		}
	}

	@Test
	public void TC_211() {
		try {
			se.Open_Settings();
			se.Media_Option();
			se.Audio_Media();
			se.Audio_play();
			se.Audio_pause();
			ExtentTest test = extent.createTest("To 'pause' playing audio file in media");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_211 Test case is Failed");
		}
	}

	@Test
	public void TC_212() {
		try {
			se.Open_Settings();
			se.Media_Option();
			se.Audio_Media();
			se.Audio_play();
			se.Back_Option();
			ExtentTest test = extent.createTest("To check 'Back' button while playing audio file in media");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_212 Test case is Failed");
		}
	}

	@Test
	public void TC_213() {
		try {
			se.Open_Settings();
			se.Media_Option();
			se.Audio_Media();
			se.Audio_play();
			se.Audio_pause();
			se.Back_Option();
			ExtentTest test = extent.createTest("To check 'Back' button after pause playing audio file in media");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_213 Test case is Failed");
		}
	}

	@Test
	public void TC_214() {
		try {
			se.Open_Settings();
			se.Media_Option();
			se.Audio_Media();
			se.Back_Option();
			ExtentTest test = extent.createTest("To check 'Back' button on opened audio file in media");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_214 Test case is Failed");
		}
	}

	@Test
	public void TC_215() {
		try {
			se.Open_Settings();
			se.Media_Option();
			se.Video_Media();
			se.Video_options();
			se.Video_pause();
			ExtentTest test = extent.createTest("To 'Pause' opened video in media");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_215 Test case is Failed");
		}
	}

	@Test
	public void TC_216() {
		try {
			se.Open_Settings();
			se.Media_Option();
			se.Video_Media();
			se.Video_options();
			se.Video_pause();
			se.Video_play();
			ExtentTest test = extent.createTest("To 'Continue-Play' opened video in media");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_216 Test case is Failed");
		}
	}

	@Test
	public void TC_217() {
		try {
			se.Open_Settings();
			se.Media_Option();
			se.Video_Media();
			se.Video_options();
			se.Video_forward();
			ExtentTest test = extent.createTest("To check 'forward' button in playing video options in media");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_217 Test case is Failed");
		}
	}

	@Test
	public void TC_218() {
		try {
			se.Open_Settings();
			se.Media_Option();
			se.Video_Media();
			se.Video_options();
			se.Video_backword();
			ExtentTest test = extent.createTest("To check 'backword' button in playing video options in media");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_218 Test case is Failed");
		}
	}

	@Test
	public void TC_219() {
		try {
			se.Open_Settings();
			se.Media_Option();
			se.Video_Media();
			se.Back_Option();
			ExtentTest test = extent.createTest("To check 'Back' button on opened video in media");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_219 Test case is Failed");
		}
	}

	@Test
	public void TC_220() {
		try {
			se.Open_Settings();
			se.Media_Option();
			se.Media_Docs();
			se.Back_Option();
			ExtentTest test = extent.createTest("To check 'Back' button in media docs");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_220 Test case is Failed");
		}
	}

	@Test
	public void TC_221() {
		try {
			se.Open_Settings();
			se.Media_Option();
			se.Media_Docs();
			se.Media_Docs_View();
			ExtentTest test = extent.createTest("To click on 'Document' for preview in media");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_221 Test case is Failed");
		}
	}

	@Test
	public void TC_222() {
		try {
			se.Open_Settings();
			se.Media_Option();
			se.Media_Docs();
			se.Media_Docs_View();
			se.Back_Option();
			ExtentTest test = extent.createTest("To check 'Back' button on opened document preview in media");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_222 Test case is Failed");
		}
	}

	@Test
	public void TC_223() {
		try {
			se.Open_Settings();
			se.Media_Option();
			se.Media_Docs();
			se.Media_Docs_View();
			se.Photo_Zoom_Media();
			se.Photo_Zoom_Media();
			ExtentTest test = extent.createTest("To check 'ZoomIN' for opened document preview in media");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_223 Test case is Failed");
		}
	}

	@Test
	public void TC_224() {
		try {
			se.Open_Settings();
			se.Media_Option();
			se.Media_Docs();
			se.Media_Docs_View();
			se.Photo_Zoom_Media();
			se.Photo_Zoom_Media();
			se.Photo_Zoom_Media();
			ExtentTest test = extent.createTest("To check 'ZoomOUT' for opened document preview in media");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_224 Test case is Failed");
		}
	}

	@Test
	public void TC_225() {
		try {
			se.Open_Settings();
			se.Media_Option();
			se.Media_Links();
			se.Back_Option();
			ExtentTest test = extent.createTest("To check 'Back' button in media links");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_225 Test case is Failed");
		}
	}

	@Test
	public void TC_226() {
		try {
			se.Open_Settings();
			se.Media_Option();
			se.Media_Links();
			se.Media_Links_Click();
			ExtentTest test = extent.createTest("To click on 'Link' to open in media");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_226 Test case is Failed");
		}
	}

	@Test
	public void TC_227() {
		try {
			se.Open_Settings();
			se.Media_Option();
			se.Media_Links();
			se.Media_Links_Click();
			se.Back_Clicked_links();
			ExtentTest test = extent.createTest("To check 'Back' button after clicking on 'Link' in media");
			Assert.assertTrue(se.check == true, "Unable to navigate to clap app media links screen from clicked link screen");
			test.pass("Navigate to clap app media links screen from clicked link screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_227 Test case is Failed");
		}
	}

	@Test
	public void TC_228() {
		try {
			se.Open_Settings();
			se.General_Option();
			se.Back_Option();
			ExtentTest test = extent.createTest("To check 'Back' button in general");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_228 Test case is Failed");
		}
	}

	@Test
	public void TC_229() {
		try {
			se.Open_Settings();
			se.General_Option();
			se.General_MobileData();
			se.General_Cancel_Options();
			ExtentTest test = extent.createTest("To check 'Cancel' button on autodownload mobile data options in general");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_229 Test case is Failed");
		}
	}

	@Test
	public void TC_230() {
		try {
			se.Open_Settings();
			se.General_Option();
			se.General_MobileData();
			se.General_Ok_Options();
			ExtentTest test = extent.createTest("To check 'Ok' button on autodownload mobile data options in general");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_230 Test case is Failed");
		}
	}

	@Test
	public void TC_231() {
		try {
			se.Open_Settings();
			se.General_Option();
			se.General_MobileData();
			se.General_Photos_checkbox();
			se.General_Audio_checkbox();
			se.General_Videos_checkbox();
			se.General_Documents_checkbox();
			se.General_Cancel_Options();
			ExtentTest test = extent.createTest("To check 'Cancel' button on autodownload mobile data options in general after selecting options");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_231 Test case is Failed");
		}
	}

	@Test
	public void TC_232() {
		try {
			se.Open_Settings();
			se.General_Option();
			se.General_MobileData();
			se.General_Photos_checkbox();
			se.General_Audio_checkbox();
			se.General_Videos_checkbox();
			se.General_Documents_checkbox();
			se.General_Ok_Options();
			ExtentTest test = extent.createTest("To check 'Ok' button on autodownload mobile data options in general after selecting options");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_232 Test case is Failed");
		}
	}

	@Test
	public void TC_233() {
		try {
			se.Open_Settings();
			se.General_Option();
			se.General_MobileData();
			if (driver.findElements(By.xpath("//android.widget.CheckBox[@checked='true']")).size() == 0) {
				se.General_Photos_checkbox();
				se.General_Audio_checkbox();
				se.General_Videos_checkbox();
				se.General_Documents_checkbox();
				se.General_Ok_Options();
				se.General_MobileData();
			}
			se.General_Photos_checkbox();
			se.General_Audio_checkbox();
			se.General_Videos_checkbox();
			se.General_Documents_checkbox();
			se.General_Cancel_Options();
			ExtentTest test = extent.createTest("To check 'Cancel' button on autodownload mobile data options in general after deselecting selected options");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_233 Test case is Failed");
		}
	}

	@Test
	public void TC_234() {
		try {
			se.Open_Settings();
			se.General_Option();
			se.General_MobileData();
			if (driver.findElements(By.xpath("//android.widget.CheckBox[@checked='true']")).size() == 0) {
				se.General_Photos_checkbox();
				se.General_Audio_checkbox();
				se.General_Videos_checkbox();
				se.General_Documents_checkbox();
				se.General_Ok_Options();
				se.General_MobileData();
			}
			se.General_Photos_checkbox();
			se.General_Audio_checkbox();
			se.General_Videos_checkbox();
			se.General_Documents_checkbox();
			se.General_Ok_Options();
			ExtentTest test = extent.createTest("To check 'Ok' button on autodownload mobile data options in general after deselecting selected options");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_234 Test case is Failed");
		}
	}

	@Test
	public void TC_235() {
		try {
			se.Open_Settings();
			se.General_Option();
			se.General_WIFI();
			se.General_Cancel_Options();
			ExtentTest test = extent.createTest("To check 'Cancel' button on autodownload WIFI options in general");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_235 Test case is Failed");
		}
	}

	@Test
	public void TC_236() {
		try {
			se.Open_Settings();
			se.General_Option();
			se.General_WIFI();
			se.General_Ok_Options();
			ExtentTest test = extent.createTest("To check 'Ok' button on autodownload WIFI options in general");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_236 Test case is Failed");
		}
	}

	@Test
	public void TC_237() {
		try {
			se.Open_Settings();
			se.General_Option();
			se.General_WIFI();
			se.General_Photos_checkbox();
			se.General_Audio_checkbox();
			se.General_Videos_checkbox();
			se.General_Documents_checkbox();
			se.General_Cancel_Options();
			ExtentTest test = extent.createTest("To check 'Cancel' button on autodownload WIFI options in general after selecting options");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_237 Test case is Failed");
		}
	}

	@Test
	public void TC_238() {
		try {
			se.Open_Settings();
			se.General_Option();
			se.General_WIFI();
			se.General_Photos_checkbox();
			se.General_Audio_checkbox();
			se.General_Videos_checkbox();
			se.General_Documents_checkbox();
			se.General_Ok_Options();
			ExtentTest test = extent.createTest("To check 'Ok' button on autodownload WIFI options in general after selecting options");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_238 Test case is Failed");
		}
	}

	@Test
	public void TC_239() {
		try {
			se.Open_Settings();
			se.General_Option();
			se.General_WIFI();
			if (driver.findElements(By.xpath("//android.widget.CheckBox[@checked='true']")).size() == 0) {
				se.General_Photos_checkbox();
				se.General_Audio_checkbox();
				se.General_Videos_checkbox();
				se.General_Documents_checkbox();
				se.General_Ok_Options();
				se.General_WIFI();
			}
			se.General_Photos_checkbox();
			se.General_Audio_checkbox();
			se.General_Videos_checkbox();
			se.General_Documents_checkbox();
			se.General_Cancel_Options();
			ExtentTest test = extent.createTest("To check 'Cancel' button on autodownload WIFI options in general after deselecting selected options");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_239 Test case is Failed");
		}
	}

	@Test
	public void TC_240() {
		try {
			se.Open_Settings();
			se.General_Option();
			se.General_WIFI();
			if (driver.findElements(By.xpath("//android.widget.CheckBox[@checked='true']")).size() == 0) {
				se.General_Photos_checkbox();
				se.General_Audio_checkbox();
				se.General_Videos_checkbox();
				se.General_Documents_checkbox();
				se.General_Ok_Options();
				se.General_WIFI();
			}
			se.General_Photos_checkbox();
			se.General_Audio_checkbox();
			se.General_Videos_checkbox();
			se.General_Documents_checkbox();
			se.General_Ok_Options();
			ExtentTest test = extent.createTest("To check 'Ok' button on autodownload WIFI options in general after deselecting selected options");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_240 Test case is Failed");
		}
	}

	@Test
	public void TC_241() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Camera();
			sm.camera_image();
			sm.send_Button();
			ExtentTest test = extent.createTest("To add 'captured image' as story");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_241 Test case is Failed");
		}
	}

	@Test
	public void TC_242() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Camera();
			sm.camera_image();
			sm.Capture_Caption();
			sm.send_Button();
			ExtentTest test = extent.createTest("To add 'captured image' as story with caption");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_242 Test case is Failed");
		}
	}

	@Test
	public void TC_243() { //passed
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Camera();
			sm.Capture_Video();
			sm.send_Button();
			ExtentTest test = extent.createTest("To add 'captured video' as story");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_243 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_244() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Camera();
			//cm.click_holdOn(cm.holdOn);
			sm.Capture_Video();
			sm.Capture_Caption();
			sm.send_Button();
			ExtentTest test = extent.createTest("To add 'captured video' as story with caption");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_244 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_245() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Camera();
			st.AddStatus_Swipe_Gallery();
			st.Select_Gallery_Image();
			sm.send_Button();
			ExtentTest test = extent.createTest("To add 'gallery image' as story");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_245 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_246() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Camera();
			st.AddStatus_Swipe_Gallery();
			st.Select_Gallery_Image();
			sm.Capture_Caption();
			sm.send_Button();
			ExtentTest test = extent.createTest("To add 'gallery image' as story with caption");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_246 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_247() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Camera();
			st.AddStatus_Swipe_Gallery();
			st.Select_Gallery_Video();
			sm.send_Button();
			ExtentTest test = extent.createTest("To add 'gallery video' as story");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_247 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_248() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Camera();
			st.AddStatus_Swipe_Gallery();
			st.Select_Gallery_Video();
			sm.Capture_Caption();
			sm.send_Button();
			ExtentTest test = extent.createTest("To add 'gallery image' as story with caption");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_248 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_249() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Camera();
			st.AddStatus_Camera_Back();
			ExtentTest test = extent.createTest("To check 'back' button in add story 'Camera' screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_249 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_250() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Camera();
			st.AddStatus_Swipe_Gallery();
			st.AddStatus_Gallery_Back();
			st.AddStatus_Camera_Back();
			ExtentTest test = extent.createTest("To check 'back' button in add story 'Gallery' screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_250 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_251() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Note();
			st.AddStatus_Note("test status");
			st.AddStatus_ADD();
			ExtentTest test = extent.createTest("To add 'note' as story");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_251 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_252() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Note();
			st.AddStatus_Note("test by updating font style and background colour");
			st.AddStatus_Change_FontStyle();
			st.AddStatus_Change_Background();
			st.AddStatus_ADD();
			ExtentTest test = extent.createTest("To add 'note' as story by updating font style and background colour");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_252 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_253() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Note();
			st.AddStatus_Note("test status");
			st.AddStatus_Back();
			st.AddStatus_Discart_NO();
			ExtentTest test = extent.createTest("To cancel the discart story by clicking on 'NO' in popup");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_253 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_254() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Note();
			st.AddStatus_Note("<b>test status<b> is done");
			st.AddStatus_Back();
			st.AddStatus_Discart_YES();
			ExtentTest test = extent.createTest("To discart the added story by clicking on 'Yes' in popup");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_254 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_255() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Note();
			st.AddStatus_Back();
			ExtentTest test = extent.createTest("To check 'back' button in add note screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_255 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_256() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Link();
			st.AddStatus_Note("https://www.amazon.in");
			st.AddStatus_ADD();
			ExtentTest test = extent.createTest("To add 'link' as story");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_256 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_257() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Link();
			st.AddStatus_Note("https://www.flipkart.com");
			st.AddStatus_Change_FontStyle();
			st.AddStatus_Change_Background();
			st.AddStatus_ADD();
			ExtentTest test = extent.createTest("To add 'link' as story by updating font style and background colour");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_257 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_258() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Link();
			st.AddStatus_Note("https://www.flipkart.com");
			st.AddStatus_Back();
			st.AddStatus_Discart_NO();
			ExtentTest test = extent.createTest("To cancel the discart story by clicking on 'NO' in popup");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_258 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_259() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Link();
			st.AddStatus_Note("https://www.flipkart.com");
			st.AddStatus_Back();
			st.AddStatus_Discart_YES();
			ExtentTest test = extent.createTest("To discart the added story by clicking on 'Yes' in popup");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_259 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_260() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Link();
			st.AddStatus_Back();
			ExtentTest test = extent.createTest("To check 'back' button in add link screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_260 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_261() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Gallery();
			st.AddStatus_Swipe_Gallery();
			st.Select_Gallery_Image();
			ed.EditImage_Crop();
			ed.EditImage_Crop_Save();
			sm.send_Button();
			ExtentTest test = extent.createTest("To add Image as story by using 'Crop' edit for image");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_261 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_262() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Gallery();
			st.AddStatus_Swipe_Gallery();
			st.Select_Gallery_Image();
			ed.EditImage_Crop();
			ed.EditImage_Back();
			sm.send_Button();
			ExtentTest test = extent.createTest("To check 'X' button in 'Crop' edit screen for image on add story");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_262 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_263() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Gallery();
			st.AddStatus_Swipe_Gallery();
			st.Select_Gallery_Image();
			ed.EditImage_Pen();
			ed.EditImage_Pen_Colour();
			ed.EditImage_Pen_Swipe(2, 0.6, 0.4);
			ed.EditImage_Crop_Save();
			sm.send_Button();
			ExtentTest test = extent.createTest("To add Image as story by using 'Pen' edit for image");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_263 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_264() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Gallery();
			st.AddStatus_Swipe_Gallery();
			st.Select_Gallery_Image();
			ed.EditImage_Pen();
			ed.EditImage_Pen_Colour();
			ed.EditImage_Pen_Swipe(2, 0.6, 0.4);
			ed.EditImage_Pen_Backward();
			ed.EditImage_Pen_Forward();
			ed.EditImage_Crop_Save();
			sm.send_Button();
			ExtentTest test = extent.createTest("To check 'Backward' and 'Forward' button in 'Pin' edit screen for image on add story");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_264 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_265() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Gallery();
			st.AddStatus_Swipe_Gallery();
			st.Select_Gallery_Image();
			ed.EditImage_Pen();
			ed.EditImage_Pen_Colour();
			ed.EditImage_Pen_Swipe(2, 0.6, 0.4);
			ed.EditImage_Back();
			sm.send_Button();
			ExtentTest test = extent.createTest("To check 'X' button in 'Pin' edit screen for image on add story");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_265 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_266() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Gallery();
			st.AddStatus_Swipe_Gallery();
			st.Select_Gallery_Image();
			ed.EditImage_Pen();
			ed.EditImage_Pen_Colour();
			ed.EditImage_Pen_Swipe(2, 0.6, 0.4);
			ed.EditImage_Pen_Backward();
			ed.EditImage_Pen_Forward();
			ed.EditImage_Back();
			sm.send_Button();
			ExtentTest test = extent.createTest("To check 'X' button in 'Pin' edit screen for image after clicking 'Forward' and 'Backward' button on add story");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_266 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_267() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Gallery();
			st.AddStatus_Swipe_Gallery();
			st.Select_Gallery_Image();
			ed.EditImage_Text();
			ed.EditImage_Pen_Colour();
			ed.EditImage_Text_Message("Need to test");
			ed.EditImage_Text_Done();
			ed.EditImage_Crop_Save();
			sm.send_Button();
			ExtentTest test = extent.createTest("To add Image as story by using 'Text' edit for image");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_267 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_268() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Gallery();
			st.AddStatus_Swipe_Gallery();
			st.Select_Gallery_Image();
			ed.EditImage_Text();
			ed.EditImage_Pen_Colour();
			ed.EditImage_Text_Message("Need to test again");
			ed.EditImage_Text_Done();
			ed.EditImage_Text_Emoji();
			ed.EditImage_Text_Emoji_Select();
			ed.EditImage_Crop_Save();
			sm.send_Button();
			ExtentTest test = extent.createTest("To add Image as story by using 'Text' and 'Emoji' edit for image");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_268 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_269() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Gallery();
			st.AddStatus_Swipe_Gallery();
			st.Select_Gallery_Image();
			ed.EditImage_Text();
			ed.EditImage_Pen_Colour();
			ed.EditImage_Text_Message("Need to test again");
			ed.EditImage_Text_Done();
			ed.EditImage_Pen_Backward();
			ed.EditImage_Pen_Forward();
			ed.EditImage_Crop_Save();
			sm.send_Button();
			ExtentTest test = extent.createTest("To check 'Backward' and 'Forward' button in 'Text' edit screen for image on add story");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_269 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_270() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Gallery();
			st.AddStatus_Swipe_Gallery();
			st.Select_Gallery_Image();
			ed.EditImage_Text();
			ed.EditImage_Pen_Colour();
			ed.EditImage_Text_Message("Need to test again");
			ed.EditImage_Text_Done();
			ed.EditImage_Back();
			sm.send_Button();
			ExtentTest test = extent.createTest("To check 'X' button in 'Text' edit screen for image after applying text edit on add story");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_270 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_271() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Gallery();
			st.AddStatus_Swipe_Gallery();
			st.Select_Gallery_Image();
			ed.EditImage_Text();
			ed.EditImage_Text_Done();
			ed.EditImage_Back();
			sm.send_Button();
			ExtentTest test = extent.createTest("To check 'X' button in 'Text' edit screen for image on add story");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_271 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_272() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Gallery();
			st.AddStatus_Swipe_Gallery();
			st.Select_Gallery_Image();
			ed.EditImage_Filter();
			ed.EditImage_Filter_Option();
			ed.EditImage_Crop_Save();
			sm.send_Button();
			ExtentTest test = extent.createTest("To add Image as story by using 'Filter' edit for image");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_272 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_273() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Gallery();
			st.AddStatus_Swipe_Gallery();
			st.Select_Gallery_Image();
			ed.EditImage_Filter();
			ed.EditImage_Filter_Option();
			ed.EditImage_Pen_Backward();
			ed.EditImage_Pen_Forward();
			ed.EditImage_Crop_Save();
			sm.send_Button();
			ExtentTest test = extent.createTest("To check 'Backward' and 'Forward' button in 'Filter' edit screen for image on add story");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_273 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_274() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Gallery();
			st.AddStatus_Swipe_Gallery();
			st.Select_Gallery_Image();
			ed.EditImage_Filter();
			ed.EditImage_Filter_Option();
			ed.EditImage_Back();
			sm.send_Button();
			ExtentTest test = extent.createTest("To check 'X' button in 'Filter' edit screen for image on add story");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_274 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_275() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Gallery();
			st.AddStatus_Swipe_Gallery();
			st.Select_Gallery_Image();
			ed.EditImage_Filter();
			ed.EditImage_Filter_Option();
			ed.EditImage_Pen_Backward();
			ed.EditImage_Pen_Forward();
			ed.EditImage_Back();
			sm.send_Button();
			ExtentTest test = extent.createTest("To check 'X' button in 'Text' edit screen for image after applying filter edit on add story");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_275 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_276() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Gallery();
			st.AddStatus_Swipe_Gallery();
			st.Select_Gallery_Image();
			ed.EditImage_Crop();
			ed.EditImage_Crop_Save();
			ed.EditImage_Pen();
			ed.EditImage_Pen_Colour();
			ed.EditImage_Pen_Swipe(2, 0.6, 0.4);
			ed.EditImage_Crop_Save();
			ed.EditImage_Text();
			ed.EditImage_Pen_Colour();
			ed.EditImage_Text_Message("Need to test again");
			ed.EditImage_Text_Done();
			ed.EditImage_Crop_Save();
			ed.EditImage_Filter();
			ed.EditImage_Filter_Option();
			ed.EditImage_Crop_Save();
			sm.send_Button();
			ExtentTest test = extent.createTest("To add image as story by applying all type of edites for image in add story");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_276 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_277() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Gallery();
			st.AddStatus_Swipe_Gallery();
			st.Select_Gallery_Image();
			ed.EditImage_Crop();
			ed.EditImage_Crop_Save();
			ed.EditImage_Pen();
			ed.EditImage_Pen_Colour();
			ed.EditImage_Pen_Swipe(2, 0.6, 0.4);
			ed.EditImage_Crop_Save();
			ed.EditImage_Text();
			ed.EditImage_Pen_Colour();
			ed.EditImage_Text_Message("Need to test again");
			ed.EditImage_Text_Done();
			ed.EditImage_Crop_Save();
			ed.EditImage_Filter();
			ed.EditImage_Filter_Option();
			ed.EditImage_Crop_Save();
			sm.Capture_Caption();
			sm.send_Button();
			ExtentTest test = extent.createTest("To add image as story with caption by applying all type of edites for image in add story");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_277 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}

	@Test
	public void TC_278() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Gallery();
			st.AddStatus_Swipe_Gallery();
			st.Select_Gallery_Image();
			st.AddStatus_Back();
			ExtentTest test = extent.createTest("To check 'X' button in add image as story screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_278 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}
	
	@Test
	public void TC_279() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Gallery();
			st.AddStatus_Swipe_Gallery();
			st.Select_Gallery_Video();
			st.AddStatus_Video_Back();
			ExtentTest test = extent.createTest("To check 'Back' button in add video as story screen");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_279 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}
	
	@Test
	public void TC_280() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Gallery();
			st.AddStatus_Swipe_Gallery();
			st.Select_Gallery_Image();
			st.AddStatus_WhocanView();
			st.WhocanView_AllContactsExcept();
			st.WhocanView_Done();
			st.WhocanView_SelectMembers();
			st.WhocanView_SelectMembers_Save();
			sm.send_Button();
			ExtentTest test = extent.createTest("To apply 'All Contacts Except' option in who can view permission");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_280 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}
	
	@Test
	public void TC_281() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Gallery();
			st.AddStatus_Swipe_Gallery();
			st.Select_Gallery_Image();
			st.AddStatus_WhocanView();
			st.WhocanView_SelectContacts();
			st.WhocanView_Done();
			st.WhocanView_SelectMembers();
			st.WhocanView_SelectMembers_Save();
			sm.send_Button();
			ExtentTest test = extent.createTest("To apply 'Select Contacts' option in who can view permission");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_281 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}
	
	@Test
	public void TC_282() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Gallery();
			st.AddStatus_Swipe_Gallery();
			st.Select_Gallery_Image();
			st.AddStatus_WhocanView();
			st.WhocanView_SelectContacts();
			st.WhocanView_Done();
			st.WhocanView_SelectMembers_Back();
			ExtentTest test = extent.createTest("To check 'Back' button in select contacts screen of who can view permission");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_282 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}
	
	@Test
	public void TC_283() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Gallery();
			st.AddStatus_Swipe_Gallery();
			st.Select_Gallery_Image();
			st.AddStatus_WhocanView();
			st.WhocanView_SelectContacts();
			st.WhocanView_Done();
			st.WhocanView_SelectMembers();
			st.WhocanView_SelectMembers_Back();
			ExtentTest test = extent.createTest("To check 'Back' button in select contacts screen of who can view permission after selecting members");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_283 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}
	
	@Test
	public void TC_284() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Gallery();
			st.AddStatus_Swipe_Gallery();
			st.Select_Gallery_Image();
			st.AddStatus_WhocanView();
			st.WhocanView_AllContacts();
			st.WhocanView_Done();
			ExtentTest test = extent.createTest("To apply 'All Contacts' option in who can view permission");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_284 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}
	
	@Test
	public void TC_285() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Note();
			st.AddStatus_Note("Permissions");
			st.AddStatus_WhocanView();
			st.WhocanView_AllContactsExcept();
			st.WhocanView_Done();
			st.WhocanView_SelectMembers();
			st.WhocanView_SelectMembers_Save();
			sm.send_Button();
			ExtentTest test = extent.createTest("To apply 'All Contacts Except' option in who can view permission for note");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_285 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}
	
	@Test
	public void TC_286() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Note();
			st.AddStatus_Note("Permissions");
			st.AddStatus_WhocanView();
			st.WhocanView_SelectContacts();
			st.WhocanView_Done();
			st.WhocanView_SelectMembers();
			st.WhocanView_SelectMembers_Save();
			sm.send_Button();
			ExtentTest test = extent.createTest("To apply 'Select Contacts' option in who can view permission for note");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_286 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}
	
	@Test
	public void TC_287() {
		try {
			st.Open_Status();
			st.Status_Create();
			st.Status_Create_Note();
			st.AddStatus_Note("Permissions");
			st.AddStatus_WhocanView();
			st.WhocanView_AllContacts();
			st.WhocanView_Done();
			ExtentTest test = extent.createTest("To apply 'All Contacts' option in who can view permission for note");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_287 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}
	
	@Test
	public void TC_288() {
		try {
			st.Open_Status();
			st.Status_Options();
			st.Status_Options_Settings();
			st.Status_Settings_WhocanView();
			st.WhocanView_AllContactsExcept();
			st.WhocanView_Done();
			st.WhocanView_SelectMembers();
			st.WhocanView_SelectMembers_Save();
			ExtentTest test = extent.createTest("To apply 'All Contacts Except' option in settings for story");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_288 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}
	
	@Test
	public void TC_289() {
		try {
			st.Open_Status();
			st.Status_Options();
			st.Status_Options_Settings();
			st.Status_Settings_WhocanView();
			st.WhocanView_SelectContacts();
			st.WhocanView_Done();
			st.WhocanView_SelectMembers();
			st.WhocanView_SelectMembers_Save();
			ExtentTest test = extent.createTest("To apply 'Select Contacts' option in settings for story");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_289 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}
	
	@Test
	public void TC_290() {
		try {
			st.Open_Status();
			st.Status_Options();
			st.Status_Options_Settings();
			st.Status_Settings_WhocanView();
			st.WhocanView_AllContacts();
			st.WhocanView_Done();
			ExtentTest test = extent.createTest("To apply 'All Contacts' option in settings for story");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_290 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}
	
	@Test
	public void TC_291() {
		try {
			st.Open_Status();
			st.Status_Options();
			st.Status_Options_Settings();
			st.Status_Settings_WhocanView();
			st.WhocanView_SelectContacts();
			st.WhocanView_Done();
			st.WhocanView_SelectMembers_Back();
			ExtentTest test = extent.createTest("To check 'Back' button in select contacts screen of who can view permission");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_291 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}
	
	@Test
	public void TC_292() {
		try {
			st.Open_Status();
			st.Status_Options();
			st.Status_Options_Settings();
			st.Status_Settings_WhocanView();
			st.WhocanView_SelectContacts();
			st.WhocanView_Done();
			st.WhocanView_SelectMembers_Search();
			st.WhocanView_SelectMembers_CheckSearchData();
			ExtentTest test = extent.createTest("To check 'Search' field in select contacts screen of who can view permission");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_292 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}
	
	@Test
	public void TC_293() {
		try {
			st.Open_Status();
			st.Status_Options();
			st.Status_Options_Settings();
			st.Status_Settings_WhocanView();
			st.WhocanView_SelectContacts();
			st.WhocanView_Done();
			st.WhocanView_SelectMembers_Search();
			st.WhocanView_SelectMembers_Search_Select();
			st.WhocanView_SelectMembers_Save();
			ExtentTest test = extent.createTest("To 'select member after searching' in select contacts screen of who can view permission");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_293 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}
	
	@Test
	public void TC_294() {
		try {
			st.Open_Status();
			st.Status_Options();
			st.Status_Options_Settings();
			st.Status_Settings_WhocanView();
			st.WhocanView_SelectContacts();
			st.WhocanView_Done();
			st.WhocanView_SelectMembers_Search();
			st.WhocanView_SelectMembers_SearchClear();
			ExtentTest test = extent.createTest("To check 'Clear' button for search field in select contacts screen of who can view permission");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_294 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}
	
	@Test
	public void TC_295() {
		try {
			st.Open_Status();
			st.Status_Options();
			st.Status_Options_Settings();
			st.Status_Settings_StatusTime();
			st.Status_Settings_StatusTime_48Hours();
			st.WhocanView_Done();
			ExtentTest test = extent.createTest("To select '48 hours' as story view time in settings");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_295 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}
	
	@Test
	public void TC_296() {
		try {
			st.Open_Status();
			st.Status_Options();
			st.Status_Options_Settings();
			st.Status_Settings_StatusTime();
			st.Status_Settings_StatusTime_72Hours();
			st.WhocanView_Done();
			ExtentTest test = extent.createTest("To select '72 hours' as story view time in settings");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_296 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}
	
	@Test
	public void TC_297() {
		try {
			st.Open_Status();
			st.Status_Options();
			st.Status_Options_Settings();
			st.Status_Settings_StatusTime();
			st.Status_Settings_StatusTime_1Week();
			st.WhocanView_Done();
			ExtentTest test = extent.createTest("To select '1 week' as story view time in settings");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_297 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}
	
	@Test
	public void TC_298() {
		try {
			st.Open_Status();
			st.Status_Options();
			st.Status_Options_Settings();
			st.Status_Settings_StatusTime();
			st.Status_Settings_StatusTime_24Hours();
			st.WhocanView_Done();
			ExtentTest test = extent.createTest("To select '24 hours' as story view time in settings");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_298 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}
	
	@Test
	public void TC_299() {
		try {
			st.Open_Status();
			st.Status_Options();
			st.Status_Options_Settings();
			st.WhocanView_SelectMembers_Back();
			ExtentTest test = extent.createTest("To check 'Back' button in settngs");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_299 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}
	
	@Test
	public void TC_300() {
		try {
			st.Open_Status();
			st.Status_Options();
			st.Status_Options_AllStatus();
			ExtentTest test = extent.createTest("To click on 'All Status' in story options");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_300 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}
	
	@Test
	public void TC_301() {
		try {
			mi.Open_MemberInfo();
			mi.longpress(driver.findElement(By.id(utility.fetchLocatorMemberInfo("MemberInfo_UserName_id"))));			
			ExtentTest test = extent.createTest("To click on 'All Status' in story options");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("TC_262 Test case is Failed");
		}
		driver.terminateApp("com.tvisha.clapmessenger");
	}
	
	@BeforeSuite
	public void driverstart() throws Exception {
		htmlReporter = new ExtentHtmlReporter("unit.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		capabilities();
	}

	//@BeforeTest
	public static void capabilities() throws Exception {
		//AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();  to start appium server programmatically
		//service.start();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Nokia G20");
		//capabilities.setCapability("deviceName", "moto g(9)");
		capabilities.setCapability("udid", "399653JA1180701474"); // Nokia
		//capabilities.setCapability("udid", "ZF65254VT5"); // Nokia
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "13");
		capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
		capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
		capabilities.setCapability("unicodeKeyboard", true);
		//cap.setCapability("newCommandTimeout", 60 * 5);
		//cap.setCapability("exported", true); cap.setCapability("–session-override",true);
		capabilities.setCapability("appPackage", "com.tvisha.clapmessenger");
		capabilities.setCapability("appActivity", "com.tvisha.clapmessenger.clap_new.ClapActivity");
		//capabilities.setCapability("appActivity", "com.tvisha.clapmessenger.clap_new.authentication.SplashActivity");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver < MobileElement > (url, capabilities);
	}

	//@AfterTest
	public static void terminate() {
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String packageName = driver.getCurrentPackage();
		driver.terminateApp(packageName);
		//driver.activateApp(packageName);
		//driver.launchApp();
	}

	@AfterSuite
	public void closeapp() {
		extent.flush();
	}
	
	public static void threadSleep(int sleep) {
		try {
			TimeUnit.SECONDS.sleep(sleep);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}