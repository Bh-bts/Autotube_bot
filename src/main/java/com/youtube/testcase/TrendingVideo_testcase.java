package com.youtube.testcase;

import java.io.IOException;

import com.youtube.Obj.LatestVideo_Obj;
import com.youtube.Obj.TrendingVideo_Obj;

public class TrendingVideo_testcase extends TrendingVideo_Obj {

	public void trendingVideo() throws IOException {

		LatestVideo_Obj.dynamicTimeOut(trending_btn);
		trending_btn.click();

		LatestVideo_Obj.dynamicTimeOut(video_link);
		video_link.click();

		LatestVideo_Obj.dynamicTimeOut(resumeVideo);
		resumeVideo.click();

		String title = getTitle.getText();
		System.out.println("Latest Trending Video is " + ANSI_BLUE + title + ANSI_RESET + '\n');

		LatestVideo_Page.getTime();

	}

}
