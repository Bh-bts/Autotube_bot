package com.youtube.MainPage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.youtube.Browsers.AllBrowsers;
import com.youtube.testcase.TrendingVideo_testcase;
import com.youtube.utils.PropertiesClass;

public class TrendingVideo_MainPage extends TrendingVideo_testcase {

	public TrendingVideo_MainPage() throws IOException {
		AllBrowsers.startBrowser(PropertiesClass.getBrowser(), PropertiesClass.getURL());
	}

	@Test
	public void getTrendingVideo() throws IOException {

		TrendingVideo_testcase obj = PageFactory.initElements(driver, TrendingVideo_testcase.class);
		obj.trendingVideo();

	}

}
