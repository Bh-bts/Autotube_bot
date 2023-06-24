package com.youtube.Obj;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.youtube.Browsers.AllBrowsers;

public class LatestVideo_Obj extends AllBrowsers {

	public static @FindBy(xpath = "//ytd-two-column-browse-results-renderer[@page-subtype='channels']//ytd-rich-grid-row[@class='style-scope ytd-rich-grid-renderer'][1]//ytd-rich-item-renderer[1]//a[@id='video-title-link']") WebElement firstVideo;
	public static @FindBy(xpath = "//button[@data-title-no-tooltip='Pause']") WebElement resumeVideo;
	public static @FindBy(xpath = "//div[@id='title']/h1/yt-formatted-string") WebElement getTitle;
	public static @FindBy(xpath = "//yt-formatted-string[@id='info']/span[3]") WebElement getTime;
	public static @FindBy(xpath = "//div[@id='description-inner']//tp-yt-paper-button[@id='expand']") WebElement showMore_btn;
	public static @FindBy(xpath = "//yt-formatted-string[@id='info']/span[1]") WebElement views;

	public static WebElement dynamicTimeOut(WebElement element) {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));

		return w.until(ExpectedConditions.visibilityOf(element));

	}

}
