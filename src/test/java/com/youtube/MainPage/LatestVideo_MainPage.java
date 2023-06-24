package com.youtube.MainPage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.youtube.Browsers.AllBrowsers;
import com.youtube.testcase.LatestVideo_Page;
import com.youtube.utils.PropertiesClass;

public class LatestVideo_MainPage extends LatestVideo_Page{
	
	public LatestVideo_MainPage() throws IOException {
		
		AllBrowsers.startBrowser(PropertiesClass.getBrowser(), PropertiesClass.getURL() + PropertiesClass.getChannel() + PropertiesClass.getTab());
		
	}

	@Test
	public void latestVideo() throws IOException {

		LatestVideo_Page obj = PageFactory.initElements(driver, LatestVideo_Page.class);
		obj.getLatestVideoTitle();

	}

}
