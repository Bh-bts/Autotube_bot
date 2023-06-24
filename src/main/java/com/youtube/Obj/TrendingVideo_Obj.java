package com.youtube.Obj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.youtube.testcase.LatestVideo_Page;

public class TrendingVideo_Obj extends LatestVideo_Page {
	
	public static @FindBy(xpath = "//yt-formatted-string[text()='Trending']/ancestor::tp-yt-paper-item") WebElement trending_btn;
	public static @FindBy(xpath = "//ytd-item-section-renderer[1]//ytd-video-renderer[1]//a[@id='video-title']") WebElement video_link;
}
