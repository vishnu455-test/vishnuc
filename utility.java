package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class utility {

public static String fetchLocatorStatus(String key) throws IOException {
		
		FileInputStream file = new FileInputStream("./config/Elements_status.properties");
		Properties property = new Properties();
		property.load(file);
		return property.get(key).toString();
	}

public static String fetchLocatorSettings(String key) throws IOException {
	
	FileInputStream file = new FileInputStream("./config/Elements_settings.properties");
	Properties property = new Properties();
	property.load(file);
	return property.get(key).toString();
}

public static String fetchLocatorEditimage(String key) throws IOException {
	
	FileInputStream file = new FileInputStream("./config/Elements_editImage.properties");
	Properties property = new Properties();
	property.load(file);
	return property.get(key).toString();
}

public static String fetchLocatorFilter(String key) throws IOException {
	
	FileInputStream file = new FileInputStream("./config/Elements_filter.properties");
	Properties property = new Properties();
	property.load(file);
	return property.get(key).toString();
}

public static String fetchLocatorSendMessage(String key) throws IOException {
	
	FileInputStream file = new FileInputStream("./config/Elements_sendMessage.properties");
	Properties property = new Properties();
	property.load(file);
	return property.get(key).toString();
}

public static String fetchLocatorMyProfile(String key) throws IOException {
	
	FileInputStream file = new FileInputStream("./config/Elements_myProfile.properties");
	Properties property = new Properties();
	property.load(file);
	return property.get(key).toString();
}

public static String fetchLocatorMemberInfo(String key) throws IOException {
	
	FileInputStream file = new FileInputStream("./config/Elements_memberInfo.properties");
	Properties property = new Properties();
	property.load(file);
	return property.get(key).toString();
}
}
