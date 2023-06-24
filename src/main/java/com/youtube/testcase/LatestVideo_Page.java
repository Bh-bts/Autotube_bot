package com.youtube.testcase;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;

import com.youtube.Obj.LatestVideo_Obj;
import com.youtube.utils.PropertiesClass;

public class LatestVideo_Page extends LatestVideo_Obj {

	public void getLatestVideoTitle() throws IOException {

		dynamicTimeOut(firstVideo);
		firstVideo.click();

		dynamicTimeOut(resumeVideo);
		resumeVideo.click();

		String title = getTitle.getText();
		System.out.println("Latest video of the " + PropertiesClass.getChannel() + " channel is : " + ANSI_BLUE + title + ANSI_RESET + '\n');

		getTime();

	}

	public static void getTime() {

		String time = getTime.getText();

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getTime);
		dynamicTimeOut(showMore_btn);
		showMore_btn.click();

		String time1 = getTime.getText();
		System.out.println(ANSI_YELLOW + time + ANSI_RESET + " Uploaded video" + " or uploaded on " + ANSI_YELLOW + time1 + ANSI_RESET + '\n');

		String getViews = views.getText();
		System.out.println("Views are : " + ANSI_GREEN + getViews + ANSI_RESET + '\n');
	}

}
